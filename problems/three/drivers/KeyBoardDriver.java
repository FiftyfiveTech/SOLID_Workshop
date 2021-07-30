package three.drivers;

import three.exceptions.NotImplementedException;

public class KeyBoardDriver implements Device {

    @Override
    public String read() {
        System.out.println("Reading a key press event");
        return "Key Event";
    }

    @Override
    public void write(String body) {
        throw new NotImplementedException("A key board doesn't write data!");
    }
}
