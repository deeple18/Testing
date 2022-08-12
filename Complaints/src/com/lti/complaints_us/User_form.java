package com.lti.complaints_us;

import java.util.Scanner;
public class User_form {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Complaint_reader com= new Complaint_reader();
		com.loaddata();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Portal..................!");
		System.out.println("Complaint Fetcher********");
		System.out.println("Enter your option between 1 to 7");
		System.out.println("1.Complaints based on the year");
		System.out.println("2.Complaints based on the name of the bank");
		System.out.println("3.Complaints based on the complaint id");
		System.out.println("4.Number of days took by the Bank to close the complaint ");
		System.out.println("5.Complaints closed/closed with explanation ");
		System.out.println("6.Complaints which received a timely response ");
	    System.out.println("7.Take User Complaint");
		System.out.println("8.Exit");
		
		System.out.println("Demo.......Jenkins");
		int option=sc.nextInt();
		sc.nextLine();
		switch(option)
		{
		case 1: 
			System.out.println("Enter year");
			String year=sc.next();
			com.complaintsBasedOnYear(year);
		break;
		case 2:
			System.out.println("Enter company name");
		    String u_company=sc.nextLine();
			com.complaintsBasedOnCompany(u_company);
		break;
		case 3: 
			System.out.println("Enter complaint ID");
			String id=sc.next();
			com.complaintsBasedOnComplaintID(id);
		break;
		case 4: 
			System.out.println("Enter complaint ID");
			String compid=sc.next();
			com.NoOfDaysTOCloseComplaint(compid);
		break;
		case 5: 
			com.complaintsClosed();
		break;
		case 6: 
			com.complaintsReceivingTimelyResponse();
		break;
		case 7:
			com.UserComplaint();
		break;	
		case 8:
			System.out.println("Exit.........!(BYE)");
		break;
		default: System.out.println("Enter valid option");
		}while(option>8);
		sc.close();
	}
}
