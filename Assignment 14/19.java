import java.io.*;
class Main {
    static void remove(String str, String word)
    {
        String msg[] = str.split(" ");
        String new_str = "";
        for (String words : msg) {
            if (!words.equals(word)) {
                new_str += words + " ";
            }
        }
        System.out.print(new_str);
    }
    public static void main(String[] args)
    {
        String str = "This is the Geeks For Geeks";
        String word = "the";
        remove(str, word);
    }
}