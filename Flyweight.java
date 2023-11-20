import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private Map<String, Robot> map = new HashMap<>();

    public void ajouterFlyweight(String s, Robot robot){
        map.put(s,robot);
    }

    public Robot creerRobot(String nameRobot){
        Robot robot = map.get(nameRobot);
       return  robot.clone();
    }
}
