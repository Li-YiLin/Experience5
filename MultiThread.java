package Experience1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//�������̵߳���
public class MultiThread extends Thread {
    //������̲߳�ʹ��ܵķ���
    public static boolean Containstr(String s1, String s2) {
        if (s1.indexOf(s2) >= 0) {
            return true;

        } else {
            return false;
        }
    }
    //ʵ�ֲ����ִʵ���Ҫ����
    public static void strfind(String file){
        File f = new File(file);
        int m = 0;
        try
        {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            List<String> list = new ArrayList<String>();
            String str = null;
            //int num = 1;
            while ((str = br.readLine()) != null)
            {
                list.add(str);
            }
            System.out.println("��������ҵ��ִ�");
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
            System.out.println("����\""+strword+"\" �Ĵ����ǣ�"+m);

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    //��д���Ǹ���Thread��run()
    public void run(String file) {
        strfind(file);
    }
}