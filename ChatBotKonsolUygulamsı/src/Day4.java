import java.util.Random;
import java.util.Scanner;

public class Day4 extends Lessons implements Routines,Places,Detay{
    Scanner scanner=new Scanner(System.in);
    //bugün olan derlerim hakkında bilgi veren bir void fonksiyon
    void Derslerim(){
        System.out.println("Bugün iki dersim var.Perşembe günü 9.30'da İngilizce dersim var ayrıca devamsızlık hakkım olmadığı için sürekli gitmek zorundayım.Öğleden sonra da tekrar Diferansiyel Denklemler dersim var.");
        System.out.println("Derslerim hakkında bilgi vermek gerekirse: "+Ing()+" "+Diff());
    }
    //uyandığım saati söyleyen bir fonksiyon
    @Override
    public void wakeUp() {
        System.out.println("Sabah İngilizce dersim olduğu için 8.15'te uyandım.");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
            Detay.uyku_detay();
        }
    }
    //ulaşım hakkında bilgi veren bir fonksiyon
    @Override
    public void Transport() {
        System.out.println("Otobüse 8.40'ta bindim ve okula gittim");
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
        System.out.println("Öğle arası bölümden arkadaşlarım ile yemekhanede yemek yedim akşam eve gittiğimde ise " +
                "ev arkadaşımla yemek yapıp yedik");
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
        System.out.println("Perşembe günü eve 17.30 civarında geldim");
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
        System.out.println("Perşembe günü kafaye gitmedim");
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
        System.out.println("Perşembe günü sabah 9.30'dan 14.00'a kadar okuldaydım");
        int karar;
        System.out.println("Hakkımda daha fazla bilgi için 1 giriniz yoksa 0 giriniz:");
        karar=scanner.nextInt();
        if (karar==1){
            Detay.okul_detay();
        }
    }
    //gün içi aktiviteleri yazdıran bir fonksiyon
    void aktivite_yazdir(){
        int dongu_karar=1;
        do{
            //aktiviteleri ekrana bastırma
            System.out.println("[1] Uyanış");
            System.out.println("[2] Ulaşım");
            System.out.println("[3] Yemek");
            System.out.println("[4] Ev Hayatı");
            System.out.println("[5] Harbor Cafe");
            System.out.println("[6] Konser");
            System.out.println("[7] Okul Hayatı");
            System.out.println("[8] Derslerim");
            Scanner scanner = new Scanner(System.in);
            //kullanıcıdan seçim alma
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
