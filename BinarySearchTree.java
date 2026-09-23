public class BinarySearchTree {

	private Node root;
	private Node parent;
	private Node deleteNode;

	public boolean isEmpty() {
		return root == null;
	}
	
	public void sampleTree1() {
		int[] nums = {20,10,60,7,11,30,65,3,40};
		
		for (int num : nums) {
			insert(num);
		}
	}
	
	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}
	
	public Node getRoot() {
		return root;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public Node getDeleteNode() {
		return deleteNode;
	}
	
	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;
			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				}
				else if (new_data > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right; 
				}
				
			} //end while
		} //end if
	}
	


    
}