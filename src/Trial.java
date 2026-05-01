import java.util.Scanner;

enum Units {
    ZERO(0,"ZERO"), ONE(1,"ONE"), TWO(2,"TWO"),
    THREE(3,"THREE"), FOUR(4,"FOUR"), FIVE(5,"FIVE"),
    SIX(6,"SIX"), SEVEN(7,"SEVEN"), EIGHT(8,"EIGHT"),
    NINE(9,"NINE"), TEN(10,"TEN"), ELEVEN(11,"ELEVEN"),
    TWELVE(12,"TWELVE"), THIRTEEN(13,"THIRTEEN"),
    FOURTEEN(14,"FOURTEEN"), FIFTEEN(15,"FIFTEEN"),
    SIXTEEN(16,"SIXTEEN"), SEVENTEEN(17,"SEVENTEEN"),
    EIGHTEEN(18,"EIGHTEEN"), NINETEEN(19,"NINETEEN");

    int val;
    String word;

    Units(int val, String word) {
        this.val = val;
        this.word = word;
    }

    static String of(int n) {
        for (Units u : values())
            if (u.val == n) return u.word;
        return "";
    }
}

enum Tens {
    TWENTY(20,"TWENTY"), THIRTY(30,"THIRTY"),
    FORTY(40,"FORTY"), FIFTY(50,"FIFTY"),
    SIXTY(60,"SIXTY"), SEVENTY(70,"SEVENTY"),
    EIGHTY(80,"EIGHTY"), NINETY(90,"NINETY");

    int val;
    String word;

    Tens(int val, String word) {
        this.val = val;
        this.word = word;
    }

    static String of(int n) {
        for (Tens t : values())
            if (t.val == n) return t.word;
        return "";
    }
}

enum Scale {
    HUNDRED(100,"HUNDRED"), THOUSAND(1000,"THOUSAND");

    int val;
    String word;

    Scale(int val, String word) {
        this.val = val;
        this.word = word;
    }
}

public class Trial {

    static String convert(int n) {
        if (n == 0) return "ZERO";
        String result = "";

        if (n >= 1000) {
            result += convert(n / 1000) + " " + Scale.THOUSAND.word + " "; n %= 1000;
        }

        if (n >= 100)  {
            result += Units.of(n / 100) + " " + Scale.HUNDRED.word + " ";  n %= 100;
        }

        if (n >= 20)   {
            result += Tens.of((n / 10) * 10); if (n % 10 != 0) result += " " + Units.of(n % 10);
        }

        else if (n > 0){
            result += Units.of(n);
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (0-99999): ");
        System.out.println(convert(sc.nextInt()));
    }
}