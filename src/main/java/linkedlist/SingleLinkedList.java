package linkedlist;

public class SingleLinkedList {

  private int data;
  private SingleLinkedList next;

  public SingleLinkedList(int data) {
    this.data = data;
  }

  public void append(int data) {
    SingleLinkedList next = new SingleLinkedList(data);
    SingleLinkedList node = this;

    while (node.next != null) {
      node = node.next;
    }

    node.next = next;
  }

  public void delete(int data) {
    SingleLinkedList node = this;
    while (node.next != null) {
      if (node.next.data == data) {
        node.next = node.next.next;
      } else {
        node = node.next;
      }
    }
  }

  public void retrieve() {
    SingleLinkedList node = this;
    while (node.next != null) {
      System.out.print(node.data + " -> ");
      node = node.next;
    }
    System.out.print(node.data);
  }
}
