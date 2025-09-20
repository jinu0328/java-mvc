package com.interface21.web.method;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

public interface MethodArgumentResolver {

    boolean supports(Parameter parameter);

    Object resolve(Parameter parameter, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
