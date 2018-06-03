/*
 * Joshua Warren
 * CS 211
 * 6/3/2018
 * Homework 7
 */


// Simple binary tree class that includes methods to construct a
// tree of ints, to print the structure, and to print the data
// using a preorder, inorder or postorder traversal.  The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree.  The
// documentation refers to these as "sequential trees."
import java.util.*;

public class IntTree {
	private IntTreeNode overallRoot;

	// pre : max > 0
	// post: constructs a sequential tree with given number of
	// nodes
	public IntTree(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("max: " + max);
		}
		overallRoot = buildTree(1, max);
	}

	// post: returns a sequential tree with n as its root unless
	// n is greater than max, in which case it returns an
	// empty tree
	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
		}
	}

	// post: prints the tree contents using a preorder traversal
	public void printPreorder() {
		System.out.print("preorder:");
		printPreorder(overallRoot);
		System.out.println();
	}

	// post: prints the tree contents using a preorder traversal
	// post: prints in preorder the tree with given root
	private void printPreorder(IntTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

	// post: prints the tree contents using a inorder traversal
	public void printInorder() {
		System.out.print("inorder:");
		printInorder(overallRoot);
		System.out.println();
	}

	// post: prints in inorder the tree with given root
	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}
	}

	// post: prints the tree contents using a postorder traversal
	public void printPostorder() {
		System.out.print("postorder:");
		printPostorder(overallRoot);
		System.out.println();
	}

	// post: prints in postorder the tree with given root
	private void printPostorder(IntTreeNode root) {
		if (root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(" " + root.data);
		}
	}

	// post: prints the tree contents, one per line, following an
	// inorder traversal and using indentation to indicate
	// node depth; prints right to left so that it looks
	// correct when the output is rotated.
	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	// post: prints in reversed preorder the tree with given
	// root, indenting each line to the given level
	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
	}
	
	/*
	 * Exercise 1:
	 * 
	 * Write a method called countLeftNodes that returns the number 
	 * of left children in the tree.
	 */
	
	// This method makes use of the private method for counting
	// the left nodes.
	public int countLeftNodes() {
	    return countLeftNodes(overallRoot);
	}

	// helper method
	private int countLeftNodes(IntTreeNode node) {
		
		// if the  node is nothing, then return 0.
	    if(node == null)
	        return 0;
	    
	    // set variables for counting
	    int count = countLeftNodes(node.right);
	    
	    // if there's something in the left node
	    if(node.left != null)
	    	
	    	// keeping goin until the if-statement 
	    	// reaches the end
	        count += 1 + countLeftNodes(node.left);
	        
	    // return the count
	    return count;
	}
	
	/*
	 * Exercise 5:
	 * 
	 * Write a method called printLevel that accepts an integer 
	 * parameter n and prints the values at level n from left to right, 
	 * one per line.
	 */
	
	// this method makes use of the helper method to 
	// help print out the nodes at n level
	public void printLevel(int n) {
		// check n before going to helper method
		// if it's less than one, throw the exception
	    if(n < 1) {
	        throw new IllegalArgumentException("Can't be less than one!");
	    }
	    // if not, call the helper method on n
	    printLevel(overallRoot, n);
	}

	// helper method
	private void printLevel(IntTreeNode node, int n) {
		
		// if there's nothing in the node, then return
	    if(node == null) {
	        return;
	    }
	    
	    // if n is one, the print the first level (root)
	    if(n == 1) {
	        System.out.println(node.data);
	        return;
	    }
	    // after printing the root, go left and right
	    printLevel(node.left, n - 1);
	    printLevel(node.right, n - 1);
	}
	
	/*
	 * Exercise 8:
	 * 
	 * Write a toString method for a binary tree of integers.
	 */
	
	// this method uses the helper method to 
	public String toString() {
	    return toString(overallRoot);
	}

	private String toString(IntTreeNode node) {
		
		// if it's a nothing tree, return "empty"
	    if(node == null)
	        return "empty";
	        
	    // if it's a case where we have a root but no left
	    // or right tree, print out just the node.
	    if(node.left == null && node.right == null) {
	        return String.valueOf(node.data);
	    }
	        
	    // else, we have a left and a right, so traverse and call toString
	    return "(" + node.data + ", " + toString(node.left) + ", " +
	        toString(node.right) + ")";
	}
	
}
