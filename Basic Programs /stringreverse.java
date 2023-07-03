 
public class ReverseStringForMain {
    public static void main(String[] args) {
        String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--) {
            reverse = reverse + blogName.charAt(i);
        }
        System.out.println("Reverse of java2blog is: " + reverse);
    }
}

public class ReverseStringRecursive {
    public static void main(String[] args) {
        ReverseStringRecursive rsr = new ReverseStringRecursive();
        String blogName = "java2blog";
        String reverse = rsr.recursiveReverse(blogName);
        System.out.println("Reverse of java2blog is:" + reverse);
    }
 
    public String recursiveReverse(String orig) {
        if (orig.length() == 1)
            return orig;
        else
            return orig.charAt(orig.length() - 1) + 
                          recursiveReverse(orig.substring(0, orig.length() - 1));
 
    }
}
