package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService implements ICredentialsService {

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMN";
		String smallCaseLetters = "ABCDEFGHIJKLMNOPQR";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%+-_<>";
		String values = capitalLetters + smallCaseLetters + numbers + specialCharacters;
		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		for (int index = 0; index < 8; index++) {
			int randomCharacter =random.nextInt(values.length());
			strBuffer.append(values.charAt(randomCharacter));
		}
		
		return strBuffer.toString();
	}

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		return firstName.trim().toLowerCase() + lastName.trim().toLowerCase() + "@" + department.toLowerCase() + ".abc.com";
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatePassword) {
		System.out.println("Dear "+employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email -> "+email);
		System.out.println("Password -> "+ generatePassword);
		
	}

}
