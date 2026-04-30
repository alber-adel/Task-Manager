
  public class task {
    private  String title;
    private  String descripe;
    private  String date;
    private  int impo ;
    private  boolean done;
    
 public  task(String t, String d, String ddate, int imp) {
        title = t;
        descripe = d;
        date = d;
        impo = imp;
        done = false;
    }    
 public  void task_is_done() {
        done = true;
    }
  public void updatet(String title, String descripe, String date, int impo) {
        this.title = title;
        this.descripe = descripe;
        this.date = date;
        this.impo = impo;
    }
  
    @Override
  public String toString() {
        if(done)
                return "[ done making "  + title + " (Priority : " + impo + ", Due: " + date + ")";
        else
                return "[ not done  "  + title + " (Priority : " + impo + ", Due: " + date + ")";

    }
     public String gett() {
        return title;
    }
  }