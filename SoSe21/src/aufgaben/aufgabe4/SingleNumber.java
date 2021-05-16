package aufgaben.aufgabe4;

import java.util.*;

/*
 * author : Katharina Schippl
 * bearbeitet mit @ Thao Trang Le
 */

public class SingleNumber 
{
//Example with for loops
	
//	public static int singleNumber(int[] nums) {
//		System.out.print("Input: ");
//		print(nums);
//		int temp_number;
//		final int NOT_FOUND = -1;
//		if(nums.length>0) {
//		    for (int i = 0; i < nums.length; i++) {
//		        boolean flag = true;
//		        temp_number = nums[i];
//		        System.out.print("current temp_number:"+temp_number+" under the index "+i);
//		        for (int j = 0; j < nums.length; j++) {
//		        	System.out.println(" --> comparing with j:"+nums[j]+" under the index "+j);
//		            if (temp_number == nums[j]) {
//		            System.out.println("found a match");
//		                if (i != j) {// if a match found then the loop will terminate
//		    	            System.out.println("under the index:"+i+ "->"+nums[i]+ " and index j:"+j+"->"+nums[j]+" is the same number --> found a duplicate");
//		                    flag = false;
//		                    break;
//		                }
//		            }
//		        }
//		        if (flag == true) {
//		           int answer = temp_number;
//		           System.out.println("Output: "+answer);
//		           return answer;
//		        }
//		    }
//		}
//		System.out.println("Not found!");
//		return NOT_FOUND;
//	}
//	
//	static void print(int[] arr) {
//		for (int element: arr) {
//            System.out.print(element+" ");
//        }
//		System.out.println();
//	}
	
	
	//Example with List
	
	 public static int singleNumber(int[] nums) 
	 {
	    List<Integer> list = new ArrayList<>(); // List muss man immer importieren
	    final int NOT_FOUND = -1;
	    
	    for (int i : nums) //für jede integer im array
	    {
	      if (!list.contains(i)) // wenn die liste den wert untern dem indes nicht hat dannn fügt man diese hinzu
	      {
	        list.add(i);
	      } 
	      else //wenn es enthalten ist --> remove
	      {
	        list.remove(new Integer(i)); //remove methode ist überladen
	      }
	    }
	    
	    if(list.size()==0) //list.isEmpty() //list.size ist wie bei array die länge
	    {
	    	System.out.println("No unique number is found.");
	    	return NOT_FOUND;
	    }
	    else 
	    { 
	    	// System.out.println(list);
	    	for(int i=0;i<list.size();i++)
	    	{
	    	    System.out.println(list.get(i));
	    	}
		    return list.get(0); // unique number, einziger eintrag in der list
	    }
	  }
		
	public static void main(String[] args) 
	{
		int [] input = {4,2,3,4,2};
		singleNumber(input);
	}

}
