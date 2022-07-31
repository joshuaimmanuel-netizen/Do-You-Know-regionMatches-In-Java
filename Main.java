class Main{
    public static void main(String[] args){
    String a="JOSHUA";
    String b="joshua";
    System.out.println(a.regionMatches(0,b,0,5));
    System.out.println(a.regionMatches(true,0,b,0,5));
    
    }
}

//public boolean regionMatches(int toffset, String other, int ooffset, int len)
// Case sensitive test method:




// It has the option to consider or ignore the case method:
//public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)