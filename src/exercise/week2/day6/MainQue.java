package exercise.week2.day6;

import java.util.Scanner;

class DList {
    static Node head;

    class Node {
        int data;
        Node leftLink;
        Node rightLink;
    }

    DList() {
        head = new Node();
        head.leftLink = head;
        head.rightLink = head;
    }

    void insert(int data){
        Node newNode = new Node();
        newNode.data = data;

        newNode.rightLink = head;
        newNode.leftLink = head.leftLink;
        head.leftLink.rightLink =  newNode;
        head.leftLink = newNode;

    }

    void delete(){
        if ((head == head.leftLink) && (head ==head.rightLink)){
            System.out.println("비어있습니다");
        }else{
            head.rightLink = head.rightLink.rightLink;
            head.rightLink.leftLink = head;

        }


    }

    void print(){
        if ((head == head.leftLink) && (head ==head.rightLink)){
            System.out.println("비어있습니다");
        }else{
            System.out.print("dList: ");
            Node current = head.rightLink;

            while (current != head) {
                System.out.print(current.data + " ");
                current = current.rightLink;
            }
            System.out.println();
        }

    }

    }

    public class MainQue {
        public static void main(String[] args) {
            DList dList = new DList();

            Scanner scanner = new Scanner(System.in);

            int choose = 0;
            int data;

            while (true){
                System.out.println("1: Insert 2: Delete 3: Print 4: Exit");
                choose = scanner.nextInt();
                switch (choose){

                    case 1:
                        System.out.print("삽입할 값을 넣으세요: ");
                        dList.insert(scanner.nextInt());
                        System.out.println("값 삽입 완료");
                        break;
                    case 2:
                        dList.delete();
                        System.out.println("값 삭제 완료");
                    case 3:
                        System.out.println("출력 조회중...");
                        dList.print();
                        break;
                    case 4:
                        System.out.println("종료합니다");
                        System.exit(0); //종료
                        break;
                    default:
                        System.out.println("다시해보세요.");
                }
            }


        }
    }
