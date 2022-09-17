/**
 * 选择排序
 */

#include <iostream>
#include <limits.h>
using std::cout;
using std::endl;

void Swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

void SelectionSort(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        int temp = INT_MAX;
        int idx = -1;
        for (int j = i; j < len; j++)
        {
            if (arr[j] < temp)
            {
                temp = arr[j];
                idx = j;
            }
        }
        Swap(arr[i], arr[idx]);
    }
}

void PrintArray(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main(int argc, char *argv[])
{
    int arr[] = {1, 7, 3, 1, 2, 7, 0};
    // double arr[] = {1.5, 7, 3, 1, 2, 7, 0};
    int len = sizeof(arr) / sizeof(arr[0]);
    SelectionSort(arr, len);
    PrintArray(arr, len);
    return 0;
}
