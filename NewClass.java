/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tt;
class sinhvien{
private String hoten;
private String lop;
private float oop, html, sql;

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getSql() {
        return sql;
    }

    public void setSql(float sql) {
        this.sql = sql;
    }

    public float getOop() {
        return oop;
    }

    public void setOop(float oop) {
        this.oop = oop;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public float dtb(){
    return(this.html+this.oop+this.sql)/3;
    }
}
class svcntt extends sinhvien{
public float dtb(){
return(this.getHtml()+(this.getOop()*2)+this.getSql())/4;
}
}
public class NewClass {
    public static void main(String[] args) {
    sinhvien sv = new sinhvien();
    sv.setHoten("abc");
    sv.setLop("cntt");
    sv.setHtml(3);
    sv.setOop(5);
    sv.setSql(10);
    System.out.println("diem trung binh la: "+sv.dtb());
    svcntt svt = new svcntt();
    svt.setHtml(5);
    svt.setOop(7);
    svt.setSql(8);
    System.out.println("diem trung binh la: "+svt.dtb());
    }
}
