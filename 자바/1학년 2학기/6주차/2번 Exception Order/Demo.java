import java.io.*;
public class Demo {
    public static void main(String[] args) {
        int[] units = {12, 8, 13, 29, 50};
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream("aFile"));
            for (int i=0; i<units.length; i ++) out.writeInt(units[i]);
        } catch (FileNotFoundException e) { 
            System.out.println("File Not Exist");
        } catch (IOException e) {
            System.out.println("Not Write File");
        } finally {
            try {if (out != null) out.close();} catch (IOException e) {}
        }
    }
}