import ReverseLinkedList.Node;
import ReverseLinkedList.ReverseLinkedListRecursively;

public class Main {
    public static void main(String[] args) {

        Node head = prepareTestData();
        ReverseLinkedListRecursively reverseLinkedList = new ReverseLinkedListRecursively();
        Node reverse = reverseLinkedList.reverse(head);

        while (reverse != null){
            System.out.print(reverse.value + " --> ");
            reverse = reverse.next;
        }

    }

    static Node prepareTestData(){
        Node head = new Node();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();

        head.value = 1;
        node1.value = 2;
        node2.value = 3;
        node3.value = 4;
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        return head;
    }
}