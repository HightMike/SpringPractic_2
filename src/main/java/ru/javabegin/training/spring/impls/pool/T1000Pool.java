//package ru.javabegin.training.spring.impls.pool;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import ru.javabegin.training.spring.impls.conveyor.T1000Conveyor;
//import ru.javabegin.training.spring.interfaces.Robot;
//import ru.javabegin.training.spring.interfaces.RobotPool;
//import ru.javabegin.training.spring.interfaces.T1000PoolQualifier;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class T1000Pool  {
//
//    T1000Pool () {
//
//    }
//
//    @Autowired
//    @T1000PoolQualifier(color=COLOR.BLUE, colorname = "blue")
//    Robot blueRobot;
//
//
//    @Autowired
//    @T1000PoolQualifier(color=COLOR.GREEN, colorname = "green")
//    Robot greenRobot;
//
//    @Autowired
//    @T1000PoolQualifier(color=COLOR.RED, colorname = "red")
//    Robot redRobot;
//
//    public Robot getBlueRobot () {
//        return blueRobot;
//    }
//}
//
