package sorting2;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSortRandom<T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "QuickSortRandom";
	}

	@Override
	protected void sort() {
		sort(0, inputSize() - 1);
	}

	private void sort(int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		
		int pivotIndex = ThreadLocalRandom.current().nextInt(lo, hi+1);

		int pivotPosition = partition(lo, hi, pivotIndex);
		sort(lo, pivotPosition - 1);
		sort(pivotPosition + 1, hi);
	}

	private int partition(int lo, int hi, int pivotIndex) {
		swap(lo, pivotIndex);

		int i = lo;
		int j = hi+1;

		while (true) {
			while (less(++i, lo)) {
				if (i == hi) {
					break;
				}
			}
			while (less(lo, --j)) {
				if (j == lo) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			swap(i, j);
		}
		swap(lo, j);
		return j;

	}
}