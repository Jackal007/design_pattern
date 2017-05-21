package iterator_tree;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		TreeNode a = new TreeNode("a");
		TreeNode b = new TreeNode("b");
		TreeNode c = new TreeNode("c");
		a.set(null, b, c);
		TreeNode d = new TreeNode("d");
		TreeNode f = new TreeNode("f");
		b.set(a, d, f);
		c.set(a, null, null);
		TreeNode e = new TreeNode("e");
		TreeNode g = new TreeNode("g");
		d.set(b, null, e);
		e.set(d,null,null);
		f.set(b, g, null);
		g.set(f,null,null);
		BinaryTree tree=new BinaryTree(a);
		System.out.println("***** MID");
		Iterator it=tree.iterator("mid");
		while(it.hasNext()){
			System.out.println(((TreeNode)it.next()).data);
		}

		System.out.println("***** PRE");
		it=tree.iterator("pre");
		while(it.hasNext()){
			System.out.println(((TreeNode)it.next()).data);
		}

		System.out.println("***** POST");
		it=tree.iterator("post");
		while(it.hasNext()){
			System.out.println(((TreeNode)it.next()).data);
		}
	}
}
