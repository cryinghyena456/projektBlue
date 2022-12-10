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
System.out.println("Hello! Welcome to XXX program");
System.out.println("Please choose an option below");
System.out.print("1: Create File");
System.out.print("  2: Delete File");
System.out.print("  3: Search File");
System.out.print("  4: Sort Files");
System.out.print("  5: Exit Program");


int opt = sc.nextInt();



if(opt == 1) {
	System.out.println("You have choosed to Create a File");
	
	
File f = new File("D:\\Jawa");
	
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
	}
	
	
}else if(opt ==2) {
	
	System.out.println("You have choosed to delete a file");
	System.out.println("Please Enter the Filename that you want to Delete: ");
	
	String 	del = sc.next();
	File fe = new File("D:\\Jawa\\"+del);

	boolean filedelete = fe.delete();
	if(filedelete ==true) {

System.out.print("File deleted");
	}
	else {System.out.println("File not found");
	break;
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
	}else {System.out.println("File not found");
	break;}

}else if(opt == 4) {
	System.out.println("You have choosed to Sort the Files!");
	File fe = new File("D:\\Jawa");
	if(fe.isDirectory()) {
	List les = Arrays.asList(fe.list());
	System.out.println(les);
	Collections.sort(les);
	break;}
	
}

	else if (opt ==5) {
		System.out.println("You have choosed to Exit the Program");
		System.out.println("Exiting the program");
		
		tre = false;
		break;


	
	}
else {
	System.out.println("Invalid Entry. Please choose 1, 2, 3, 4");
}
		}
	}

	

}
