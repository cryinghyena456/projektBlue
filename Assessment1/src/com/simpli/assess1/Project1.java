package com.simpli.assess1;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class Project1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Hello! Welcome to XXX program");
System.out.println("Please choose an option below");
System.out.print("1: Create File");
System.out.print("  2: Delete File");
System.out.print("  3: Search File");
System.out.print("  4: Exit Program");

File f = new File("D:\\Gitess");
String ans = sc.next();


f.mkdir();
File fe = new File("D:\\Gitess\\"+ans);
fe.createNewFile();
int opt = sc.nextInt();
System.out.println(f.listFiles());


if(opt == 1) {
	System.out.println("You have choosed to Create a File");
}else if(opt ==2) {
	System.out.println("You have choosed to delete a file");
}else if (opt ==3) {
	System.out.println("You have choosed to Search a File");
}else if(opt == 4) {
	System.out.println("You have choosed to exit!");
}
else {
	System.out.println("Invalid Entry. Please choose 1, 2, 3, 4");
}
	}

}
