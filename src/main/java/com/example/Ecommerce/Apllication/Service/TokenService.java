package com.example.Ecommerce.Apllication.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Date;

@Service
public class TokenService {
    public static final String token_secret="hdwerghbvcsdfghjkyt";
    public String createTokenFunction(Integer id){
        try {
            Algorithm algoObj=Algorithm.HMAC256(token_secret); //encoding for token_secret;algoobj is signnature
            String token= JWT.create().                        // we generated a jwtoken by using the id,sign and date
                    withClaim("userId",id.toString()).
                    withClaim("createdAt",new Date()).
                    sign(algoObj);
            return token;

        }catch(UnsupportedEncodingException | JWTCreationException e){
            e.printStackTrace();
        }
        return null;
    }
    public String getUserIdToken(String token){
        try{
            Algorithm algoObj=Algorithm.HMAC256(token_secret);
            JWTVerifier jwtVerifier=JWT.require(algoObj).build();
            DecodedJWT decodedJWT=jwtVerifier.verify(token);
            return decodedJWT.getClaim("userid").asString();
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return null;
    }
    public boolean isTokenValid(String token){
        String userId=this.getUserIdToken(token);
        return userId!=null;
    }
}
