

package com.reachloacl.adplatform.infrastructur.directory.search;

import org.apache.commons.lang3.StringUtils;


public class TraversalFactoy {
    private static TraversalFactoy instance;
    
    public static TraversalFactoy getInstance() {
        if(instance == null) {
            instance = new TraversalFactoy();
        }
        
        return instance;
    }
    
    private TraversalFactoy() {
        
    }
    
    public DirectoryTraversal createTravesalLogic( String logicName) {
        DirectoryTraversal traversal = null;
        if(!StringUtils.isBlank(logicName) && logicName.equals("breadth")) {
            traversal = new BreadthFirstDirectoryTraversal();
        }else{
            traversal = new DepthFirstDirectoryTraversal();
        }
        return traversal;
    }
}
