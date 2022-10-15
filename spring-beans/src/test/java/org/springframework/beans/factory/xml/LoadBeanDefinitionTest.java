package org.springframework.beans.factory.xml;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Leo
 * @version 1.0
 * @className LoadBeanDefinitionTest
 * @description TODO
 * @date 2022/10/8 21:49
 **/
public class LoadBeanDefinitionTest {

	@Test
	public void load() {
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		ClassPathResource classPathResource = new ClassPathResource("loadBeanDefinitionTest.xml", this.getClass());
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
		defaultListableBeanFactory.addBeanPostProcessor(new Student("", 1));
		Object bean1 = defaultListableBeanFactory.getBean("studentBean");
//		Object bean = defaultListableBeanFactory.getBean("&testFactory122");
		Student studentBean1 = (Student) bean1;
		System.out.println(studentBean1);

	}
}
