package com.reachloacl.adplatform.infrastructur.directory.search;

import java.io.File;

/**
 *
 * @author philip.dogbey
 */
public class DirectoryList {

    private Node first;
    private Node last;

    public DirectoryList() {
        first = null;
        last = null;
    }

    public void add(File file) {
        Node node = new Node(file);

        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;
    }

    public boolean empty() {
        return (first == null);
    }

    public File remove() {
        if (first == null) {
            throw new IllegalStateException("List empty");
        }

        File result = first.file;
        first = first.next;
        return result;
    }

    private class Node {
        public Node next;
        public File file;
        public Node(File file) {
            this.file = file;
            next = null;
        }
    }
}
