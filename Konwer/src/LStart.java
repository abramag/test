
public class LStart {

	public static void main(String[] args) {

		System.out.println("Start");
		int k;
		LStop stp = new LStart(). new LStop(8);
		k=stp.zwroc();
		System.out.println(k);
	
	}


//LStop musi byc interface
	class LStop  {
		public LStop(int l) {
			this.k=l++;

		}	

		public int zwroc () {
			System.out.println("Result K is: " + k);
			return k;

		}
		int k;
	}

}

//interface Stops{};