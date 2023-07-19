package problem_E2_9;

public class ReverseBuilder {
    public static void main(String[]args)
    {
        String input="deserts";
        StringBuilder sb=new StringBuilder(input);
        sb.reverse();
        String reverseString=sb.toString();
        System.out.println("reversed string :" +reverseString);
        //System.out.println("expected string :" +reverseString(input));
    }
    public static String reverseString(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
