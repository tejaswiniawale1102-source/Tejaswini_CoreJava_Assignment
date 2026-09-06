class Date
{
         int day;
         int month;
         int year;
         String dow;
         Date()
           {
             //default constructor
             this.day=15;
             this.month=8;
             this.year=19467;
             this.dow="Friday";
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
               d1.setDay(30);
               d1.setMonth(7);
               d1.setYear(2026);
               d1.setDow("Thursday");

               Date d2;//reference
               d2=new Date();
               d2.setDay(29);
               d2.setMonth(7);
               d2.setYear(2026);
               d2.setDow("Wednesday");

               if(d1.getDay()>d2.getDay())
              {
                   System.out.println("D1 is Younger !!");
              }else
              {
                    System.out.println("D2 is Younger !!");
              }
     
              if(d1.getMonth()>d2.getMonth())
              {
                   System.out.println("D1 is Younger !!");
              }else
              {
                    System.out.println("D2 is Younger !!");
              }
              if(d1.getYear()>d2.getYear())
              {
                   System.out.println("D1 is Younger !!");
              }else
              {
                    System.out.println("D2 is Younger !!");
              }
              if(d1.getDow()>d2.getDow())
              {
                   System.out.println("D1 is Younger !!");
              }else
              {
                    System.out.println("D2 is Younger !!");
              }

         }
}
               