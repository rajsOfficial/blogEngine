package com.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class BasicLoginHelper {

    /*
    @author rajkanna
     */

    public static Map<String,Object> authenticate(HttpServletRequest request, HttpServletResponse response){

        Map<String,Object> resultMap = new HashMap<>();

        String userEmail = request.getParameter("userEmail");
        String password = request.getParameter("password");

        if(userEmail.equalsIgnoreCase("rajkanna96@gmail.com") && password.equalsIgnoreCase("1234")){
            resultMap.put("status",true);
        }
        else{
            resultMap.put("status",false);
            resultMap.put("error_message","Username or Password is not valid");
        }
        return  resultMap;
    }
}
