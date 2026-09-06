class Date
{
         int day;
         int month;
         int year;
         String dow;
         Date()
           {
             //default constructor
             System.out.println("In default constructor");
             this.day=15;
             this.month=8;
             this.year=19467;
             this.dow="Friday";
           }
          Date(int day,int month,int year,String dow){
              System.out.println("In parameterized constructor");
              this.day=day;
              this.month=month;
              this.year=year;
              this.dow=dow;
            }

          void setDay(int day){
                 this.day=day;
           }
           void setMonth(int month){
                 this.month=month;
           }
           void setYear(int year){
                 this.year=year;
           }
           void setDow(String dow){
                 this.dow=dow;
           }
           void display()
          {
           System.out.println(this.day);
           System.out.println(this.month);
           System.out.println(this.year);
           System.out.println(this.dow);
          }
        int getDay(){
                return this.day;
       }  
        int getMonth(){
                return this.month;
       }
       int getYear(){
                return this.year;
       }
       String getDow(){
                return this.dow;
        }
}
//class Date ends here
class TestDate
{
            public static void main(String[] args)
            {
               Date d1;//reference
               d1=new Date();
               d1.display();
               Date d2;
               d2=new Date();
         }
}
               