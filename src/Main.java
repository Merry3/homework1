import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      System.out.println(" Please fill the following form");

      Scanner userInput=new Scanner(System.in);
      System.out.println("Please Enter your Monthly Salary");
        int salary=userInput.nextInt();

        System.out.println("Enter your Bank Saving Amount (Number only)");
        int saving=userInput.nextInt();

        System.out.println("Do you have a criminal record? True/False ");
        boolean crmrecod= userInput.nextBoolean();

        System.out.println("How many monthly socialscore do you have?");
        int socscore=userInput.nextInt();

        boolean  status1 = Boolean.parseBoolean(salary>70000? "True": "false");
        boolean  status2 = Boolean.parseBoolean(saving>5000000 ? "True": "false");
        boolean status4= Boolean.parseBoolean(((socscore*12) <55?"True":"False"));
        //boolean credit=(status1 && status2)&&(crmrecod||status4 ) =;
        String credit=((status1 && status2)&&(crmrecod||status4 ))? "CONGRADULATIONS YOU CAN BORROW THE MONEY!":"SORRY YOU CANNOT BORROW MONEY FROM OUR BANK" ;
       System.out.println(credit);








    }
}


