package j11;

public class Praktikum1 {
    public static void main(String[] args){
        
        String identitas = "Brito Reza Daud / X RPL 3 / 11";
        System.out.println("Identitas : "+ identitas);
        
        String x = "Operasi";
        System.out.println("Isi variable x : "+ x);
        System.out.println("\""+ x + "\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("Isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("Isi variable z : "+ z);
        System.out.println("Isi x sama dengan z (Case Sensitive) : "
                + x.equals(z));
        
        String r = "Operasi";
        System.out.println("Isi variable r : "+ r);
        System.out.println("Isi x sama dengan r (Case Sensitive) : "
                + x.equals(r));
        System.out.println("Isi x sama dengan r (Not Case Senstive) : "
                + x.equalsIgnoreCase(r));
        
        
        
        
}
}
