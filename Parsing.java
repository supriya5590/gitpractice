package ExceptionHandlingDay2;
public class Parsing {

	public static void main(String[] args) {
   
    try
    {
		 String n= "100";
		 int h= Integer.parseInt(n);   //h=100
		 
		 
		String n2= "100abc";
		 int h2= Integer.parseInt(n2);   //h=100
	
        System.out.println(h);
    }
    catch(NumberFormatException r)
    {
    	System.out.println(" data is not correct");
    }
		 
	}

}

