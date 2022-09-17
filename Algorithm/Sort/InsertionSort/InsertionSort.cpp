/**
 * 插入排序
 *
 */
#include <iostream>
using std::cout;
using std::endl;

void PrintArray(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void InsertionSort(int arr[], int len)
{
    for (int i = 1; i < len; i++)
    {
        int temp = arr[i];
        int j = i;
        for (; j > 0 && arr[j - 1] > temp; j--)
        {
            arr[j] = arr[j - 1];
        }
        arr[j] = temp;
    }
}
int main(int argc, char *argv[])
{
    int arr[] = {1, 7, 3, 1, 2, 7, 0};
    int len = sizeof(arr) / sizeof(arr[0]);
    InsertionSort(arr, len);
    PrintArray(arr, len);
    return 0;
}
