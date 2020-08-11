
/*
 
Primitive type javanın: Nesne olamayan yapısıdır. 
Primitif değişkenler: belleğin Stack hafızasında tutulur. 
stack hafıza: hafıza boyutu belli ise 

BSİL

byte
short
int
long

float
double

char
boolean

default değerler
-----------------------------------
byte , short , int :: default =0  
long default :: değeri=0L
Float :: default değer=0.0f; 
float f1 =(float)12.45;
double ::default değer=0.0d  
Char ::default değeri: \u0000 
boolean ::default değeri:false

Hafıza uzayları
-----------------------------------
byte  =2^0=  1bayt=8 bit     2^7= -128<= X <+127 
short=2^1=   2bayt=16bit          -32768< =Y<=+32767
int    =2^2=   4bayt=32bit
long=2^3=   8bayt=64bit     -2^63=  <(2^63-1) =
float   = 4bayt
double=8 bayt
boolean =1bit
char =2bayt


 */
public class Ders_003_DataTypesPrimitiveTypes {
public static void main(String[] args) {
	byte byt=12;
	short shrt=12;
	int in=12;
	long lng=12L; //Default L olarak göstermeliyiz
			
	float flt=12.5f;
	double dbl=12.5;
	
	boolean bln=true;
	boolean bln2=12>5;
	
	char chr='a';
}
}
