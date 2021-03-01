package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        long startString = System.nanoTime();
        for (int i = 0; i <= 20000; i++) {
            string = string + (i + " ");
        }
        long finishString = System.nanoTime();
        System.out.println(string);
        StringBuilder sb = new StringBuilder();
        long startSb = System.nanoTime();
        for (int i = 1; i <= 20000; i++) {
            sb.append(i + " ");
        }
        long finishSb = System.nanoTime();
        System.out.println("");
        System.out.println(sb);
        System.out.println(finishString - startString);
        System.out.println(finishSb - startSb);
    }
}
