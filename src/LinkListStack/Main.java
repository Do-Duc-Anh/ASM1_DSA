/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkListStack;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        LinkListStack linkedListStack = new LinkListStack();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println(linkedListStack.peek()); // Output: 3
        System.out.println(linkedListStack.pop());   // Output: 3
        System.out.println(linkedListStack.isEmpty()); // Output: false
    }
}
