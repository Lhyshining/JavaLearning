/**
 * 堆排
 * 1. 遍历，将数组先排序成大根堆heapinsert
 * 2. 将数组开始结尾数互换，heapsize--
 * 3. 重新排序成大根堆heapify
 */
#include <iostream>

using namespace std;
void Swap(int &a, int &b)
{
	int temp = a;
	a = b;
	b = temp;
}
void HeapInsert(int arr[], int index);
void Heapify(int arr[], int index, int heap_size);

void HeapSort(int arr[], int len)
{
	for (size_t i = 0; i < len; i++)
	{
		HeapInsert(arr, i);
	}
	int heap_size = len;
	Swap(arr[0], arr[--heap_size]);
	while (heap_size > 0)
	{
		Heapify(arr, 0, heap_size);
		Swap(arr[0], arr[--heap_size]);
	}
}

// 从下往上
void HeapInsert(int arr[], int index)
{
	while (arr[index] > arr[(index - 1) / 2])
	{
		Swap(arr[index], arr[(index - 1) / 2]);
		index = (index - 1) / 2;
	}
}
// 从上往下
void Heapify(int arr[], int index, int heap_size)
{
	int left = 2 * index + 1;
	while (left < heap_size)
	{
		// 下方有孩子时候，谁的值大就把下标给largest
		int largest = left + 1 < heap_size && arr[left + 1] > arr[left] ? left + 1 : left;
		// 孩子中较大值再跟父比较
		largest = arr[index] < arr[largest] ? largest : index;
		if (largest == index)
		{
			break;
		}
		Swap(arr[index], arr[largest]);
		index = largest;
		left = 2 * index + 1;
	}
}
int main()
{
	int arr[] = {1, 3, 4, 2, 5, 3, 2, 6};
	int len = sizeof(arr) / sizeof(arr[0]);
	HeapSort(arr, len);
	for (size_t i = 0; i < len; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
	return 0;
}
