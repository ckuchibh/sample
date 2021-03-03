package JavaActivity1;

public class car {
	 String color;
	 String transmission;
	 int make;
	 int tyres;
	 int doors; 
	 
	public car() {
		this.tyres=4;
		this.doors=4;
}

	public void displayCharacteristics(){
		System.out.println(" \n value of color:  "+ color);
		System.out.println(" \n value of transmission:  "+ transmission);
		System.out.println(" \n value of make:  "+ make);
		System.out.println(" \n value of tyres:  "+ tyres);
		System.out.println(" \n value of doors:  "+ doors);
	}
	
	public void accelarate() {
		
		System.out.println("\n Accelerate please: Car is moving forward, and speed is 100KmPH ");
	}

	public void brake() {
		System.out.println("\n Brakes please : car has stopped");
	}
	
	
	
}
