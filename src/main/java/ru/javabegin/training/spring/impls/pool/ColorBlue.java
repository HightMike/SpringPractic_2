package ru.javabegin.training.spring.impls.pool;

import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.T1000PoolQualifier;


//@T1000PoolQualifier(color=COLOR.BLUE, colorname = "blue")

public class ColorBlue implements Robot {
    public void action() {
        System.out.println("Красит синим");
    }

    public void dance() {
        System.out.println("Танцует как синька");
    }
}
