import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        File fileName = new File("./check.bin");
        ObjectWriter ow = new ObjectWriter();
        ow.write("Aleks", fileName);
        System.out.println(ow.read(fileName));
        //deleting File on exit from the Application
        fileName.deleteOnExit();
    }
}
