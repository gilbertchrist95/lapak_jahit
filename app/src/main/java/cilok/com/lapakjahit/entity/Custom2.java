package cilok.com.lapakjahit.entity;

import java.util.List;

/**
 * Created by Alhaura on 28/05/2017.
 */

public class Custom2 {

    /**
     * id_produk : 8j54lp
     * kategori : [{"id_jenis":"164","nama_fashion":"Fashion Pria","id_kategori":"6","nama_kategori":"Topi"}]
     * bahan : [{"id_bahan":"6","nama_bahan":"Drill","keterangan_bahan":null,"id_produk":"8j54lp"},{"id_bahan":"7","nama_bahan":"Kanvas","keterangan_bahan":null,"id_produk":"8j54lp"}]
     * ukuran : [{"id_ukuran":"8","id_produk":"8j54lp","ukuran":"All Size","keterangan_ukuran":"Segala Ukuran"}]
     * warna : [{"id_warna":"5","id_produk":"8j54lp","kode_hexa":"#ffff","keterangan_warna":"hitam"}]
     * motif : [{"id_motif":"5","id_produk":"8j54lp","nama_motif":"sablon","path_gambar_motif":"upload/motif/Model-Topi-Sablon.jpg","url_gambar":"http://localhost/lapakjahit/upload/motif/Model-Topi-Sablon.jpg"}]
     * teks : [{"id_teks":"1","id_produk":"8j54lp","custom":"1"}]
     */

    private String id_produk;
    private List<Kategori> kategori;
    private List<Bahan> bahan;
    private List<Ukuran> ukuran;
    private List<Warna> warna;
    private List<Motif> motif;
    private List<Teks> teks;
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

    public List<Motif> getMotif() {
        return motif;
    }

    public void setMotif(List<Motif> motif) {
        this.motif = motif;
    }

    public List<Teks> getTeks() {
        return teks;
    }

    public void setTeks(List<Teks> teks) {
        this.teks = teks;
    }

    public static class Kategori {
        /**
         * id_jenis : 164
         * nama_fashion : Fashion Pria
         * id_kategori : 6
         * nama_kategori : Topi
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
         * id_bahan : 6
         * nama_bahan : Drill
         * keterangan_bahan : null
         * id_produk : 8j54lp
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
         * id_ukuran : 8
         * id_produk : 8j54lp
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
         * id_warna : 5
         * id_produk : 8j54lp
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

    public static class Motif {
        /**
         * id_motif : 5
         * id_produk : 8j54lp
         * nama_motif : sablon
         * path_gambar_motif : upload/motif/Model-Topi-Sablon.jpg
         * url_gambar : http://localhost/lapakjahit/upload/motif/Model-Topi-Sablon.jpg
         */

        private String id_motif;
        private String id_produk;
        private String nama_motif;
        private String path_gambar_motif;
        private String url_gambar;

        public String getId_motif() {
            return id_motif;
        }

        public void setId_motif(String id_motif) {
            this.id_motif = id_motif;
        }

        public String getId_produk() {
            return id_produk;
        }

        public void setId_produk(String id_produk) {
            this.id_produk = id_produk;
        }

        public String getNama_motif() {
            return nama_motif;
        }

        public void setNama_motif(String nama_motif) {
            this.nama_motif = nama_motif;
        }

        public String getPath_gambar_motif() {
            return path_gambar_motif;
        }

        public void setPath_gambar_motif(String path_gambar_motif) {
            this.path_gambar_motif = path_gambar_motif;
        }

        public String getUrl_gambar() {
            return url_gambar;
        }

        public void setUrl_gambar(String url_gambar) {
            this.url_gambar = url_gambar;
        }
    }

    public static class Teks {
        /**
         * id_teks : 1
         * id_produk : 8j54lp
         * custom : 1
         */

        private String id_teks;
        private String id_produk;
        private String custom;

        public String getId_teks() {
            return id_teks;
        }

        public void setId_teks(String id_teks) {
            this.id_teks = id_teks;
        }

        public String getId_produk() {
            return id_produk;
        }

        public void setId_produk(String id_produk) {
            this.id_produk = id_produk;
        }

        public String getCustom() {
            return custom;
        }

        public void setCustom(String custom) {
            this.custom = custom;
        }
    }
}
