package org.tyaa.springctx1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tyaa.springctx1.builder.Unit;

public class Main {

	public static void main(String[] args) {
		
		//sysout -> Ctrl+space
		//System.out.println("Hello!");
		//TODO:
		//1. Добавить еще одну реализацию IPerson, например, "священник",
		//и ITool, например, "жезл", выполняющий функцию "обратить врага"
		//2. Добавить в контекст соответствующие бины - базовые + несколько составных
		//3. Получить по одному экземпляру составных бинов в главном методе и вызвать их методы
		
		//Получаем контекст (реестр бинов)
		ApplicationContext context =
				new ClassPathXmlApplicationContext("AppContext.xml");
		
		//Из контекста получаем составной бин
		Unit warriorUnit = (Unit) context.getBean("warrior_unit");
		
		//Вызываем у бина все методы
		warriorUnit.show();
		warriorUnit.say("Hello");
		warriorUnit.testActions();
	}

}
