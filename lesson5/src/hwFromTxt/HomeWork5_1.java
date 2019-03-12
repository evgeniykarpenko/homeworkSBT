package hwFromTxt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HomeWork5_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter URL:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String strUrl = reader.readLine();
                readContent(strUrl);
            }
        } finally {
            reader.close();
        }
    }

    public static void readContent(String str) throws IOException {
        try {
            URL url = new URL(str);
            BufferedReader urlReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String str1;
            System.out.println("Now reading: " + str);
            while ((str1 = urlReader.readLine()) != null)
                System.out.println(str1);
            urlReader.close();
            System.exit(0);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("WRONG URL !!!");
            System.out.println("ENTER NEW URL !!!");
        }
    }
}
