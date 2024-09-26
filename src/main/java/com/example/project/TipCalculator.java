package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) {//You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        double totalTip;
        
        totalTip = Math.round(cost*percent)/100.0;
        double totalBill = cost + totalTip;
        double  totalCostPerPerson = (int)(totalBill/people*100) / 100.0; //Rounding learned from https://www.geeksforgeeks.org/java-math-round-method-example/
        double totalTipPerPerson = Math.round(totalTip/people * 100) / 100.0;
        double perCost = Math.round(cost/people * 100) / 100.0;
  




                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + totalTip + "\n");
        result.append("Total Bill with tip: $" + totalBill + "\n");
        result.append("Per person cost before tip: $" + perCost + "\n");
        result.append("Tip per person: $" + totalTipPerPerson + "\n");
        result.append("Total cost per person: $" + totalCostPerPerson + "\n" );
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        
        System.out.println(calculateTip(people,percent,cost));
       
    }
}
        
