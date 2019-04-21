package ru.javabegin.training.spring.impls.pool;

import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotPool;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class T1000Pool implements RobotPool {

    private Map<String, Robot> robotCollection;

    public T1000Pool (Map<String, Robot> robotCollection){
        this.robotCollection = robotCollection;
    }



    public Map<String, Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    public void action() {
        for (Map.Entry<String, Robot> map : robotCollection.entrySet()) {
            System.out.println(map.getKey());
            map.getValue().action();
        }
    }


}
