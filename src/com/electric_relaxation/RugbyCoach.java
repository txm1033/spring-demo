package com.electric_relaxation;

public class RugbyCoach implements CoachInterface{
    // define a private field for the dependency

    private FortuneService fortuneService;

    // define a constructor
    public RugbyCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Conduct Line out lifting for 30 minutes";
    }
    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
