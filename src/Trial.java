import java.util.Scanner;

class NumberToWords {

    enum Numbers {

        ZERO("ZERO"), ONE("ONE"), TWO("TWO"), THREE("THREE"), FOUR("FOUR"),
        FIVE("FIVE"), SIX("SIX"), SEVEN("SEVEN"), EIGHT("EIGHT"), NINE("NINE"),
        TEN("TEN"), ELEVEN("ELEVEN"), TWELVE("TWELVE"), THIRTEEN("THIRTEEN"),
        FOURTEEN("FOURTEEN"), FIFTEEN("FIFTEEN"), SIXTEEN("SIXTEEN"), SEVENTEEN("SEVENTEEN"),
        EIGHTEEN("EIGHTEEN"), NINETEEN("NINETEEN"), TWENTY("TWENTY"), THIRTY("THIRTY"),
        FORTY("FORTY"), FIFTY("FIFTY"), SIXTY("SIXTY"), SEVENTY("SEVENTY"),
        EIGHTY("EIGHTY"), NINETY("NINETY");

        String word;

        Numbers(String word) {
            this.word = word;
        }

        String getWord() {
            return word;
        }
    }

    static String twoDigits(int num) {

        if(num < 20) {
            return Numbers.values()[num].getWord();
        }

        int tens = num / 10;
        int ones = num % 10;

        String result = "";

        switch(tens) {

            case 2 -> result = Numbers.TWENTY.getWord();
            case 3 -> result = Numbers.THIRTY.getWord();
            case 4 -> result = Numbers.FORTY.getWord();
            case 5 -> result = Numbers.FIFTY.getWord();
            case 6 -> result = Numbers.SIXTY.getWord();
            case 7 -> result = Numbers.SEVENTY.getWord();
            case 8 -> result = Numbers.EIGHTY.getWord();
            case 9 -> result = Numbers.NINETY.getWord();
        }

        if(ones != 0) {
            result += " " + Numbers.values()[ones].getWord();
        }

        return result;
    }

    static String convert(int num) {

        if(num == 0) {
            return Numbers.ZERO.getWord();
        }

        String result = "";

        int thousands = num / 1000;
        int remaining = num % 1000;

        if(thousands > 0) {
            result += twoDigits(thousands) + " THOUSAND ";
        }

        int hundreds = remaining / 100;
        remaining = remaining % 100;

        if(hundreds > 0) {
            result += Numbers.values()[hundreds].getWord() + " HUNDRED ";
        }

        if(remaining > 0) {
            result += twoDigits(remaining);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-99999): ");
        int num = sc.nextInt();

        if(num < 0 || num > 99999) {
            System.out.println("Out of range");
        }

        else {
            System.out.println(convert(num));
        }

        sc.close();
    }
}