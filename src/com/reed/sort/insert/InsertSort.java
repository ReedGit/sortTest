package com.reed.sort.insert;

/**
 * @author reed 
 * 直接插入排序（稳定排序）
 * 在R(0)至R(i-1)长度为i的字表已经有序的情况下，将R(i)插入，得到R(0)至R(i)长度为i+1的字表有序，这样通过n-1趟之后，R(0)至R(n)有序
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] r = new int[] { 36, 20, 18, 10, 60, 25, 30, 18, 12, 56 };
		sort(r);
		System.out.print("结果是：");
		for (int i = 0; i < r.length; i++)
			System.out.print(r[i] + " ");
	}

	/**
	 * temp为监视变量，空间复杂度为O(1) 时间复杂度为O(n^2) 
	 * (1)最好的情况： 总比较次数n-1次，总移动次数0次 
	 * (2)最坏的情况： 总比较次数=(1/2)*(n+2)*(n-1)；总移动次数=(1/2)*(n+4)*(n-1) 
	 * 第i趟比较次数=i，移动次数=i+1
	 * @param r
	 * @return
	 */
	public static void sort(int[] r) {
		int temp = r[0];
		for (int i = 1; i < r.length; i++) {
			if (r[i] < r[i - 1]) {
				temp = r[i];
				int j;
				for (j = i - 1; j >= 0 && temp < r[j]; j--) {
					r[j + 1] = r[j];
				}
				r[j + 1] = temp;
			}
			for (int m = 0; m < r.length; m++)
				System.out.print(r[m] + " ");
			System.out.println();
		}
	}
}
