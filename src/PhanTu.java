import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhanTu<T extends Comparable<T>>{
    private T t;

    public boolean isGreaterThan(T other) {
        if (t.compareTo(other) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        try {
            File input = new File(args[0]);
            Scanner readFile = new Scanner(input);
            while (readFile.hasNextInt()) {
                int a = readFile.nextInt();
                integerArrayList.add(a);
            }
            Collections.sort(integerArrayList);

            File output = new File(args[1]);
            FileWriter fileWriter = new FileWriter(output, false);
            PrintWriter printWriter = new PrintWriter(fileWriter, true);
            String printedLine = "";
            for (Integer integer : integerArrayList) {
                printedLine += integer + " ";
            }
            printWriter.println(printedLine);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
