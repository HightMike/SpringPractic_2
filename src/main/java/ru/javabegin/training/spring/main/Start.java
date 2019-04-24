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

		ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);

		t1000.action();

		((ClassPathXmlApplicationContext) context).close();
	}
}
