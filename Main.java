public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
			vehicle.moveForward();
			vehicle.moveBackwards();
			vehicle.moveLeft();
			vehicle.moveRight();
			System.out.println(" ");
			
		}
		
		public static void performService(Serviceable item){
			item.service();
		}

	public static void main(String[] args) {

		Serviceable car = new Car("Toyota", "Corolla", 2022, 4);
		Serviceable motor = new Motorcycle("Yamaha", "R15M", 2023, 155);
		Serviceable truck = new Truck("Isuzu", "Elf", 2021, 6);
		Serviceable printer = new Printer();

		Vehicle[] vehicles = {
			new Car("Toyota", "Corolla", 2022, 4),
			new Motorcycle("Yamaha", "R15M", 2023, 155),
			new Truck("Isuzu", "Elf", 2021, 6)
		};
		
		for(Vehicle currentVehicle: vehicles){
			printDetails(currentVehicle);
		}

			Serviceable[] service = {
			car,
			motor,
			truck,
			printer
		};

		System.out.println(" ");
		
		//Loop for serviceable
		for(Serviceable currentService: service){
			performService(currentService);
		}

}
}