package linkedlist;

public class SingleLinkedListPlayground {

  public static void play() {
    SingleLinkedList singleLinkedList = new SingleLinkedList(1);
    singleLinkedList.append(2);
    singleLinkedList.append(3);
    singleLinkedList.append(4);
    singleLinkedList.append(5);
    singleLinkedList.retrieve();

    System.out.println();

    singleLinkedList.delete(2);
    singleLinkedList.retrieve();
  }
}
