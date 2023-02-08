
public class Test {
	public static void main(String[] args) {
		QuocGia quocGia_1 = new QuocGia("VN", "Viet Nam");
		QuocGia quocGia_2 = new QuocGia("USA", "Hoa Ky");
		QuocGia quocGia_3 = new QuocGia("JP", "Nhat Ban");
		
		Date date_1 = new Date(10, 10, 2020);
		Date date_2 = new Date(15, 10, 2021);
		Date date_3 = new Date(9, 10, 2023);
		
		
		HangSanXuat hang_1 = new HangSanXuat("Dell", quocGia_1);
		HangSanXuat hang_2 = new HangSanXuat("HP", quocGia_2);
		HangSanXuat hang_3 = new HangSanXuat("Acer", quocGia_3);
		
		MayTinh mayTinh_1 = new MayTinh(hang_2, date_3, 1000, 24);
		MayTinh mayTinh_2 = new MayTinh(hang_1, date_2, 2000, 12);
		MayTinh mayTinh_3 = new MayTinh(hang_3, date_1, 3000, 18);
		
		System.out.println("So sanh gia ban: "+ mayTinh_1.checkGiaBan(mayTinh_3));
		
		mayTinh_1.tenQuocGia();
		mayTinh_2.tenQuocGia();
		mayTinh_3.tenQuocGia();
		
	}
}
