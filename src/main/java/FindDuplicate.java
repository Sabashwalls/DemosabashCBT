public class FindDuplicate {
	
    public static void main(String[] args) {
    	
    	int[] numbers = {1, 2, 3, 4, 5, 1, 6, 7, 8, 9, 2};
    	for (int i = 0; i < numbers.length - 1; i++) {
    		for (int j = i + 1; j < numbers.length; j++) {
    			if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate found: " + numbers[i]);
                }
            }
        }
    }
}
