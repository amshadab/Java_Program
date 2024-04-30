import java.io.*;
public class Words {

    public static void main(String[] args) throws IOException {
        File f = new File("Hello.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter("Hello.txt");
        fw.write("Hello World in java");
        fw.close();
        FileReader fr = new FileReader("Hello.txt");
        int ch;
        int word=0;
        while((ch=fr.read())!=-1)
        {
            if(ch==' ')
            {
               word++;
            }
        }
        System.out.println("Number of words: "+ (word+1));
        fr.close();
    }
}