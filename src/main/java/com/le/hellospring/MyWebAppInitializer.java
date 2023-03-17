package com.le.hellospring;

import jakarta.servlet.Filter;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { HelloSpringApplication.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { // here
        return new Class[0];
    }


    @Override
    protected String @NotNull [] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{
                new HiddenHttpMethodFilter(), new CharacterEncodingFilter()};
    }
}
