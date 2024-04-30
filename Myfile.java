import java.io.*;

public class Myfile {

    public static void main(String[] args) throws IOException{
      File f = new File("Hello.txt");
      f.createNewFile();
    FileWriter fw = new FileWriter("Hello.txt");
    fw.write("Hello world this is my first file in java");
    fw.close();
    FileReader fr = new FileReader("Hello.txt");
    FileWriter fw2 = new FileWriter("Copy.txt");
    int ch;
    while((ch=fr.read())!=-1)
    {
       fw2.write(ch);
    }
    
    fw2.close();
    fr.close();
    }
  }
