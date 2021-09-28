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
}
