package com.cognizant.forecast;

public class ForecastTest {

    public static void main(String[] args) {

        Forecast forecast = new Forecast();

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = forecast.calculateFutureValue(currentValue, growthRate, years);

        System.out.println("Current Value: Rs." + currentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Future Value: Rs." + futureValue);
    }
}