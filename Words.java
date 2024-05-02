import java.io.*;
public class Words {

    public static void main(String[] args) throws IOException {
        File f = new File("Hello.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.write("Hello World in java");
        fw.close();
        FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
        String line;
        int count=0;
        while((line=br.readLine())!=null)
        {
            String word[]=line.split(" ");
            count = count + word.length;
        }
        System.out.println("Number of words: "+count);
        br.close();
        fr.close();

    }
}
