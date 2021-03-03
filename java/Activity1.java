package JavaActivity1;

public class Activity1 extends car{

	public static void main(String[] args) {
		car carName= new car(); 
		 carName.make= 2014;
		 carName.color="Black";
		 carName.transmission="Manual";
		 
		 //calling method
		 
		carName.displayCharacteristics();
		carName.accelarate();
		carName.brake();
		 
		 }

}
