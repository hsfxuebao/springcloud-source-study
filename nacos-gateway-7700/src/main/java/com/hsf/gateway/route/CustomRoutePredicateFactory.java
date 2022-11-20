package com.hsf.gateway.route;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.hsf.gateway.route.CustomRoutePredicateFactory.User;

import lombok.Data;

/**
 * @author hsfxuebao
 * Created on 2022-11-20
 */
@Component
public class CustomRoutePredicateFactory extends AbstractRoutePredicateFactory<User> {

    private static final String CUSTOM_KEY = "name";

    public CustomRoutePredicateFactory() {
        super(User.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(User config) {
        return serverWebExchange -> {
            String param = serverWebExchange.getRequest().getQueryParams().getFirst(CUSTOM_KEY);
            if (StringUtils.isNotBlank(param) && StringUtils.equals(param, config.getName())) {
                return true;
            }
            return false;
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList(CUSTOM_KEY);
    }


    @Data
    public static class User {
        private String name;
    }
}
