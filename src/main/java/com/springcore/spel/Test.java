package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Sample s = context.getBean("sample",Sample.class);
		System.out.println(s);
		
//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression expression = temp.parseExpression("90+30");
//		System.out.println(expression.getValue());
	}
}
