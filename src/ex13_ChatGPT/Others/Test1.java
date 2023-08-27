package ex13_ChatGPT.Others;

public class Test1  {
    public static void main(String[] args) {
        String s="pencil";
        char c='e';

        System.out.println(javaUtils.isEmpty("apple"));
        System.out.println(javaUtils.isEmpty(""));
        //javaUtils.returnIndex("phone");

        System.out.println(s.indexOf(c));
        System.out.println(javaUtils.returnIndex("apple", 'r'));

        System.out.println(javaUtils.isEmpty("aa"));

        System.out.println(javaUtils.isSidesMatched("level"));

        //System.out.println(javaUtils.reverseAndPrint("apple"));
        System.out.println(javaUtils.reverseAndPrint("abcde"));

        System.out.println(javaUtils.findMaxValue(new int[]{113,119,21}));
        System.out.println(javaUtils.findMinValue(new int[]{113,119,21}));
        System.out.println(javaUtils.sumIntArrary(new int[]{3,9,1}));

        System.out.println(javaUtils.dateToString());

        System.out.println(javaUtils.findIntArrary(new int[]{3,6,7}, 8));


    }
}
