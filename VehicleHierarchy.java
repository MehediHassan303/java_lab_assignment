//Assignment-3
class Vehicle{
	String brand;
	String model;
	int year;
	Vehicle(String brand,String model,int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	void displayVehicleDetails(){
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
	}
}
class Car extends Vehicle{
	String color;
	Car(String brand,String model,int year,String color){
		super(brand,model,year);
		this.color=color;
	}
	void displayVehicleDetails(int seat){
         super.displayVehicleDetails();
		/*System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);*/
		System.out.println("Color:"+color);
		System.out.println("Number of seat:"+seat);
	}
}
class Truck extends Vehicle{
	int wheel;
	Truck(String brand,String model,int year,int wheel){
			super(brand,model,year);
			this.wheel=wheel;
	}
	void displayVehicleDetails(String date){
	         super.displayVehicleDetails();
			/*System.out.println("Brand:"+brand);
			System.out.println("Model:"+model);
			System.out.println("Year:"+year);*/
			System.out.println("Number of wheel:"+wheel);
			System.out.println("Date:"+date);
	}
}
class Motorcycle extends Vehicle{
	int cc;
	Motorcycle(String brand,String model,int year,int cc){
			super(brand,model,year);
			this.cc=cc;
	}
	void displayVehicleDetails(String country){
	         super.displayVehicleDetails();
			/*System.out.println("Brand:"+brand);
			System.out.println("Model:"+model);
			System.out.println("Year:"+year);*/
			System.out.println("CC:"+cc);
			System.out.println("Country:"+country);
	}
}
//main class
class VehicleHierarchy{
	public static void main(String[] args){
		Car car=new Car("Toyota","corolla",2018,"Black");

		car.displayVehicleDetails(4);
		System.out.println("\n");
        car.displayVehicleDetails();
        System.out.println("\n");
        Truck truck=new Truck("TATA","model1",2019,10);
        truck.displayVehicleDetails();
		System.out.println("\n");
        truck.displayVehicleDetails("15 October");
        System.out.println("\n");
		 Motorcycle motor=new Motorcycle("Yamaha","R15",2023,150);
		 motor.displayVehicleDetails();
		 System.out.println("\n");
        motor.displayVehicleDetails("India");
	}
}