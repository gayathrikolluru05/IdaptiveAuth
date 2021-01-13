package com.example.demo;
import java.io.IOException;
import java.util.Collection;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

        @Component
        public class SimpleAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

            private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

            @Override
            public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1, Authentication authentication)
                    throws IOException, ServletException {

                Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) authentication.getAuthorities();
                authorities.forEach(authority -> {

                    try {
                        redirectStrategy.sendRedirect(arg0, arg1, "/test");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });

            }
        }




