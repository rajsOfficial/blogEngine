package com.auth;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
   @author Rajkanna started on 27 mar 2019
   This controller handles all the authentication requests
 */


@Controller
public class AuthenticationController {


    @RequestMapping("/basicLogin")
    public Map<String,Object> basicLogin(HttpServletRequest request, HttpServletResponse response){
        return BasicLoginHelper.authenticate(request,response);
    }


}
