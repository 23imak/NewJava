
public class BinarySearch {
	private int first, last, middle, n, search;
	private int[] array;

	public BinarySearch(int[] values) {
		this.array = values;
	}
	public void setArray(){
		searchNumber(array);
	}
	private int searchNumber(int[] array) {

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
			int flag = 1;
			return flag;
		}
		return 0;

	}

}