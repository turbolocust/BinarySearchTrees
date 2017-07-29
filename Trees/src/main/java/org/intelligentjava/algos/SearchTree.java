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
     * Finds a node with concrete value. If it is not found then {@code null} is
     * returned.
     *
     * @param element the element to be found.
     * @return node with value provided, or {@code null} if not found.
     */
    public Node search(int element);

    /**
     * Inserts a new element in the tree.
     *
     * @param element the element to be inserted.
     * @return the newly inserted element as {@link Node}.
     */
    public Node insert(int element);

    /**
     * Removes the specified element if {@link Node} with such value exists.
     *
     * @param element the element to be removed.
     * @return new {@link Node} that is in place of deleted one. Or {@code null}
     * if element to be deleted was not found.
     */
    public Node delete(int element);

    /**
     * Checks whether this tree contains the specified element or not.
     *
     * @param element the element to be checked.
     * @return true if tree contains element, false otherwise.
     */
    public boolean contains(int element);

    /**
     * Finds the minimum element in the tree.
     *
     * @return the minimum element in the tree.
     */
    public int getMinimum();

    /**
     * Finds the maximum element in the tree.
     *
     * @return the maximum element in the tree.
     */
    public int getMaximum();

    /**
     * Get next element that is bigger than the provided element.
     *
     * @param element the element for whom descendent element is searched.
     * @return the successor of the specified element.
     */
    public int getSuccessor(int element);

    /**
     * Returns the number of elements in the tree.
     *
     * @return the number of elements in the tree.
     */
    public int getSize();

    /**
     * Tree traversal with printing element values. In-order method.
     */
    public void printTreeInOrder();

    /**
     * Tree traversal with printing element values. Pre-order method.
     */
    public void printTreePreOrder();

    /**
     * Tree traversal with printing element values. Post-order method.
     */
    public void printTreePostOrder();

    /**
     * Prints the tree starting from root node.
     */
    public void printTree();

    /**
     * Prints a subtree starting from the specified {@link Node}.
     *
     * @param node the node from which to start traversal from.
     */
    public void printSubtree(Node node);

    /**
     * Represents a node in a search tree.
     */
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

        /**
         * Checks whether this node is a leaf or not.
         *
         * @return true if this node is a leaf, false otherwise.
         */
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
