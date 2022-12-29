class nameless_array{
public static void cal_marks(int[] marks){
int total=0;
for (int mark : marks){
System.out.println(mark);
}
}
public static void main(String[] args){
cal_marks(new int[]{35,36,37,38,39});
}
}