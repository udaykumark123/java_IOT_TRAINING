package day9;

public class day9traversal {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			
		}
	}
	//recursive method
	static void preorder(Node root) {
		//base condition
		if(root==null) {
			return;
		}
		//visit root
		System.out.println(root.data + " ");
		//visit left tree
		preorder(root.left);
		//visit right tree
		preorder(root.right);
		
	}

	public static void main(String[] args) {
		//create tree
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println("preorder traversal:");
		preorder(root);
			
		}
		
		
		// TODO Auto-generated method stub

	}


