package latihan;

public class latihan2 {
    
    //SALAH
//    public static void main(String[] args){
//        byte[] b = new byte [5];
//        
//        try{
//            System.in.read(b);
//        }catch(java.io.IOException e){
//            System.out.println(" Hasil : " +(char)b[0] + (char)b[1] + (char)b[2] );
//        }
//    }
    
    //BENAR
    public static void main(String[] args){
        int n = 0;
        
        try{
            n=System.in.read();
        }catch(java.io.IOException e){
            System.out.println(e);
        }
        System.out.println("Hasil = " + (char)n);
    }
}

