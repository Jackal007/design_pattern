package iterator_tree;

import java.util.Iterator;

public class PostIterator implements Iterator{
	BinaryTree tree;
	TreeNode point;
	int size;

	public PostIterator(BinaryTree tree){
		this.tree=tree;
		point=tree.root;
		size=tree.getSize();
	}

	public boolean hasNext(){
		if(size>0){
			return true;
		}
		else{
			return false;
		}
	}

	public TreeNode next(){

		// System.out.println("*****"+point.data);

		//婵″倹鐏夊锕�鐡欓弽鎴滅瑝娑撹櫣鈹栭敍灞肩瑬濞屸剝婀佺悮顐ヮ問闂傤喛绻冮敍灞藉灟闁帒缍婂锕�鐡欓弽锟�
		if(point.leftChild!=null&&!point.leftChild.isVisit){
			point=point.leftChild;
			// System.out.println("/");
			return next();
		}		
		//閸愬秴顩ч弸婊冨礁鐎涙劖鐖叉稉宥勮礋缁岀尨绱濇稉鏃�鐥呴張澶庮潶鐠佸潡妫舵潻鍥风礉閸掓瑩锟芥帒缍婇崣鍐茬摍閺嶏拷
		else if(point.rightChild!=null&&!point.rightChild.isVisit){
			point=point.rightChild;
			// System.out.println("\\");
			return next();
		}
		//婵″倹鐏夊锕�鐡欓弽鎴滆礋缁岀尨绱濋幋鏍у灟鐞氼偉顔栭梻顔跨箖娴滃棴绱濇稉鏃囧殰瀹歌鲸鐥呴張澶庮潶鐠佸潡妫堕敍灞藉灟鏉╂柨娲栬ぐ鎾冲閻愶拷
		else if(!point.isVisit){
			size--;
			point.isVisit=true;
			return point;
		}
		//婵″倹鐏夐弶鈥叉闁姤鐥呮潏鐐灇閿涘苯鍨潻鏂挎礀閸掓壆鍩楅懞鍌滃仯
		else{
			point=point.parent;
			// System.out.println("|");
			return next();
		}
	}

}
