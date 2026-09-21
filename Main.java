public class Main {
    public static void main(String[] args) {
        
        Vehicle car1 = new Vehicle();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2015;

        Vehicle car2 = new Vehicle();
        car2.brand = "Ford";
        car2.model = "Mustang";
        car2.year = 1995;

        Vehicle car3 = new Vehicle();
        car3.brand = "Honda";
        car3.model = "Civic";
        car3.year = 2022;

        car1.displayInfo();
        System.out.println("Age: " + car1.calculateAge());
        System.out.println("Vintage: " + car1.isVintage());
        System.out.println();

        car2.displayInfo();
        System.out.println("Age: " + car2.calculateAge());
        System.out.println("Vintage: " + car2.isVintage());
        System.out.println();

        car3.displayInfo();
        System.out.println("Age: " + car3.calculateAge());
        System.out.println("Vintage: " + car3.isVintage());
    }
}