package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;

/**
 *
 * @author philip.dogbey
 */
public class DepthFirstDirectoryTraversal extends DirectoryTraversal {

    public DepthFirstDirectoryTraversal() {

    }
    @Override
   protected void traverse(File baseFile) {
        for (File file : baseFile.listFiles()) {
            depthFirsFileSearch(file);
        }
    }

    private void depthFirsFileSearch(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                depthFirsFileSearch(f);
            }
        } else {
            listener.proceedWithFile(file);
        }
    }
}
