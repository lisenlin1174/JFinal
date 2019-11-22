package com.jfinal.aop;

import com.jfinal.core.Controller;

public class NeedLogin implements Interceptor {
    public void intercept(Invocation invocation) {
        Controller controller= invocation.getController();
        String username=controller.get("username");
        String password=controller.get("password");
        if(username.equals("admin")&&password.equals("123")){
            invocation.invoke();
        }else{
            controller.renderHtml("登陆成功");
        }
    }
}
