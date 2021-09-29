package linkedlist;

public class LinkedListPlayground {

  public static void playSingleLinkedListNode() {
    SingleLinkedListNode singleLinkedListNode = new SingleLinkedListNode(1);
    singleLinkedListNode.append(2);
    singleLinkedListNode.append(3);
    singleLinkedListNode.append(4);
    singleLinkedListNode.append(5);
    singleLinkedListNode.retrieve();

    System.out.println();

    singleLinkedListNode.delete(2);
    singleLinkedListNode.retrieve();
  }

  public static void playSingleLinkedList() {
    SingleLinkedList singleLinkedList = new SingleLinkedList();
    singleLinkedList.append(1);
    singleLinkedList.append(2);
    singleLinkedList.append(3);
    singleLinkedList.append(4);
    singleLinkedList.append(5);
    singleLinkedList.retrieve();

    System.out.println();

    singleLinkedList.delete(5);
    singleLinkedList.delete(1);
    singleLinkedList.retrieve();
  }
}
