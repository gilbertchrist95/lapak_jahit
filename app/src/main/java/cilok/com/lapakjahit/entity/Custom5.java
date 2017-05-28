package cilok.com.lapakjahit.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Alhaura on 28/05/2017.
 */

public class Custom5 implements Parcelable{


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

    protected Custom5(Parcel in) {
        id_produk = in.readString();
        kategori = in.createTypedArrayList(Kategori.CREATOR);
        bahan = in.createTypedArrayList(Bahan.CREATOR);
        ukuran = in.createTypedArrayList(Ukuran.CREATOR);
        warna = in.createTypedArrayList(Warna.CREATOR);
        tipe = in.createTypedArrayList(Tipe.CREATOR);
        product = in.readParcelable(Product.class.getClassLoader());
    }

    public static final Creator<Custom5> CREATOR = new Creator<Custom5>() {
        @Override
        public Custom5 createFromParcel(Parcel in) {
            return new Custom5(in);
        }

        @Override
        public Custom5[] newArray(int size) {
            return new Custom5[size];
        }
    };

    public Custom5() {
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id_produk);
        parcel.writeTypedList(kategori);
        parcel.writeTypedList(bahan);
        parcel.writeTypedList(ukuran);
        parcel.writeTypedList(warna);
        parcel.writeTypedList(tipe);
        parcel.writeParcelable(product, i);
    }

    public static class Kategori implements Parcelable{
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

        protected Kategori(Parcel in) {
            id_jenis = in.readString();
            nama_fashion = in.readString();
            id_kategori = in.readString();
            nama_kategori = in.readString();
        }

        public static final Creator<Kategori> CREATOR = new Creator<Kategori>() {
            @Override
            public Kategori createFromParcel(Parcel in) {
                return new Kategori(in);
            }

            @Override
            public Kategori[] newArray(int size) {
                return new Kategori[size];
            }
        };

        public Kategori() {
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

    public static class Bahan implements Parcelable {
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

        protected Bahan(Parcel in) {
            id_bahan = in.readString();
            nama_bahan = in.readString();
            id_produk = in.readString();
        }

        public static final Creator<Bahan> CREATOR = new Creator<Bahan>() {
            @Override
            public Bahan createFromParcel(Parcel in) {
                return new Bahan(in);
            }

            @Override
            public Bahan[] newArray(int size) {
                return new Bahan[size];
            }
        };

        public Bahan() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id_bahan);
            parcel.writeString(nama_bahan);
            parcel.writeString(id_produk);
        }
    }

    public static class Ukuran implements Parcelable {
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

        protected Ukuran(Parcel in) {
            id_ukuran = in.readString();
            id_produk = in.readString();
            ukuran = in.readString();
            keterangan_ukuran = in.readString();
        }

        public static final Creator<Ukuran> CREATOR = new Creator<Ukuran>() {
            @Override
            public Ukuran createFromParcel(Parcel in) {
                return new Ukuran(in);
            }

            @Override
            public Ukuran[] newArray(int size) {
                return new Ukuran[size];
            }
        };

        public Ukuran() {
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

    public static class Warna implements Parcelable {
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

        protected Warna(Parcel in) {
            id_warna = in.readString();
            id_produk = in.readString();
            kode_hexa = in.readString();
            keterangan_warna = in.readString();
        }

        public static final Creator<Warna> CREATOR = new Creator<Warna>() {
            @Override
            public Warna createFromParcel(Parcel in) {
                return new Warna(in);
            }

            @Override
            public Warna[] newArray(int size) {
                return new Warna[size];
            }
        };

        public Warna() {
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

    public static class Tipe implements Parcelable {
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

        protected Tipe(Parcel in) {
            id_panjang = in.readString();
            id_ukuran_panjang = in.readString();
            keterangan = in.readString();
            id_produk = in.readString();
        }

        public static final Creator<Tipe> CREATOR = new Creator<Tipe>() {
            @Override
            public Tipe createFromParcel(Parcel in) {
                return new Tipe(in);
            }

            @Override
            public Tipe[] newArray(int size) {
                return new Tipe[size];
            }
        };

        public Tipe() {
        }

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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(id_panjang);
            parcel.writeString(id_ukuran_panjang);
            parcel.writeString(keterangan);
            parcel.writeString(id_produk);
        }
    }
}
