public class DoublyLinkedList {
	
	// Attributes in Class DoublyLinkedList
	private Node head;
	private Node tail;
	
	// Default Constructor
	public DoublyLinkedList () {
		this.head = null;
		this.tail = null;
	}
	
	// Method for traverse all nodes
	public String traversal() {
		Node current_node = head;
		String result = "[";
		boolean first = true;
		while (current_node != null) {
			result += (!first ? ", " : "") + current_node.data;
			current_node = current_node.next;
			first = false;
		}
		result += "]";
		return result;
	}

	// Method for inserting at the end of list
	public void insert(Object value) {
	    Node newNode = new Node(value);

	    if (head == null) {
	        head = newNode;
	        tail = newNode;
	    } else {
	        tail.next = newNode;
	        newNode.previous = tail;
	        tail = newNode;
	    }
	}
	// Method for inserting at the beginning and specific position
	public void insert(int position, Object value) {

	    Node newNode = new Node(value);

	    if (head == null || position <= 0) {

	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            newNode.next = head;
	            head.previous = newNode;
	            head = newNode;
	        }
	        return;
	    }

	    Node current = head;
	    int index = 0;

	    while (current.next != null && index < position - 1) {
	        current = current.next;
	        index++;
	    }

	    if (current.next == null) {
	        current.next = newNode;
	        newNode.previous = current;
	        tail = newNode;
	    } else {
	        newNode.next = current.next;
	        newNode.previous = current;
	        current.next.previous = newNode;
	        current.next = newNode;
	    }
	}

	// Method for deleting the last node
	public void remove() {
		if (head != null) {  // check if the list is NOT empty list
			if (head.next == null) {  // check if the list has only 1 node -> make the list to empty list
				head = null;
				tail = null;
			} else {
				tail = tail.previous;
				tail.next = null;
				
			}
		}
	}
	
	// Method for deleting at the beginning and specific position
	public void remove(int position) {
		if (head != null) {  // check if the list is NOT empty list
			if (head.next == null) {  // check if the list has only 1 node -> make the list to empty list
				head = null;
				tail = null;
			} else if (position == 0) {
				head = head.next;
				head.previous = null;
				
			} else {
				Node current = head;

				for (int i = 0; i < position; i++) {
				    current = current.next;
				}

				if (current == tail) {
				    tail = tail.previous;
				    tail.next = null;
				} else {
				    current.previous.next = current.next;
				    current.next.previous = current.previous;
				}
				
			}
		}
	}

	// Method for a backward traversal (from the last node to the first node)
	public String backwardTraversal() {
	    Node current = tail;
	    String result = "[";
	    boolean first = true;

	    while (current != null) {
	        result += (first ? "" : ", ") + current.data;
	        current = current.previous;
	        first = false;
	    }

	    result += "]";
	    return result;
	}
	
}