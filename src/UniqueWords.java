/* Project: Lab 2
 * Class: UniqueWords.java
 * Author: DeJonte July
 * Date: February 25, 2021
 * This Program counts the number of unique strings in an array list of strings
 */

import java.util.ArrayList;

import com.sun.jdi.Value;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0; 
	  
	  //for loop to iterate through the array list 
      for (int i = 0; i < list.size(); i++){
    	  for (int j = i+1; j < list.size(); j++){
    	 
    		  
    		  //compares the current value (i) to the value that follows it (j)
    	  if(list.get(i).equals(list.get(j))) {
    		  
    		  count++;
    		  }

    	  
  
    		  
    	  }
      
 
      }
      count = list.size() - count; 
	  return count;
	  
   }
   

//main method 
   
   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");

   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
