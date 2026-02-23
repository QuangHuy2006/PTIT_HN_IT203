package Session10.Ex4;

public class MainEx4{
    public static void main(String[] args) {
        IRemoteControl smartLight = new IRemoteControl(){
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật.");
            }
        };

        smartLight.powerOn();
        smartLight.checkBattery();
    }
}