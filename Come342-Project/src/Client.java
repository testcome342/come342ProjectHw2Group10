// Author : Tamer Ince
// Date : 14.04.2018
import java.util.*;
public class Client {
	
	private String companyName;
	private String companyAddress;
	private String contactName;
	private String contactEmail;
	
	Scanner giris2=new Scanner(System.in);
	
	Client()
	{
		
	}
	Client(String companyName,String companyAddress,String contactName)
	{
		setClientInfo ( companyName, companyAddress, contactName,contactEmail);
	}
	
	public void setClientInfo (String companyName,String companyAddress,String contactName,String contactEmail)
	{
		this.companyName=companyName;
		this.companyAddress=companyAddress;
		this.contactName=contactName;
		this.contactEmail=contactEmail;
	}
	public void getClientInfo()
	{
		System.out.println("COMPANYNAME :"+companyName);
		System.out.println("COMPANYADDRESS :"+companyAddress);
		System.out.println("CONTACTNAME :"+contactName);
		System.out.println("CONTACTE-Mail :"+contactEmail);
		
		
	}
	
	
	
	
	
	
	

	String getClientCompanyName()
	{
		return companyName;
	}
	

	
	
	
};
