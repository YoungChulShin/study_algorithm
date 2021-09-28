package linkedlist;

public class SingleLinkedListNode {

  private int data;
  private SingleLinkedListNode next;

  public SingleLinkedListNode(int data) {
    this.data = data;
  }

  public void append(int data) {
    SingleLinkedListNode next = new SingleLinkedListNode(data);
    SingleLinkedListNode node = this;

    while (node.next != null) {
      node = node.next;
    }

    node.next = next;
  }

  public void delete(int data) {
    SingleLinkedListNode node = this;
    while (node.next != null) {
      if (node.next.data == data) {
        node.next = node.next.next;
      } else {
        node = node.next;
      }
    }
  }

  public void retrieve() {
    SingleLinkedListNode node = this;
    while (node.next != null) {
      System.out.print(node.data + " -> ");
      node = node.next;
    }
    System.out.print(node.data);
  }
}
