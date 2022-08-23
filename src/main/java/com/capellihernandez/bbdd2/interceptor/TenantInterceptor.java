package com.capellihernandez.bbdd2.interceptor;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TenantInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        final String tenantId = request.getHeader("TenantId");
        if (tenantId != null) {
            ThreadContext.put("TenantId", tenantId);
            return Boolean.TRUE;
        }
        response.getWriter().write("TenantId mandatory");
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return Boolean.FALSE;
    }
}
