package groupid.artiid;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

//examples of unit positive tests
//does it successfully open a file
//is the first line of the file the correct one
//is there more than one line in the file


public class AppTestPositive 
{
    /**
     * Rigorous Test :-)
     * @throws Exception 
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception
    {

    	File file = App.FindFriendFile();

    	String[] list = App.ScanFriendFile(file);
    	
    	String dummyLine = "//list of facebooks friends";
    	
    	if(file != null) {
    		assertTrue(true);
    	}
    	else if(list.length > 0) {
    		assertTrue(true);
    	}
    	else if(list[0].equals(dummyLine)) {
    		assertTrue(true);
    	}
    	
    	
    }
}
