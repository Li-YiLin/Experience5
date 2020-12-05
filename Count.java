package Experience1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Count {
    public static int count(String srcname,String code){
        int i = 0;
        int n = -1;
        byte [] a = new byte[100];
        File f = new File(srcname);
        try{
            FileInputStream in = new FileInputStream(f);
            int m = code.length();
            while((n = in.read(a,0,2*m)) != -1){
                String s = new String (a,0,n);
                if(code.equals(s)){
                    i++;
                }
            }


        }catch(IOException ne){
            System.out.println("ReadError");
        }
        catch(Exception ne){
            System.out.println("error");
        }
        System.out.println(i);
        return i;
    }
}
