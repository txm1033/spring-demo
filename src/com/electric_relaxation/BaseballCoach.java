package com.electric_relaxation;

public class BaseballCoach implements  CoachInterface{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Hit the batting cage for 30 minutes daily";
    }

    @Override
    public String getDailyFortune() {
        return "Good job out there!";
    }
}
