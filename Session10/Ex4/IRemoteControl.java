package Session10.Ex4;

public interface IRemoteControl {
    void powerOn();

    default void checkBattery(){
        System.out.println("Pin ổn định");
    }
}
