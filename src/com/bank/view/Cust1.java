package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.bank.model.User;



public class Cust1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileinputstream = new FileInputStream("c:\\programs\\bank.txt");
			ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
			//User a= (User)objectinputstream.readObject();
			ArrayList<User> userList = (ArrayList<User>)objectinputstream.readObject();
			User a = new User();
			//System.out.println(a.getFirstname()+" "+a.getLastname()+" "+a.getAadhar()+" ");
			a=userList.get(0);
			System.out.println(a.getFirstname()+" "+a.getLastname()+" "+a.getAadhar()+" "+a.getAccountno()+" "+a.getAcounttype()+" "+a.getPancardno()+" "+a.getPhoneno()+" "+a.getAddress());;
			a=userList.get(5);
			System.out.println(a.getFirstname()+" "+a.getLastname()+" "+a.getAadhar()+" "+a.getAccountno()+" "+a.getAcounttype()+" "+a.getPancardno()+" "+a.getPhoneno()+" "+a.getAddress());;
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
