import java.io.*;
//write and read to/from File using ObjectWriter
public class ObjectWriter {

    public static void write(Object object, File fileName){
        try (FileOutputStream out = new FileOutputStream(fileName)){
            BufferedOutputStream bout = new BufferedOutputStream(out);
            ObjectOutputStream dout = new ObjectOutputStream(bout);
            dout.writeObject(object);
            dout.flush();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static Object read(File fileName){
        try (FileInputStream in = new FileInputStream(fileName)){
            BufferedInputStream bin = new BufferedInputStream(in);
            ObjectInputStream oin = new ObjectInputStream(bin);
            return oin.readObject();
        }catch (IOException | ClassNotFoundException ioe){
            ioe.printStackTrace();
            return null;
        }
    }
}
