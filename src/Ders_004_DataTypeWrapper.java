
/*
 
Referans ise object tanımlamada kullanmaktayız.

Referans değişkenler ise :belleğin heap alanında tutulur
Heap: hafıza belli değilse




 */
public class Ders_004_DataTypeWrapper {
public static void main(String[] args) {
	
	//Primitive
	//null veremezsin
	//Nesne olarak çalışmaz.
	//Stack hafıza unutma : stack hafıza daha hızlıdır.
	//Bilgisayarda RAM’de tutulur.
	byte byt=12;
	short shrt=12;
	int in=12;
	long lng=12L; //Default L olarak göstermeliyiz
			
	float flt=12.5f;
	double dbl=12.5;
	
	boolean bln=true;
	boolean bln2=12>5;
	
	char chr='a';
	
	
	//Wrapper classs
	//null verebiliriz
	//Nesne olarak çalışıyoruz.
	//Heap hafıza unutma : stack hafıza daha hızlıdır.
	//Bilgisayarda RAM’de tutulur.

	Byte byt=new Byte((byte) 12);
	Short shrt=new Short((short) 12);
	Integer in=new Integer(12);
	Long lng=new Long(12);
			
	Float flt=new Float(12.5);
	Double  dbl=new Double(12.5);
	
	Boolean bln=new Boolean(true);
	Character character=new Character('a');
	
	
	
}
}
