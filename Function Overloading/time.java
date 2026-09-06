class Time
{
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec)
    {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    Time add(Time t)
    {
        int s = this.sec + t.sec;
        int m = this.min + t.min;
        int h = this.hr + t.hr;

        if(s >= 60)
        {
            m = m + s / 60;
            s = s % 60;
        }

        if(m >= 60)
        {
            h = h + m / 60;
            m = m % 60;
        }

        h = h % 24;

        return new Time(h, m, s);
    }

    Time add(int value, String unit)
    {
        int h = this.hr;
        int m = this.min;
        int s = this.sec;

        if(unit.equals("hours"))
        {
            h = h + value;
        }
        else if(unit.equals("minutes"))
        {
            m = m + value;
        }
        else if(unit.equals("seconds"))
        {
            s = s + value;
        }

        if(s >= 60)
        {
            m = m + s / 60;
            s = s % 60;
        }

        if(m >= 60)
        {
            h = h + m / 60;
            m = m % 60;
        }

        h = h % 24;

        return new Time(h, m, s);
    }

    void display()
    {
        System.out.printf("%02d:%02d:%02d\n",hr,min,sec);
    }
}

class Test
{
    public static void main(String args[])
    {
        Time t1 = new Time(10,20,30);
        Time t2 = new Time(2,40,40);

        Time result1 = t1.add(t2);

        System.out.print("Adding Two Time Objects: ");
        result1.display();

        Time result2 = t1.add(45,"seconds");

        System.out.print("Adding Seconds: ");
        result2.display();

        Time result3 = t1.add(50,"minutes");

        System.out.print("Adding Minutes: ");
        result3.display();

        Time result4 = t1.add(5,"hours");

        System.out.print("Adding Hours: ");
        result4.display();
    }
}