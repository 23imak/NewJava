
public class BinarySearch {
	private int[] array;

	public BinarySearch(int[] values) {
		this.array = values;
	}
	public void setArray(){
		searchNumber(array);
	}
	private int searchNumber(int[] array) {
		int first,last,middle,n = 0, search = 0;
		first = 0;
		last = n - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				return middle + 1;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
		
		{
			return -1;
		}
		return 0;

	}

}