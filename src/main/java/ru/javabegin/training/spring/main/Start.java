package ru.javabegin.training.spring.main;

//import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.conveyor.T1000Conveyor;
import ru.javabegin.training.spring.impls.pool.T1000Pool;
import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotConveyor;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		//ModelT1000 t1001 = context.getBean("t1000", ModelT1000.class);

		T1000Pool goldent1000 = context.getBean("t1000GoldenPool", T1000Pool.class);

//		Robot terminator1 = t1000conveyor.createRobot();
//		Robot terminator2 = t1000conveyor.createRobot();
//		Robot terminator3 = t1000conveyor.createRobot();
		goldent1000.beginShow();

//		System.out.println("terminator1" + terminator1);
//		System.out.println("terminator2" + terminator2);
//		System.out.println("terminator3" + terminator3);


		((ClassPathXmlApplicationContext) context).close();
	}
}
