class employee{
static String org_name="TCS";
int eid=101;
int sal=45000;
public static void main(String[] args){
System.out.println(org_name);
System.out.println(employee.org_name);
employee s1=new employee();
employee s2=new employee();
System.out.println(s1.eid);
System.out.println(s1.sal);
System.out.println(s2.eid);
System.out.println(s2.sal);
System.out.println(s1.org_name);
System.out.println(s2.org_name);
}
}

