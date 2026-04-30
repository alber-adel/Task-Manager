import java.util.*;

public class manger {
    private static List<task> tasks = new ArrayList<>();
    public manger() {
        tasks = new ArrayList<>();
    }
    
    
      
     
     
    public static void Add(task t)
    {
        tasks.add(t);
        
    }
   public static boolean remove(String t) {
    for (int i = 0; i < tasks.size(); i++) {
        if (tasks.get(i).gett().equalsIgnoreCase(t)) {
            tasks.remove(i);
            return true;             

            
        }
    
}
           return false;

}
      public static boolean complete(String t) {
       for (int i = 0; i < tasks.size(); i++) {
        if (tasks.get(i).gett().equalsIgnoreCase(t)) {
             tasks.get(i).task_is_done();
              return true;
        
            
        }
}
           return false;
        
      }
      
   public static boolean update(int i, String t, String d, String date, int imp) {
      
     if (i >= 0 && i < tasks.size()) {
            tasks.get(i).updatet(t, d, date, imp);
            return true;
        } else {
            return false;
        }
    }
     
       public static String display_tasks() {
        if (tasks.isEmpty()) {
            return "No tasks available " ;
        }
       StringBuilder sb = new StringBuilder();
    for (int i = 0; i < tasks.size(); i++) {
        sb.append(i).append(". ").append(tasks.get(i).toString()).append("\n");
                System.out.println("");
    }
    return sb.toString();
}
}