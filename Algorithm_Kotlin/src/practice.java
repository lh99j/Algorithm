interface Parse{
    public default String[] getTokens(String in, String delim) {
        String[] out = in.split(delim);
        return out;
    }
}

class Parser implements Parse{
    private String in;

    public void setInputString(String in) {this.in = in;}
    private int[] getNumbers() {
        String[] stringNums =  getTokens(in, "\\(|,|\\)");
        int[] out = new int[stringNums.length];
        for(int i = 0; i < stringNums.length; i++)
//            out[i] = Integer.parseInt(stringNums[i]);
            System.out.print(stringNums[i]);
        return out;
    }
    public void showNumbers() {
        int[] numbers = getNumbers();
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println("");
    }

//    public void showNumberPairs(int num) {
//        int[] numbers = getNumbers();
//        for(int i = 0; i < numbers.length; i++) {
//            System.out.printf("%d ", numbers[i]);
//        }
//        System.out.println("");
//    }

}



public class practice {
    public static void main(String[] args){

        Parser p = new Parser();
//        p.setInputString("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
//        p.showNumbers();

        p.setInputString("(1, 2), (3, 4), (5, 6), (7, 8), (9, 10)");
        p.showNumbers();
//        p.showNumberPairs(2);

    }
}
