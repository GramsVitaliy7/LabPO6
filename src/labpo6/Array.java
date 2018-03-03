/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labpo6;

/**
 *
 * @author VITGR
 */
public class Array {

    private int[] value;

    Array(int[] value) {
        this.value = value;
    }

    public int[] deleteMultipleElement() {
        int lengthArray = value.length;
        for (int i = 1; i < lengthArray; i++) {
            if (value[i] % value[0] == 0) {
                for (int j = i; j < value.length - 1; j++) {
                    value[j] = value[j + 1];
                }
                lengthArray--;
                i--;
            }
        }
        int[] convertedArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            convertedArray[i] = value[i];
        }
        return (convertedArray);
    }
}
