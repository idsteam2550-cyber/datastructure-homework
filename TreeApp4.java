import java.util.Scanner;
 
public class TreeApp4 {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
 
		tree .createTree6();
		tree.printTree(tree.getRoot(),0);
		
		System.out.println("");
		System.out.print("Enter node data :   ");
		int target = scanner.nextInt();
		
		Node found = findNode(tree.getRoot(),target);
		
		if(found == null) {
			System.out.println("Cannot found Node(data=[" + target + "])");
		}else {
			if(found.left != null) {
				System.out.println("Left Child = " + found.left.data);
			}else {
				System.out.println("No left Child");
			}
			
			if(found.right != null) {
				System.out.println("Right Child = " + found.right.data);
			}else {
				System.out.println("No Right Child");
			}
			if(found.left == null && found.right == null) {
				System.out.println("[" + target  + "] is leaf Node");
			}else {
				System.out.println("[" + target  + "] is not leaf Node");
			}
		}
		
		scanner.close();
	}
	
	public static Node findNode(Node node,int target) {
		if(node == null) {
			return null;
		}
		if(node.data == target) {
			return node;
		}
		Node leftResult = findNode(node.left, target);
		if(leftResult != null) {
			return leftResult;
		}
		return findNode(node.right,target);
	}
 
}