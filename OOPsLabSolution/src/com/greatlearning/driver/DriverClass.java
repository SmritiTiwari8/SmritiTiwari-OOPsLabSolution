package com.greatlearning.driver;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import java.util.Scanner;

public class DriverClass {
	private static final CredentialService credentialService = new CredentialService();
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//System.out.println("Please enter your first and last name ");
		//String firstName = sc.nextLine();
		//String lastName = sc.nextLine();
		
		String firstName = "Harshit";
		String lastName = "Choudary";
		
		Employee employee = new Employee(firstName, lastName);
		
		String generatedEmail;
		String generatedPassword;
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. HR");
		System.out.println("3. Admin");
		System.out.println("4. Legal");
		
		int departmentNumber = sc.nextInt();
		
		switch(departmentNumber) {
		case 1:
		{
			generatedPassword = credentialService.generatePassword();
			generatedEmail = credentialService.getEmailAddress(firstName, lastName, "Technical");
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 2:
		{
			generatedPassword = credentialService.generatePassword();
			generatedEmail = credentialService.getEmailAddress(firstName, lastName, "HR");
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 3:
		{
			generatedPassword = credentialService.generatePassword();
			generatedEmail = credentialService.getEmailAddress(firstName, lastName, "Admin");
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		case 4:
		{
			generatedPassword = credentialService.generatePassword();
			generatedEmail = credentialService.getEmailAddress(firstName, lastName, "Legal");
			credentialService.showCredentials(employee, generatedEmail, generatedPassword);
		}
		break;
		}
	}

}
