package sorting2;

public class InsertionSort<T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "InsertionSort";
	}

	@Override
	protected void sort() {
		for (int i = 1; i < inputSize(); i++) {
			if (less(i, i - 1)) {
				for (int j = 0; j < i; j++) {
					if (less(i, j)) {
						for (int x = i; x > j; x--) {
							swap(x, x - 1);
						}
						break;
					}
				}
			}
		}
	}
}