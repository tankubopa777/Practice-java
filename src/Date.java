public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int mouth){
        this.month = mouth;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int day,int mouth,int year){
        this.day = day;
        this.month = mouth;
        this.year = year;
    }
//    public String toString(){
//        if (day < 10 && month < 10){
//            return "0"+day+"/"+"0"+month+"/"+year;
 //       }
  //  }
}
