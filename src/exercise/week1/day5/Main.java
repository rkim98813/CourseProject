package exercise.week1.day5;

import java.util.Scanner;

class MyList {
    static Node head;

    class Node{
        int data;
        Node link;

        Node(int data) {
            this.data = data;
            this.link = null;
        }

    }

    MyList(){
        Node head = null;
    }

    //1:insert
    void insert(int data){
        Node newNode = new Node(data);
        newNode.link = head;
        head = newNode;
    }

    //2:delete
    void delete(){
        if (head != null) {
            head = head.link;
        }else {
            System.out.println("비어있어 삭제 불가");
        }
    }

    //3:invert linked list (lead, middle, trail)
    Node invert(Node lead){
        Node trail = null;
        Node middle = null;

        while(lead!=null){
            trail = middle;
            middle = lead;
            lead = lead.link;
            middle.link = trail;
        }
        return middle;
    }

    //4:print
    void print(){
        Node cur = head;
        System.out.print("첫번째 노드 값 -> ");
        while(cur != null){
            System.out.println(cur.data+"  ");
            cur=cur.link;
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();

        Scanner scanner = new Scanner(System.in);

        int choose = 0; //초기 설정
        int data; //초기 설정

        while(choose != 5){
            System.out.println("선택을 위한 값을 입력 - 1:insert 2:delete 3:invert 4:output 5:exit");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("삽입할 값을 넣으세요: ");
                    data = scanner.nextInt();
                    myList.insert(data);
                    break;
                case 2:
                    myList.delete();
                        System.out.println("첫번째 노드의 값의 삭제가 완료되었습니다.");
                    break;
                case 3:
                    myList.head = myList.invert(myList.head);
                    break;
                case 4:
                    System.out.println("출력값을 보여드립니다.");
                    myList.print();
                    break;
                case 5:
                    System.exit(0); // Exit
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("다시하세요.");
            }
        }
    }
}
