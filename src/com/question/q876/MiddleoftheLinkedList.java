package com.question.q876;

public class MiddleoftheLinkedList {
	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {// ×：slow != null
			// 快指针步长为2 ，慢指针步长为1。 当快指针走到头，慢指针恰好到中点。
			// 故：循环终止条件应该为 快指针的下个/下下个结点为null
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		ListNode aListNode = new ListNode(5);
		MiddleoftheLinkedList.middleNode(aListNode);
	}
}
