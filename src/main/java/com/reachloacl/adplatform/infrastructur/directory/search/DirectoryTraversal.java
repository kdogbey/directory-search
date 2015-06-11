package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;

/**
 *
 * @author philip.dogbey
 */
public abstract class DirectoryTraversal {

    protected DirectoryTraversalListener listener;

    public void execute(String baseDirectory) {
        File baseFile = new File(baseDirectory);
        listener = new DirectoryFileAndSizePrinter();
        listener.initialize();
        traverse(baseFile);
        listener.printFiles();
    }

    protected abstract void traverse(File file);
}
