package ne222hz_assign3.Exercise4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MyDataChart {
	
	public static Integer [] reading(String filename) throws IOException{
		int value;
		int []count = new int[10];
		String[] lines = Files.readAllLines(new File(filename).toPath()).toArray(new String[0]);
	    for (String line : lines) {
	    	value = Integer.valueOf(line);
	    	System.err.println("############# "+value);
	    	if (value < 10) {
		        count[0]++;
		      } else if (value >= 10 && value < 20) {
		    	  count[1]++;
		      } else if (value >= 20 && value < 30) {
		    	  count[2]++;
		      } else if (value >= 30 && value < 40) {
		    	  count[3]++;
		      } else if (value >= 40 && value < 50) {
		    	  count[4]++;
		      } else if (value >= 50 && value < 60) {
		    	  count[5]++;
		      } else if (value >= 60 && value < 70) {
		    	  count[6]++;
		      } else if (value >= 70 && value < 80) {
		    	  count[7]++;
		      } else if (value >= 80 && value < 90) {
		    	  count[8]++;
		      } else {
		    	  count[9]++;
		      }
		    }
	    

	    Integer[] newArray = new Integer[count.length];
	    int i = 0;
	    for (Integer v : count) {
	        newArray[i++] = Integer.valueOf(v);
	    }
		    return newArray;
	}

}
