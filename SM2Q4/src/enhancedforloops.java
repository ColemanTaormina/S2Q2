
public class enhancedforloops {
	public static void main(String[]args) {
	int[] x ={1,3,5,4,2,6,8,9,23,10};
	int counter1=0;
	int counter2=0;
	double counter3=0;
	int counter4=0;
	int counter5=0;
	int holder=0;
	boolean check=true;
	for(int value: x) {
		
		if(value%2!=0) {
			counter1++;
		}
		if(value%2==0) {
			counter2+=value;
		}
		counter3+=value;
		counter4++;
		
		
		if(value>holder) {
			holder=value;
		}else {
			check=false;
		}
		
	}
	counter3=counter3/(double)counter4;
	
	System.out.println("odd "+counter1);
	System.out.println("even numbers sum "+counter2);
	System.out.println("ave "+counter3);
	System.out.println("max "+holder);
	System.out.println("is it in order "+check);
}
}
