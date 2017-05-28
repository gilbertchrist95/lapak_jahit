package cilok.com.lapakjahit.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Gilbert on 5/28/2017.
 */

public class Custom3 implements Parcelable {

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

    protected Custom3(Parcel in) {
        id_produk = in.readString();
        product = in.readParcelable(Product.class.getClassLoader());
        kategori = in.createTypedArrayList(KategoriBean.CREATOR);
        ukuran = in.createTypedArrayList(UkuranBean.CREATOR);
        warna = in.createTypedArrayList(WarnaBean.CREATOR);
        motif = in.createTypedArrayList(MotifBean.CREATOR);
    }

    public static final Creator<Custom3> CREATOR = new Creator<Custom3>() {
        @Override
        public Custom3 createFromParcel(Parcel in) {
            return new Custom3(in);
        }

        @Override
        public Custom3[] newArray(int size) {
            return new Custom3[size];
        }
    };

    public Custom3() {
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id_produk);
        parcel.writeParcelable(product, i);
        parcel.writeTypedList(kategori);
        parcel.writeTypedList(ukuran);
        parcel.writeTypedList(warna);
        parcel.writeTypedList(motif);
    }

    public static class BahanBean implements Parcelable{
        private List<BahanLuarBean> bahan_luar;
        private List<BahanDalamBean> bahan_dalam;

        protected BahanBean(Parcel in) {
        }

        public static final Creator<BahanBean> CREATOR = new Creator<BahanBean>() {
            @Override
            public BahanBean createFromParcel(Parcel in) {
                return new BahanBean(in);
            }

            @Override
            public BahanBean[] newArray(int size) {
                return new BahanBean[size];
            }
        };

        public BahanBean() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
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

    public static class KategoriBean implements Parcelable {
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

        protected KategoriBean(Parcel in) {
            id_jenis = in.readString();
            nama_fashion = in.readString();
            id_kategori = in.readString();
            nama_kategori = in.readString();
        }

        public static final Creator<KategoriBean> CREATOR = new Creator<KategoriBean>() {
            @Override
            public KategoriBean createFromParcel(Parcel in) {
                return new KategoriBean(in);
            }

            @Override
            public KategoriBean[] newArray(int size) {
                return new KategoriBean[size];
            }
        };

        public KategoriBean() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id_jenis);
            parcel.writeString(nama_fashion);
            parcel.writeString(id_kategori);
            parcel.writeString(nama_kategori);
        }
    }

    public static class UkuranBean implements Parcelable {
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

        protected UkuranBean(Parcel in) {
            id_ukuran = in.readString();
            id_produk = in.readString();
            ukuran = in.readString();
            keterangan_ukuran = in.readString();
        }

        public static final Creator<UkuranBean> CREATOR = new Creator<UkuranBean>() {
            @Override
            public UkuranBean createFromParcel(Parcel in) {
                return new UkuranBean(in);
            }

            @Override
            public UkuranBean[] newArray(int size) {
                return new UkuranBean[size];
            }
        };

        public UkuranBean() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id_ukuran);
            parcel.writeString(id_produk);
            parcel.writeString(ukuran);
            parcel.writeString(keterangan_ukuran);
        }
    }

    public static class WarnaBean implements Parcelable{
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

        protected WarnaBean(Parcel in) {
            id_warna = in.readString();
            id_produk = in.readString();
            kode_hexa = in.readString();
            keterangan_warna = in.readString();
        }

        public static final Creator<WarnaBean> CREATOR = new Creator<WarnaBean>() {
            @Override
            public WarnaBean createFromParcel(Parcel in) {
                return new WarnaBean(in);
            }

            @Override
            public WarnaBean[] newArray(int size) {
                return new WarnaBean[size];
            }
        };

        public WarnaBean() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id_warna);
            parcel.writeString(id_produk);
            parcel.writeString(kode_hexa);
            parcel.writeString(keterangan_warna);
        }
    }

    public static class MotifBean implements Parcelable {
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

        protected MotifBean(Parcel in) {
            id_motif = in.readString();
            id_produk = in.readString();
            nama_motif = in.readString();
            path_gambar_motif = in.readString();
            url_gambar = in.readString();
        }

        public static final Creator<MotifBean> CREATOR = new Creator<MotifBean>() {
            @Override
            public MotifBean createFromParcel(Parcel in) {
                return new MotifBean(in);
            }

            @Override
            public MotifBean[] newArray(int size) {
                return new MotifBean[size];
            }
        };

        public MotifBean() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id_motif);
            parcel.writeString(id_produk);
            parcel.writeString(nama_motif);
            parcel.writeString(path_gambar_motif);
            parcel.writeString(url_gambar);
        }
    }
}
