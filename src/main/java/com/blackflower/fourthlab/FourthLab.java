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
        FindIterationCount(limit);
        
        //----------------------------------------------------
        System.out.println(FindBiggestDivisor(14, 12));
        
        //----------------------------------------------------
        FindReverse(548957);
        
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
    
    public static int FindBiggestDivisor(int num1, int num2){
        
        int maxDevisorOfFirst = 1;
        int maxDevisorOfSec = 1;
        
        int i = 1;
        while(i < num1){
            if (num1 % i == 0) {
                maxDevisorOfFirst = i;
            }
            i++;
        }
        
        i = 1;
        while(i < num2){
            if (num2 % i == 0) {
                maxDevisorOfSec = i;
            }
            i++;
        }
        
        return (maxDevisorOfFirst > maxDevisorOfSec) ? maxDevisorOfFirst : maxDevisorOfSec;
    }
    
    
        public static int FindBiggestDivisorInBetterWay(int num1, int num2){
        
        int maxDevisor = 1;
        
        int i = 1;
        while(i < num1 || i < num2){
            if ((num1 % i == 0 && num1 != i) || (num2 % i == 0 && num2 != i)) {
                maxDevisor = i;
            }
            i++;
        }
        
        return maxDevisor;
    }
        
    public static void FindReverse(int number){
        int lastDigit;
        
        while(number > 0){
             lastDigit = number % 10;             
             number = number / 10;
             System.out.print(lastDigit);
        }
    }
}
