
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
private int currentYear = 2025;
    
public void setAge(int Age)
{
 Age = Age;
 if(Age >= 16)
 {
    System.out.println(Age + " - Eligeble to drive");   
 }
 else 
 {
    System.out.println(Age + " - Ineligeble, must wait "+(16 - Age)+" more year(s) to drive");      
 }
}
}


