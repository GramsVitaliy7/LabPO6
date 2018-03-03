/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo6;

import java.util.Scanner;

/**
 *
 * @author VITGR
 */
public class LabPO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Введите " + i + "-й элемент");
            array[i] = scanner.nextInt();
        }
        Array newArray = new Array(array);
        int[] transformedArray = newArray.deleteMultipleElement();
        for (int i = 0; i < transformedArray.length; i++) {
            System.out.print(transformedArray[i] + " ");
        }
    }

}
