/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;
import static javaapplication7.JavaApplication7.SumSeriesRecursive.bai8;
/**
 *
 * @author LENOVO
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */


public class SumSeriesRecursive {
    public static double bai8(int n) {
        if (n == 1) {
            return (double) 1 / 2;
        }
        return (double) (2 * n - 1) / (2 * n) + bai8(n - 1);
    }
 

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value n: ");
        int n = scanner.nextInt();
        double result = bai8(n);
        System.out.printf("S(%d) = %.6f%n", n, result);
    }
    
}
