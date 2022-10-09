#include <iostream>
#include <list>

using std::cout;
using std::endl;
/**
 * @brief 链表自定义 
 */
struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(NULL) {}
    ListNode(int x) : val(x), next(NULL) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

int main(int argc, char *argv[])
{

    return 0;
}
