package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration annotation is used to inform the ioc container that this is the configuration file
// just like we did with xml file
//component scan annotation is used to provide base package for the particular class
// just like we did <context:component-scan base-package=""> in xml


@Configuration
//@ComponentScan("com.springcore.javaconfig")
public class JavaConfig {
	
	// This method will return student object to the IOC container so we can get it in main class
	//we have comment out the @Component annotation so we can also remove @ComponentScan because we are not using component so 
	//no need to declare it
	
	@Bean
	public Sample getSample() {
		return new Sample();
	}
	
	@Bean(name= {"student","lukkho"})
	public Student getStudent() {
		return new Student(getSample());
	}

}