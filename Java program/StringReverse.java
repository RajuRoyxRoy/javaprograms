public class StringReverse {
public static void main(String[]args)
{
String s ="RAJU RAJBONGSHI";
char[]c = s.toCharArray();
int j = c.length - 1;
//j= arrayLength - 1
for(int i = 0; i<j;i++ , j--)
{
char temp = c[i];
c[i] = c[j];
c[j] = temp;

}
String reversedString = new String(c);
System.out.println(reversedString);



}

}