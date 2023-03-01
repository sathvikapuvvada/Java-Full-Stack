class leastof3_num{  
public static void main(String[] args){  
	int a=40, b=78, c=19;    
	if(a<=b && a<=c)  
		System.out.println(a+" is the least Number");  
	else if (b<=a && b<=c)  
		System.out.println(b+" is the least Number");  
	else  
		System.out.println(c+" is the least number");  
	}  
}