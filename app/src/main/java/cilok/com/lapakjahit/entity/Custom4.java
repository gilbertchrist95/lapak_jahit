package cilok.com.lapakjahit.entity;

import java.util.List;

/**
 * Created by Alhaura on 28/05/2017.
 */

public class Custom4 {


    /**
     * id_produk : 8j506e
     * kategori : [{"id_jenis":"164","nama_fashion":"Fashion Pria","id_kategori":"8","nama_kategori":"Jeans"}]
     * bahan : [{"id_bahan":"8","nama_bahan":"Denim Cotton","keterangan_bahan":null,"id_produk":"8j506e"}]
     * ukuran : [{"id_ukuran":"9","id_produk":"8j506e","ukuran":"27","keterangan_ukuran":"S"},{"id_ukuran":"10","id_produk":"8j506e","ukuran":"28","keterangan_ukuran":"S"},{"id_ukuran":"11","id_produk":"8j506e","ukuran":"29","keterangan_ukuran":"M"},{"id_ukuran":"12","id_produk":"8j506e","ukuran":"30","keterangan_ukuran":"M"},{"id_ukuran":"13","id_produk":"8j506e","ukuran":"31","keterangan_ukuran":"L"},{"id_ukuran":"14","id_produk":"8j506e","ukuran":"32","keterangan_ukuran":"L"}]
     * warna : [{"id_warna":"6","id_produk":"8j506e","kode_hexa":"#ffff","keterangan_warna":"Black"},{"id_warna":"7","id_produk":"8j506e","kode_hexa":"#7B9EC8","keterangan_warna":"River Blue"}]
     * tipe : [{"id_tipe":"1","tipe_jeans":"Low Rise","id_produk":"8j506e"},{"id_tipe":"2","tipe_jeans":"Regular Fit","id_produk":"8j506e"}]
     */

    private String id_produk;
    private List<Kategori> kategori;
    private List<Bahan> bahan;
    private List<Ukuran> ukuran;
    private List<Warna> warna;
    private List<Tipe> tipe;
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public List<Kategori> getKategori() {
        return kategori;
    }

    public void setKategori(List<Kategori> kategori) {
        this.kategori = kategori;
    }

    public List<Bahan> getBahan() {
        return bahan;
    }

    public void setBahan(List<Bahan> bahan) {
        this.bahan = bahan;
    }

    public List<Ukuran> getUkuran() {
        return ukuran;
    }

    public void setUkuran(List<Ukuran> ukuran) {
        this.ukuran = ukuran;
    }

    public List<Warna> getWarna() {
        return warna;
    }

    public void setWarna(List<Warna> warna) {
        this.warna = warna;
    }

    public List<Tipe> getTipe() {
        return tipe;
    }

    public void setTipe(List<Tipe> tipe) {
        this.tipe = tipe;
    }

    public static class Kategori {
        /**
         * id_jenis : 164
         * nama_fashion : Fashion Pria
         * id_kategori : 8
         * nama_kategori : Jeans
         */

        private String id_jenis;
        private String nama_fashion;
        private String id_kategori;
        private String nama_kategori;

        public String getId_jenis() {
            return id_jenis;
        }

        public void setId_jenis(String id_jenis) {
            this.id_jenis = id_jenis;
        }

        public String getNama_fashion() {
            return nama_fashion;
        }

        public void setNama_fashion(String nama_fashion) {
            this.nama_fashion = nama_fashion;
        }

        public String getId_kategori() {
            return id_kategori;
        }

        public void setId_kategori(String id_kategori) {
            this.id_kategori = id_kategori;
        }

        public String getNama_kategori() {
            return nama_kategori;
        }

        public void setNama_kategori(String nama_kategori) {
            this.nama_kategori = nama_kategori;
        }
    }

    public static class Bahan {
        /**
         * id_bahan : 8
         * nama_bahan : Denim Cotton
         * keterangan_bahan : null
         * id_produk : 8j506e
         */

        private String id_bahan;
        private String nama_bahan;
        private Object keterangan_bahan;
        private String id_produk;

        public String getId_bahan() {
            return id_bahan;
        }

        public void setId_bahan(String id_bahan) {
            this.id_bahan = id_bahan;
        }

        public String getNama_bahan() {
            return nama_bahan;
        }

        public void setNama_bahan(String nama_bahan) {
            this.nama_bahan = nama_bahan;
        }

        public Object getKeterangan_bahan() {
            return keterangan_bahan;
        }

        public void setKeterangan_bahan(Object keterangan_bahan) {
            this.keterangan_bahan = keterangan_bahan;
        }

        public String getId_produk() {
            return id_produk;
        }

        public void setId_produk(String id_produk) {
            this.id_produk = id_produk;
        }
    }

    public static class Ukuran {
        /**
         * id_ukuran : 9
         * id_produk : 8j506e
         * ukuran : 27
         * keterangan_ukuran : S
         */

        private String id_ukuran;
        private String id_produk;
        private String ukuran;
        private String keterangan_ukuran;

        public String getId_ukuran() {
            return id_ukuran;
        }

        public void setId_ukuran(String id_ukuran) {
            this.id_ukuran = id_ukuran;
        }

        public String getId_produk() {
            return id_produk;
        }

        public void setId_produk(String id_produk) {
            this.id_produk = id_produk;
        }

        public String getUkuran() {
            return ukuran;
        }

        public void setUkuran(String ukuran) {
            this.ukuran = ukuran;
        }

        public String getKeterangan_ukuran() {
            return keterangan_ukuran;
        }

        public void setKeterangan_ukuran(String keterangan_ukuran) {
            this.keterangan_ukuran = keterangan_ukuran;
        }
    }

    public static class Warna {
        /**
         * id_warna : 6
         * id_produk : 8j506e
         * kode_hexa : #ffff
         * keterangan_warna : Black
         */

        private String id_warna;
        private String id_produk;
        private String kode_hexa;
        private String keterangan_warna;

        public String getId_warna() {
            return id_warna;
        }

        public void setId_warna(String id_warna) {
            this.id_warna = id_warna;
        }

        public String getId_produk() {
            return id_produk;
        }

        public void setId_produk(String id_produk) {
            this.id_produk = id_produk;
        }

        public String getKode_hexa() {
            return kode_hexa;
        }

        public void setKode_hexa(String kode_hexa) {
            this.kode_hexa = kode_hexa;
        }

        public String getKeterangan_warna() {
            return keterangan_warna;
        }

        public void setKeterangan_warna(String keterangan_warna) {
            this.keterangan_warna = keterangan_warna;
        }
    }

    public static class Tipe {
        /**
         * id_tipe : 1
         * tipe_jeans : Low Rise
         * id_produk : 8j506e
         */

        private String id_tipe;
        private String tipe_jeans;
        private String id_produk;

        public String getId_tipe() {
            return id_tipe;
        }

        public void setId_tipe(String id_tipe) {
            this.id_tipe = id_tipe;
        }

        public String getTipe_jeans() {
            return tipe_jeans;
        }

        public void setTipe_jeans(String tipe_jeans) {
            this.tipe_jeans = tipe_jeans;
        }

        public String getId_produk() {
            return id_produk;
        }

        public void setId_produk(String id_produk) {
            this.id_produk = id_produk;
        }
    }
}
