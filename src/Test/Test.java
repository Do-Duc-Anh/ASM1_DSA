/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author LENOVO
 */
public class Test {
    public static void convertToBinary(int n) {
        if (n > 1) {
            convertToBinary(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        System.out.print("Binary of 10: ");
        convertToBinary(10); // Output: 1010
    }
}
