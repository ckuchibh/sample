package ApiActivities

import javax.imageio.stream.FileImageInputStream

class Activity1b {

	static void main(args) {
		// TODO Auto-generated method stub
		File file = new File("src/test.txt")
		file.createNewFile()
		def inputText ="A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nTh1\$ 1\$ v3ry c0nfus1ng"
		file.write(inputText);
		
		println "Modify Operations"
		//Print the line that has Cow at the end of the line
		file.eachLine { line -> 
			if(line ==~ /^A.*Cow$/) {
				println "Line that ends with 'Cow' is : $line"
			}
		}
		
		//Print the line that start with capital letter 'J'
		file.eachLine { line ->
			if(line ==~ /^J.*$/) {
				println "Line that start with capital letter 'J' is : $line"
			}
		}
		
		//Print the line that has two numbers one after the other
		file.eachLine { line ->
			if(line ==~ /.*\d\d.*/) {
				println "Line that has two numbers one after the other is : $line"
			}
		}
		
		println "Find Operations"
		//Print the string(s) that match the pattern '\S+er'
		def match1 = file.getText() =~ /\S+er/
		println "String(s) that match the pattern '\\S+er' is : ${match1.findAll()}"
		
		//Print the string(s) that match the pattern '\S*\d\W'
		def match2 = file.getText() =~ /\S*\d\W/
		println "String(s) that match the pattern '\\S*\\d\\W' is : ${match1.findAll()}"
		
		
		
		
	}
}
