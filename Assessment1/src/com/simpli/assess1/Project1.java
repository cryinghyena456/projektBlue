package com.simpli.assess1;
import java.io.File;

import java.io.IOException;
import java.util.*;


public class Project1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		boolean tre = true;
		while(tre) {
Scanner sc = new Scanner(System.in);
System.out.println("Hello! Welcome to LOCKEDME program");
System.out.println("");
System.out.println("Program created by: Trideep Deka");
System.out.println("S/W Development Trainee at LOCKEDME.COM");
System.out.println("");
System.out.println("Please choose an option below");
System.out.println("  1: Sort Files");
System.out.println("  2: Create A File");
System.out.println("  3: Search A File");
System.out.println("  4: Delete A File");
System.out.println("  5: Exit The Program");


int opt = sc.nextInt();



if(opt == 1) {
	System.out.println("You have choosed to Sort the Files");
	
	

	
File fe = new File("D:\\Jawa");
if(fe.isDirectory()) {
List les = Arrays.asList(fe.list());
System.out.println(les);
Collections.sort(les);

System.out.println(" ");
}


	
	
}else if(opt ==2) {
	
File f = new File("D:\\Jawa");
System.out.println("You have choosed to Create a File");
	System.out.println("Please Enter file name: ");
	
	String ans = sc.next();
	
	List les = Arrays.asList(f.list());
	boolean res = les.contains(ans);
	if(res != true) {

	f.mkdir();
	File fe = new File("D:\\Jawa\\"+ans);
	fe.createNewFile();
	System.out.println("File created!");
	System.out.println(" ");
	}else {
		System.out.println("File already exists!");
		System.out.println("");
	}
	
}else if (opt ==3) {
	System.out.println("You have choosed to Search a File");
	System.out.println("Please Enter the Filename that you want to search for: ");
	String entry = sc.next();
	File fe = new File("D:\\Jawa");
	
	List les = Arrays.asList(fe.list());
	boolean contain = les.contains(entry);
	
	if(contain == true) {
		System.out.println("File with the name "+ entry+" Has been found");
	}else {System.out.println("File not found. Please Try again");
	System.out.println("");
	}

}else if(opt == 4) {
	System.out.println("You have choosed to delete a file");
	System.out.println("Please Enter the Filename that you want to Delete: ");
		
		String 	del = sc.next();
		File fe = new File("D:\\Jawa\\"+del);

		boolean filedelete = fe.delete();
		if(filedelete ==true) {

	System.out.print("File deleted");
	System.out.println("");
		}
		else {System.out.println("File not found. Please Try again");
		System.out.println("");
		
		}
	
}

	else if (opt ==5) {
		System.out.println("You have choosed to Exit the Program");
		System.out.println("Thanks for using my program. Exiting the program now");
		System.out.println("");
		
		tre = false;
		break;


	
	}
else {
	System.out.println("Invalid Entry. Please choose 1, 2, 3, 4");
	System.out.println("");
}
		}
	}

	

}
