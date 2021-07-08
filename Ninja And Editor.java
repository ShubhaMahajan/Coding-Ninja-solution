/*Ninja wants to print a book of stories. He created a doc file and sent it to his editor to make some edits. But the file 
got corrupted due to some reasons and made changes in the original file. Ninja did not have a duplicate file of the same, so
he wants to correct the same file. He found that the file has been changed in such a way that all the spaces have been removed 
from the file and the first letter after each space that used to be has been changed to the equivalent uppercase characters.  */

 import java.util.Arrays;
public class Solution {
    public static String editSentence(String str){
      
    		
		String[] st = str.split("");
		String result ="";
			
		  for(int i =0;i<st.length;i++){
			  
	         if(Character.isUpperCase(str.charAt(i))){
	        	 st[i]= " "+st[i].toLowerCase();	
	        	 
	        	 result =  result + st[i];
	        	  continue;
	         }
	         result +=     st[i];
			  
	            
	        }
    	return(result.trim());
}}

    
