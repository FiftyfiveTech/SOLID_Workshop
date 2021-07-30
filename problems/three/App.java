package three;

import three.drivers.Device;
import three.drivers.KeyBoardDriver;
import three.drivers.NormalScreenDriver;
import three.drivers.TouchScreenDriver;
import three.exceptions.NotImplementedException;

public class App {
    public static void main(String[] args) {
        KeyBoardDriver keyBoard = new KeyBoardDriver();
        readFrom(keyBoard);
        writeDefaultMessageTo(keyBoard);

        TouchScreenDriver touchScreen = new TouchScreenDriver();
        readFrom(touchScreen);
        writeDefaultMessageTo(touchScreen);

        NormalScreenDriver normalScreen = new NormalScreenDriver();
        readFrom(normalScreen);
        writeDefaultMessageTo(normalScreen);
    }

    private static boolean readFrom(Device device) {
        try {
            device.read();
            return true;
        } catch (NotImplementedException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean writeDefaultMessageTo(Device device) {
        try {
            device.write("Default message");
            return true;
        } catch (NotImplementedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
