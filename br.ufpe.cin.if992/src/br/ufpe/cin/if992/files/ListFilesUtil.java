package br.ufpe.cin.if992.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Contains some methods to list files and folders from a directory
 *
 * @author viniciusgarcia
 * http://viniciusgarcia.com
 * http://assertlab.com
 * 
 */

public class ListFilesUtil {

	/**
     * List all the files and folders from a directory
     * @param directoryName to be listed
     */
    public void listFilesAndFolders(String directoryName){
 
        File directory = new File(directoryName);
 
        //get all the files from a directory
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            System.out.println(file.getName());
        }
    }
 
    /**
     * List all the files under a directory
     * @param directoryName to be listed
     */
    public void listFiles(String directoryName){
 
        File directory = new File(directoryName);
 
        //get all the files from a directory
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
 
    /**
     * List all the folder under a directory
     * @param directoryName to be listed
     */
    public void listFolders(String directoryName){
 
        File directory = new File(directoryName);
 
        //get all the files from a directory
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            if (file.isDirectory()){
                System.out.println(file.getName());
            }
        }
    }
 
    /**
     * List all files from a directory and its subdirectories
     * @param directoryName to be listed
     */
    public String listFilesAndFilesSubDirectories(String directoryName){
 
        File directory = new File(directoryName);
        String res = new String();
        
        //get all the files from a directory
        File[] fList = directory.listFiles();
 
        for (File file : fList){
            if (file.isFile()){
            	if(!file.isHidden()){
	                //System.out.println(file.getAbsolutePath());
	                res += file.getAbsolutePath() + "\n";
            	}
            } else if (file.isDirectory()){
            	res += listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
        return res;
    }
	
	public ListFilesUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListFilesUtil listFilesUtil = new ListFilesUtil();
        
        final String directoryLinuxMac ="/Users/viniciusgarcia/Work/Videos";
        BufferedWriter writer = null;
        String myfilelist;
        myfilelist = directoryLinuxMac + "/myDirectoryFileList.txt";
        
        String fileList = listFilesUtil.listFilesAndFilesSubDirectories(directoryLinuxMac);
        
        try {
        	writer = new BufferedWriter( new FileWriter(myfilelist));
	        
	        //Windows directory example
			//final String directoryWindows ="C://test";
	 
	        //listFilesUtil.listFiles(directoryLinuxMac);
        	//System.out.println(listFilesUtil.listFilesAndFilesSubDirectories(directoryLinuxMac));
	        writer.write(fileList);
        
        } catch(IOException e){
            System.out.print("Exception");
        }
        finally
        {
            try
            {
                if ( writer != null)
                writer.close( );
            }
            catch ( IOException e)
            {
            }
        }

	}

}

 
