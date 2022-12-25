package inharret;

public abstract  class AkademikPersonel extends Person { // abstract class bu sınıftan nesne oluşturmak istemiyorum.
    protected String departman;

	protected AkademikPersonel(String adi, String soyadi, String email, String departman) {
		super(adi, soyadi, email);
		this.departman = departman;
	}

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	protected String giris() {
		return " Fakulte Kapısından Giriş yaptı";
		
	}
	protected  abstract String  cikis(); //bu foksiyonu geçersiz say
}
