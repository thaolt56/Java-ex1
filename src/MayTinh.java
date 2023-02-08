
public class MayTinh {
	private HangSanXuat hangSanXuat;
	private Date ngaySanXuat;
	private double giaBan;
	private int baoHanh;
	
	public MayTinh(HangSanXuat hangSanXuat, Date ngaySanXuat, double giaBan, int baoHanh) {
		
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.baoHanh = baoHanh;
	}

	public HangSanXuat getHangSanXuat() {
		return this.hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public Date getNgaySanXuat() {
		return this.ngaySanXuat;
	}

	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBan() {
		return this.giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getBaoHanh() {
		return baoHanh;
	}

	public void setBaoHanh(int baoHanh) {
		this.baoHanh = baoHanh;
	}
	
	public boolean checkGiaBan(MayTinh mayTinhKhac) {
		return this.giaBan - mayTinhKhac.giaBan > 0;
		
	}
	
	public void tenQuocGia() {
		System.out.println("Tên quốc gia sản xuất máy tính: " + this.hangSanXuat.getQuocGia().getTenQG());
	}
	
}
