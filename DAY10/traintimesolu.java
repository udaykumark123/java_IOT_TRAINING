package day11;

public class traintimesolu {
	public static void main(String[] args) {
	int[] arrival= {9,9,10,10,11};
	int[] departure= {10,11,10,11,12};
	int lastDeparture = departure[0];
    System.out.println("Selected Trains:");
    System.out.println("Train 1");
    

    for (int i = 1; i < arrival.length; i++) {

        if (arrival[i] >= lastDeparture) {
            System.out.println("Train " + (i + 1));
            lastDeparture = departure[i];

}
    }
	}
}
