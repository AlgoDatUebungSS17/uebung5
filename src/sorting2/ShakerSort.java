package sorting2;

public class ShakerSort<T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "ShakerSort";
	}

	@Override
	protected void sort() {

		boolean needNext;

		for (int j = 0; j < inputSize() / 2; j++) {
			needNext = false;
			for (int i = j; i < inputSize() - 1 - j; i++) {
				if (less(i + 1, i)) {
					swap(i, i + 1);
					needNext = true;
				}
			}

			for (int l = inputSize() - 1 - j; l > j; l--) {
				if (less(l, l - 1)) {
					swap(l - 1, l);
					needNext = true;
				}
			}
			if(!needNext)
			{
				j = inputSize();
			}
		}

	}
}