public class kmTOmiles {
    public static void main(String[] args) {
        double kilometers = 5.0; 
        double miles = convertKmToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }

    public static double convertKmToMiles(double km) {
        return km * 0.621371; 
    }
    
}
