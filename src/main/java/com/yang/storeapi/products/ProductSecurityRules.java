package com.yang.storeapi.products;

import com.yang.storeapi.common.SecurityRules;
import com.yang.storeapi.users.Role;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.stereotype.Component;

@Component
public class ProductSecurityRules implements SecurityRules {
    @Override
    public void configure(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
        registry.requestMatchers(HttpMethod.GET, "/products/**").permitAll()
                .requestMatchers(HttpMethod.POST, "/products/**").hasRole(Role.USER.name())
                .requestMatchers(HttpMethod.PUT, "/products/**").hasRole(Role.USER.name())
                .requestMatchers(HttpMethod.DELETE, "/products/**").hasRole(Role.USER.name());
    }
}
