package org.springframework.beans.factory.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Leo
 * @version 1.0
 * @className Student
 * @description TODO
 * @date 2022/10/11 14:04
 **/
public class Student implements BeanPostProcessor {

	private String name;

	private Integer age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean [" + beanName + "] 开始初始化");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean [" + beanName + "] 完成初始化");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
