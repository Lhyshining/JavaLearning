/**
 * 冒泡排序
 * 模板
 */

#include <iostream>
using std::cout;
using std::endl;

template <typename T>
void Swap(T &a, T &b)
{
    T temp = a;
    a = b;
    b = temp;
}

template <typename T>
void BubbleSort(T arr[], int len)
{
    for (int i = 0; i < len - 1; i++) // 共执行n-1次从0开始的循环比较 for(i = len - 1; i >=0; i--)
    {
        int flag = 0;                         // 全程无交换标识符
        for (int j = 0; j < len - 1 - i; j++) // 每次循环需要比较的次数 for(j = 0; i < i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                Swap(arr[j], arr[j + 1]);
                flag = 1;
            }
        }
        if (flag == 0)
        {
            break;
        }
    }
}

template <typename T>
void PrintArray(T arr[], int len)
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
    BubbleSort(arr, len);
    PrintArray(arr, len);
    return 0;
}
