public class MyApp {
    public static void main(String[] args) {

        CoachInterface theCoach = new BaseballCoach();
        CoachInterface trackCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());


    }
}
