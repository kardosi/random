
public class tomb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tomb= new int[10];
		java.util.Random rand = new java.util.Random();
		int random = rand.nextInt(50)+1;
		System.out.println("random: "+random);
		for(int i=0; i<10; i++)
		{
			tomb[i]=rand.nextInt(50)+1;;
			System.out.println("Tomb: "+tomb[i]);
		}
		for(int element : tomb){
			System.out.println(element);
		}
		
		int random2 = (int )(Math.random() * 50) +1;
		System.out.println("random: "+random2);

	}

}
