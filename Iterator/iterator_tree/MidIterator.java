package iterator_tree;

import java.util.Iterator;

public class MidIterator implements Iterator {
	BinaryTree tree;
	TreeNode point;
	int size;

	public MidIterator(BinaryTree tree) {
		this.tree = tree;
		point = tree.root;
		size = tree.getSize();
	}

	public boolean hasNext() {
		if (size > 0) {
			return true;
		} else {
			return false;
		}
	}

	public TreeNode next() {

		// System.out.println("*****"+point.data);

		// 濡傛灉宸﹀瓙鏍戜笉涓虹┖锛屼笖娌℃湁琚闂繃锛屽垯閫掑綊宸﹀瓙鏍�
		if (point.leftChild != null && !point.leftChild.isVisit) {
			point = point.leftChild;
			// System.out.println("/");
			return next();
		}
		// 濡傛灉宸﹀瓙鏍戜负绌猴紝鎴栧垯琚闂繃浜嗭紝涓旇嚜宸辨病鏈夎璁块棶锛屽垯杩斿洖褰撳墠鐐�
		else if (!point.isVisit) {
			size--;
			point.isVisit = true;
			return point;
		}
		// 鍐嶅鏋滃彸瀛愭爲涓嶄负绌猴紝涓旀病鏈夎璁块棶杩囷紝鍒欓�掑綊鍙冲瓙鏍�
		else if (point.rightChild != null && !point.rightChild.isVisit) {
			point = point.rightChild;
			// System.out.println("\\");
			return next();
		}
		// 濡傛灉鏉′欢閮芥病杈炬垚锛屽垯杩斿洖鍒扮埗鑺傜偣
		else {
			point = point.parent;
			// System.out.println("|");
			return next();
		}
	}
}
