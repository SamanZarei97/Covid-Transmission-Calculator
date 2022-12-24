/* 
*  This program has designed to compute the risk of Covid transmission
*  between two people at their work palce based on the amount of time
*  they have been cantacted together.
*/

import java.util.Scanner;

/** This class calculates the possibility of
*   Covid transmission between two people
*   according the amount of time they have
*   been cantacted together.
*/
public class CovidTransmission {

  /**
  * @param args the command line argument
  */

  public static void main(String[] args) {

      // Getting input from the user.
      Scanner sc= new Scanner(System.in);
      // Determination of starting day being contacted.
      int day1 = sc.nextInt();
      // Determination of starting hour being contacted.
      int hour1 = sc.nextInt();
      // Determination of starting minute being contacted.
      int min1 = sc.nextInt();
      // Determination of ending day being contacted.
      int day2 = sc.nextInt();
      // Determination of ending hour being contacted.
      int hour2 = sc.nextInt();
      // Determination of ending minute being contacted.
      int min2 = sc.nextInt();
      // Difference of days and covert to minute.
      int changeOfDays = (day2 - day1) * 1440;
      // Difference of hours and convert to minute.
      int changeOfHours = (hour2 - hour1) * 60;
      // Difference of minutes.
      int changeOfMins = min2 - min1;
      // Determination of minutes they have been contacted.
      int cTime = -1;
      // String letter for writing risk type.
      String ra;

      // Days, times, and hours must be in the certain range.
      if( ( (day1 < 1) || (day1 > 31) ) || ( (day2 < 1 ) || (day2 > 31) ) ) {
        cTime = -1;
        ra = "-1";
      }
      else if( ( (hour1 < 0) || (hour1 > 23) ) || ( (hour2 < 0 ) || (hour2 > 23) ) ) {
        cTime = -1;
        ra = "-1";
      }
      else if ( ( (min1 < 0) || (min1 > 59) ) || ( (min2 < 0 ) || (min2 > 59) ) ) {
        cTime = -1;
        ra = "-1";
      }
      else {
        cTime = changeOfDays + changeOfHours + changeOfMins;
      }



      // The amount possibility for Covid transmission.
      if( (cTime >= 0) && (cTime <= 60) ) {
        ra = "low";
      }
      else if( (cTime > 60) && (cTime <= 180) ) {
        ra = "medium";
      }
      else if( (cTime > 180) && (cTime <= 360) ) {
        ra = "high";
      }
      else if(cTime > 360) {
        ra = "extremely high";
      }
      else {
        ra = "-1";
        cTime = -1;
      }
      System.out.println(cTime + " " + ra);

  }

}
