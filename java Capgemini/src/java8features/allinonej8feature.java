package java8features;

	//ArrayList, Lambda exp, ForEach,Method reference, Stream API, limit,sorted,filter......
	import java.util.ArrayList;

	public class allinonej8feature {

		public static void main(String[] args) 
		{
			ArrayList<String> cl=new ArrayList<>();
			cl.add("Green");
			cl.add("White");
			cl.add("Black");
			cl.add("Yellow");
			cl.add("Pink");
			cl.add("Blue");
			cl.add("Purple");
			cl.add("Orange");
			cl.add("Brown");
			cl.add("Red");
			//Stream.of(cl);//one of the creation method of stream process
			cl.stream()//Created stream //Stream
			//.filter(f->f.startsWith("S"))//filter method with LE
			.limit(4)
			.distinct()//no duplication
			.sorted()
			.forEach(System.out::println);//forEach method with method reference 
		}
	}

