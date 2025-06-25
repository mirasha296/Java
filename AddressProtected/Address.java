
/**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Address//set to protected
{
	protected String StreetNum;
	protected String StreetName;
	protected String Apt;
	protected String City;
	protected String State;
	protected String ZipCode;

    public class Address()//default constructor
    {
		StreetNum = new String();
		StreetName = new String();
		Apt = new String();
		City = new String();
		State =  new String();
		ZipCode = new String;
    }

    private class Address(String newStreetNum, String newStreetName , 
                        	String newApt, String NewCity, String newState,
                                	String NewZip )//conversion constructor 
    {
    	if(newStreetNum == null)
		{
			System.out.println(“illegal Street number”);
			System.exit(0);
		}
		if(newStreetName == null)
		{
			System.out.println(“illegal Street name”);
			System.exit(0);
		}
		if(newApt == null)
		{
			System.out.println(“illegal Apt”);
			System.exit(0);
		}
		if(newCity == null)
		{
			System.out.println(“illegal City”);
			System.exit(0);
		}
		if(newState == null)
		{
			System.out.println(“illegal State”);
			System.exit(0);
		}
		if(newZip == null)
		{
			System.out.println(“illegal Street number”);
			System.exit(0);
		}
	
		StreetNum =  String(newStreetNum);
		StreetName = String(newStreetName);
		Apt = String(newApt);
		City = String(NewCity);
		State = String(newState);
		ZipCode = String(NewZip);
	}
	
	public Address(Address other)
	{
		if(other == null){
			System.out.println(“null address”);
			System.exit(0);
		}
		if(other StreetNum == null; || other StreetName == null; || other Apt == null || other City == null || other State == null || other ZipCode == null){
			System.out.println(“illegal Address”);
			System.exit(0)
		} else
		{
		StreetNum =  new String(other.StreetNum);
		StreetName = new String(StreetName);
		Apt = new String(Apt);
		City = new String(City);
		State = new String(State);
		ZipCode = new String(ZipCode);
		}
	}
	//Accessors 
	public String getAddress()
	{
		return (new String(address));
	}
	public String getStreetNum()
	{
		return new String(StreetNum);
	}
	public String getStreetName()
	{
		return new String(StreetName);
	}
	public String getApt()
	{
		return new String(Apt);
	}
	public String getCity()
	{
		return new String(City);
	}
	public String getState()
	{
		return new String(State);
	}
	public String getZip()
	{
		return new String(ZipCode);
	}

	\\mutator
	public void setStreetNum(string newStreetNum)
	{
		if(newStreetNum == null)
		{
			System.out.println(“illegal Street Number”);
			System.exit(0);
		}
		else
		{
			StreetNum = new String(newStringNum);
		}
	}
	public void setStreetName(string newStreetName)
	{
		if(newStreetName == null)
		{
			System.out.println(“illegal Street Name”);
			System.exit(0);
		}
		else
		{
			StreetName = new String(newStringName);
		}
	}
	public void setApt(string newApt)
	{
		if(newApt == null)
		{
			System.out.println(“illegal Apartment”);
			System.exit(0);
		}
		else
		{
			Apt = new String(newApt);
		}
	}
	public void setCity(string newCity)
	{
		if(newCity == null)
		{
			System.out.println(“illegal City”);
			System.exit(0);
		}
		else
		{
			City = new String(newCity);
		}
	}
	public void setState(string newState)
	{
		if(newState == null)
		{
			System.out.println(“illegal State”);
			System.exit(0);
		}
		else
		{
			State = new String(newState);
		}
	}
	public void setZipCode(string newZip)
	{
		if(newZip == null)
		{
			System.out.println(“illegal Zip Code”);
			System.exit(0);
		}
		else
		{
			ZipCode = new String(newZip);
		}
	}
	public boolean equals(Address other)
	{
		return streetNum.equals(other.StreetNum) && streetName.equals(other.StreetName) &&
			Apt.equals(other.Apt) &&
			City.equals(other.City) &&
			State.equals(other.State) &&
			ZipCode.equals(ZipCode);
	}
	public String toString()
	{
		return StreetNum + “ “ +  StreetName + “ ” + Apt + “ “ + City = “ ” + State + “ ” + ZipCode;
	}
	
	public class BusinessAddress extends Address	
	{
		private String MailStop;
		public BusinessAddress()
		{
			Super();
			MailStop = new String()
		}
	}
	public BusinessAddress(String newStreetNum, String newStreetName, String newApt, String newCity, String newState, String NewZip, String newMailStop)
	{
		Super(newStreetNum, newStreetName, newApt, newCity, newState, NewZip);
		if(newMailStop == null)
		{
			System.out.println(“illegal Address”);
			System.exit(0);
		}
		else
		{
			MailStop = new String(newMailStop);
		}
	}
	public BusinessAddress(BusinessAddress other)
	{
		Super(other.StreetNum, other.StreetName, other.Apt, other.City, other.State, other.Zip);
		if(other.MailStop == null)
		{
			System.out.println(“illegal Address”);
			System.exit(0);
		}
		else
		{
			MailStop = new String(other.MailStop);
		}
	}
	public String getMailStop()
	{
		return new String(MailStop);
	}
	public void setMailStop(String MailStop)
	{
		if(MailStop == null)
		{
			System.out.println(“illegal mail stop”);
			System.exit(0);
		}
		MailStop = new String(MailStop);
	}
	public boolean equals(BusinessAddres other)
	{
		return streetNum.equals(other.StreetNum) && streetName.equals(other.StreetName) &&
			Apt.equals(other.Apt) &&
			City.equals(other.City) &&
			State.equals(other.State) &&
			ZipCode.equals(ZipCode) &&
			MailStop.equals(other.MailStop);
	}
	public String toString()
	{
		return return StreetNum + “ “ +  StreetName + “ ” + Apt + “ “ + City = “ ” + State + “ ” + ZipCode + “ “ MailStop;
	}
}

