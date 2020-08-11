
/*
 
boxing: integer olan bir yapıyı wrapper olarak kullanmakır
unboxing: Wrapper --> Primitve çevir




 */
public class Ders_006_BoxingUnboxing {
public static void main(String[] args) {

	int primitive=45;
	Integer wrap=primitive; //Boxing
	
	Integer wrap2=new Integer(99);
	int primitive2=wrap2; //unboxing
}
}
