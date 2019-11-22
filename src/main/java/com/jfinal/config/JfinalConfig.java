package com.jfinal.config;

import com.jfinal.controller.IndexController;
import com.jfinal.controller.PhotoController;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

public class JfinalConfig extends JFinalConfig{

    public void configConstant(Constants constants) {
        constants.setDevMode(true);                                           //打开开发者模式
    }

    public void configRoute(Routes routes) {
        routes.add("/", IndexController.class);                  //配置路由
        routes.add("/photo", PhotoController.class);
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {                              //数据库配置
       /* loadPropertyFile("myconfig.properties");     //加载配置文件 文件放在/src/main/resources下
        DruidPlugin druidPlugin=new DruidPlugin(              //添加Druid数据库连接池插件，分别传入Druid可以根据jdbc url自动识别驱动类型
                getProperty("jdbc.url"),
                getProperty("jdbc.username","root"),   //数据库连接用户名
                getProperty("jdbc.password","root")    //数据库连接密码
        );
        plugins.add(druidPlugin);                             //通过add方法添加插件

        //添加Activeecord插件
        ActiveRecordPlugin activeRecordPlugin=new ActiveRecordPlugin(druidPlugin);
        plugins.add(activeRecordPlugin);
        activeRecordPlugin.setDialect(new MysqlDialect());   //设置Activeecord插件数据库方言，默认为Mysqlialect
        activeRecordPlugin.setDevMode(getPropertyToBoolean("devMode",false));  //根据配置文件配置Activeecord插件的开发模式
        activeRecordPlugin.setShowSql(getPropertyToBoolean("showSql",false));  //根据配置文件配置Activeecord插件的开发是否输出SQL语句

        */
    }

    public void configInterceptor(Interceptors interceptors) {
        //配置session拦截器 可以在模板中直接调用session
       // interceptors.add(new SessionInViewInterceptor());

    }

    public void configHandler(Handlers handlers) {

    }
}