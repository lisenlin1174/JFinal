package com.jfinal.config;

import com.jfinal.controller.IndexController;
import com.jfinal.controller.PhotoController;
import com.jfinal.template.Engine;

public class JfinalConfig extends JFinalConfig{

    public void configConstant(Constants constants) {
        constants.setDevMode(true);                 //打开开发者模式
    }

    public void configRoute(Routes routes) {
        routes.add("/", IndexController.class);                  //配置路由
        routes.add("/photo", PhotoController.class);
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {

    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}