public class Strings {
    public static boolean ispalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.print("false");
                return false;
            }
        }
        System.out.print("true");
     return true;
    }
public static float shortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if (dir == 'N'){
                y++;
            } else if (dir== 'W') {
                x--;
            } else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        System.out.print ((float)Math.sqrt(X2+Y2));
        return ((float)Math.sqrt(X2+Y2));
}
public static String substring(String str,int si,int ei){
        String substr="";
    for (int i = si; i <ei ; i++) {
        substr += str.charAt(i);
    }
    return substr;
}
public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
    for (int i = 1; i <str.length() ; i++) {
        if (str.charAt(i) == ' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
public static String compress(String str){
        String newstr ="";
    for (int i = 0; i < str.length(); i++) {
        Integer count=1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        newstr += str.charAt(i);
        if (count>1){
            newstr += count.toString();
        }
    }
    return newstr;
}
    public static void main(String[] args) {
//        String fruits[]={"apple","mango","banana"};
//        String largest=fruits[0];
//        for (int i = 1; i <fruits.length ; i++) {
//         if(largest.compareToIgnoreCase(fruits[i] )< 0){
//             largest=fruits[i];
//         }
//        }
//        System.out.println(largest);
//        //System.out.println(str.substring(0,5));
//        //ispalindrome(str);
//        //shortestpath(path);
//        //System.out.println(substring(str,0,5));
//        StringBuilder sb=new StringBuilder("");
//        for (char ch='a';ch<='z';ch++){
//            sb.append(ch);
//        }
//        System.out.println(sb);
//        String str="hi , i am nilima";
//        System.out.println(toUpperCase(str));
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
}
