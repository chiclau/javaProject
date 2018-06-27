package java01;

public class Test4 {
	public static void main(String[] args) {
		int i,j;
		for( i=1;i<10;i++) {
			for( j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"  ");
			}
			System.out.println();
		}
		System.out.println("-----");
		int m;
		switch(2) {
		case 0:System.out.println("case0");
		break;
		case 1:
		case 2:
		case 3:System.out.println("Non Zero");
		}
		
		
	}
}
