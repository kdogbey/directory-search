package com.reachloacl.adplatform.infrastructur.directory.search;

/**
 *
 * @author philip.dogbey
 */
public interface DirectoryTraversalListener {

    public void initialize();

    public void proceedWithFile(java.io.File file);

    public void printFiles();

}
