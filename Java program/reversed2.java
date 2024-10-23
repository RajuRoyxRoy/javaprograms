class reversed2 { 
    public static void main (String[] args) { 
        
        String str= "Royx", nstr=""; 
        char ch; 
        
      System.out.print("Original word: \n "); 
      System.out.println(" Royx"); 
        
      for (int i=0; i<str.length(); i++) 
      { 
        ch= str.charAt(i);  
        nstr= ch+nstr; 
      } 
      System.out.println("Reversed word: \n "+ nstr); 
    } 
} 