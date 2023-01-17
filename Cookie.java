package sdf.fortunecookies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cookie {
    String dirPath = "./data2";
    String fileName = "cookie.txt";

    List<String> cookieItems = null;

    //read from cookie file
    public void readCookieFile() throws FileNotFoundException{
        cookieItems = new ArrayList<String>();

        File file = new File(dirPath + File.separator + fileName);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String cookie;

        try {
            while ((cookie = br.readLine() )!= null){
                cookieItems.add(cookie);
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String returnCookie(){
        Random rand = new Random();

        if (cookieItems != null){

            return cookieItems.get(rand.nextInt(cookieItems.size()));

        } else {
            return "There is no cookie found";
        }
    }

    
}
