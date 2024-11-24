/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkListStack;

/**
 *
 * @author LENOVO
 */
public class LinkListStack {
    private Node top; // Pointer to the top of the stack

    // Constructor to initialize the stack
    public LinkListStack() {
        this.top = null; // Initialize top to null to indicate the stack is empty
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push an element onto the stack
    public void push(int element) {
        Node newNode = new Node(element); // Create a new node
        newNode.next = top; // Link new node to the previous top
        top = newNode; // Update top to the new node
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Indicate underflow
        } else {
            int poppedData = top.data; // Get the data of the top node
            top = top.next; // Move top to the next node
            return poppedData; // Return the data of the popped node
        }
    }

    // Peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Indicate that the stack is empty
        } else {
            return top.data; // Return the data of the top node
        }
    }
}
