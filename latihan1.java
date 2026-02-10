class bidangDuaDimensi {
    protected String nama;

    bidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void info(){
        System.out.printf("%-18s : %s\n", "Nama Bidang Dua Dimensi", this.nama);
    }

    int luas(){
        return 0;
    }
}

class bujurSangkar extends bidangDuaDimensi{
    private int sisi;

    public bujurSangkar(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }
    
    void setNama(String nama){
        super.setNama(nama);
    }

    void setSisi(int sisi){
        this.sisi = sisi;
    }

    @Override
    int luas (){
        int luas = sisi*sisi;
        return luas;
    }

    @Override
    void info(){
        super.info();
        System.out.printf("Sisi %-18s : %d cm%n", this.nama, this.sisi);
        System.out.printf("Luas %-18s : %d cm²%n", this.nama, luas());
        System.out.println("------------------------------------");
    }
}

class lingkaran extends bidangDuaDimensi{
    private int diameter;

    public lingkaran(String nama, int diameter){
        super(nama);
        this.diameter = diameter;
    }

    void setNama(String nama){
        super.setNama(nama);
    }

    void setDiameter(int diameter){
        this.diameter = diameter;
    }

    @Override
    int luas(){
        double luas;
        double r = this.diameter / 2.0;

        if (this.diameter % 7 == 0){
            luas = (22.0/7.0)*r*r;
        }else{
            luas = 3.14*r*r;
        }
        Math.round(luas);
        return (int)luas;
    }

    @Override
    void info(){
        super.info();
        System.out.printf("Diameter %-14s : %d cm%n", this.nama, this.diameter);
        System.out.printf("Luas %-18s : %d cm²%n", this.nama, luas());
        System.out.println("------------------------------------");
    }
}

class App{
    public static void main(String[] args) {
        bidangDuaDimensi bidang1 = new bujurSangkar(null, 10);
        bidang1.setNama("Persegi");
        bidang1.info();

        lingkaran bidang2 = new lingkaran(null, 0);
        bidang2.setNama("Lingkaran");
        bidang2.setDiameter(14);
        bidang2.info();
    }
}

