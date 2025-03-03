import java.util.*;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private ArrayList<Bird> zooBirds;
    
    public Zoo(){
        zooBirds.add(new Bird("blue","blue jay",2));
        zooBirds.add(new Bird("blue","red cardinal",1));
        zooBirds.add(new Bird("red","red cardinal",1));
        zooBirds.add(new Bird("blue","red cardinal",1));
        zooBirds.add(new Bird("red","red cardinal",1));
        zooBirds.add(new Bird("blue","red cardinal",1));
        zooBirds.add(new Bird("red","red cardinal",1));
        zooBirds.add(new Bird("blue","red cardinal",1));
    }
    
    int countBlueBirds(){
        return 0;
    }
    public int countBlueBirds() {
        int count = 0;
        for (Bird bird : zooBirds) {
            if (bird.getColor().equals("blue")) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Number of blue birds: " + zoo.countBlueBirds());
    }
    
}


