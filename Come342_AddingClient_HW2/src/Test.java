

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	
	ArrayList<Client> Client=new ArrayList<>();

	Scanner input = new Scanner(System.in);

 public	int clientSayacı = 0;
	int manyCampaign;
	void addNewClient()
	{
		String CompanyName, companyAddress, contactName,contactEmail;
		System.out.println("how many client you wanna add ");
		int manyClient = Integer.parseInt(input.nextLine());
		 
			for (int i = 0; i < manyClient; i++) {
                Client temp=new Client();
				System.out.println("please enter the CompanyName,companyAddress,contactName,contactEmail");
				CompanyName = input.nextLine();
				companyAddress = input.nextLine();
				contactName = input.nextLine();
				contactEmail=input.nextLine();

				temp.setClientInfo(CompanyName, companyAddress, contactName, contactEmail);
                 Client.add(temp);
				clientSayacı++;
			}
	}
	
	
	  void getAllClients()
	    {
		  for (int i = 0; i < clientSayacı; i++) {
			  Client.get(i).getClientInfo();
			}
	    }
}





