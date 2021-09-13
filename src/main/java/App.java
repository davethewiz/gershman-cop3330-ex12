/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

public class App 
{
    public static double CalculateInterest(double P, double r, double t) {
        return P * (1 + r * t);
    }

    public static void main( String[] args )
    {
        double principal = Input.GetDouble("Enter the principal: ");
        double roi = Input.GetDouble("Enter the rate of interest: ");
        double years = Input.GetDouble("Enter the number of years: ");

        double finalVal = CalculateInterest(principal, roi / 100d, years);
        finalVal = Math.round(finalVal * 100) / 100d;

        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.2f.", years, roi, finalVal);
    }
}
