public class StrongNumber {
    public static void main(String[] args) {
        int num = 40585;
        int sum = 0;
        int originalNum = num;
        int factorial = 1, factorial1 = 1, factorial2 = 1;        
        
        int lastDigit = num % 10;
        System.out.println(lastDigit);
        for(int i = 1; i <= lastDigit; i++){
            factorial = factorial * i;
        }

        num = num / 10;
        int secDigit = num % 10;
        System.out.println(secDigit);
        for(int i = 1; i <= secDigit; i++){
            factorial1 = factorial1 * i;
        }
            
        for(int i = 1; i <= firstDigit; i++){
            factorial2 = factorial2 * i;
        }
            System.out.println("------------------");
            System.out.println(factorial);
            System.out.println(factorial1);
            System.out.println(factorial2);
            
            System.out.println(originalNum);

            sum = factorial + factorial1 + factorial2;

            if (sum == originalNum){
            
                System.out.println("STRONG NUMBER!");
            }else{
               
                System.out.println("NOT STRONG NUMBER!");
            }

    } // END MAIN
} // END CLASS
