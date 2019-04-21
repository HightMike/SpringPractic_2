package ru.javabegin.training.spring.main;

//import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.conveyor.T1000Conveyor;
import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.interfaces.Robot;
import ru.javabegin.training.spring.interfaces.RobotConveyor;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");
		//ModelT1000 t1001 = context.getBean("t1000", ModelT1000.class);

		ModelT1000 t1000 = context.getBean("t1001", ModelT1000.class);

//		Robot terminator1 = t1000conveyor.createRobot();
//		Robot terminator2 = t1000conveyor.createRobot();
//		Robot terminator3 = t1000conveyor.createRobot();
		t1000.action();
		t1000.action();

//		System.out.println("terminator1" + terminator1);
//		System.out.println("terminator2" + terminator2);
//		System.out.println("terminator3" + terminator3);


		((ClassPathXmlApplicationContext) context).close();
	}
}
