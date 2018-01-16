
public class LStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
	int k;
	LStart.LStop stp = new LStart.LStop();
	k=stp.LStopa(8);
	System.out.println(k);
	}
	
	
	private class LStop {
		 public int LStopa(int l) {
			 l++;
			 return l;
		 }	
			
		}
}
