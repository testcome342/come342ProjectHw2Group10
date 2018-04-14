// Author : Tamer Ince

// Date  : 14.04.2018

import java.util.*;

public class Basla {

	public static void main(String[] args) {
		Test basla=new Test();
		String toDo;
		Scanner input=new Scanner(System.in);
		System.out.println("------------------AGATE LTD-----------------");
		while(true)
		{
			System.out.println("\r\n" + "To add Clients Press -1- \nto get info Of the Clients press -2-");
			toDo = input.nextLine();
			if (toDo.equalsIgnoreCase("1"))
			{
				basla.addNewClient();
			}
			if (toDo.equalsIgnoreCase("2"))
			{
				basla.getAllClients();
		 	}
        	
		}

	}

}
