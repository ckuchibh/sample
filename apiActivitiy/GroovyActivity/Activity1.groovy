package APIActivity

class Activity1 {
	
	public static void main(String[] args) {
		def arr = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		
		def strlist=arr.minus([11, 2, 19, 5])
		def intlist=arr.minus(["Mango", "Apple", "Watermelon"])
		
		println strlist.sort()
		println intlist.sort()
		
	}
	
}