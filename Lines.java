import java.io.*;
public class Lines {

    public static void main(String[] args) throws IOException {
        File f = new File("Hello.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.write("Hello World in java\n okay bye");
        fw.close();
        FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
        int count=0;
        while((br.readLine())!=null)
        {
            count++;
        }
        System.out.println("Number of lines: "+count);
        br.close();
        fr.close();

    }
}
