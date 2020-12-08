package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String j = "0";
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            j = j + " " + i;
           // System.out.print(i + " ");
        }
        System.out.println(j + " ");
        long spentTime = System.currentTimeMillis() - startTime;
        System.out.println("Время затраченное на конкатенацию :  " + spentTime + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000 ; i++) {
            sb.append(i).append(" ");
        }
        spentTime = System.currentTimeMillis() - startTime;
        System.out.print(sb);
        System.out.println();
        System.out.println("Время затраченное StringBuilder:  " + spentTime + " мс");
    }
}
