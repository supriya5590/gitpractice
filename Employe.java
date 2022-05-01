/*// wap to class employee having method that ask employee record from user if salary entered
//by user is negative throw exception else print bonus i.e salary+ 2000 .
//display all record using display method*/
package ExceptionHandlingDay2;
import java.util.Scanner;

	// wap to class employee having  method that ask  employee record from user if salary entered 
	//by user is negative throw exception else print bonus i.e salary+ 2000 .
	//display all record using display method 

	class Employee 
	{
		String name;
		int salary;
		
		void accept() throws Exception //in case if exception occur it is passed to calling program 
		// and calling program will handle exception
		{
			Scanner s= new Scanner(System.in);
			System.out.println("enter name and salary");
			name=s.next();
			salary= s.nextInt();
			if(salary<0) throw new Exception();  // raising checked exception 
			else
				System.out.println(" after bonus "+( salary+2000));
		
		}
		
		void display()
		{
			System.out.println("name="+ name + "salary="+(salary+2000));
		}
		
	}



	public class Employe {

		public static void main(String[] args)// throws Exception
		{  try{
			 Employee e= new Employee();
			 e.accept();
		}
		 catch(Exception g){}
		System.out.println(" rest part of program");
		}

	}

	