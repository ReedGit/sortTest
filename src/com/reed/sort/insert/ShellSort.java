package com.reed.sort.insert;

/**
 * @author reed 希尔排序（不稳定排序）
 * 先选取一个小于n的整数d(i)（称之为步长），然后把排序表中的n个记录分为d(i)个组。
 * 从第一个记录开始，间隔为d(i)的记录为同一个组，各组内进行直接插入排序，一趟之后，间隔d(i)的记录有序。
 * 随着有序性的改善，减小步长d(i)，重复进行，直到d(i)=1，使得间隔为1的记录有序，也就使整体达到了有序
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] r = new int[] { 36, 20, 18, 10, 60, 25, 30, 18, 12, 56 };// 待排序数组
		int[] d = new int[] { 5, 3, 1 };// 步长增量
		int[] result = sort(r, d);
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}

	/**
	 * 希尔排序时效分析很难，有人在大量的实验基础上推出，当n在某个特定范围内，希尔排序所需的比较次数和移动次数约为n^1.3
	 * 步长因子中除1外应没有公因子，且最后一个步长因子必须为1
	 * @param r 待排序数组
	 * @param d 步长增量
	 * @return
	 */
	public static int[] sort(int[] r, int d[]) {
		for (int k = 0; k < d.length; k++) {
			int h = d[k];
			for (int i = h; i < r.length; i++) {
				if (r[i] < r[i - h]) {
					int temp = r[i];
					int j;
					for (j = i - h; j >= 0 && temp < r[j]; j = j - h) {
						r[j + h] = r[j];
					}
					r[j + h] = temp;
				}
			}
		}
		return r;
	}

}
