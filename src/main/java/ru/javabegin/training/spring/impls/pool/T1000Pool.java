package ru.javabegin.training.spring.impls.pool;

import ru.javabegin.training.spring.impls.conveyor.T1000Conveyor;
import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotPool;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class T1000Pool  {

    private Collection<Robot> robotCollection;

    public T1000Pool (Collection<Robot> robotCollection){
        super();
        this.robotCollection = robotCollection;
    }



    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }
//    //public Map<String, Robot> getRobotCollection() {
//        return robotCollection;
//    }


//    public void action() {
//        for (Map.Entry<String, Robot> map : robotCollection.entrySet()) {
//            System.out.println(map.getKey());
//            map.getValue().action();
//        }
//    }

    public void beginShow() {
        for (Robot robot : robotCollection) {
            robot.action();
        }
    }


}
