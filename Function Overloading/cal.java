class Calculator{
   
          void add(int a,int b){
            System.out.println(a + " " +b);
           }
          void add(double c,int d){
            System.out.println(c + " " +d);
           }
          void add(int e,double f){
            System.out.println(e + " " +f);
           }
          void add(double i,double g){
            System.out.println(i + " " +g);
           }
}
//class Calculator ends here
class TestCal
{
         public static void main(String[] args){
                Calculator c1;//reference
                c1=new Calculator();
                c1.add(10,10);
                c1.add(10.5,10);
                c1.add(20,10.4);
                c1.add(2.5,12.4);
        }
}