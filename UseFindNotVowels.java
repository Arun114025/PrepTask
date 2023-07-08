package Day2;

public class UseFindNotVowels {
	public static void main(String[] args) {
		 UseFindNotVowels b=new  UseFindNotVowels();
		  String[] c= {"arun","aravind","sum","moon","xyz"};
		  
  FindNotVowelsWords d=(i->{
		  for(String x:i) {
			  if(x.contains("a")||x.contains("e")||x.contains("i")||x.contains("o")||x.contains("u")) {
			  continue;
		  }
			  else {
				  System.out.println(x);
			  }
		  }
  });
  d.findVowels(c);
	}
}
