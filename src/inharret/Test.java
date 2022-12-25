package inharret;



public class Test {

	public static void main(String[] args) {
		Person p=new Person("Ahmet","Mehmet","ahme@gmail.com");
		System.out.println(p.getAdi()+" "+p.getSoyadi()+" "+p.giris());
		 //AkademikPersonel a=new AkademikPersonel ( "Ali", "Veli", "a@gmail.com","Bilgisayar Muh.");
		//System.out.println(a.getAdi()+" "+a.getSoyadi()+" "+a.getDepartman()+" "+a.giris());
		Hoca h=new Hoca("Hasan","Hüseyin","h@gmail.com","Bil.Müh","Doc.Dr.");
		System.out.println(h.getDepartman()+" "+h.getUnvan()+" "+h.getAdi()+" "+h.getSoyadi()+" "+h.giris());
        Student s=new Student("Leyla","Mecnun","m@hmail.com", 100000);
         System.out.println(s.getOgrId()+" "+s.getAdi()+" "+s.getSoyadi()+" "+s.giris());
         System.out.println(h.getDepartman()+" "+h.getUnvan()+" "+h.getAdi()+" "+h.getSoyadi()+" "+h.cikis());
	}

}
