package ro.uvt.info.splabotimanrafael2026.controllers;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("LOG INAINTE: Se proceseaza request-ul: " + req.getMethod() + " " + req.getRequestURI());

        chain.doFilter(request, response);

        System.out.println("LOG DUPA: S-a finalizat procesarea request-ului: " + req.getMethod() + " " + req.getRequestURI());
    }
}