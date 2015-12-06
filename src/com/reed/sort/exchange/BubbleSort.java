package com.reed.sort.exchange;

/**
 * @author reed 
 * 冒泡排序（稳定排序）
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] r = new int[] { 60, 56, 36, 30, 25, 20, 18, 18, 12, 10 };
		int[] result = sort(r);
		System.out.print("结果是：");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}

	/**
	 * 时间复杂度O(n^2)
	 * 最好情况：只需比较n-1次，不需要移动
	 * 最坏情况：总比较次数=(1/2)*n*(n-1)
	 * @param r
	 * @return
	 */
	public static int[] sort(int[] r) {
		for (int i = 1; i < r.length; i++) {
			int swap = 0;
			for (int j = 0; j < r.length - i; j++) {
				if (r[j] > r[j + 1]) {
					int temp;
					temp = r[j + 1];
					r[j + 1] = r[j];
					r[j] = temp;
					swap = 1;
				}
			}
			for (int m = 0; m < r.length; m++)
				System.out.print(r[m] + " ");
			System.out.println();
			if (swap == 0) {
				break;
			}
		}
		return r;
	}

}
