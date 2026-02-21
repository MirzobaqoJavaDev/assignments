package reference;

public class PriportyQueary {
    private String name;



    public String mixString(String a, String b) {
     StringBuilder sb = new StringBuilder();
     int max = Math.max(a.length(), b.length());
     for (int i = 0; i < max; i++) {
         if (a.length()>=i){
             sb.append(a.charAt(i));
         }
         if (b.length()>=i){
             sb.append(b.charAt(i));
         }
     }
     return sb.toString();
    }
    public String repeatEnd(String str, int n) {
     StringBuilder sb = new StringBuilder();
     String end = str.substring(str.length()-n);
     for (int i = 0; i < n; i++) {
         sb.append(end);
     }
     return sb.toString();
    }
    public String repeatFront(String str, int n) {
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < n; i++) {
         String last = str.substring(0, n-i);
         sb.append(last);
     }
     return sb.toString();
    }
    public String repeatSeparator(String word, String sep, int count) {
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < count-1; i++) {
         sb.append(word);
         sb.append(sep);
     }
     sb.append(word);
     return sb.toString();
    }
    public boolean prefixAgain(String str, int n) {
        if (n==1&&str.length()>1) {
            return true;
        }
      String prefix = str.substring(0, n);
      for (int i = n-1; i< str.length()-n; i++) {
          if (str.substring(i,i+n).equals(prefix)){
              return true;
          }
      }
      return false;
    }
    public boolean xyzMiddle(String str) {
        if(str.length()<3){
            return false;
        }
        int index =str.length()/2;
        if (str.length()%2==0) {
            return str.startsWith("xyz", index - 2) || str.substring(index - 1, index + 2).equals("xyz");
        }
        if (str.length()%2==1) {
            return str.startsWith("xyz", index - 3) || str.substring(index - 1, index + 2).equals("xyz");
        }
        return false;
    }

    public static void main(String[] args) {
     PriportyQueary pq = new PriportyQueary();
     pq.setName("Ali");
        System.out.println(pq);
    }
    public PriportyQueary() {
        this("Saidjon");
        System.out.println("Salom dunyo");
    }
    public PriportyQueary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PriportyQueary{" +
                "name='" + name + '\'' +
                '}';
    }
}
