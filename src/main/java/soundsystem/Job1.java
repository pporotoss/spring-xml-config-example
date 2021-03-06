package soundsystem;

import org.springframework.beans.factory.BeanNameAware;

public class Job1 implements BaseJob, BeanNameAware {
    
    private String name;
    
    @Override
    public void exec() {
        System.out.println("id : "+this.name + " exe()!!!");
    }
    
    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
