package linkedlist;

public class SingleLinkedList {

  private Node head;

  private static class Node {
    private int data;
    private Node next;

    public Node() {
    }

    public Node(int data) {
      this.data = data;
    }
  }

  public SingleLinkedList() {
    head = new Node();
  }

  public void append(int data) {
    Node node = head;
    Node endNode = new Node(data);
    while (node.next != null) {
      node = node.next;
    }

    node.next = endNode;
  }

  public void delete(int data) {
    Node node = head;
    while (node.next != null) {
      if (node.next.data == data) {
        node.next = node.next.next;
      } else {
        node = node.next;
      }
    }
  }

  public void retrieve() {
    Node node = head.next;
    if (node == null) {
      return;
    }
    while (node.next != null) {
      System.out.print(node.data + " -> ");
      node = node.next;
    }
    System.out.print(node.data);
  }
}
