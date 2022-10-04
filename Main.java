import java.util.*;

public class Main {
    public static void main(String[] args) {
        main2();
    }

    public static void main1(){
        Document.firstBloc("1234-ABC-5678-ABC-9G0H");
    }

    public static void main2(){
        Document.numberWithoutLetters("1234-ABC-5678-ABH-9G0H");
    }

    public static void main3(){
        Document.onlyLetters("1234-ABC-5678-ABC-9G0H");
    }

    public static void main4(){
        Document.onlyLettersUpper("1234-ABC-5678-ABC-9G0H");
    }

    public static void main5(){
        Document.thePresenceOfASequence("1234-ABC-5678-ABC-9G0H");
    }

    public static void main6(){
        Document.startFrom555("1234-ABC-5678-ABC-9G0H");
    }

    public static void main7(){
        Document.endWith1a2b("1234-ABC-5678-ABC-9G0H");
    }

    public static void main8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int max_index = 0;
        for (int i = 0; i < split.length; i++) {
            if(split[i].length() >= split[max_index].length()){
                max_index = i;
            }
        }
        System.out.println(split[max_index]);
    }

    public static void main9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int min_index = 0;
        for (int i = 0; i < split.length; i++) {
            if(split[i].length() <= split[min_index].length()){
                min_index = i;
            }
        }
        System.out.println(split[min_index]);
    }

    public static void main10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        String goal = split[0];
        System.out.println("Массив: ");
        for (int i=0;i<split.length;i++){
            System.out.print(split[i]+" ");
            if ( LessDiffLetters.diffWords(split[i])<LessDiffLetters.diffWords(goal))
                goal = split[i];
        }
        System.out.println("");
        System.out.println("Искомое слово: "+goal+", число разных символов: "+ LessDiffLetters.diffWords(goal));
    }

    public static void main11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите номер слова: ");
        int n = scann.nextInt();
        String[] split = s.split(" ");
        if(n > split.length) {
            System.out.println("Слишком большое число. Кол-во слов не совпадает!!");
        } else{
            StringBuilder sb = new StringBuilder(split[n-1]);
            String s1 = sb.reverse().toString();
            System.out.println(s1);
            boolean equals = s1.equals(split[n-1]);
            System.out.println(equals);
        }
    }

    public static void main12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder("");
        String s1 = "";
        for (String f : s.split("")){
             sb.append(f).append(f);
        }
        System.out.println(sb);
    }
}