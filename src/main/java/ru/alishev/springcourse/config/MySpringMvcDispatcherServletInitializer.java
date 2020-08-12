package ru.alishev.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//класс заменяет web.xml
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() { //указать класс, где находится spring конфигурация
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};  // эквивалент  <servlet-mapping>
                                      // <servlet-name>dispatcher</servlet-name>
                                      // <url-pattern>/</url-pattern>
                                      // </servlet-mapping>
    }
}
