
public class TreeApp {

	public static void main(String[] args) {
		//Tree1
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree1()");
		System.out.println("-------------------------------");
		
		BinaryTree tree = new BinaryTree();
		tree.createTree1();
		tree.printTree(tree.getRoot(), 0);
		
		//Tree2
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree2()");
		System.out.println("-------------------------------");
		
		tree.createTree2();
		tree.printTree(tree.getRoot(), 0);
		
		//Tree3
		System.out.println("-------------------------------");
		System.out.println("Binary Tree from createTree3()");
		System.out.println("-------------------------------");
		
		tree.createTree3();
		tree.printTree(tree.getRoot(), 0);
	}

}