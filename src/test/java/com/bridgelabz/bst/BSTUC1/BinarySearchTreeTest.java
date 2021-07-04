package com.bridgelabz.bst.BSTUC1;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.bst.BSTMaster.BinaryTree;

public class BinarySearchTreeTest {
	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}