import java.util.*;
public class MyClass
{
    public static void main(String[] args)
    {
        HashSet<String> set =new HashSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Yellow");
        HashSet<String> newSet=new HashSet<String>();
        myCode(set,newSet);
    }
    public static void myCode(HashSet<String> set, HashSet<String> newSet)
    {
        for(String x:set)
        newSet.add(x);
        System.out.println(newSet);
    }
}