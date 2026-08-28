package praticeday5iot;

public class ptday63 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("Java");
		System.out.println("String:"+sb);
		
		sb.insert(6,"Jvaaa");
		System.out.println(sb);
		sb.delete(5, 10);
		System.out.println(sb);
		sb.reverse();
		System.out.println("REverse:"+sb);
	}

}
