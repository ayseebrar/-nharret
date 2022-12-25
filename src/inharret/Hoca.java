package inharret;

public class Hoca extends  AkademikPersonel {
 protected String unvan;

protected Hoca(String adi, String soyadi, String email, String departman, String unvan) {
	super(adi, soyadi, email, departman);
	this.unvan = unvan;
}

protected String getUnvan() {
	return unvan;
}

protected void setUnvan(String unvan) {
	this.unvan = unvan;
}
protected String giris() {
	return " Fakulte A Kapısından Giriş yaptı";
	
}
protected String cikis() {   // bunu yazmassak hata verir kalıtımsal olarak bulamaz
	return "Fakülte  A kapisindan cıkıs yapti";
}
}
