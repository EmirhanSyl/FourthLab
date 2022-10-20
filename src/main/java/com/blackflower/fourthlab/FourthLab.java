package com.blackflower.fourthlab;


public class FourthLab {

    public static void main(String[] args) {
        
        //----------------------------------------------------
        PrintEvenNumbers(0);
        
        //----------------------------------------------------
        MultipliesOfSeven(0);
        
        //----------------------------------------------------
        int number = 5;
        System.out.println("Fuctorial is" + number + " is: " + FindTheFuctorial(number));
        
        //----------------------------------------------------
        int limit = 3000;
        FindIterationCount(3000);
        
        //----------------------------------------------------
        System.out.println("");
        
        //----------------------------------------------------
        System.out.println("");
        
        //----------------------------------------------------
        System.out.println("");

    }
    
    
    
    public static void PrintEvenNumbers(int firstNum){
        System.out.println("Even Numbers: ");
        while(firstNum < 20){
            firstNum += 2;
            System.out.println(firstNum);
        }
    }
    
    public static void MultipliesOfSeven(int firstNum){
        System.out.println("Multiplies of seven: ");
        while(firstNum < 200){
            firstNum += 7;
            System.out.println(firstNum);
        }
        
        /**int i = 0;
        while(i < 200){
            if (i % 7 == 0) {
                System.out.println(firstNum);
            }
            i++;
        }**/
    }
    
    public static int FindTheFuctorial(int number){
        int i = 1;
        int result = 1;
        
        while(i <= number){
            result *= i;
            i++;
        }
        
        return result;
    }
    
    public static void FindIterationCount(int limit){
       int iterationCount = 1;
       int result = iterationCount;
       
       while(result + iterationCount < limit && iterationCount< 100){
           iterationCount++;
           result += iterationCount;
       }
       
        System.out.println("Loop lmit exceed at " + iterationCount + "th iteration and result is: " + result);
    }
    
    public static void Example_5(){
        
    }
}
