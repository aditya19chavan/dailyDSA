public class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        
    }

    // Add to the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add to the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }



//delete first
public void deleteFirst(){
    if(head == null){
        System.out.println("The list is empty");
        return;
    }
    head =  head.next;
}


 //delete last
 public void deleteLast(){
    if(head == null){
        System.out.println("The list is empty");
        return;
    }


if(head.next ==null){
    head = null;
    return;
}

    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next !=null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }
    secondLast.next = null;
 }


    // Print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
    
                System.out.print(" -> ");
            
            currNode = currNode.next;
        }
        System.out.println(" -> NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList(); // Output: is -> a -> NULL

        list.addLast("list");
        list.printList(); // Output: is -> a -> list -> NULL

        list.addFirst("this");
        list.printList(); // Output: this -> is -> a -> list -> NULL

        list.deleteFirst();
        list.printList();


        list.deleteLast();
        list.printList();
    }
}
