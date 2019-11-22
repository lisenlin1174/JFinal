package com.jfinal.aop;

import com.jfinal.kit.LogKit;

public class FirstInterceptor implements Interceptor{
    public void intercept(Invocation invocation) {
        String methodName=invocation.getMethodName();
        LogKit.error("拦截了方法："+methodName);
        invocation.invoke();
    }
}
