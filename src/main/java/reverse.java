/*public class reverse {
	
    public static void main(String[] args) {
        int num = 12345; // Number to be reversed
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversedNum);
    }
}*/
public class reverse{

	public static void main(String[] args){

	int num = 12345;
	int reverse = 0;

	while(num !=0){
	int digit= num%10;
	reverse = reverse *10+digit;
	num/=10;
}
	System.out.println(reverse);
}

}