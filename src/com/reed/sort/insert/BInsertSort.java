package com.reed.sort.insert;

/**
 * @author reed
 * 折半插入排序（稳定排序）
 * 在有序表中确定插入位置，因此在寻找R(i)的插入位置时，可以利用折半查找的方法来确定。
 * 用折半查找方法查找R(i)的插入位置，再将R(i)插入进去，使得R(0)到R(i)有序
 */
public class BInsertSort {

	public static void main(String[] args) {
		int[] r = new int[] { 36, 20, 18, 10, 60, 25, 30, 18, 12, 56 };
		int[] result = sort(r);
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}

	/**
	 * 空间复杂度：O(1)
	 * 比较次数最多是log (n+1)以2为底向上取整
	 * 比较次数的时间复杂度O(n*(log n以2为底))
	 * 移动次数时间复杂度仍是O(n^2)
	 * @param r
	 * @return
	 */
	public static int[] sort(int r[]) {
		int temp = r[0];
		for (int i = 1; i < r.length; i++) {
			temp = r[i];
			int low = 0;
			int high = i - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (temp > r[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			for (int j = i - 1; j >= high + 1; j--) {
				r[j + 1] = r[j];
			}
			r[high + 1] = temp;
		}
		return r;
	}

}
