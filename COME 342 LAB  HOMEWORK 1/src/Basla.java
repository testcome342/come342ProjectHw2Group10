//Author: ANIL KARLIDAG
//Date: 14.04.2018 
import java.util.*;

public class Basla {

	public static void main(String[] args) {
		BackStage basla=new BackStage();
		String toDo;
		Scanner input=new Scanner(System.in);
		System.out.println("------------------AGATE LTD-----------------");
		System.out.println("\r\n" + "PLEASE WRITE WHAT WANT  TO DO");
		System.out.println("(add new client)-(get all clients)**these are the options you can type**");  
		while(true)                                                
		{
			
			toDo = input.nextLine();
			if (toDo.equalsIgnoreCase("add new client"))
			{
				basla.addNewClient();
			}
			if (toDo.equalsIgnoreCase("get All Clients"))
			{
				basla.getAllClients();
			}
			if(!toDo.equalsIgnoreCase("add new client")&&!toDo.equalsIgnoreCase("get All Clients"))
					{
				System.out.println("please make a proper request");
					}
        	
		}

	}

}
