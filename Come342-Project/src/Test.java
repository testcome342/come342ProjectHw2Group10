// Author : Tamer Ince

// Date : 14.04.2018

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	
	ArrayList<Client> Client=new ArrayList<>();

	Scanner input = new Scanner(System.in);

 public	int clientSayaci = 0;
	int manyCampaign;
	void addNewClient()
	{
		String CompanyName, companyAddress, contactName,contactEmail;
		System.out.println("Please Add how many Clients You want to add ");
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
				clientSayaci++;
			}
	}
	  void getAllClients()
	    {
		  for (int i = 0; i < clientSayaci; i++) {
				
			  Client.get(i).getClientInfo();
			}
	    }
     
  
	 
	  	

	
	

	
		

	

		
	

	}







