package TestWord;

import com.mycompany.guessing.Guessing;
import com.mycompany.guessing.Words;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class TestWord {
    
   private Guessing guessing;

@BeforeEach
    public void setUp()
    {   

    guessing = new Guessing();

    }

   @Test
   public void testWordArray()
   {
       Words word = new Words();
       String[] actual = word.getWords();
       String[] expected = {"cat", "dog", "bird", "mouse"}; 
               
       assertArrayEquals(expected, actual, "The word array doesn't contain the expected data.");
        
   }
   
   @Test
   public void testTrueValue()
   {            
       assertTrue(guessing.TestWords("cat"), "The guess method should return true for a word that is in the array.");       
   }
   
   @Test 
   public void testFalseValue()
   {              
       assertFalse(guessing.TestWords("donkey"), "The guess method should return true for a word that is in the array.");   
   }
    
}
