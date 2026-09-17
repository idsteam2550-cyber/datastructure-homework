public class TreeApp2 {
	
	public static void main(String[] args) {
		
		//Tree4
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree4()");
		System.out.println("-------------------------------");
		
		BinaryTree tree4 = new BinaryTree();
		
		tree4.createTree4();
		
		tree4.printTree(tree4.getRoot(), 0);
		
		//tree5
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("-------------------------------");
		
		BinaryTree tree5 = new BinaryTree();
		
		tree5.createTree5();
		
		tree5.printTree(tree5.getRoot(), 0);
		
		//Tree6
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree6()");
		System.out.println("-------------------------------");

		BinaryTree tree6 = new BinaryTree();
		
		tree6.createTree6();
		
		tree6.printTree(tree6.getRoot(), 0);

	}
}