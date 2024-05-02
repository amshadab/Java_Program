import java.io.*;
public class Lines {

    public static void main(String[] args) throws IOException {
        File f = new File("Hello.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter("Hello.txt");
        fw.write("Hello World in java\nThis is my file handling code\nOkay Bye");
        fw.close();
        FileReader fr = new FileReader("Hello.txt");
        int ch;
        int line=0;
        while((ch=fr.read())!=-1)
        {
            if(ch=='\n')
            {
               line++;
            }
        }
        System.out.println("Number of Lines: "+ (line+1));
        fr.close();
    }
}
