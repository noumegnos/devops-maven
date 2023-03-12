package groupid.artiid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//this is an example app that simulates fetching a list of facebook friends
//there is a small text file which the app reads and prints out in the console
//it also contains a series of positive and negative unit tests

//this is an updated version of assignment#3, maven unit testing
//I updated the code to ask for a username and to tell the user "hello"


public class App 
{
	
	//static File file;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        askName();
    }
    
    public static String askName() {
    	
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        
        return userName;
    }
    
    public static String sayHi(String[] args) {
    	
        System.out.println( "Hi" );
        
    	return "Hi";
    }
    
    public static File FindFriendFile() throws Exception {
        
        File myObj = new File("./src/main/java/groupid/artiid//friendlist.txt");
        
        return myObj;
    }
    
    public static String[] ScanFriendFile(File scanMe) throws FileNotFoundException {
        Scanner counter = new Scanner(scanMe);
        Scanner sc = new Scanner(scanMe);
        int countLines = 0;
        
        
//        String[] names = new String[countLines];

        
        while (counter.hasNextLine()) {
        	
        	countLines++;        	
        	System.out.println("Counting: " + countLines + " " + counter.nextLine());

        }
        
        
        counter.close();
        

        
        String[] names = new String[countLines];
        
        int lineIndex = 0;
        
        while(sc.hasNextLine()) {
        	String thisLine = sc.nextLine();
        	
        	names[lineIndex] = thisLine;
        	
        	lineIndex++;
        }
        
        
        sc.close();
        
        for(int i = 0; i < names.length; i++) {
        	System.out.println(names[i]);
        }
        
        return names;
        
    }
    
    public static void AddFileLinesToArray() {
    	
    }
}
