/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class TwoSum {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var head = ListNode(0)
        var f = l1
        var s = l2
        var up = 0

        var cur = head

        while (f!=null || s!=null){

            val fv = f?.`val` ?: 0
            val sv = s?.`val` ?: 0

            val sum = fv.plus(sv).plus(up)
            up = sum / 10
            val v = sum % 10
            cur.next = ListNode(v)
            cur = cur.next!!
            if(f != null) f = f.next
            if(s != null) s = s.next
        }

        if(up>0){
            cur.next = ListNode(up)
        }
        return head.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
