package lesson.day2;

class Bank {
    private int balance;//잔액
    private int account_id;//계좌번호
    private int account_ps;//게좌비밀번호
    public String Bank_name; //은행명
    public void Balance_Chek(){
        System.out.println(balance);
    }
    public void Print_ID(){
        System.out.println(account_id);
    }
}
public class test{
    public static void main(String args[]){
        Bank user = new Bank();
        user.Balance_Chek();
        user.Print_ID();
        //user.account_ps; //외부접근 불가
        //user.Bank_name; //외부접근 가능
    }
}

