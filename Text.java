package Experience1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Text {
    public static void main(String args[]){
        Student li = new Student("李宜林","2019311292","男");
        System.out.println("输入学科");
        Scanner l = new Scanner(System.in);
        li.setMajor(l.nextLine());
        try{
            int n = -1;
            int i = 0;
            byte [] a = new byte[100];
            File f = new File("src\\Experience1\\changhenge.txt");
            FileInputStream in = new FileInputStream(f);
            File targetFile = new File("src\\Experience1\\B.txt");
            Writer out = new FileWriter(targetFile,true);
            out.append(li.toString());
            System.out.println(li.toString());
            out.flush();
            while((n = in.read(a,0,2)) != -1){
                String s = new String (a,0,n);
                i++;
                out.write(s);
                out.flush();
                if(i%7 == 0 && i%14 != 0){
                    //out.write(s);
                    out.append("，");
                    out.flush();
                }

                else if(i%14 == 0){
                    out.append("。\n");
                    //out.write(s);
                    out.flush();
                }
                else{
                    //out.write(s);
                    out.flush();
                }
            }

            in.close();

        }
        catch(IOException n){
            System.out.println("ReadError");
        }
        catch(Exception n){
            System.out.println("error");
        }
        finally{}
        System.out.println("输入您想查询的字符");
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        Count.count("src\\Experience1\\changhenge.txt",s);



        //strfind("src\\Experience1\\B.txt");
        MultiThread demo = new MultiThread();
        demo.run("src\\Experience1\\B.txt");

    }

    /* public static boolean Containstr(String s1, String s2) {
         if (s1.indexOf(s2) >= 0) {
             return true;

         } else {
             return false;
         }
     }

 //编写静态查找字词方法，便于主函数调用
 public static void strfind(String file){
     File f = new File(file);
     int m = 0;
     try
     {
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         List<String> list = new ArrayList<String>();
         String str = null;
         int num = 1;
         while ((str = br.readLine()) != null)
         {
             list.add(str);
         }
         System.out.println("请输入查找的单词");
         Scanner sc = new Scanner(System.in);
         String strword = sc.nextLine();
         for (String s : list)
         {
             boolean b = Containstr(s, strword);
             if (b)
             {
                 //System.out.println(num + ":" + s);
                 m++;
             }
             //num++;
         }
         System.out.println("出现"+strword+"的次数是："+m);

     } catch (FileNotFoundException e)
     {
         e.printStackTrace();
     } catch (IOException e)
     {
         e.printStackTrace();
     }

 }*/
}
