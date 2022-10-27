package springapp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	Mybusseness bs=ctx.getBean("mb",Mybusseness.class);
	bs.fun();
	}

}
