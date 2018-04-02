package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameMain {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("game.xml");
    
        Game game = context.getBean(Game.class);
        game.play();
    }
    
}
