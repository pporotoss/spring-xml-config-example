package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam02 {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("exam02.xml");
    
        System.out.println("ApplicationContext 생성완료!!!!!!!");
        
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
    }
    
}
