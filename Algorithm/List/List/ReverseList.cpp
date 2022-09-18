/**
 * @brief 反转链表练习
 */

#include <iostream>
#include <list>
using namespace std;

void Print(const list<int> &lst)
{
    for (list<int>::const_iterator it = lst.begin(); it != lst.end(); it++)
    {
        cout << *it << " ";
    }
    cout << endl;
}

int main(int argc, char *argv[])
{
    list<int> lst;
    for (int i = 0; i < 5; i++)
    {
        lst.push_back(i);
    }
    Print(lst);

    return 0;
}