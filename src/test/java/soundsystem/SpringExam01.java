package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam01 {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("exam01.xml");
    
        MyBean bean1 = (MyBean) context.getBean("bean1");
        bean1.setName("홍길동");
    
        MyBean bean2 = (MyBean) context.getBean("bean1");
    
        System.out.println(bean2.getName());
        
//        MyBean bean5 = context.getBean(MyBean.class); // NoUniqueBeanDefinitionException
        MyBean bean5 = context.getBean("bean1", MyBean.class);
        System.out.println(bean5.getName());
        
//        MyBean bean3 = (MyBean) context.getBean("bean2");
//        System.out.println(bean3.getName());

//        MyBean bean4 = (MyBean) context.getBean("bean3"); // NoSuchBeanDefinitionException
    
    }
    
}
