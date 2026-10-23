public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Vios", 2022, 4);
        Vehicle motorcycle = new Motorcycle("Yamaha", "NMAXX 155", 2023, 155);

        Vehicle truck = new Truck("Mitshubishi", "Fuso Fighter", 2020, 8);

        Vehicle[] vehicles = {car, motorcycle, truck};

        System.out.println("=== Runtime polymorphism (method overriding) ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.startEngine();
            System.out.println();
        }

    }
}
