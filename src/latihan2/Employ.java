
package latihan2;

class Employ extends Person {
    
    private String nokaryawan;
    //konstruktor
    public Employ (String nokaryawan, String nama, int usia){
        super(nama,usia);
        this.nokaryawan = nokaryawan;
    }
    //metode
    public void info(){
        System.out.println("No. karyawan : "+this.nokaryawan);
        super.info();
    }
}//akhir kelas Employ

