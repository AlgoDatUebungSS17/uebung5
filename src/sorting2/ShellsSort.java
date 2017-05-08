package sorting2;

public class ShellsSort<T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "ShellsSort";
	}

	@Override
	protected void sort() {

		int shells[] = { 701, 301, 132, 57, 23, 10, 4, 1 };
		for (int shell : shells) {
			for (int i = shell; i < inputSize(); i++) {
				for (int k = i; k > shell-1; k = k - shell)
					if (less(k, k - shell)) {
						swap(k, k - shell);
					}
					else
					{
						break;
					}
			}
		}
	}
}