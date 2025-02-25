import java.util.Scanner;

class kk
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbol = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        System.out.print("Введите римское число: ");
        String str = in.nextLine();
        int num = Integer.parseInt(str);

        for (int i = 0; i < nums.length; ++i) {
            while (num >= nums[i]) {
                sb.append(symbol[i]);
                num -= nums[i];
            }
        }
        //return sb.toString();
    }
}

КИРИЛЛ ЕБЛАН
