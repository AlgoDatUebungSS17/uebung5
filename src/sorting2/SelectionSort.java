package sorting2;

public class SelectionSort <T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "SelectionSort";
	}

	@Override
	protected void sort() {
		
		for ( int i = 0; i< inputSize(); i++)
		{
			int nextSmallestIndex = i;
			for (int j = i+1; j< inputSize(); j++)
			{
				if(less(j, nextSmallestIndex))
				{
					nextSmallestIndex = j;
				}
			}
			//Darf ich das hier machen, nach der Aufgabenstelleung?
			if(i != nextSmallestIndex)
			{
				swap(i, nextSmallestIndex);
			}
		}

	}
}