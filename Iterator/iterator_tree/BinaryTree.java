package iterator_tree;

import java.util.Iterator;

public class BinaryTree {
	TreeNode root;
	BinaryTree leftSubTree;
	BinaryTree rightSubTree;

	public BinaryTree(TreeNode root){
		if(root!=null){
			this.root=root;
			leftSubTree=new BinaryTree(root.leftChild);
			rightSubTree=new BinaryTree(root.rightChild);
		}
		else{
			root=null;
		}
	}

	public int getSize(){
		if(root==null) return 0;
		return 1+leftSubTree.getSize()+rightSubTree.getSize();
	}

	public void clear(){
		if(root==null) return;
		root.isVisit=false;
		leftSubTree.clear();
		rightSubTree.clear();
	}

	public Iterator iterator(String type){
		clear();
		switch(type){
		case("pre"):return new PreIterator(this);
		case("mid"):return new MidIterator(this);
		case("post"):return new PostIterator(this);
		default:return null;
		}
	}
}
