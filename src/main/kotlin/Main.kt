fun main(){
    val twoSum = TwoSum()
    val n1 = ListNode(2)
    val n2 = ListNode(4)
    val n3 = ListNode(3)
    n1.next = n2
    n2.next = n3


    val m1 = ListNode(5)
    val m2 = ListNode(6)
    val m3 = ListNode(4)
    m1.next = m2
    m2.next = m3

    val listNode = twoSum.addTwoNumbers(n1, m1)
    println(listNode?.`val`)
    println(listNode?.next?.`val`)
    println(listNode?.next?.next?.`val`)

}
