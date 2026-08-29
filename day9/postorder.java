package day9;

public class postorder {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			
		}
	}
	//recursive method
	static void Postorder(Node root) {
		//base condition
		if(root==null) {
			return;
		}
		
		//visit left tree
		Postorder(root.left);
		//visit right tree
		Postorder(root.right);
		//visit root
		System.out.println(root.data + " ");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println("postorder traversal:");
		Postorder(root);

	}

}
