/**
 * @brief 判断一个链表是否是回文结构
 * @brief 给定一个单链表的头节点head，请判断该链表是否为回文结构
 * @example 1->2->1，返回true；1->2->2->1，返回true；15->6->15，返回true；1->2->3，返回false；
 * @details 如果链表长度为N，时间复杂度达到O(N)，额外空间复杂度达到O(1)
 */

/**
 * 1. 将链表压入栈中，再依次弹出进行比较，空间复杂度较大；
 * 2. 快慢指针，然后慢指针从中间走到最后时修改指针朝向，最后头尾指针依次遍历比较。 
 */