package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;

public class BreadthFirstDirectoryTraversal extends DirectoryTraversal {
    private DirectoryList list;
 
    public BreadthFirstDirectoryTraversal() {
        list = new DirectoryList();
    }

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
                proceedWithFile(file);
            }
        }
    }
}
