package com.yuan.d.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class a {
        @RequestMapping("/hllo")
        public String hello(){
            return "Hello World!";
        }
    }

