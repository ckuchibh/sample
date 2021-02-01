package JavaActivity1;

public class Activity1_1 {
	

	public static void main(String[] args) {
		Car kia = new Car();
        kia.make = 2014;
        kia.color = "Black";
        kia.transmission = "Manual";
    
        //Using Car class method
        kia.displayCharacterstics();
        kia.accelerate();
        kia.brake();
	}

}
