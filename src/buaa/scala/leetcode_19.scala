package buaa.scala

object leetcode_19 {
  def main(args: Array[String]): Unit = {

    /*
    LeetCode 第19题
     */
    class ListNode(var _x: Int = 0) {
        var next: ListNode = null
        var x: Int = _x
      }

    def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
      val dummy = new ListNode(0)
      dummy.next = head
      var first: ListNode = dummy
      var second: ListNode = dummy
      for(i<- 1 to n+1){
        first = first.next
      }
      while(first!=null){
        first = first.next
        second = second.next
      }
      second.next = second.next.next
      dummy.next
    }

    val headNode = new ListNode(1)

    val secondNode = new ListNode(2)
    headNode.next = secondNode

    val thirdNode = new ListNode(3)
    secondNode.next = thirdNode

    val fourthNode = new ListNode(4)
    thirdNode.next = fourthNode

    val fifthNode = new ListNode(5)
    fourthNode.next = fifthNode

    var currentNode = headNode

    val result: ListNode = removeNthFromEnd(currentNode, 2)

    while (result != null) {
      println(currentNode.x)
      currentNode = currentNode.next
    }

  }
}
