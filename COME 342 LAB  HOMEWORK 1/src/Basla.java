//Author: ANIL KARLIDA�
//Date: 14.04.2018 
import java.util.*;

public class Basla {

	public static void main(String[] args) {
		BackStage basla=new BackStage();
		String toDo;
		Scanner input=new Scanner(System.in);
		System.out.println("------------------AGATE LTD-----------------");
		System.out.println("\r\n" + "PLEASE WRITE WHAT WOULD YOU L�KE TO DO");
		System.out.println("(add new client)-(get all clients)");   //bu se�eneklerden birini yaz�p istedi�imiz kaddr add client yap�p daha sonra get all clients diyerek b�t�n eklenenlerin bilgilerine ula�abliyoruz
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
        	
		}

	}

}
