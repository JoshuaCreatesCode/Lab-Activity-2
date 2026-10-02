public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Vehicle("Toyota", "Vios", 2022);
        Vehicle car2 = new Vehicle("Ford", "Ranger", 2021);
        Vehicle car3 = new Vehicle("Mitsubishi", "Montero", 2022);

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