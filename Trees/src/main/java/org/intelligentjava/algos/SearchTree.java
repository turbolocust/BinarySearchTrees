/*
 * Copyright (c) Matthias Fussenegger
 */
package org.intelligentjava.algos;

/**
 *
 * @author Matthias Fussenegger
 */
public interface SearchTree {

    /**
     * Finds a node with concrete value. If it is not found then null is
     * returned.
     *
     * @param element Element value.
     * @return Node with value provided, or null if not found.
     */
    public Node search(int element);

    /**
     * Insert new element to tree.
     *
     * @param element Element to insert.
     * @return
     */
    public Node insert(int element);

    /**
     * Removes element if node with such value exists.
     *
     * @param element Element value to remove.
     *
     * @return New node that is in place of deleted node. Or null if element for
     * delete was not found.
     */
    public Node delete(int element);

    /**
     * @param element
     * @return true if tree contains element.
     */
    public boolean contains(int element);

    /**
     * @return Minimum element in tree.
     */
    public int getMinimum();

    /**
     * @return Maximum element in tree.
     */
    public int getMaximum();

    /**
     * Get next element element who is bigger than provided element.
     *
     * @param element Element for whom descendand element is searched
     * @return Successor value.
     */
    public int getSuccessor(int element);

    /**
     * @return Number of elements in the tree.
     */
    public int getSize();

    /**
     * Tree traversal with printing element values. In order method.
     */
    public void printTreeInOrder();

    /**
     * Tree traversal with printing element values. Pre order method.
     */
    public void printTreePreOrder();

    /**
     * Tree traversal with printing element values. Post order method.
     */
    public void printTreePostOrder();

    public void printTree();

    public void printSubtree(Node node);

    public static class Node {

        public Node(Integer value, Node parent, Node left, Node right) {
            super();
            this.value = value;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public Integer value;
        public Node parent;
        public Node left;
        public Node right;

        public boolean isLeaf() {
            return left == null && right == null;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((value == null) ? 0 : value.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Node other = (Node) obj;
            if (value == null) {
                if (other.value != null) {
                    return false;
                }
            } else if (!value.equals(other.value)) {
                return false;
            }
            return true;
        }
    }
}
