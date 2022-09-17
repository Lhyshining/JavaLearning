/**
 * 桶排
 * 1. 先找出数组中最大的位数
 * 2.
 */
#include <iostream>
#include <limits.h>
#include <cmath>

using namespace std;

int FindMaxBits(int arr[], int len)
{
	int max = INT_MIN;
	int max_bits = 0;
	for (int i = 0; i < len; i++)
	{
		max = max > arr[i] ? max : arr[i];
	}
	while (max != 0)
	{
		max_bits++;
		max /= 10;
	}
	return max_bits;
}
int GetDigit(int num, int d)
{
	return (int(num / pow(10, d - 1)) % 10);
}
void RadixSort(int arr[], int len)
{
	int max_bits = 0;
	max_bits = FindMaxBits(arr, len);
	int arr_temp[len] = {};
	for (int i = 1; i <= max_bits; i++)
	{
		int count[10] = {}; // 存放某位有几个数
		for (int j = 0; j < len; j++)
		{
			int n = GetDigit(arr[j], i); // 某位得到了一个数，将其放入桶中
			count[n]++;
		}
		// count数组累加
		// count[1] 表示当前位是0~1的数字有多少个
		// count[i] 表示当前位是0~i的数字有多少个
		for (int k = 1; k < 10; k++)
		{
			count[k] = count[k] + count[k - 1];
		}

		// 从原数组倒序查找
		// 从最右边开始查找，假如arr[k]的当前位是4，且count[4] = 5。
		// 那么表示当前位小于等于4的共有5个数，所以arr[k]应当放到arr[4]上。
		for (int k = len - 1; k >= 0; k--)
		{
			int n = GetDigit(arr[k], i);
			arr_temp[count[n] - 1] = arr[k];
			count[n]--;
		}

		for (int k = 0; k < len; k++)
		{
			arr[k] = arr_temp[k];
		}
	}
}
int main()
{
	int arr[] = {100, 234, 1, 23, 456, 2, 3,1122};
	int len = sizeof(arr) / sizeof(arr[0]);
	RadixSort(arr, len);
	for (int i = 0; i < len; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;
	return 0;
}