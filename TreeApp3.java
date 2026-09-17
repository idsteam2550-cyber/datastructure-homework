public class TreeApp3 {

	public static void main(String[] args) {
		
		/*BinaryTree tree = new BinaryTree();
		
		tree.createTree4();
		
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println();
		tree.searchDeleteNode(14);
		System.out.println(tree.getDeleteNode().data);
		System.out.println(tree.getParent().data);
		
		System.out.println("-------------------------------");
		int target = 11;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		*/
		
		//Practice05
		//Binary Tree 5
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree5()");
		System.out.println("-------------------------------");
		
		BinaryTree tree5 = new BinaryTree();
		
		tree5.createTree5();
		
		tree5.printTree(tree5.getRoot(), 0);
		
		//Delete leaf node
		System.out.println("-------------------------------");
		System.out.println("Delete leaf node -> 25");
		System.out.println("-------------------------------");
		
		tree5.delete(25);
		tree5.printTree(tree5.getRoot(), 0);
		
		//Delete node only 1 child
		System.out.println("-------------------------------");
		System.out.println("Delete node only 1 child -> 40");
		System.out.println("-------------------------------");
		
		tree5.delete(40);
		tree5.printTree(tree5.getRoot(), 0);
		
		//Delete node only 2 child
		System.out.println("-------------------------------");
		System.out.println("Delete node only 1 child -> 60");
		System.out.println("-------------------------------");
		
		tree5.delete(60);
		tree5.printTree(tree5.getRoot(), 0);

	}

}