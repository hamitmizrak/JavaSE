
/*
 
Cast=dönüştürmek
String int
İntString

PrimitiveWrapper (Boxing)
WrapperPrimitive(Unboxing)

Büyük değişken içerisine küçük veri yerleştirirsek veri kaybı olmaz
Ancak küçük değişken içerine büyük veri yerleştirirsek veri kaybı olmaktadır.




 */
public class Ders_008_Cast {
public static void main(String[] args) {

//Stringten Sayıya cast
String str="5";
int in=Integer.valueOf(str);   //1:
int in2=Integer.parseInt(str); //2:  2 numara 1 numaraya göre daha hızlıdır.

//Sayıyı String
int in3=45;
String str2=String.valueOf(in3);
String str3=Integer.toString(in3);


//Büyük değişken içerisine küçük veri yerleştirirsek veri kaybı olmaz
byte b2=4;
long l4=b2;


//Ancak küçük değişken içerine büyük veri yerleştirirsek veri kaybı olmaktadır.
long L3=4567;
short s3=(short) L3;


}
}
