import java.util.*;

public class Logic_Gate {
    int a[] = new int[10];
    int b[] = new int[10];
    int c[] = new int[10];
    int x=0,y=0;
    
    //constructor
    Logic_Gate(int a[],int b[]){
        this.a=a;
        this.b=b;
    }
    
    //checking if elements in array are binary
    int ocheck(){
       for(int i=0;i<a.length;i++){
            if((a[i] == 1 | a[i] == 0) & (b[i] == 1 | b[i] == 0))
                 x++;
            else
                y++;
        }
       return y;
    }
    
    void ANDgate(){
        for(int i=0;i<a.length;i++){
            c[i] = a[i] & b[i];
            System.out.print(c[i]+" ");
        }
    }
    
    void ORgate(){
        for(int i=0;i<a.length;i++){
            c[i] = a[i] | b[i];
            System.out.print(c[i]+" ");
        }
    }
    
    void NANDgate(){
        for(int i=0;i<a.length;i++){
            c[i] = (a[i] & b[i] );
            if(c[i]==0)
                c[i]=1;
            else
                c[i]=0;
            
            System.out.print(c[i]+" ");
        }
    }
    
    void NOTgate(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                c[i]=1;
            else
                c[i]=0;
            System.out.print(c[i]+" ");
        }
    }
    
    void NORgate(){
        for(int i=0;i<a.length;i++){
            c[i] = (a[i] | b[i]);
            if(c[i]==0)
                c[i]=1;
            else
                c[i]=0;
            System.out.print(c[i]+" ");
        }
    }
  
    void XORgate(){
        for(int i=0;i<a.length;i++){
            c[i] = a[i] ^ b[i];
            System.out.print(c[i]+" ");
        }
    }
    
    void XNORgate(){
        for(int i=0;i<a.length;i++){
            c[i] = a[i] ^ b[i];
            if(c[i]==0)
                c[i]=1;
            else
                c[i]=0;
            System.out.print(c[i]+" ");
        }
    }
}

class demo {
    public static void main(String args[]){
        System.out.print("Enter number of elements in array: ");
        //size of array
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        
        //elements in input 1
        System.out.println("Enter elements for Input 1");
        for(int i=0;i<size;i++){
            Scanner s1 = new Scanner(System.in);
            a[i]=s1.nextInt();
        }
        
        //elements in input 2
        System.out.println("Enter elements for Input 2");
        for(int i=0;i<size;i++){
            Scanner s1 = new Scanner(System.in);
            b[i]=s1.nextInt();
        }
        
        Logic_Gate l = new Logic_Gate(a,b);
        System.out.print("Input 1   ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Input 2   ");
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" "); 
        }
            if(l.ocheck()==0){
                System.out.println();
                System.out.print("AND Gate  ");
                l.ANDgate();
                System.out.println();
                System.out.print("OR Gate   ");
                l.ORgate();
                System.out.println();
                System.out.print("NAND Gate ");
                l.NANDgate();
                System.out.println();
                System.out.print("NOT Gate  ");
                l.NOTgate(a);
                System.out.println();
                System.out.print("NOR Gate  ");
                l.NORgate();
                System.out.println();
                System.out.print("XOR Gate  ");
                l.XORgate();
                System.out.println();
                System.out.print("XNOR Gate ");
                l.XNORgate();
                System.out.println();
              }else{
                System.out.println();
                System.out.println("Elements in array are not binary");
         }
    }
}