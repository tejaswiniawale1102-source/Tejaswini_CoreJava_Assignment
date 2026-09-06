class SalesManager
{
  int id;
  String name;
  float salary;
  float incentive;
  int target;
}
//class SalesManager ends here
class TestSalesManager
{
               public static void main(String[] args)
             {
                SalesManager sm1;//reference
                sm1 = new SalesManager();
                System.out.println(sm1);
             }
}
               