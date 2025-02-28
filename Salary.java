
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
 private int workedHours;
 private int $perHour;
 private double taxes = 3.0/10.0;
 private double salary = workedHours * $perHour;
 private double netpay = salary - salary * taxes;
 
 public void setWorkedHours(int hours)
 {
    this.workedHours = hours;   
 }
 
 public void set$perHour(int hourlyWage)
 {
    this.$perHour = hourlyWage;   
 }
 
 public void getSalary()
 {
    salary = workedHours * $perHour;
    System.out.println(salary);   
 }
 
 public void getNetPay()
 {
    netpay = salary - (salary * this.taxes);
    System.out.println(netpay);
 }
}  