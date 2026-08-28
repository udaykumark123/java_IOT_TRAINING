package praticeday5iot;

public class ptday67 {

	public static void main(String[] args) {
		int[] marks= {35,55,65,65,80,75};
		String[] exams= {
				"First test","second test","third test","Quarterly","Half yearly","annual"};
		int maxScore=0;
		String bestExam="";
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>maxScore) {
				maxScore=marks[i];
				bestExam=exams[i];
			}
		}
		System.out.println("Maximum score:"+maxScore);
		System.out.println("Best Exam"+bestExam);
		
		// TODO Auto-generated method stub

	}

}
