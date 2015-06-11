
package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;
import java.util.List;

/**
 *
 * @author philip.dogbey
 */
public class DirectoryAndFilePrinter implements DirectorySearchOutputProcessor{
    @Override
    
    public void printFiles(List<File> fileList) {
        System.out.println("\nPrinting Directory and  File Name");
        for(File file : fileList) {
            System.out.println("Directory: " + file.getParent() + ", File: "+ file.getName() );
        }
    }

   
}
