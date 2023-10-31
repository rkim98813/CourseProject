package lesson.day4.Remote;

// LGRemoteTV class implementing the abstract class RemoteTV
public class LGRemoteTV extends RemoteTV {
    @Override
    public void channelDown() { // Override the channelDown method
        nChannel--;
        System.out.println("TV Channel Down " + nChannel);
    }

    public static void main(String[] args) {
        LGRemoteTV tv = new LGRemoteTV();
        tv.powerOn();
        tv.channelUp();
        tv.channelDown();
        tv.powerOff();
    }
}
