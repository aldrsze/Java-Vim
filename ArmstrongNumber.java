import java.io.Console;

public class ArmstrongNumber{
    public static void main(String[] args){
        Console con = System.console();

        int num = Integer.parseInt(con.readLine("Enter a Number: "));
        int sum = 0;
        int digit = 0;
        int originalNum = num;

        int numLength = String.valueOf(num).length();

        while (num > 0){
            int power = 1;

            digit = num % 10;
            
            for(int i = 0; i < digit; i++){
                power = (int) Math.pow(digit, numLength);


            }// FOR LOOP   
         
            num = num / 10; 
            sum = sum + power;

        } // END WHILE LOOP
            if(sum == originalNum){
                System.out.println("The number is an Armstrong Number!");
            }else{
                System.out.println("The number is NOT an Armstrong Number!");
            }
            

    }// END MAIN

}// END CLASS
