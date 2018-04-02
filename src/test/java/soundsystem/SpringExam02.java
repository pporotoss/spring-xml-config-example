package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam02 {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("ApplicationContext 생성 시작!!!");
        System.out.println();
        ApplicationContext context = new ClassPathXmlApplicationContext("exam02.xml");
        System.out.println();
        System.out.println("ApplicationContext 생성완료!!!!!!!");
        System.out.println();
        
        // prototype
        MyBean bean1 = context.getBean("bean1", MyBean.class);
        System.out.println(bean1.getName());
        System.out.println(bean1.getCount());
        MyBean bean2 = context.getBean("bean1", MyBean.class);
        System.out.println("bean1 == bean2 :: " + (bean1 == bean2));
        
        // singleton
        MyBean bean3 = context.getBean("bean2", MyBean.class);
        MyBean bean4 = context.getBean("bean2", MyBean.class);
    
        System.out.println("bean3 == bean4 :: " + (bean3 == bean4));
        
        MyBean bean5 = context.getBean("bean3", MyBean.class);
        System.out.println(bean5.getName());
        System.out.println(bean5.getCount());
    
        MyBean bean6 = context.getBean("bean4", MyBean.class);
        System.out.println(bean6.getValue("1"));
        System.out.println(bean6.getValue("2"));
        System.out.println(bean6.getValue("3"));
        System.out.println(bean6.getValue("4"));
        
    }
    
}
