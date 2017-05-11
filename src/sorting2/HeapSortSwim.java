package sorting2;

public class HeapSortSwim<T extends Comparable<T>> extends Sorter<T> {

	@Override
	protected String name() {
		return "HeapSort";
	}

	public void sink(int index, int size) {
		if (2 * index + 1 <= size) {
			if (2 * index + 2 <= size) {
				if (lessOrEqual(2 * index + 1, 2 * index + 2)) {
					if (less(index, 2 * index + 2)) {
						swap(index, 2 * index + 2);
						sink(2*index+2, size);
					}
				} else {
					if (less(index, 2 * index + 1)) {
						swap(index, 2 * index + 1);
						sink(2*index+1, size);
					}
				}
			} else {
				if (less(index, 2 * index + 1)) {
					swap(index, 2 * index + 1);
					sink(2*index+1, size);
				}
			}
		}
	}
	
	
	public void swim(int index)
	{
		if(index>0)
		{
			if(index%2==0)
			{
				if(less(index/2-1,index))
				{
					swap(index, index/2-1);
					swim(index/2-1);
				}
			}
			else
			{
				if(less((index-1)/2,index))
				{
					swap(index, (index-1)/2);
					swim((index-1)/2);
				}
			}
			
			
		}
			
		
	}

	public void makeHeap() {
		for(int i =1; i<inputSize(); i++)
		{
			swim(i);
		}

	}

	public void deleteMax(int size) {
		swap(0, size);
		sink(0, size-1);
		

	}

	@Override
	protected void sort() {
		makeHeap();
		for (int i = inputSize()-1; i > 0; i--) {
			deleteMax(i);
		}
	}

}
