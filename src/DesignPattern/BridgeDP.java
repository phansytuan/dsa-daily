package DesignPattern;

/**
 * Thay vì tạo các lớp kết hợp như:
 *   BasicTV Remote, AdvancedTV Remote, BasicRadio Remote, AdvancedRadio Remote, ...
    
  => Ta tách làm 2 nhánh:
     - RemoteControl (Abstraction)
     - Device (Implementation)
  
 *  giúp tránh class explosion:
 *   Nếu không dùng Bridge → phải tạo class riêng cho từng cặp Remote–Device.
 *   Bridge tách Abstraction, Implementation - cho phép kết hợp linh hoạt tại runtime:
 *   new AdvancedRemote(new TV()
 */


// Implementor
interface Device {
    void turnOn();
    void turnOff();
}

// Concrete Implementors
class TV implements Device {
    @Override 
    public void turnOn() { System.out.println("TV is now ON"); }

    @Override 
    public void turnOff() { System.out.println("TV is now OFF"); }
}

class Radio implements Device {
    @Override 
    public void turnOn() { System.out.println("Radio is now ON"); }

    @Override 
    public void turnOff() { System.out.println("Radio is now OFF"); }
}


// Abstraction
abstract class RemoteControl {
    protected Device device; // Bridge reference -- to Implementor

    public RemoteControl(Device device) { 
        this.device = device; 
    }

    public abstract void togglePower();
}


// Refined Abstractions
class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() { System.out.println("Using Basic Remote to toggle power.");
        device.turnOn();
    }
}
class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() { System.out.println("Using AB Remote with extra features.");
        device.turnOn();
    }
}


// Client
public class BridgeDP {
    public static void main(String[] args) {

        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.togglePower();

        RemoteControl advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
    }
}
