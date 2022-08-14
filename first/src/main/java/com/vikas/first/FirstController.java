package com.vikas.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
    
@RequestMapping("/")
    public String hello ()
    {
        return "Hello World";
    }

@RequestMapping("/myapi")
    public String myapi ()
    {
        return "My first API";
    }

}
