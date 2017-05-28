package cilok.com.lapakjahit.entity;

import java.util.List;

/**
 * Created by Alhaura on 28/05/2017.
 */

public class Custom5 {


    /**
     * id_produk : 8j4u8i
     * kategori : [{"id_jenis":"159","nama_fashion":"Fashion Wanita","id_kategori":"14","nama_kategori":"Rok"}]
     * bahan : [{"id_bahan":"9","nama_bahan":"Barotelli","keterangan_bahan":null,"id_produk":"8j4u8i"}]
     * ukuran : [{"id_ukuran":"15","id_produk":"8j4u8i","ukuran":"All Size","keterangan_ukuran":"Segala Ukuran"}]
     * warna : [{"id_warna":"8","id_produk":"8j4u8i","kode_hexa":"#ffff","keterangan_warna":"hitam"},{"id_warna":"9","id_produk":"8j4u8i","kode_hexa":"#0000","keterangan_warna":"putih"},{"id_warna":"10","id_produk":"8j4u8i","kode_hexa":"#7B9EC8","keterangan_warna":"Biru Jeans"}]
     * tipe : [{"id_panjang":"1","id_ukuran_panjang":"1","keterangan":"Panjang","id_produk":"8j4u8i"}]
     */

    private String id_produk;
    private List<Kategori> kategori;
    private List<Bahan> bahan;
    private List<Ukuran> ukuran;
    private List<Warna> warna;
    private List<Tipe> tipe;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private Product product;

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
         * id_jenis : 159
         * nama_fashion : Fashion Wanita
         * id_kategori : 14
         * nama_kategori : Rok
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
         * id_bahan : 9
         * nama_bahan : Barotelli
         * keterangan_bahan : null
         * id_produk : 8j4u8i
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
         * id_ukuran : 15
         * id_produk : 8j4u8i
         * ukuran : All Size
         * keterangan_ukuran : Segala Ukuran
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
         * id_warna : 8
         * id_produk : 8j4u8i
         * kode_hexa : #ffff
         * keterangan_warna : hitam
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
         * id_panjang : 1
         * id_ukuran_panjang : 1
         * keterangan : Panjang
         * id_produk : 8j4u8i
         */

        private String id_panjang;
        private String id_ukuran_panjang;
        private String keterangan;
        private String id_produk;

        public String getId_panjang() {
            return id_panjang;
        }

        public void setId_panjang(String id_panjang) {
            this.id_panjang = id_panjang;
        }

        public String getId_ukuran_panjang() {
            return id_ukuran_panjang;
        }

        public void setId_ukuran_panjang(String id_ukuran_panjang) {
            this.id_ukuran_panjang = id_ukuran_panjang;
        }

        public String getKeterangan() {
            return keterangan;
        }

        public void setKeterangan(String keterangan) {
            this.keterangan = keterangan;
        }

        public String getId_produk() {
            return id_produk;
        }

        public void setId_produk(String id_produk) {
            this.id_produk = id_produk;
        }
    }
}
