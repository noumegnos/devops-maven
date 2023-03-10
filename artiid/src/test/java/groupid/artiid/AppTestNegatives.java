package groupid.artiid;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

//examples of unit tests
//check if the text file exists
//check if the text file is empty

//check if the contents of the text file can be put into a string array
//the text file should have one name on each line, so every line should be an entry in the string array
//so if the text file has only one line, can we consider it a fail? What if someone only has one friend? What if someone has no friends?
//I'll also add one dummy line, so we can assume a successful test gets at least one line
//if it does get only one line, check if this line matches the dummy line



public class AppTestNegatives 
{
    /**
     * Rigorous Test :-)
     * @throws Exception 
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {
//    	String hitest = App.sayHi(null);
//    	
//    	if(hitest == null) {
//    		assertTrue(false);
//    	}
//    	else {
//            assertTrue( true );
//
//    	}
    	
    	
    	File file = App.FindFriendFile();
    	
    	String[] list = App.ScanFriendFile(file);
    	
    	String dummyLine = "//list of facebooks friends";
    	
    	if(file == null) {
    		//if file is null, test fails
    		assertTrue(false);
    	}
    	else if(list == null) {
    		//if array of strings is null, test fails
    		assertTrue(false);
    	}
    	else if(list.length < 2){
    		//if array of friends is less than 2, test might fail
    		if(list.length == 1) {
    			//if list string is not exactly the one that is expected, test fails
    			if(!list[0].equals(dummyLine)) {
    				System.out.println("Only 1 line found; does not match expected line: " + dummyLine + " Found: " + list[0]);
    				assertTrue(false);
    			}
    			else {
    				//in this case, the list returned the expected string, but no friends were found. Success?
    				assertTrue(true);
    			}
    		}
    		else if(list.length < 1) {
    			//length of array is less than 1, something is quite wrong and test fails
        		assertTrue(false);
    		}

    	}
    	else {
    		System.out.println(list.length); //52? that is way too many
    		assertTrue(true);
    	}
    	
    	
    }
}
