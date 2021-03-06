import java.io.*;
import java.util.Scanner;

class linkedlist {
	int data;
	linkedlist next;

	linkedlist(int value) {
		this.data = value;
	}

	void display() {
		System.out.println(data);
	}
}

class linked {
	public linkedlist fstnode, lastnode;

	linked() {
		fstnode = null;
		lastnode = null;
	}
	
	/* Insert node or create linked list */
	void insertnode(int value) {
		linkedlist node = new linkedlist(value);
		node.next = null;
		if(fstnode == null) {
			fstnode = lastnode = node;
			System.out.println("Linked list created successfully!");
		}
		else {
			lastnode.next = node;
			lastnode = node;
			System.out.println("Node inserted successfully!");
		}
	}

	/* Delete node from linked list */
	void delete() {
		int count = 0, number, i;
		linkedlist node, node1;
		Scanner input = new Scanner(System.in);
		
		for(node = fstnode; node != null; node = node.next)
			count++;
		display();
		node = node1 = fstnode;
		System.out.println(count+" nodes available here!");
		System.out.println("Enter the node number which you want to delete:");
		number = Integer.parseInt(input.nextLine());
		if(number != 1) {
			if(number <= count) {
				for(i = 2; i <= number; i++)
					node = node.next;

				for(i = 2; i <= number-1; i++)
					node1 = node1.next;

				node1.next = node.next;
				node.next = null;
				node = null;
			}
			else
				System.out.println("Invalid node number!\n");
		}
		else {
			fstnode = node.next;
			node = null;
		}

		System.out.println("Node has been deleted successfully!\n");
	}

	/* Display linked list */
	void display() {
		linkedlist node = fstnode;
		System.out.println("List of node:");
		while(node != null) {
			node.display();
			node = node.next;
		}
	}
}


class singlylinkedlist {
	public static void main(String args[ ]) {
		linked list = new linked();
		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 4) {
			System.out.println("1. Insert a node 2. Delete a node 3. Show current list 4. Exit");
			System.out.println("Enter your choice:");
			op = Integer.parseInt(input.nextLine());
			switch(op) {
				case 1:
					System.out.println("Enter the position value for Linked list:");
					list.insertnode(Integer.parseInt(input.nextLine()));
					break;

				case 2:
					list.delete();
					break;

				case 3:
					list.display();
					break;

				case 4:
					System.out.println("Bye Bye!");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice!");

			}
		}
	}
}

