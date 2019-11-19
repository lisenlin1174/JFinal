package com.jfinal;

import com.jfinal.core.JFinal;

public class Main {
    public static void main(String[] args){
        JFinal.start("web",8080,"/",15);
    }
}
