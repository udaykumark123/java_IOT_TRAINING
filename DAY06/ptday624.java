package praticeday5iot;

public class ptday624 {

	public static void main(String[] args) {
		String[] names = {"Ravi", "Anu", "Kiran"};
        int[] numbers = {101, 102, 103};

        String[] merged = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            merged[i] = names[i] + " - " + numbers[i];
        }

        System.out.println("Student details:");

        for (int i = 0; i < merged.length; i++) {
            System.out.println(merged[i]);
        }
		// TODO Auto-generated method stub

	}

}
