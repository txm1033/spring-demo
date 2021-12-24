package com.electric_relaxation;

public class TrackCoach implements CoachInterface {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "You will run the 5k in less than 30 minutes!";
    }
}
