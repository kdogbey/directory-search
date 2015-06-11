package com.reachloacl.adplatform.infrastructur.directory.search;

public class DirectoryTraversalMain {

    public static void main(String[] args) {
        String basePath = args[0];
        String logic = args[1];
        DirectoryTraversal traversal = TraversalFactoy.getInstance().createTravesalLogic(logic);
        traversal.execute(basePath);
    }
}
