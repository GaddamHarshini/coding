package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class UsersReg {
	static Scanner sc=new Scanner(System.in);
	
	public static  User values(long aadhar)
	{
		
		User b=new User();
		b.setFirstname(sc.next());
		b.setLastname(sc.next());
		b.setAadhar(aadhar);
		b.setAccountno(sc.nextLong());
		b.setAcounttype(sc.next());
		b.setPancardno(sc.next());
		b.setPhoneno(sc.nextLong());
		b.setAddress(sc.next());
        
        return b;
	}
	
	public static void main(String[] args) {
		
          FileInputStream fileinputstream;
		try {
			fileinputstream = new FileInputStream("c:\\programs\\bank.txt");
			ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
			ArrayList<User> userList = (ArrayList<User>)objectinputstream.readObject();
			User a = new User();
			long aadhar=sc.nextLong();
			
			int count=0;
			for (int i = 0; i <userList.size() ; i++) {
				User t=userList.get(i);
				if(t.getAadhar()==aadhar)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("no account present");
				//a.add(setValues());
				userList.add(values(aadhar));
	
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\programs\\bank.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
					objectOutputStream.writeObject(userList);
					System.out.println("registration successful");
				 
			}
			else
			{
				System.out.println("account already exists");
			}
			
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
