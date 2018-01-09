package com.recipe.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Daniel Tominov on 1/8/2018
 */

@Controller
public class IndexController {
    @RequestMapping({"","/","/index" })
    public String getIndex(){
        return "index";
    }
}
