import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered {

    public static void main(String[] args) {
        buffer();
        reader();


    }

    public static void buffer() {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\PC\\Desktop\\Test\\output.txt"));
            bw.write("karen\n");
            bw.write("chad\n");
            bw.write("becky\n");
        } catch (Exception ex) {
            return;

        }

    }

    public static void reader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\PC\\Desktop\\Test\\output2.txt"));
            String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (Exception ex) {
            return;

        }


    }


}
