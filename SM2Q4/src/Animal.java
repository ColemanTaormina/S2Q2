import java.util.*;

public class Animal {
	public static void main(String[]args) {
	List<Animal1> myList=new ArrayList<Animal1>();
		myList.add(new Animal1("pig",4,0));
		myList.add(new Animal1("cow",4,0));
		myList.add(new Animal1("rooster",2,2));
		myList.add(new Animal1("bob",2,0));
	
	int counter1=0;
	int counter2=0;
	int counter3=0;
	int fewest=Integer.MAX_VALUE;
	String holder="";
		for(Animal1 value:myList) {
			counter1+=value.Numoffeet();
			counter2+=value.numofWings();
		if(fewest>value.Numoffeet()+value.numofWings()) {
			fewest=value.Numoffeet()+value.numofWings();
			holder=value.Animaltype();
		}
	}
		System.out.println("feet "+counter1);
		System.out.println("wings "+counter2);
	System.out.println("fewest num of feet+wings is "+holder);
}
}