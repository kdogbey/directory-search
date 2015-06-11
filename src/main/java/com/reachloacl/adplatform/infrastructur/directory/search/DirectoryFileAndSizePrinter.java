
package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author philip.dogbey
 */
public class DirectoryFileAndSizePrinter implements DirectorySearchOutputProcessor{
    @Override
    public void printFiles( List<File> fileList) {
         System.out.println("\nPrinting Directory,  File Name and Size");
        for (File file : fileList) {
          System.out.println("Directory: " + file.getParent() + ", File: "+ file.getName() + ", Size: " + file.length());
        }
    }
 
}
