package sorting2;

public class ShakerSort<T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "ShakerSort";
	}

	@Override
	protected void sort() {

		int steps = 0;

		for (int j = 0; j < inputSize() / 2; j++) {
			for (int i = steps; i < inputSize() - 1 - j; i++) {
				if (less(i + 1, i)) {
					swap(i, i + 1);
				}
			}

			for (int l = inputSize() - 1 - steps; l > steps; l--) {
				if (less(l, l - 1)) {
					swap(l - 1, l);
				}
			}

			steps++;
		}

	}
}