package com.jfinal.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {

    public void index(){
        renderText("IndexController index");
    }

    public void hello(){
       // renderText("<h2>hello</h2>");                //文本
        renderText("hello");
    }

    public void bye(){
       // renderHtml("<h2>bye</h2>");        //html
        String username=get("username");
        String gender=get("gender");
        if(gender.equals("1")){
            renderHtml("bye "+username+"先生");
        }else{
            renderHtml("bye "+username+"女士");
        }

    }
}
