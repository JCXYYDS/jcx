
public class jinrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,sum=0,a;
    a=10000;
    for(i=1;i<=10;i++) {
    	a=(int)(a*1.05);
    }

System.out.println(a);
    a=10000;
    for(i=1;i<=4;i++)
    {
        a=(int)(a*1.05);
        sum=sum +a;
	}
System.out.println(sum);

}
	}
