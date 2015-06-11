package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author philip.dogbey
 */
public abstract class DirectoryTraversal {

    private List<DirectorySearchOutputProcessor> outputProcessors = Arrays.asList(new DirectoryAndFilePrinter(), new DirectoryFileAndSizePrinter());
    protected DirectorySearchOutputProcessor listener;
    private List<File> fileResultList;

    public void execute(String baseDirectory) {
        initialize();
        File baseFile = new File(baseDirectory);
        traverse(baseFile);
        processResult();
    }

    private void initialize() {
        fileResultList = new LinkedList<File>();
        listener = new DirectoryFileAndSizePrinter();
    }

    protected abstract void traverse(File file);

    protected void proceedWithFile(File file) {
        fileResultList.add(file);

    }

    private void processResult() {
        for (DirectorySearchOutputProcessor outputProcessor : outputProcessors) {
            outputProcessor.printFiles(fileResultList);
        }
    }

}
