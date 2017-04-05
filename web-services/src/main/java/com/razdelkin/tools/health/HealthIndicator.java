package com.razdelkin.tools.health;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Alex on 3/29/2017.
 */
@RestController
public class HealthIndicator {

    private static final String OK = "OK";
    private static final String NOT_OK = "NOT_OK";

    @GetMapping("/status")
    public String getServerStatus(){

        URL url;
        HttpURLConnection connection = null;
        int code = 0;
        try {
            url = new URL("http://localhost:9000/user/all");
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            code = connection.getResponseCode();
        } catch (IOException  e){
            e.printStackTrace();
            return NOT_OK;
        }
        if(code != 200){
            return NOT_OK;
        }
        return OK;
    }
}
