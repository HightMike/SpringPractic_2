package ru.javabegin.training.spring.impls.robot;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;
import ru.javabegin.training.spring.interfaces.Robot;

public class RobotReplacer implements MethodReplacer {


    public Object reimplement(Object ModelT1000, Method action, Object[] objects) throws Throwable {
        System.out.println("new Реализейшн");
        return null;
    }
}
