package ru.javabegin.training.spring.impls.robot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.javabegin.training.spring.impls.sony.SonyHand;
import ru.javabegin.training.spring.impls.sony.SonyHead;
import ru.javabegin.training.spring.impls.sony.SonyLeg;
import ru.javabegin.training.spring.interfaces.*;


@Configuration
@ComponentScan(basePackages = "ru.javabegin.training.spring",
			includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Repository.class))


@Repository
public class ModelT1000 extends BaseModel  {

	private String color;
	private int year;
	private boolean soundEnabled;

	public ModelT1000() {
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ModelT1000 model1() {
		return new ModelT1000();
	}
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ModelT1000 model2() {
		return new ModelT1000("blue", 2002, true);
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
		// super(hand, leg, head);
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(String color, int year, boolean soundEnabled) {
		super();
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public void action() {
		getHead().calc();
		getHand().catchSomething();
		getLeg().go();
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("can play sound: " + soundEnabled);
	}

	public void initObject() {
		System.out.println("Объект проинициализирован");
	}
	public void destroyObject() {
		System.out.println("Объект разрушен");
	}

//	public void afterPropertiesSet() throws Exception {
//		System.out.println("метод вызван");
//	}


	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

}
