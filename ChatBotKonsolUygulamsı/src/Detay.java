import java.util.Random;

public interface Detay {
    static void uyku_detay(){
        String[] uykuCevaplari = {
                "Genellikle her gece düzenli bir şekilde uyuyarak, uykunun önemli bir parçası olduğuna inanırım.",
                "Uykusuz kalmaktan pek hoşlanmam ve genellikle yeterli uyku almak benim için önemlidir.",
                "Uyku benim için sadece bir ihtiyaç değil, aynı zamanda dinlenmiş hissetmemi sağlayan bir ritüeldir.",
                "Uykusuz kaldığımda gün içinde odaklanmakta zorlanıyorum, bu yüzden düzenli uyku benim için hayati önem taşıyor.",
                "Uyku, ruhsal ve fiziksel sağlığım açısından önemli bir rol oynar ve genellikle geceleri iyi bir uyku çekmek benim için keyiflidir."
        };
        Random random = new Random();
        int rastgeleIndex = random.nextInt(uykuCevaplari.length);
        System.out.println(uykuCevaplari[rastgeleIndex]);
    }
    static void ulasim_detay(){String[] ulasimCevaplari = {
            "Akşam saatlerinden nefret ederim çünkü çok kalabalık oluyor",
            "Evim uzak olduğu için otobüs yolculuğu çok uzun sürüyor ve çok fazla vakit kaybediyorum.",
            "Keşke evim metroya yakın bi yerde olsaydı çünkü son otobüsüm 11.30'da.",
            "Metro kullanmayı çok severim.",
            "Ulus'a ekmek almaya giden dayılara çok sinir olurum çünkü otobüsü onlar dolduruyor."
    };
        Random random = new Random();
        int rastgeleIndex = random.nextInt(ulasimCevaplari.length);
        System.out.println(ulasimCevaplari[rastgeleIndex]);
    }
    static void yemek_detay(){
        String[] yemekCevaplari = {
                "Yemek yemeyi çok severim, özellikle annemin yaptığı nefis ev yemeklerini en çok beğenirim.",
                "Tadı damaklarımda bırakan favori yemeğim genellikle bir tabak güveçte pişirilmiş karnabahar gratenidir.",
                "En sevdiğim yemek arasında yer alan bir diğer lezzetli seçenek de babamın mangalda hazırladığı köftedir.",
                "Akşam yemeklerinde genellikle tercihim, zeytinyağlı yemeklerden biri olan bamya yemeği veya kısır olur.",
                "Yemek sofrasında tatlıyı ihmal etmem, özellikle de annemin ellerinden çıkan nefis baklava benim için vazgeçilmezdir."
        };
        Random random = new Random();
        int rastgeleIndex = random.nextInt(yemekCevaplari.length);
        System.out.println(yemekCevaplari[rastgeleIndex]);
    }
    static void ev_detay(){
        String[] evCevaplari = {
                "Evde vakit geçirmeyi çok severim, özellikle kitap okumak, film izlemek veya kendim için yeni tarifler denemek gibi aktivitelerle.",
                "En sevdiğim evde vakit geçirme aktivitelerinden biri, müzik dinleyerek veya enstrüman çalarak kendi küçük konserimi düzenlemektir.",
                "Evde durup durmak yerine, genellikle yaratıcı projelere zaman ayırmayı tercih ederim, örneğin resim yapmak veya el işi projeleri uygulamak.",
                "Evde vakit geçirirken kendime yeni beceriler kazanmaya çalışırım, örneğin bir enstrüman çalmayı öğrenmek veya yemek pişirmekte ustalaşmak gibi.",
                "Aynı zamanda evde olmak, içsel huzuru bulmak için meditasyon ve yoga gibi mindfulness pratiklerine zaman ayırmak için harika bir fırsattır."
        };
        Random random = new Random();
        int rastgeleIndex = random.nextInt(evCevaplari.length);
        System.out.println(evCevaplari[rastgeleIndex]);
    }
    static void harbor_detay(){
        String[] HarborCevaplari = {
                "Harbor Cafe'de arkadaşım Buse çalışıyor bende ders çıkışları oraya ders çalışmaya gidiyorum.",
                "Bu mekan genelde boş oluyor yani ders çalışmak için daha iyi.",
                "Diğer arkadaşlarımla birlikte bazen burada toplanıyoruz ve birlikte vakit geçiriyoruz.",
                "Genelde Hamza ve Can la birlikte satranç veya tavla oynarız.",
        };
        Random random = new Random();
        int rastgeleIndex = random.nextInt(HarborCevaplari.length);
        System.out.println(HarborCevaplari[rastgeleIndex]);
    }
    static void konser_detay(){
        String[] konserCevaplari = {
                "Konserlere gitmeyi çok severim, özellikle Mor ve Ötesi'nin muhteşem performanslarına hayranlıkla şahit olmak benim için bir ayrıcalıktır.",
                "Manga'nın enerjik sahne şovları, konser atmosferinde adeta bir müzik şöleni yaşatıyor ve bu deneyimi kaçırmak istemem.",
                "Dedüblüman'ın yaratıcı müziği ve canlı performansları, beni konser alanında sürükleyen etkileyici anlar yaratır.",
                "Ozbi'nin kendine özgü tarzı ve sözleriyle dolu şarkıları, konserlerinde beni hem duygusal hem de düşünsel olarak etkiler.",
                "Konserler, sadece müziği dinlemekle kalmayıp aynı zamanda sanatçıların sahnedeki enerjisini ve etkileşimini doğrudan deneyimleme fırsatı sunar, bu da benim için unutulmaz anlar yaratır."
        };
        Random random = new Random();
        int rastgeleIndex = random.nextInt(konserCevaplari.length);
        System.out.println(konserCevaplari[rastgeleIndex]);
    }
    static void okul_detay(){
        String[] konserCevaplari = {
                "Genellikle okulu seviyorum, özellikle ilgi duyduğum dersleri almak ve yeni bilgiler öğrenmek benim için keyifli bir deneyim.",
                "Okulu sevdiğim anlardan biri, sınıf arkadaşlarımla sosyal etkileşim ve grup projeleri aracılığıyla işbirliği yapmak.",
                "Ancak bazen yoğun öğrenim temposu ve sınav stresi, okulu sevmekte zorlanmama neden olabilir.",
                "Öğretmenlerin ilginç ders anlatımı ve interaktif öğrenim yöntemleri, okulu sevmemi kolaylaştıran faktörler arasında yer alıyor.",
                "Her ne kadar zaman zaman zorluklarla karşılaşsam da, genel olarak okulun bana kattığı bilgi ve deneyimleri seviyorum."
        };
        Random random = new Random();
        int rastgeleIndex = random.nextInt(konserCevaplari.length);
        System.out.println(konserCevaplari[rastgeleIndex]);
    }
}
