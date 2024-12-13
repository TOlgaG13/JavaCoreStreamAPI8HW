package sample2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File folder = new File("D:\\Java lessons"); 
  Map<String, String> fileClassification = new HashMap<>();
	        if (folder.isDirectory()) {
	            for (File file : folder.listFiles()) {
	                if (file.isFile()) {
	                    long size = file.length(); 
	                    String category = classifyFile(size);
	                    fileClassification.put(file.getName(), category);
	                }
	            }
	        }
	        fileClassification.forEach((fileName, category) -> 
	            System.out.println("File: " + fileName + " -> Category: " + category)
	        );
	    }
	    private static String classifyFile(long size) {
	        if (size < 1024) return "Small ( up to 1 1KB)";
	        else if (size < 1024 * 1024) return "medium (1KB - 1MB)";
	        else return "large (more than  1MB)";
	    }
	}
	


