package lesson.day4.Remote;

// Abstract class RemoteTV implementing the IRemoteControl interface
public abstract class RemoteTV implements IRemoteControl {
    protected int nChannel = 0;
    protected boolean bPower = false;

    @Override
    public void powerOn() { // Override the powerOn method
        bPower = true;
        System.out.println("TV 전원 On!");
    }

    @Override
    public void powerOff() { // Override the powerOff method
        bPower = false;
        System.out.println("TV 전원 Off!");
    }

    @Override
    public void channelUp() { // Override the channelUp method
        nChannel++;
        System.out.println("TV Channel Up " + nChannel);
    }
}
