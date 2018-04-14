//Author: ANIL KARLIDAG
//Date: 14.04.2018 
import java.util.ArrayList;            
import java.util.Scanner;

public class BackStage {
	
	ArrayList<Client> Client=new ArrayList<>();

	Scanner input = new Scanner(System.in);

 public	int clientSayaci = 0;
	
	void addNewClient()
	{
		String CompanyName, companyAddress, contactName,contactEmail;
		System.out.println("how many client you want to add ? ");
		int manyClient = Integer.parseInt(input.nextLine());
		 
			for (int i = 0; i < manyClient; i++) {
                                Client temp=new Client();
				System.out.println("please enter the " +(i+1)+ ". CompanyName,companyAddress,contactName,contactEmail");
				CompanyName = input.nextLine();
				companyAddress = input.nextLine();
				contactName = input.nextLine();
				contactEmail=input.nextLine();

				temp.setClientInfo(CompanyName, companyAddress, contactName, contactEmail);
                                Client.add(temp);
				clientSayaci++;
				System.out.println("client  added");
			}
			
	}
	  void getAllClients()
	    {
		  for (int i = 0; i < clientSayaci; i++) {
				System.out.print((i+1)+".");
			  Client.get(i).getClientInfo();
			  
			}
		  System.out.println("******************************************");
	    }
	}







