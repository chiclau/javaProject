package java01;
/**
 * 下面是打印输出所有和为1000的连续整数(如298、299、300、301、302等）的程序。
 * @author chic
 *
 */
public class Test6 {
	public static void main(String[] args) {
		int i;		//循环计数用，是连续整数序列的起始点
		int j;		//记录连续整数序列的终点
		int k;		//循环计数用
		int sum;	//计算连续整数的和
		for(i=1;i<1000;i++) {
			j=i;
			sum=i;
						//sum为若干个连续整数之和
			if(sum==1000) {//如果恰好等于1000，就输出i-j整数序列
				for(k=i;k<=j;k++) {
					System.out.print(k+",");
				}
				System.out.println();
			}
		}
	}
}
