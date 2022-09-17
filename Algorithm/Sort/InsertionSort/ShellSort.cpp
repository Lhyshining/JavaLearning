/**
 * 希尔排序
 * 使用插入排序 5间隔排序 -> 3间隔排序 -> 1间隔排序
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

void ShellSort(int arr[], int len)
{
    for (int D = len / 2; D > 0; D /= 2)
    {
        for (int i = D; i < len; i++)
        {
            int temp = arr[i];
            int j = i;
            for (; j >= D && arr[j - D] > temp; j -= D)
            {
                arr[j] = arr[j - D];
            }
            arr[j] = temp;
        }
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
    ShellSort(arr, len);
    PrintArray(arr, len);
    return 0;
}
