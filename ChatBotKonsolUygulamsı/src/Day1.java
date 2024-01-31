import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Day1 extends Lessons implements Routines, HomeWork ,Places,Detay{
    //bugün olan derlerim hakkında bilgi veren bir void fonksiyon
    void Derslerim(){
        System.out.println("Bugün iki tane dersim var.Pazartesi günleri en yorgun olduğum gün çünkü Olasılık ve istatistik dersini 13.30 ve Data dersini 17.30'da alıyorum ve ders bitişi akşam 20.30'da ");
        System.out.println("Derslerim hakkında bilgi vermek gerekirse: "+Olasılık()+" "+Data());
    }
    //uyandığım saati söyleyen bir fonksiyon
    @Override
    public void wakeUp() {
        System.out.println("Pazartesi günü saat 10.37'de uyandım");
        int karar;
        do {
            System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz: ");
            karar = scanner.nextInt();
            if (karar == 1) {
                Detay.uyku_detay();
            }
        } while (karar == 1);
    }
    //ulaşım hakkında bilgi veren bir fonksiyon
    @Override
    public void Transport() {
        System.out.println("Saat 12.15 otobüsüne bindim");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
            Detay.ulasim_detay();
        }
    }
    //yemek yemekle alaklı bilgi veren bir fonksiyon
    @Override
    public void Food() {
        System.out.println("Yemekhanede yemek yemedim , akşam data dersinden önce arkadaşlarla Kesit Cafe de patso yedik");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
            Detay.yemek_detay();
        }
    }
    //evde olduğum zamanlar için bilgi veren bir fonksiyon
    @Override
    public void Home() {
        System.out.println("Akşam data dersinden sonra 9.30 gibi evime geldim");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
           Detay.ev_detay();
        }
    }
    //kafade olduğum zamanlar için bir fonksiyon
    @Override
    public void Harboor() {
        System.out.println("Arkadışımın kafesi olan Harbor'a bugün yorgun olduğum için gitmedim");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
            Detay.harbor_detay();
        }
    }
    //konserler hakkında bilgi veren bir fonksiyon
    @Override
    public void Konser() {
        System.out.println("Bugün konser yoktu");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
            Detay.konser_detay();
        }
    }
    //okul vakitleri hakkında bilgi veren bir fonsksiyon
    @Override
    public void School() {
        System.out.println("Bugün saat 13.30'dan akşam 20.30'a kadar okuldayım");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
            Detay.okul_detay();
        }

    }
    Scanner scanner = new Scanner(System.in);
    //gün içi aktiviteleri yazdıran bir fonksiyon
    void aktivite_yazdir(){
        int dongu_karar=1;
        do{
            //gün içi olayları ekrana bastırma
            System.out.println("[1] Uyanış");
            System.out.println("[2] Ulaşım");
            System.out.println("[3] Yemek");
            System.out.println("[4] Ev Hayatı");
            System.out.println("[5] Harbor Cafe");
            System.out.println("[6] Konser");
            System.out.println("[7] Okul Hayatı");
            System.out.println("[8] Derslerim");
            Scanner scanner = new Scanner(System.in);
            //kullanıcıdan aktivite seçimi alma
            int karar = scanner.nextInt();
            switch (karar) {
                case 1:
                    wakeUp();
                    System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
                case 2: Transport();
                    System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
                case 3: Food();  System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
                case 4: Home();  System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
                case 5: Harboor(); System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
                case 6: Konser();  System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
                case 7: School(); System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
                case 8: Derslerim();  System.out.println("Ana menü için 0 giriniz devam etmek için 1 giriniz:");
                    dongu_karar=scanner.nextInt();
                    break;
            }
        }while (dongu_karar!=0);
    }
    }
