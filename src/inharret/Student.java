package inharret;

public class Student  extends Person {
     protected int ogrId;

	protected Student(String adi, String soyadi, String email, int ogrId) {
		super(adi, soyadi, email);
		this.ogrId = ogrId;
	}

	protected int getOgrId() {
		return ogrId;
	}

	protected void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	protected String giris() {
		return super.giris(); //super metodu üst sınıftan giriş yazısını almak için yazılır.
			}                 // super giriş ,yerine öğrenci kapısından giriş yaptı yazarsak öyle çıktı alırız.
	
}
