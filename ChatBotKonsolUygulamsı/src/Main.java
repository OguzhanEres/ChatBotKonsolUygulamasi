import java.util.Scanner;
import java.util.function.Consumer;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main{
    public static void main(String[] args) {
        //seçilecek gün numarası için değişken tanımlaması
        //do-while döngüsü olduğu için başlangıç değeri 1
        int karar=1;
        Scanner scanner=new Scanner(System.in);
        do {
            //konsola gün numaralarının bastırılması
            for(int i=1;i<8;i++){
                System.out.print(i+". Gün   ");
            }
            System.out.println();
            //gün numarasının kullanıcıdan alınması
            karar=scanner.nextInt();
            switch (karar){
                case 1:
                    Day1 day1=new Day1();
                    //seçilen gün içindeki aktiviteleri gösterecek olan fonksiyon
                    //bütün sınıfların içinde aynı method var ve diğer case ler için hepsi bu şekilde
                    day1.aktivite_yazdir();
                    System.out.println("Uygulamadan çıkış için 0 giriniz devam etmek için 1 giriniz:");
                    karar=scanner.nextInt();
                    break;
                case 2:
                    Day2 day2=new Day2();
                    day2.aktivite_yazdir();
                    System.out.println("Uygulamadan çıkış için 0 giriniz devam etmek için 1 giriniz:");
                    karar=scanner.nextInt();
                    break;
                case 3:
                    Day3 day3=new Day3();
                    day3.aktivite_yazdir();
                    karar=scanner.nextInt();
                    break;
                case 4:
                    Day4 day4=new Day4();
                    day4.aktivite_yazdir();
                    karar=scanner.nextInt();
                    break;
                case 5:
                    Day5 day5=new Day5();
                    day5.aktivite_yazdir();
                    karar=scanner.nextInt();
                    break;
                case 6:
                    Day6 day6=new Day6();
                    day6.aktivite_yazdir();
                    karar=scanner.nextInt();
                    break;
                case 7:
                    Day7 day7=new Day7();
                    day7.aktivite_yazdir();
                    karar=scanner.nextInt();
                    break;
            }
        }while (karar!=0);
//
    }
}
