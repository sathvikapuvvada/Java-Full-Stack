class leastof2_num{
   public static void main (String[]args){
     int num1 = 50, num2 = 20;
     if (num1 == num2)
       System.out.println ("both are equal");
     else if (num1 < num2)
         System.out.println (num1 + " is least");
     else
         System.out.println (num2 + " is least");
   }
 }