

package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author philip.dogbey
 */
public class DirectoryAndFilePrinter implements DirectoryTraversalListener{
    private List<File> fileList;
    @Override
    public void proceedWithFile(File file) {
        fileList.add(file);
    }

    @Override
    public void printFiles() {
        for(File file : fileList) {
            System.out.println("Directory: " + file.getParent() + ", File: "+ file.getName() );
        }
    }

    @Override
    public void initialize() {
       fileList = new LinkedList<File>();
    }
}
