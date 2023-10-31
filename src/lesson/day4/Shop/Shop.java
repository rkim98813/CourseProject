package lesson.day4.Shop;


/**
 저장소 역할을 하는 클래스
 **/
import java.util.Vector;
public class Shop{
    //가게에 물건을 저장할 수 있는 공간
    protected Vector store = new Vector();
    //가게에 물건의 갯수를 알 수 있는 메서드
    public int getCount(){
        return store.size();
    }
} //end of Shop class