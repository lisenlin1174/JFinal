package com.jfinal.aop;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class RegisterValidator extends Validator {
    protected void validate(Controller controller) {
        validateRequiredString("username","errMsg","用户名或密码错误");
        validateRequiredString("password","errMsg","用户名或秘码错误");
    }

    protected void handleError(Controller controller) {
        controller.renderHtml((String) controller.getAttr("errMsg"));
    }
}
