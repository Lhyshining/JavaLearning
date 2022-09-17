/**
 * 归并排序
 */
#include <iostream>
using namespace std;

void PrintArr(const int arr[], int len)
{
	for (size_t i = 0; i < len; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
}
void Process(int arr[], int L, int R);
void MergeSort(int arr[], int len)
{
	Process(arr, 0, len - 1);
}
/**
 * 先交换后归并
 */
void Process(int arr[], int L, int R)
{
	if (L == R)
	{
		return;
	}
	int mid = L + ((R - L) >> 1);
	Process(arr, L, mid);
	Process(arr, mid + 1, R);
	// 归并
	int len_temp = R - L + 1;
	int arr_temp[len_temp] = {};
	int idx = 0;
	int p1 = L;
	int p2 = mid + 1;
	while (p1 <= mid && p2 <= R)
	{
		arr_temp[idx++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
	}
	while (p1 <= mid)
	{
		arr_temp[idx++] = arr[p1++];
	}
	while (p2 <= R)
	{
		arr_temp[idx++] = arr[p2++];
	}

	// arr_temp替换掉arr[L]到arr[R]
	for (size_t i = 0; i < len_temp; i++)
	{
		arr[L + i] = arr_temp[i];
	}
}
int main()
{
	int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 3, 4, 5, 6, 7, 8, 9};
	int len = sizeof(arr) / sizeof(arr[0]);
	int arr_result[len] = {};
	PrintArr(arr, len);
	MergeSort(arr, len);
	PrintArr(arr, len);
	return 0;
}
