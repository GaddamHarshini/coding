package com.bank.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class Cust {
	
	
	public static User setValues()
	{
		User user = new User();
		Scanner sc= new Scanner(System.in);
		
		user.setFirstname(sc.next());
		user.setLastname(sc.next());
		user.setAadhar(sc.nextLong());
		user.setAccountno(sc.nextLong());
		user.setAcounttype(sc.next());
		user.setPancardno(sc.next());
		user.setPhoneno(sc.nextLong());
		user.setAddress(sc.next());
		
		
		return user;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<User> a = new ArrayList<User>();
          a.add(setValues());
          a.add(setValues());
          a.add(setValues());
          a.add(setValues());
          a.add(setValues());
          try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\programs\\bank.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
