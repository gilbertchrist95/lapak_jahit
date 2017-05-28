package cilok.com.lapakjahit.entity;

import java.util.List;

/**
 * Created by Gilbert on 5/28/2017.
 */

public class Custom2 {

    /**
     * id_produk : 4o1k3z
     * kategori : [{"id_jenis":"159","nama_fashion":"Fashion Wanita","id_kategori":"10","nama_kategori":"Kebaya"}]
     * bahan : {"bahan_luar":[{"id_keterangan":"1","id_bahan":"3","id_fungsi_bahan":"1","nama_bahan":"Kutu Baru","keterangan_bahan":null,"id_produk":"4o1k3z"},{"id_keterangan":"3","id_bahan":"5","id_fungsi_bahan":"1","nama_bahan":"Barotelli","keterangan_bahan":null,"id_produk":"4o1k3z"}],"bahan_dalam":[{"id_keterangan":"2","id_bahan":"4","id_fungsi_bahan":"2","nama_bahan":"Satin","keterangan_bahan":null,"id_produk":"4o1k3z"}]}
     * ukuran : [{"id_ukuran":"5","id_produk":"4o1k3z","ukuran":"S","keterangan_ukuran":"kecil"},{"id_ukuran":"6","id_produk":"4o1k3z","ukuran":"M","keterangan_ukuran":"sedang"},{"id_ukuran":"7","id_produk":"4o1k3z","ukuran":"L","keterangan_ukuran":"sedang"}]
     * warna : [{"id_warna":"3","id_produk":"4o1k3z","kode_hexa":"#ffff","keterangan_warna":"hitam"},{"id_warna":"4","id_produk":"4o1k3z","kode_hexa":"#0000","keterangan_warna":"putih"}]
     * motif : [{"id_motif":"3","id_produk":"4o1k3z","nama_motif":"emboss","path_gambar_motif":"upload/motif/aac.jpg","url_gambar":"http://localhost/lapakjahit/upload/motif/aac.jpg"},{"id_motif":"4","id_produk":"4o1k3z","nama_motif":"non emboss","path_gambar_motif":"upload/motif/aaa.jpg","url_gambar":"http://localhost/lapakjahit/upload/motif/aaa.jpg"}]
     */

    private String id_produk;
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private BahanBean bahan;
    private List<KategoriBean> kategori;
    private List<UkuranBean> ukuran;
    private List<WarnaBean> warna;
    private List<MotifBean> motif;

    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public BahanBean getBahan() {
        return bahan;
    }

    public void setBahan(BahanBean bahan) {
        this.bahan = bahan;
    }

    public List<KategoriBean> getKategori() {
        return kategori;
    }

    public void setKategori(List<KategoriBean> kategori) {
        this.kategori = kategori;
    }

    public List<UkuranBean> getUkuran() {
        return ukuran;
    }

    public void setUkuran(List<UkuranBean> ukuran) {
        this.ukuran = ukuran;
    }

    public List<WarnaBean> getWarna() {
        return warna;
    }

    public void setWarna(List<WarnaBean> warna) {
        this.warna = warna;
    }

    public List<MotifBean> getMotif() {
        return motif;
    }

    public void setMotif(List<MotifBean> motif) {
        this.motif = motif;
    }

    public static class BahanBean {
        private List<BahanLuarBean> bahan_luar;
        private List<BahanDalamBean> bahan_dalam;

        public List<BahanLuarBean> getBahan_luar() {
            return bahan_luar;
        }

        public void setBahan_luar(List<BahanLuarBean> bahan_luar) {
            this.bahan_luar = bahan_luar;
        }

        public List<BahanDalamBean> getBahan_dalam() {
            return bahan_dalam;
        }

        public void setBahan_dalam(List<BahanDalamBean> bahan_dalam) {
            this.bahan_dalam = bahan_dalam;
        }

        public static class BahanLuarBean {
            /**
             * id_keterangan : 1
             * id_bahan : 3
             * id_fungsi_bahan : 1
             * nama_bahan : Kutu Baru
             * keterangan_bahan : null
             * id_produk : 4o1k3z
             */

            private String id_keterangan;
            private String id_bahan;
            private String id_fungsi_bahan;
            private String nama_bahan;
            private Object keterangan_bahan;
            private String id_produk;

            public String getId_keterangan() {
                return id_keterangan;
            }

            public void setId_keterangan(String id_keterangan) {
                this.id_keterangan = id_keterangan;
            }

            public String getId_bahan() {
                return id_bahan;
            }

            public void setId_bahan(String id_bahan) {
                this.id_bahan = id_bahan;
            }

            public String getId_fungsi_bahan() {
                return id_fungsi_bahan;
            }

            public void setId_fungsi_bahan(String id_fungsi_bahan) {
                this.id_fungsi_bahan = id_fungsi_bahan;
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

        public static class BahanDalamBean {
            /**
             * id_keterangan : 2
             * id_bahan : 4
             * id_fungsi_bahan : 2
             * nama_bahan : Satin
             * keterangan_bahan : null
             * id_produk : 4o1k3z
             */

            private String id_keterangan;
            private String id_bahan;
            private String id_fungsi_bahan;
            private String nama_bahan;
            private Object keterangan_bahan;
            private String id_produk;

            public String getId_keterangan() {
                return id_keterangan;
            }

            public void setId_keterangan(String id_keterangan) {
                this.id_keterangan = id_keterangan;
            }

            public String getId_bahan() {
                return id_bahan;
            }

            public void setId_bahan(String id_bahan) {
                this.id_bahan = id_bahan;
            }

            public String getId_fungsi_bahan() {
                return id_fungsi_bahan;
            }

            public void setId_fungsi_bahan(String id_fungsi_bahan) {
                this.id_fungsi_bahan = id_fungsi_bahan;
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
    }

    public static class KategoriBean {
        /**
         * id_jenis : 159
         * nama_fashion : Fashion Wanita
         * id_kategori : 10
         * nama_kategori : Kebaya
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

    public static class UkuranBean {
        /**
         * id_ukuran : 5
         * id_produk : 4o1k3z
         * ukuran : S
         * keterangan_ukuran : kecil
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

    public static class WarnaBean {
        /**
         * id_warna : 3
         * id_produk : 4o1k3z
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

    public static class MotifBean {
        /**
         * id_motif : 3
         * id_produk : 4o1k3z
         * nama_motif : emboss
         * path_gambar_motif : upload/motif/aac.jpg
         * url_gambar : http://localhost/lapakjahit/upload/motif/aac.jpg
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
}
