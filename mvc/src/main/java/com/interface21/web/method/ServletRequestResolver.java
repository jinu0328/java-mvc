package com.interface21.web.method;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

public class ServletRequestResolver implements MethodArgumentResolver {

    @Override
    public boolean supports(Parameter parameter) {
        Class<?> type = parameter.getType();
        return HttpServletRequest.class.isAssignableFrom(type);
    }

    @Override
    public Object resolve(Parameter parameter, HttpServletRequest request, HttpServletResponse response) {
        return request;
    }
}
