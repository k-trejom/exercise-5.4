public class MilesToKilometers {
    public static void main(String[] args) {
    System.out.println("Miles        Kilometers");
    System.out.println("----------");
    for (int i = 1; i <=10; i++) {
        double kilometers = i * 1.609;
        System.out.printf("%-7d %.3f%n", i, kilometers);
    }
}  

}