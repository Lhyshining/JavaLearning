#include <iostream>
#include <unordered_set>
#include <unordered_map>
#include <set>
#include <map>
#include <string>
#include <ctime>

using std::cout;
using std::endl;

/**
 * @brief This is a 'print' function in template
 * @param container is a stl container. e.g. vector, set,map
 * @param it is an iterator of this container
 */
template <typename T1, typename T2>
void Print(T1 container, T2 it)
{  
    for (it = container.begin(); it != container.end(); it++)
    {
        cout << *it << " ";
    }
    cout << endl;
}

int main(int argc, char *argv[])
{
    int arr[] = {7, 2, 1, 5, 5};
    std::string arr_str[] = {"wang", "li", "lu", "jiang", "huang"};
    int len = sizeof(arr) / sizeof(arr[0]);

    // hash_set, tree_set
    std::unordered_set<int> uos;
    for (int i = 0; i < len; i++)
    {
        uos.insert(arr[i]);
    }
    std::unordered_set<int>::const_iterator uit;
    Print(uos, uit);

    std::set<int> set;
    for (int i = 0; i < len; i++)
    {
        set.insert(arr[i]);
    }
    std::set<int>::const_iterator it;
    Print(set, it);
    


    /**
     * @todo to be continued
     */
    // hash_map, tree_map
    std::unordered_map<int,std::string> uom;
    for (int i = 0; i < len; i++)
    {
        uom.insert(std::pair<int,std::string>(arr[i],arr_str[i]));
    }
    std::unordered_map<int,std::string>::const_iterator umit;    
    
    return 0;
}
