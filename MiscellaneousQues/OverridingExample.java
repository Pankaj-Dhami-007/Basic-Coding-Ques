class Device{
    public void start(){
        System.out.println("Device is On");
    }
}

class Computer extends Device{
    @Override
    public void start(){
        System.out.println("Computer is On");
    }
}

class Laptop extends Device{
    @Override
    public void start(){
        System.out.println("Laptop is On");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Device device = new Device();
        device.start();
        Device computerDevice = new Computer();
        Device laptopDevice = new Laptop();

        computerDevice.start();
        laptopDevice.start();
    }
}
