class Printer{
   
          void print(int a){
            System.out.println("int :"+a);
           }
          void print(String str){
            System.out.println(str);
           }
          void print(double a){
            System.out.println("double :"+a);
           }
          void print(){
            System.out.println("Nothing!!");
           }
}
//class Printer ends here
class TestPrinter
{
         public static void main(String[] args){
                Printer p1;//reference
                p1=new Printer();
                p1.print(10);
                p1.print(10.5);
                p1.print("Hello");
                p1.print();
        }
}