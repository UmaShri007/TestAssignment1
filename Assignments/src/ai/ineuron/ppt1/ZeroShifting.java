package ai.ineuron.ppt1;

import java.util.Arrays;

public class ZeroShifting {

	public static void zeroShift(int[] array) {
		int len = array.length;
		System.out.println(len);
		int temp = 0;
		for (int j = 0; j < len; j++) {
			for (int i = 0; i < len - 1; i++) {
				if (array[i] == 0 && array[i + 1] != 0) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] array = { 0, 1, 0, 3, 0, 12, 15, 0 };

		zeroShift(array);

		System.out.println(Arrays.toString(array));
	}

}
