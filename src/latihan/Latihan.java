package latihan;

public class Latihan {
    
    //SALAH
//      public static void main (String[] args){
//         int n = 0;
//         n = System.in.read();
//         System.out.println("Hasil :" + (char)n);
//      }
//     
    
    //BENAR
    public static void main(String[] args) {
        int n = 0;
        try{
            n = System.in.read();
        }catch(java.io.IOException e){
            System.out.println(e);
        }
        System.out.println("Hasilnya adalah : "+(char)n);
    }
    
}
