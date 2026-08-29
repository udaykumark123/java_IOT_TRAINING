package day9;

public class inorder {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			
		}
	}
	static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.right);
		System.out.println(root.data + " ");
		inorder(root.left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		System.out.println("inorder traversal:");
		inorder(root);

	}

}
