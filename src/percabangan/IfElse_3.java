package percabangan;

public class IfElse_3 {
        public static void main(String[] args) {
            double totalBelanja = 53000;
            double uangDiDompet = 25000;

            if(uangDiDompet<totalBelanja){
                System.out.println("Uang kurang, kurangi belanja anda");
            }else if (uangDiDompet>totalBelanja) {
                double kembalian = uangDiDompet - totalBelanja;
                System.out.println("Uang Cukup, Kembalian : " + kembalian);
            }else{
                System.out.println("Uang Pas... UwU..");
        }

    }

}