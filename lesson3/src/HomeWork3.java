import java.io.*;
import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        System.out.println("different words in file: " + diffWords(fileName));
        System.out.println("sorted words : " + sortWords(fileName));
        wordsCount(fileName);
        System.out.println("reversed words : ");
        reverseString(fileName);
        System.out.println("iterator words : ");
        descendingIterators(fileName);
        System.out.println("number of words : ");
        numberString(fileName, 2,1,7);

    }

    public static int diffWords(String file) {
        Set<String> set = new HashSet<>();
        try {
            FileInputStream fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                String[] bufStr = strLine.split(" ");
                for (int i = 0; i < bufStr.length; i++)
                    set.add(bufStr[i]);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return set.size();
    }

    public static List sortWords(String file) {
        Set<String> set = new HashSet<>();
        try {
            FileInputStream fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                String[] bufStr = strLine.split(" ");
                for (int i = 0; i < bufStr.length; i++)
                    set.add(bufStr[i]);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }

    public static void wordsCount(String file) {
        Map<String, Integer> map = new HashMap<>();
        Integer count;
        try {
            FileInputStream fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                String[] bufStr = strLine.split(" ");
                for (int i = 0; i < bufStr.length; i++) {
                    if (map.containsKey(bufStr[i])) {
                        count = map.get(bufStr[i]);
                        map.put(bufStr[i], ++count);
                    } else {
                        count = 1;
                        map.put(bufStr[i], count);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        for (Map.Entry<String, Integer> p : map.entrySet()) {
            System.out.println("for word: " + p.getKey() + " - " + p.getValue() + " times");
        }
    }

    public static void reverseString(String file) {
        List<String> list = new ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {

                list.add(strLine);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void descendingIterators(String file) {
        List<String> list = new LinkedList<>();
        try {
            FileInputStream fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {

                list.add(strLine);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

        for( Iterator<String> it = ((LinkedList<String>) list).descendingIterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        //   System.out.println(list);
    }

    public static void numberString(String file, int ...n) {
        List<String> list = new ArrayList<>();
        try {
            FileInputStream fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {

                list.add(strLine);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(list.get(n[i]-1));
        }
    }
}


