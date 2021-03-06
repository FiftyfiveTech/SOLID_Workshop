package three.drivers;

import three.exceptions.NotImplementedException;

public class NormalScreenDriver implements Device {

    @Override
    public String read() {
        throw new NotImplementedException("A normal screen doesn't reads data");
    }

    @Override
    public void write(String body) {
        body = String.format("Writing %s to normal screen", body);
        System.out.println(body);
    }
}