
package bitwisedemo2;


public class Bitwisedemo2 {

    
    public static void main(String[] args) {
        int x=0b1010;
        int y=0b0110;
        int z;
        z=x&y;
        System.out.println(z);
        
        
        int a=0b1010;
        int b=0b110;
        int c;
        
        c=a^b;
        System.out.println(c);
        
        
        int d=0b1;
        int e;
        e=x<<1;
        
        System.out.println(e);
    }
    
}
