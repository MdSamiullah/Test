package CodeCounter;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class CodeCount {
	public static void main(String[] args) throws Exception{
		int lineCount = 0;
		int I = 0;
		
	    String directory1 = "C:\\Users\\msamiull\\workspace\\NETPlusPlus\\src\\";
	    String directory2 = "C:\\Users\\msamiull\\workspace\\NETPlusPlus\\src\\components\\";
	    String directory3 = "C:\\Users\\msamiull\\workspace\\IOOBNGUI\\src\\test\\";
	    
	    File folder1 = new File(directory1);
	    File[] listOfFiles1 = folder1.listFiles();
	    
	    File folder2 = new File(directory2);
	    File[] listOfFiles2 = folder2.listFiles();
	    
	    File folder3 = new File(directory3);
	    File[] listOfFiles3 = folder3.listFiles();
	    
	    for(I = 0; I <listOfFiles1.length; I++){
	    	if(listOfFiles1[I].isFile()){
		    	LineNumberReader  lnr = new LineNumberReader(new FileReader(new File(listOfFiles1[I].toString())));
		    	lnr.skip(Long.MAX_VALUE);
	//   		System.out.println(lineCount = lnr.getLineNumber() + 1); //Add 1 because line index starts at 0
		    	lineCount += lnr.getLineNumber() + 1;
	    	}
	    }
	    
	    for(I = 0; I <listOfFiles2.length; I++){
	    	if(listOfFiles2[I].isFile()){
		    	LineNumberReader  lnr = new LineNumberReader(new FileReader(new File(listOfFiles2[I].toString())));
		    	lnr.skip(Long.MAX_VALUE);
	//   		System.out.println(lineCount = lnr.getLineNumber() + 1); //Add 1 because line index starts at 0
		    	lineCount += lnr.getLineNumber() + 1;
	    	}
	    }
	    
	    for(I = 0; I <listOfFiles3.length; I++){
	    	if(listOfFiles3[I].isFile()){
		    	LineNumberReader  lnr = new LineNumberReader(new FileReader(new File(listOfFiles3[I].toString())));
		    	lnr.skip(Long.MAX_VALUE);
	//   		System.out.println(lineCount = lnr.getLineNumber() + 1); //Add 1 because line index starts at 0
		    	lineCount += lnr.getLineNumber() + 1;
	    	}
	    }
	    
	    LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("C:\\Users\\msamiull\\workspace\\NppANTLR\\NETPlusPlus.g4")));
    	lnr.skip(Long.MAX_VALUE);
	    lineCount += lnr.getLineNumber() + 1;
	    
	    lnr = new LineNumberReader(new FileReader(new File("C:\\Users\\msamiull\\workspace\\NETPlusPlus\\src\\CodeCounter\\CodeCount.java")));
    	lnr.skip(Long.MAX_VALUE);
	    lineCount += lnr.getLineNumber() + 1;
	    
	    System.out.println("Total Number of Lines : " + lineCount);
	
//   	Finally, the LineNumberReader object should be closed to prevent resource leak
//	    lnr.close();
	    
	}
}
