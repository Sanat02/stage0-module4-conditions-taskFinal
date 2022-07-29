package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(month==9||month==4||month==6||month==11)
      {
          System.out.println("30");
      }
      else if(month==2&&year%4==0)
      {
          System.out.println("29");
      }
      else if(month==2&&year%4!=0)
      {
          System.out.println("28");
      }
      else if(month>12||month<=0)
      {
             System.out.println("invalid date");

      }
      else
      {
          System.out.println("31");
      }


    }
}
