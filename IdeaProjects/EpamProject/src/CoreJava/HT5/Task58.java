package src.CoreJava.HT5;
//Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
public class Task58 {
    public String removeSubstring(String base, String remove) {
        String result = base.replace(remove, "");
        return result;
    }
    public static void main(String[] args){
        Task58 task58 = new Task58();
        System.out.println(task58.removeSubstring("rama devi","devi"));//rama
    }
}
