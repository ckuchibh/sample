package JavaActivity2_1;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
		
	}
}
class MyBook extends Book{

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
	}
	
}
public class Activity2_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBook newbook =new MyBook();
		newbook.setTitle("MY AUTO-BIOGRAPHY");
		System.out.println("Title of my book : " + newbook.getTitle());
	}

}
