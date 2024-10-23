public class check_string_equal {
    public static void main (String args[]){

        String a = "ROYX";
        String b = "Royx";

        if(a.equals(b)){

            System.out.println("Both strings are equal in case");
        }
        else{
            System.out.println("Both strings are not equal in case");

        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }

    }
}