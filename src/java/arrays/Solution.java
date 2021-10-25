package arrays;

import java.util.Scanner;
public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++){
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < strings.length; i++){
            for (int j = i + 1; j < strings.length; j++){
                if (strings[i] != null && strings[j] != null && strings[i].equals(strings[j])){
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
