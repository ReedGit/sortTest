package com.reed.sort.exchange;

/**
 * @author reed 
 * 快速排序（不稳定排序）
 * 以某个记录为标准（也称为支点），通过划分将待排序列分分成两组，其中一组中的记录的关键码均大于或等于支点记录的关键码，
 * 另一组中的所有记录的关键码小于支点记录的关键码，则支点记录就放在两组之间，这也是该记录的最终位置。
 * 再对各部分继续划分，直到整个序列按关键码有序
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] r = new int[] { 36, 20, 18, 10, 60, 25, 30, 18, 12, 56 };
		int low = 0;
		int high = r.length - 1;
		sort(r, low, high);
		System.out.print("结果是：");
		for (int i = 0; i < r.length; i++)
			System.out.print(r[i] + " ");
	}

	/**
	 * 划分算法 
	 * 快速排序的核心时划分 
	 * 设置两个搜索指针low和high是指示待划分区域的两个端点，
	 * 从high位置开始向前搜索比支点小的记录，并将其交换到low位置处，
	 * low向后移动一个位置，从low位置开始向后搜索比支点大（等于）的记录，并将其交换到high位置处，high向前移动一个位置，
	 * 如此继续，知道low和high相等，这表明low前面的都比支点小，high后面的都比支点大，low和high指的这个位置就是支点的最后位置。
	 * 为了减少数据的移动，先把支点记录缓存起来，最后再置入最终的位置。
	 * 
	 * @param r
	 * @param low
	 * @param high
	 * @return
	 */
	public static int Partition(int[] r, int low, int high) {
		int temp = r[low];
		while (low < high) {
			while (low < high && r[high] >= temp)
				high--;
			if (low < high) {
				r[low] = r[high];
				low++;
			}
			while (low < high && r[low] < temp) {
				low++;
			}
			if (low < high) {
				r[high] = r[low];
				high--;
			}
		}
		r[low] = temp;
		for (int m = 0; m < r.length; m++)
			System.out.print(r[m] + " ");
		System.out.println();
		return low;
	}

	/**
	 * 快速排序
	 * 空间复杂度O(log n以2为底)
	 * 时间复杂度O(n*log n以2为底)
	 * @param r
	 * @param s
	 * @param t
	 */
	public static void sort(int[] r, int s, int t) {
		if (s < t) {
			int i = Partition(r, s, t);
			sort(r, s, i - 1);
			sort(r, i + 1, t);
		}
	}

}
