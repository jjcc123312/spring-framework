package org.springframework.beans.factory.xml;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests;
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
		Object bean = defaultListableBeanFactory.getBean("testBean");
		System.out.println("bean value: " + bean);
	}
}
