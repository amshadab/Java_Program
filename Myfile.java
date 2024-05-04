import java.io.*;

public class Myfile {

    public static void main(String[] args) throws IOException{
      File f = new File("Hello.txt");
      f.createNewFile();
    FileWriter fw = new FileWriter(f);
    fw.write("Hello world this is my first file in java");
    fw.close();
    FileReader fr = new FileReader(f);
    File f2 = new File("Copy.txt");
    f2.createNewFile();
    FileWriter fw2 = new FileWriter(f2);
    int ch;
    while((ch=fr.read())!=-1)
    {
       fw2.write(ch);
    }
    
    fw2.close();
    fr.close();
    }
  }
