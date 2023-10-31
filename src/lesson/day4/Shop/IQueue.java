package lesson.day4.Shop;

/**
 * Queue 형태로 데이터를 삽입하고 추출하는 인터페이스
 **/
public interface IQueue {
    void enQueue(String video);

    String deQueue();
} //end of IQueue interface
