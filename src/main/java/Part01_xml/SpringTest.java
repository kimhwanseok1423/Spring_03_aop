package Part01_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String path="part01_xml/aop.xml";
		
		ApplicationContext context=new ClassPathXmlApplicationContext(path);
		
		Service svc=null;
		
		svc=(Service) context.getBean("svc");
		svc.prn1();

	}

}