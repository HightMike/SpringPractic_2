package ru.javabegin.training.spring.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("тут бин после инициалиации" + o);
        return o;
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("тут бин до инициалиации" + o);
        return o;
    }
}
