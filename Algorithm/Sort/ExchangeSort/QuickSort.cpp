/**
 * 快排
 */
#include <iostream>
#include <ctime>
using namespace std;
void Divide(int arr[], int begin, int end);
void Swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

void QuickSort(int arr[], int len)
{
    Divide(arr, 0, len - 1);
}

void Divide(int arr[], int begin, int end)
{
    // LR为左右开边界
    // [0,1,2], L = -1, R = 3
    // begin end为此数组开始结束的坐标
    if (begin >= end)
    {
        return;
    }

    int L = begin - 1;
    int R = end + 1;

    int i = begin;
    // 随机生成数
    int num = arr[rand() % (end - begin + 1) + begin];
    while (i < R)
    {
        if (arr[i] < num)
        {
            // 小于的放在左边
            Swap(arr[i], arr[L + 1]);
            i++;
            L++;
        }
        else if (arr[i] == num)
        {
            // 等于的放在中间
            i++;
        }
        else
        {
            // 大于的放在右边
            Swap(arr[i], arr[R - 1]);
            R--;
        }
    }
    // 此处已经排好左中右
    // [4(begin), 5, 6, L(7), 8, 9, R(10), 11, 12, 13(end)], len = 10
    // 递归
    Divide(arr, begin, L);
    Divide(arr, R, end);
}

int main()
{
    srand((unsigned int)time(NULL));
    int arr[] = {1, 3, 4, 2, 5, 3, 2, 6};
    int len = sizeof(arr) / sizeof(arr[0]);
    QuickSort(arr, len);
    for (size_t i = 0; i < len; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}
