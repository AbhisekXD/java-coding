class ReverseAnumber{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=12345;  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }       
   System.out.println(sum);    
}  
} 