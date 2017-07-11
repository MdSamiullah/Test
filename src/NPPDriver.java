/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import com.itextpdf.text.pdf.parser.Path;

import components.NewClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 	1. overlapping management (node, instance, potential, IO)

	2. parent interfaces and classes must be compiled and with the extension .oobn

	If it is a standalone interface or class then .oobn can be ensured using Hugin i.e. easy and standard

	If it is a derived one (interafce or class) then must be in ioobn format but after compilation a ".oobn" 
	version will be generated for this in our system. So, from all angles it is clear.

	Code changing: for parent component extraction, use .oobn extension

 * 
 * */

public class NPPDriver {

	public static int noOfErrors;
	
	public static ParseTree performParsing(String inputFile, String directory) throws IOException{
        String tempInputFile = "temp";	
        
        Scanner Sc = new Scanner (new File(directory+inputFile));
        
        FileWriter write = new FileWriter(tempInputFile);
		PrintWriter print_line = new PrintWriter(write);
		
		String line;
		while(Sc.hasNext()){
			line = Sc.nextLine();
			line = line.split("%")[0];
			print_line.println(line);
		}
        print_line.close();

        InputStream is = System.in;
        if ( tempInputFile!=null ) is = new FileInputStream(tempInputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        NETPlusPlusLexer lexer = new NETPlusPlusLexer(input);
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NETPlusPlusParser parser = new NETPlusPlusParser(tokens);
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        
        System.out.println("\n");
        ParseTree tree = parser.prog(); // parse
        
        noOfErrors = ThrowingErrorListener.errorCount;
        
        ThrowingErrorListener.errorCount = 0; // resetting count for other files
        
        return tree;
	}
	
	public void generateCode(String directory, String fileName, String extension) throws Exception
	{
		String className;
        
        className = fileName;
        
        NewClass classFileStructure;
        
        ParseTree tree = performParsing(className+extension, directory);
        
        if(noOfErrors > 0)        System.err.println("Total error found: " + noOfErrors);
        else{
        	NPPvisit traverse = new NPPvisit();
            traverse.visit(tree); // visit() can be found in "String org.antlr.v4.runtime.tree.AbstractParseTreeVisitor.visit(ParseTree tree)"
            
            classFileStructure = new NewClass(className, traverse.classNode.getType());
            classFileStructure.insertOwnComponent(traverse.classNode);
            
            if(traverse.parentClassList != ""){
            	String str = traverse.parentClassList.trim();
            	
            	if((new File(directory + str + extension)).exists() == false){
            		System.err.println("parent class: " + str + "not found");
            	}
            	else{
	            	tree = performParsing(str+extension, directory);
	            	if(noOfErrors > 0)	System.err.println("Total error found: " + noOfErrors);
	            	else{
	            		NPPvisit traverse1 = new NPPvisit();
	                    traverse1.visit(tree);
	                    classFileStructure.insertParentComponent(traverse1.classNode);
	            	}
            	}
            }
            
            String parentInterfaces = traverse.parentInterfaceList;
            
            if(parentInterfaces != ""){
            	String strArray[] = parentInterfaces.split("[ ,]");
            	for( int I = 0; I < strArray.length; I++){
            		if((new File(directory + strArray[I] + extension)).exists() == false){
                		System.err.println("parent interface: " + strArray[I] + " not found");
                	}
                	else{
	            		tree = performParsing(strArray[I]+extension, directory);
	                	if(noOfErrors > 0)	System.err.println("Total error found: " + noOfErrors);
	                	else{
	                		NPPvisit traverse1 = new NPPvisit();
	                        traverse1.visit(tree);
	                        classFileStructure.insertParentComponent(traverse1.classNode);
	                	}
                	}
            	}
            }
            
            /* Overriding is handled here in the following line in combineComponents() method
             * there is a chance of overriding/over writing components with same name in the map of
			 * combined class. So, parent classes components should be added first, to ensure overriding 
			 * prioritize own components. 
			 * 
			 */
            classFileStructure.combineComponents();
            //classFileStructure.printCode(1);
            classFileStructure.generateCode(directory+"GeneratedFiles\\"+className, 1, instanceClassOrderForCompile);
        }
	}
	
	public ArrayList<String> fileListFromDir(String path)
	{
		ArrayList<String> classList = new ArrayList<String>();
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				//System.out.println("File " + listOfFiles[i].getName());
//				String fileName = listOfFiles[i].getName().split(".")[0];
				String fileName = listOfFiles[i].getName().replace(".ioobn", "");
				classList.add(fileName);
			} 
			else if (listOfFiles[i].isDirectory()) {
				//System.out.println("Directory " + listOfFiles[i].getName());
			}
		}
		
		return classList;
	}
	
	public ArrayList<String> fileListFromConsole()
	{
		ArrayList<String> classList = new ArrayList<String>();
		
		String fileName = "";
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please provide the class names one by one and indicate end by END");
    	while(true){
            fileName = sc.next();
            if(fileName.equalsIgnoreCase("END"))
            	break;
            else{
            	classList.add(fileName);
            	System.out.print("Please provide next class name: ");
            }
    	}
		
		return classList;
	}
	
	public void compileAllFiles(String directory, String extension) throws Exception
	{
    	File codeGenDir = new File(directory + "GeneratedFiles\\");
    	java.nio.file.Path codeGenDirPath = Paths.get(directory + "GeneratedFiles\\");
    	
    	//Files.deleteIfExists(codeGenDirPath);
    	
    	boolean successful = codeGenDir.mkdir();
    	
    	Scanner S = new Scanner (System.in);
    	String choice;
    	
    	System.out.println("Press D for input from default directory or C for console filename list");
    	choice = S.next();
    	
    	ArrayList<String> classNameList = new ArrayList<String>();
    	
    	if(choice.equalsIgnoreCase("D")){
    		classNameList = fileListFromDir(directory);
    	}
    	else if(choice.equalsIgnoreCase("C")){
    		classNameList = fileListFromConsole();
    	}
    		
    	String fileName = "";
    	for(int I = 0; I < classNameList.size(); I++){
    		fileName = classNameList.get(I);
        	generateCode(directory, fileName, extension);
    	}
	}
	
	/*
	 * this is for maintaining the order of classes (because of instances need to be loaded first before they are used)
	 * in Hugin code
	 * 
	 */  
	static Stack<String> instanceClassOrderForCompile = new Stack<String>(); 
	
	public ArrayList<String> stackToArrayList()
	{
		//System.out.println(instanceClassOrderForCompile);
		ArrayList<String> classOrderList = new ArrayList<String>(instanceClassOrderForCompile);
		ArrayList<String> classOrderListShort = new ArrayList<String>();
		
		while(!classOrderList.isEmpty()){
			String temp = classOrderList.get(classOrderList.size()-1);
			classOrderListShort.add(temp);
			while(classOrderList.remove(temp));// this list removes all occurrences of temp in the list
		}
		
		return classOrderListShort;
	}
	
    public static void main(String[] args) throws Exception 
    {
    	String extension = ".ioobn";
    	String directory = "InputIOOBNFiles\\";
    	NPPDriver dr = new NPPDriver();
    	dr.compileAllFiles(directory, extension);
    	System.err.println("\n\n\n Compilation done Successfully!!! \n\n\n");
    	
    	ArrayList<String> classOrder = dr.stackToArrayList();
    	System.err.println("Class loading order: " + classOrder);
    	
    }
}
