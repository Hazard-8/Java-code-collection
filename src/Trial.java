import java.util.*;

class Trial{
    enum Val{
            ZERO("zero"), ONE("one"), TWO("two"), THREE("three"),
            FOUR("four"), FIVE("five"), SIX("six"), SEVEN("seven"),
            EIGHT("eight"), NINE("nine"),TEN("ten"),ELEVEN("eleven"),
            TWELVE("twelve"), THIRTEEN("thirteen"), FOURTEEN("fourteen"),
            FIFTEEN("fifteen"), SIXTEEN("sixteen"), SEVENTEEN("seventeen"),
            EIGHTEEN("eighteen"), NINETEEN("nineteen"), TWENTY("twenty"),
            THIRTY("thirty"), FORTY("forty"), FIFTY("fifty"),
            SIXTY("sixty"), SEVENTY("seventy"), EIGHTY("eighty"),
            NINETY("ninety");

            private final String word;

            Val(String word){
                this.word=word;
            }

            public String getWord(){
                return this.word;
            }

        }


        static String convert(int num){
            if(num==0)
                return Val.ZERO.getWord();
            StringBuilder words= new StringBuilder();
            int tho=num/1000;
            int rem=num%1000;
            if(tho>0)
                words.append(convert(tho)).append(" thousand ");
            int hun=rem/100;
            rem %= 100;
            if(hun>0)
                words.append(Val.values()[hun].getWord()).append(" hundred ");
            if(rem!=0){
                if(rem<=20)
                    words.append(Val.values()[rem].getWord());
                else{
                    words.append(Val.values()[(rem/10)+18].getWord()).append(" ");
                    rem%=10;
                    if(rem>0)
                        words.append(Val.values()[rem].getWord());
                }
            }

            return words.toString();
        }

        public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number (0-99999) : ");
            int num = sc.nextInt();
            if (num < 0 || num > 99999)
                System.out.println("Number out of range");
            else {
                String words = convert(num);
                System.out.println("Number in words : " + words);
            }
        }
}