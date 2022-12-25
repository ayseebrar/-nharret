package inharret;

public class ArGör  extends AkademikPersonel {
 protected String unvanArGor;

protected ArGör(String adi, String soyadi, String email, String departman, String unvanArGor) {
	super(adi, soyadi, email, departman);
	this.unvanArGor = unvanArGor;
}

protected String getUnvanArGor() {
	return unvanArGor;
}

protected void setUnvanArGor(String unvanArGor) {
	this.unvanArGor = unvanArGor;
}
protected String cikis() {
	return " Fakulte B kapısından çıkış yaptı";
}

}
