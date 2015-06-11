package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;

public class BreadthFirstDirectoryTraversal extends DirectoryTraversal {
    private DirectoryList list;
   /*  public BreadthFirstDirectoryTraversal(String basePath) {
        this();
        this.basePth = basePath;
        directoryTraversalListener = new DirectoryFileAndSizePrinter();
    }
*/
    
   /* @Override
    public void execute() {
        directoryTraversalListener.initialize();
        File file = new File(basePth);
        traverse(file);
        directoryTraversalListener.printFiles();
    }
*/
    public BreadthFirstDirectoryTraversal() {
        list = new DirectoryList();
    }

    /**
     * Traverses the directory tree in level order (breadth first)
     *
     * @param file
     */
    public void traverse(File file) {
        list.add(file);
        while (!list.empty()) {
            file = list.remove();
            if (file.isDirectory()) {
                String entries[] = file.list();
                if (entries != null) {
                    for (String entry : entries) {
                        list.add(new File(file, entry));
                    }
                }
            } else {
                listener.proceedWithFile(file);
            }
        }
    }
}
