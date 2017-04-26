package sorting2;

public class BubbleSort<T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "BubbleSort";
	}

	@Override
	protected void sort() {
		boolean needsNext;
		for (int j = 0; j < inputSize(); j++) {
			needsNext = false;
			for (int i = 0; i < inputSize() - 1-j; i++) {
				if (less(i + 1, i)) {
					swap(i, i + 1);
					needsNext = true;
				}
			}
			if(!needsNext)
			{
				j = inputSize();
			}
		}

	}
}