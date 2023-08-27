/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ps22219_thanhtp_sof203_asmFinal;

/**
 *
 * @author Acer
 */
public class Grade {

    private String Hoten;
    private String Masv;
    private double TiengAnh;
    private double TinHoc;
    private double GDTC;

    public Grade() {
    }

    public Grade(String Hoten, String Masv, double TiengAnh, double TinHoc, double GDTC) {
        this.Hoten = Hoten;
        this.Masv = Masv;
        this.TiengAnh = TiengAnh;
        this.TinHoc = TinHoc;
        this.GDTC = GDTC;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public double getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(double TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public double getTinHoc() {
        return TinHoc;
    }

    public void setTinHoc(double TinHoc) {
        this.TinHoc = TinHoc;
    }

    public double getGDTC() {
        return GDTC;
    }

    public void setGDTC(double GDTC) {
        this.GDTC = GDTC;
    }

    

    public double getAVG(){
        return Math.ceil((getTiengAnh()+getGDTC()+getTinHoc())/3*100)/100;
    }
}
