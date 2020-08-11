
/*
 
Java, 1991 yılında Sun şirketi çatısı altında kurulan ‘Green Team’ adlı on üç kişilik bir ekip tarafından hazırlandı. Green Team, bilişim teknolojileri üzerinde araştırma geliştirme yapmayı hedefleyen bir ekipti. 
C++’da olduğu gibi bellek problemlerinin olmaması
Javanın ilk adı OAK
Nesne olarak ise C++ çok yakındır.
C diline benzerliğinden dolayı pointer yerine referans
WORA=Write Once Run Anywhere
Multithreading =aynı anda birden fazla işi yapabilmek
Byte code üreten dillerden JDK sistemde çalışıyor)

JavaSE=Java Stardart Edition
JDK=JRE+JVM+Vompiler+Debug
JRE=JVM+Api
JVM=Jit+Interpreter
Jit=Just In Tıme: Sadece çalışacak kodu derlemek yani küçük compiler diyebiliriz
Interpreter= Satır satır yorumlayan eğer bir hata varsa orada duracak olan yapı
 
JVM=Diğerlerine göre JDK ve JRE göre Makine diline daha yakındır.
JVM=Java virtual machine
 
JDK=Java Devolopment Kit
JRE=Java Runtime Enviroment
 
Platformdan bağımsız 
Yüksek performanslı 
Open source 
Nesneye yönelik (ancak primitive hariç)
Güvenlikli (byte codes)
Esnek dil (JVM)
Kullanılmayan nesneler silinir Garbage  (eğer son durumda null ise)
Collector (System.gc())
Multithreading (multİ processes)
Zengin API 
Ücretsiz ve Güçlü IDE(Netbeans-Eclipse)
Ücretsiz Olması


Basit özelliklere sahip olan Java 1.0 sürümü sonra büyük değişikler yapılarak Java 1.2 çıkarılmıştır. Platform 2 olarak adlandırılan 1.2 sürümü bugün hızla gelişerek Java 12’e kadar gelmiştir. 
1995 –, ilk Applet teknolojisi
1996 – Java Development Kit (JDK) 1.0 çıktı. Temel Seviye. Ex GUI  I/O
1997 – JDK 1.1 çıkartıldı. Bu sürümde Java GUI, veritabanı erişimi için JDBC, dağınık nesneler için RMI ve daha bir çok yeni gelişmeler eklendi.
1998 – JDK 1.2
1999 – Java teknolojisi J2SE(Standart Edition), J2EE(Enterprise Edition) ve J2ME(Java Micro Edition) 
2000 – HotSpot JVM çıkarldı
2004 – İlk önce 1.5 olarak duyrulan Java 5.0 sürümü çıktı, adı Tiger Projesi olan bu sürümde 
2006 – Java 6 (Mustang Projesi) ile Grafiksel altyapı ve sanal makine  yenilikler 
2011 – Java 7 sürümü çıktı.
2014 – Java 8 Sürümü (OTN) çıktı. Lambda expressions, Functional interfaces, Method references, Stream API
2017 – Java 9 Sürümü  JShell(Java Shell) ile REPL(Read-Eval-Print-Loop) aracı geliştirildi Çöp toplayıcı iyileştirmeleri Daha iyi Javadoc
2018(Mart)  – Java 10 Sürümü variable type inference var liste = new ArrayList<Integer>()  Garbarage collector daha güçlü
2018(Eylül) – Java 11 Sürümü
2019(Mart) –Java 12 Sürümü

Java 5 (Tiger ) beraberinde dil,kütüphane, arayüz,performans. Java 5.0 ile 
Gelişmiş for döngüsü
Autoboxing/Unboxing
Generic yapılar
Metadata (Annotations)
Typesafe Enum (Güvenli sıralama yapıları)
Varargs (Değişken sayıda argüman)
Static Import

 API (Application Programming Interface), uygulamaya ait yeteneklerin, diğer bir uygulamada da kullanılanılıp işlem görülmesini , kendi öz yeteneklerini diğer uygulamaya miras  alınan bir sistemdir. Kısaca, X yapısnın özelliklerini B yapısında da kullanabilmemizi sağlayan özelliğe API diyoruz.
COMPILER :yüksek seviye bir programlama dilinde yazılmış bir kaynak kodun, başka bir dile veya bilgisayarın/işlemcinin anlayabileceği makine diline tercümesini yapan bir programdır.

INTERPRETER:Yorumlayıcı (Interpreter), girdi olarak program için olan verilerle birlikte kaynak kodu alan, ve kaynak programı satır satır yürüten bir programdır.Örnek olarak Java yorumlayıcısı java verilebilir. Java .class uzantılı dosyayı üzerinde çalıştığı makinede çalıştırılabilecek olan doğal makine kodlarına çevirir.Java’da derleyici ve yorumlayıcı beraber çalışır. Yani, önce oluşturulan kaynak koddan bir ara kod (bytecode) üretilmek için derlenir. Daha sonra bu derlenen bytecode Java Sanal Makinesi (JVM) üzerinde yorumlanarak yürütülür.

JIT derleyici (Just In Tıme) :(JVM) altında çalışan bir COMPİLERDIR. Bu derleyicinin :çalıştırılacak bytecode un sadece kullanılacak kısmının derlenerek çalıştırılmasını amaçlıyor. Diğer kısımlar kolayca yorumlanıyor. Bu durumda tekrar tam derleme gerekmediği için tekrar tekrar aynı işlemlere gerek kalmadığı için hız artışı sağlamış oluyoruz.Bu da Perfonmansını artırıyor.

Java kodlarını derledikten sonra makine diline çevrilir buna makine dilinin anlayacağı kodlara BYTE CODE denir. Bu byte kodlar ile java platformdan bağımsız olarak çalışmaktadır.
JVM : byte codeslerdan sonra alıp cross platformlara çevriliyordu.

JVM=Jit +interpreter

JRE=JVM+(Java API+Libraries)

JDK=JRE+JVM+(debug+compile)
jar  =java sıkıştırılmış dosyadır.
Byte code çevrilen bütün dilleri çalıştırılabilir özelliktedir.

Runtime error=
Programın çalıştırılması sırasında karşılaşılan hatalardır. 
Yazılımcının dışında gerçekleşen hatalardır.

Sytax error = Gramer hatası
 
 ı,ö,ü,ç ,ş ,İ,Ö,Ç,Ş değişken isimlerinde kullanmayalım. (HATA)
int 41_sayi ;  (HATA)

CamelCase:   hamitMızrakMalatya
PascalCase:  HamitMızrakMalatya
 */
public class Ders_001_GenelBilgiler {

}
