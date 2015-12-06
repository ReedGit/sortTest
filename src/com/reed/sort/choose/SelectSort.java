package com.reed.sort.choose;

/**
 * @author reed
 * 简单选择排序（不稳定排序）
 * 第1趟，从n个记录中找出关键码最小的记录与第一个记录交换
 * 第2趟，从第2个记录开始的n-1个记录中再选出关键码最小的记录与第2个记录交换
 * 如此，第i趟，则从第i个记录开始的n-i+1个记录中选出关键码最小的记录与第i个记录交换，直到整个序列按关键码有序
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] r = new int[] { 36, 20, 18, 10, 60, 25, 30, 18, 12, 56 };
		sort(r);
		System.out.print("结果是：");
		for (int i = 0; i < r.length; i++)
			System.out.print(r[i] + " ");
	}

	/**
	 * 空间复杂度是O(1)
	 * 时间复杂度是O(n^2)
	 * @param r
	 */
	public static void sort(int[] r) {
		for (int i = 0; i < r.length; i++) {
			int k = i;
			for (int j = i + 1; j < r.length; j++) {
				if (r[j] < r[k]) {
					k = j;
				}
			}
			if (i != k) {
				int temp = r[k];
				r[k] = r[i];
				r[i] = temp;
			}
			for (int m = 0; m < r.length; m++)
				System.out.print(r[m] + " ");
			System.out.println();
		}

	}

}
