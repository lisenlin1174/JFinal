package com.jfinal.aop;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class RegisterValidator extends Validator {
    protected void validate(Controller controller) {
        setShortCircuit(true);
        validateRequired("username","errMsg","用户名为空");
        validateRequired("password","errMsg","密码为空");
        String gender=controller.get("gender");
        if(!gender.equals("男")&&!gender.equals("女")){
            addError("errMsg","性别不正确");
        }
        validateEmail("email","errMsg","电子邮件不正确");
        validateRequired("nickname","errMsg","昵称为空");

    }

    protected void handleError(Controller controller) {
        //controller.renderHtml((String) controller.getAttr("errMsg"));
        controller.setAttr("success",false);
        controller.renderJson();
    }
}
