/* 
Author : Mustafa Burak Altıntaş
Date : 14.04.2018 
*/

import java.util.*;

public class Basla {

	public static void main(String[] args) {
		Test basla=new Test();
		String toDo;
		Scanner input=new Scanner(System.in);
		System.out.println("**AGATE LTD**");
		while(true)
		{
			System.out.println("\r\n" + "Please enter what you want to do.");
			toDo = input.nextLine();
			if (toDo.equalsIgnoreCase("add client"))
			{
				basla.addNewClient();
			}
			if (toDo.equalsIgnoreCase("get All Clients"))
			{
				basla.getAllClients();
			}	
		}
	}
}
