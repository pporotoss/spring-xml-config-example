package soundsystem;

public class Player {
    
    private Dice dice;
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setDice(Dice dice) {
        this.dice = dice;
    }
    
    public void play() {
        int randomNumber = dice.getNumber();
        System.out.println(getName()+"의 주사위 숫자가 "+randomNumber+"이 나왔습니다.");
    }

}
