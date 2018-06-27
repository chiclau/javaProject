package java01;

public class Test5 {
	public static void main(String[] args) {
		for(int i=6;i<=100;i+=2) {
			for(int j=2;j<100;j++) {
				
				isPrime(i);
				System.out.println(i+"="+j+"+"+(i-j));
				break;
			}//loop j
		} //loop i
	}
	
	public static boolean isPrime(int m) {
		for(int i=2;i<m;i++) {
			if(m%i==0) {
				return false;
			}
		}
		return true;
	}
}
