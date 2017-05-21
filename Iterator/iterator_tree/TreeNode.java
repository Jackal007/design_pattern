package iterator_tree;

public class TreeNode {
	public TreeNode parent;
	public TreeNode leftChild;
  public TreeNode rightChild;
	public boolean isVisit;
	public String data="";

	public TreeNode(String data){
		parent=null;
		leftChild=null;
		rightChild=null;
		isVisit=false;
		this.data=data;
	}

	public void set(TreeNode parent,TreeNode leftChild,TreeNode rightChild){
		this.parent=parent;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
	}

}
