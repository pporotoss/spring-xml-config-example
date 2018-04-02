package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobMain {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("job.xml");
        JobRunner jobRunner = context.getBean(JobRunner.class);
        jobRunner.exec();
    }
    
}
