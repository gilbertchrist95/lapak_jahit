package cilok.com.lapakjahit.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Gilbert on 5/25/2017.
 */

public class Cart {

    private int cart_id; //ok
    private List<CartBean> cart;
    private String message; //ok




    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public List<CartBean> getCart() {
        return cart;
    }

    public void setCart(List<CartBean> cart) {
        this.cart = cart;
    }


    public static class CartBean {
        /**
         * seller : {"id":1251687,"username":"sfswendy","name":"Ninik Wijaya","gender":"Laki-laki","avatar":"https://s0.bukalapak.com/avt/5867761/medium/SFSSTORE.jpg","level":"Good Seller","level_badge_url":"https://www.bukalapak.com/images/badge/seller/xhdpi/level-6.png","lapak_name":"Jaket Adidas windbreaker dan waterproof grade original","lapak_desc":"SUPPLIER Jaket Adidas dan Nike WATERPROOF |\r\nSUPPLIER Jam Tangan CASIO G SHOCK &amp; -SEVENFRIDAY","lapak_header":"https://s2.bukalapak.com/hdr/7329721/normal/IMG_4533.JPG","last_login":"2017-05-25T07:10:00.000+07:00","joined_at":"2014-09-08T14:51:45.000+07:00","verified_user":false,"official":false,"store_closed":false,"schedule_close_store":false,"close_date":"2016-12-11T17:23:23.000+07:00","reopen_date":null,"close_reason":"Toko kami tutup sementara \r\ndan akan kembali buka pada tanggal \r\n14/11/16 (Hari Rabu) \r\n Thx \r\n-SFS-","delivery_time":"17 jam","rejection":{"rejected":0,"recent_trans":100},"address":{"province":"DKI Jakarta","city":"Jakarta Utara"},"subscriber_amount":1756,"last_order_schedule":{},"premium_user":true,"top_merchant":true,"seller_voucher":{},"is_seller":true,"feedbacks":{"positive":9533,"negative":0}}
         * items : [{"id":697916656,"name":"MODEL PALING LAKU ... G Shock Casio GA400 Gmix Full Red Merah dual time Jam Tangan Pria Termurah","quantity":1,"price":120000,"stock":92,"message":null,"product":{"deal_info":{},"deal_request_state":"can request","price":120000,"category_id":171,"category":"Jam Tangan","category_structure":["Fashion Pria","Jam Tangan"],"courier":["GO-JEK GO-SEND","JNE REG","JNE YES"],"seller_username":"sfswendy","seller_name":"Ninik Wijaya","seller_id":1251687,"seller_avatar":"https://s0.bukalapak.com/avt/5867761/medium/SFSSTORE.jpg","seller_level":"Good Seller","seller_level_badge_url":"https://www.bukalapak.com/images/badge/seller/xhdpi/level-6.png","seller_delivery_time":"17 jam","seller_positive_feedback":9533,"seller_negative_feedback":0,"seller_term_condition":"<p>Barang yg kami jual di jamin PREMIUM QUALITY!!!<\/p>\n\n<p>apapun penyebut an nya ; Grade ORIGINAL , KW Super , Clone , Mirror 1:1 (DIJAMIN BUKAN ABAL2!!!)<\/p>\n\n<p>BONUS (KHUSUS PEMBELIAN JAM TANGAN)<\/p>\n\n<p>-Harga yg tertera sudah termasuk :<\/p>\n\n<p>*Jam<\/p>\n\n<p>*Box<\/p>\n\n<p>*Batre tambahan<\/p>\n\n<p>SETIAP PACKINGAN ANDA AKAN DI BUNGKUS RAPIH DENGAN BUBLE WRAP &amp; 2 Kali PROSES CEK (Sehingga sangat minim barang cacat / rusak :D )<\/p>\n\n<p>jadwal pengriman :<\/p>\n\n<p>-gojek akan di pick up jam 10.00 pagi - 5.00 sore<\/p>\n\n<p>-Jne di kirim jam 8 malem ke jne<\/p>\n\n<p>-jika anda mw ikut pengiriman hari yg sama (maximal transaksi jam 5 sore)<\/p>\n\n<p>-resi di input jam 12 malem ke atas<\/p>\n\n<p>(tidak perlu tanyakan mana resi , Karena klo sudah ada pasti segera kami input :D )<\/p>\n\n<p>*SANGAT TIDAK DI SARANKAN DI BAWA KE AIR<\/p>\n\n<p>-Nama nya KW sebagus apapun TETAP KW<\/p>\n\n<p>(TIDAK ADA RETUR DENGAN ALESAN MATI KARENA KENA AIR)<\/p>\n\n<p>MEMBELI=SETUJU<\/p>\n\n<p>Untuk dropship jangan lupa cantum kan nama dan no hp pengirim yah :)<\/p>\n\n<p>ada yg lbih murah?BANYAK!!<\/p>\n\n<p>TAPI KAMI BERANI DI ADU KUALITAS NYA :D<\/p>\n\n<p>RAGU???<\/p>\n\n<p>Baca Feedback kami dengan 100% Feedback Lebih dari 8500++ Transaksi<\/p>\n\n<p>(dan akan terus bertambah)<\/p>\n\n<p>Sehingga bisa menjaga EMBLEM LAPAK TERBAIK dan Gelar GOOD SELLER :D<\/p>\n\n<p>happy shooping gan :D<\/p>\n","seller_alert":null,"for_sale":true,"state_description":[],"premium_account":true,"top_merchant":true,"last_order_schedule":{},"seller_voucher":{},"waiting_payment":-10,"sold_count":6,"specs":{"Brand":"Casio"},"force_insurance":false,"free_shipping_coverage":[],"labels":[{"id":1592835,"name":"G-Shock Casio","slug":"g-shock-casio","description":null}],"tag_pages":[{"id":5678,"name":"Jam Tangan Casio Pria","has_landing_page":true},{"id":5618,"name":"Jam Tangan G Shock Pria","has_landing_page":true},{"id":9398,"name":"Jam Tangan Sevenfriday","has_landing_page":true}],"id":"8734s1","url":"https://www.bukalapak.com/p/fashion-pria/jam-tangan-171/8734s1-jual-model-paling-laku-g-shock-casio-ga400-gmix-full-red-merah-dual-time-jam-tangan-pria-termurah","name":"MODEL PALING LAKU ... G Shock Casio GA400 Gmix Full Red Merah dual time Jam Tangan Pria Termurah","active":true,"city":"Jakarta Utara","province":"DKI Jakarta","weight":300,"image_ids":[1204806601,1204806571,1204806606,1204806611],"images":["https://s1.bukalapak.com/img/1066084021/large/GA400_2___Copy.JPG","https://s1.bukalapak.com/img/1756084021/large/GA400_2.JPG","https://s1.bukalapak.com/img/6066084021/large/GA400_2_HAND___Copy.JPG","https://s1.bukalapak.com/img/1166084021/large/IMG_9123.JPG"],"small_images":["https://s1.bukalapak.com/img/1066084021/small/GA400_2___Copy.JPG","https://s1.bukalapak.com/img/1756084021/small/GA400_2.JPG","https://s1.bukalapak.com/img/6066084021/small/GA400_2_HAND___Copy.JPG","https://s1.bukalapak.com/img/1166084021/small/IMG_9123.JPG"],"desc":"TOLONG Membaca deskripsi ini sampai habis yah gan ??<br/>Di karenakan ada BONUS yg kami bagikan ??<br/><br/>Kualitas : Grade Original /Kw Super /Grade A++ / Mirror 1:1 ( Kami MENJAMIN BUKAN ABAL-ABAL)<br/><br/><br/>Semua fitur BERFUNGSI : <br/>-Tanggal <br/>-Jam<br/>-Hari <br/>-Detik<br/>-Stopwatch<br/>-Alarm <br/>-Lampu <br/>-Digital <br/>-Analog<br/><br/><br/>- Untuk Foto barang 100000% RealPic / Foto asli (GAK NYOMOT GAMBAR ORG/GOOGLE!!)<br/>- Foto Jam di pake di tangan?liat foto berikut nya yah ?? <br/>- Setiap packing an akan di bungkus dengan buble wrap , sehingga aman sampai tujuan ??<br/><br/><br/>**************** BONUS********************<br/>SETIAP pembelian sudah TERMASUK :<br/>- Box Gshock sesuai foto <br/>- BONUS BATRE SONY ORIGINAL <br/><br/><br/>Masih Ragu?tekan tombol Feedback kami <br/>untuk saat ini kami masih bisa menjaga konsistensi toko kami dengan 100% feedback dari 10.000++ transaksi lebih ??<br/><br/>Happy Shooping - SFSstore ??","condition":"new","stock":92,"favorited":false,"created_at":"2017-05-03T22:49:39.000+07:00","updated_at":"2017-05-25T05:46:54.000+07:00","product_sin":[],"rating":{"average_rate":"3.7","user_count":3},"current_variant_name":"","current_product_sku_id":487803031,"product_sku":[],"options":[],"interest_count":32,"last_relist_at":"2017-05-23T10:34:32.000+07:00","view_count":1085},"original_price":120000,"discount_price":120000},{"id":697916956,"name":"MODEL TERBARU... Jam Tangan G Shock Casio GA110 Full red merah dual time digital analog pria . SKMEI","quantity":1,"price":120000,"stock":94,"message":null,"product":{"deal_info":{},"deal_request_state":"can request","price":120000,"category_id":171,"category":"Jam Tangan","category_structure":["Fashion Pria","Jam Tangan"],"courier":["GO-JEK GO-SEND","JNE REG","JNE YES"],"seller_username":"sfswendy","seller_name":"Ninik Wijaya","seller_id":1251687,"seller_avatar":"https://s0.bukalapak.com/avt/5867761/medium/SFSSTORE.jpg","seller_level":"Good Seller","seller_level_badge_url":"https://www.bukalapak.com/images/badge/seller/xhdpi/level-6.png","seller_delivery_time":"17 jam","seller_positive_feedback":9533,"seller_negative_feedback":0,"seller_term_condition":"<p>Barang yg kami jual di jamin PREMIUM QUALITY!!!<\/p>\n\n<p>apapun penyebut an nya ; Grade ORIGINAL , KW Super , Clone , Mirror 1:1 (DIJAMIN BUKAN ABAL2!!!)<\/p>\n\n<p>BONUS (KHUSUS PEMBELIAN JAM TANGAN)<\/p>\n\n<p>-Harga yg tertera sudah termasuk :<\/p>\n\n<p>*Jam<\/p>\n\n<p>*Box<\/p>\n\n<p>*Batre tambahan<\/p>\n\n<p>SETIAP PACKINGAN ANDA AKAN DI BUNGKUS RAPIH DENGAN BUBLE WRAP &amp; 2 Kali PROSES CEK (Sehingga sangat minim barang cacat / rusak :D )<\/p>\n\n<p>jadwal pengriman :<\/p>\n\n<p>-gojek akan di pick up jam 10.00 pagi - 5.00 sore<\/p>\n\n<p>-Jne di kirim jam 8 malem ke jne<\/p>\n\n<p>-jika anda mw ikut pengiriman hari yg sama (maximal transaksi jam 5 sore)<\/p>\n\n<p>-resi di input jam 12 malem ke atas<\/p>\n\n<p>(tidak perlu tanyakan mana resi , Karena klo sudah ada pasti segera kami input :D )<\/p>\n\n<p>*SANGAT TIDAK DI SARANKAN DI BAWA KE AIR<\/p>\n\n<p>-Nama nya KW sebagus apapun TETAP KW<\/p>\n\n<p>(TIDAK ADA RETUR DENGAN ALESAN MATI KARENA KENA AIR)<\/p>\n\n<p>MEMBELI=SETUJU<\/p>\n\n<p>Untuk dropship jangan lupa cantum kan nama dan no hp pengirim yah :)<\/p>\n\n<p>ada yg lbih murah?BANYAK!!<\/p>\n\n<p>TAPI KAMI BERANI DI ADU KUALITAS NYA :D<\/p>\n\n<p>RAGU???<\/p>\n\n<p>Baca Feedback kami dengan 100% Feedback Lebih dari 8500++ Transaksi<\/p>\n\n<p>(dan akan terus bertambah)<\/p>\n\n<p>Sehingga bisa menjaga EMBLEM LAPAK TERBAIK dan Gelar GOOD SELLER :D<\/p>\n\n<p>happy shooping gan :D<\/p>\n","seller_alert":null,"for_sale":true,"state_description":[],"premium_account":true,"top_merchant":true,"last_order_schedule":{},"seller_voucher":{},"waiting_payment":-7,"sold_count":3,"specs":{"Brand":"Casio"},"force_insurance":false,"free_shipping_coverage":[],"labels":[{"id":1592835,"name":"G-Shock Casio","slug":"g-shock-casio","description":null}],"tag_pages":[{"id":5678,"name":"Jam Tangan Casio Pria","has_landing_page":true},{"id":5618,"name":"Jam Tangan G Shock Pria","has_landing_page":true},{"id":9398,"name":"Jam Tangan Sevenfriday","has_landing_page":true}],"id":"895gcq","url":"https://www.bukalapak.com/p/fashion-pria/jam-tangan-171/895gcq-jual-model-terbaru-jam-tangan-g-shock-casio-ga110-full-red-merah-dual-time-digital-analog-pria-skmei","name":"MODEL TERBARU... Jam Tangan G Shock Casio GA110 Full red merah dual time digital analog pria . SKMEI ","active":true,"city":"Jakarta Utara","province":"DKI Jakarta","weight":300,"image_ids":[1214456796,1214456856,1214456876,1214456906,1214456931],"images":["https://s1.bukalapak.com/img/6976544121/large/GA110_P.JPG","https://s1.bukalapak.com/img/6586544121/large/GA110_P_HAND.JPG","https://s1.bukalapak.com/img/6786544121/large/GA110_P_DET.JPG","https://s1.bukalapak.com/img/6096544121/large/GA110_P_SIDE.JPG","https://s1.bukalapak.com/img/1396544121/large/B.JPG"],"small_images":["https://s1.bukalapak.com/img/6976544121/small/GA110_P.JPG","https://s1.bukalapak.com/img/6586544121/small/GA110_P_HAND.JPG","https://s1.bukalapak.com/img/6786544121/small/GA110_P_DET.JPG","https://s1.bukalapak.com/img/6096544121/small/GA110_P_SIDE.JPG","https://s1.bukalapak.com/img/1396544121/small/B.JPG"],"desc":"TOLONG Membaca deskripsi ini sampai habis yah gan ??<br/>Di karenakan ada BONUS yg kami bagikan ??<br/><br/>Kualitas : Grade Original /Kw Super /Grade A++ / Mirror 1:1 ( Kami MENJAMIN BUKAN ABAL-ABAL)<br/><br/><br/>Semua fitur BERFUNGSI : <br/>-Tanggal <br/>-Jam<br/>-Hari <br/>-Detik<br/>-Stopwatch<br/>-Alarm <br/>-Lampu <br/>-Digital <br/>-Analog<br/><br/><br/>- Untuk Foto barang 100000% RealPic / Foto asli (GAK NYOMOT GAMBAR ORG/GOOGLE!!)<br/>- Foto Jam di pake di tangan?liat foto berikut nya yah ?? <br/>- Setiap packing an akan di bungkus dengan buble wrap , sehingga aman sampai tujuan ??<br/><br/><br/>**************** BONUS********************<br/>SETIAP pembelian sudah TERMASUK :<br/>- Box Gshock sesuai foto <br/>- BONUS BATRE SONY ORIGINAL <br/><br/><br/>Masih Ragu?tekan tombol Feedback kami <br/>untuk saat ini kami masih bisa menjaga konsistensi toko kami dengan 100% feedback dari 10.000++ transaksi lebih ??<br/><br/>Happy Shooping - SFSstore","condition":"new","stock":94,"favorited":false,"created_at":"2017-05-08T13:00:18.000+07:00","updated_at":"2017-05-24T12:20:43.000+07:00","product_sin":[],"rating":{"average_rate":0,"user_count":0},"current_variant_name":"","current_product_sku_id":491279366,"product_sku":[],"options":[],"interest_count":16,"last_relist_at":"2017-05-21T00:51:12.000+07:00","view_count":479},"original_price":120000,"discount_price":120000},{"id":697917366,"name":"Jam Tangan G Shock Casio GA1000 Edisi PILOT NAVY SEAL . digital pria & anak anak fashion murah","quantity":1,"price":120000,"stock":99,"message":null,"product":{"deal_info":{},"deal_request_state":"can request","price":120000,"category_id":171,"category":"Jam Tangan","category_structure":["Fashion Pria","Jam Tangan"],"courier":["GO-JEK GO-SEND","JNE REG","JNE YES"],"seller_username":"sfswendy","seller_name":"Ninik Wijaya","seller_id":1251687,"seller_avatar":"https://s0.bukalapak.com/avt/5867761/medium/SFSSTORE.jpg","seller_level":"Good Seller","seller_level_badge_url":"https://www.bukalapak.com/images/badge/seller/xhdpi/level-6.png","seller_delivery_time":"17 jam","seller_positive_feedback":9533,"seller_negative_feedback":0,"seller_term_condition":"<p>Barang yg kami jual di jamin PREMIUM QUALITY!!!<\/p>\n\n<p>apapun penyebut an nya ; Grade ORIGINAL , KW Super , Clone , Mirror 1:1 (DIJAMIN BUKAN ABAL2!!!)<\/p>\n\n<p>BONUS (KHUSUS PEMBELIAN JAM TANGAN)<\/p>\n\n<p>-Harga yg tertera sudah termasuk :<\/p>\n\n<p>*Jam<\/p>\n\n<p>*Box<\/p>\n\n<p>*Batre tambahan<\/p>\n\n<p>SETIAP PACKINGAN ANDA AKAN DI BUNGKUS RAPIH DENGAN BUBLE WRAP &amp; 2 Kali PROSES CEK (Sehingga sangat minim barang cacat / rusak :D )<\/p>\n\n<p>jadwal pengriman :<\/p>\n\n<p>-gojek akan di pick up jam 10.00 pagi - 5.00 sore<\/p>\n\n<p>-Jne di kirim jam 8 malem ke jne<\/p>\n\n<p>-jika anda mw ikut pengiriman hari yg sama (maximal transaksi jam 5 sore)<\/p>\n\n<p>-resi di input jam 12 malem ke atas<\/p>\n\n<p>(tidak perlu tanyakan mana resi , Karena klo sudah ada pasti segera kami input :D )<\/p>\n\n<p>*SANGAT TIDAK DI SARANKAN DI BAWA KE AIR<\/p>\n\n<p>-Nama nya KW sebagus apapun TETAP KW<\/p>\n\n<p>(TIDAK ADA RETUR DENGAN ALESAN MATI KARENA KENA AIR)<\/p>\n\n<p>MEMBELI=SETUJU<\/p>\n\n<p>Untuk dropship jangan lupa cantum kan nama dan no hp pengirim yah :)<\/p>\n\n<p>ada yg lbih murah?BANYAK!!<\/p>\n\n<p>TAPI KAMI BERANI DI ADU KUALITAS NYA :D<\/p>\n\n<p>RAGU???<\/p>\n\n<p>Baca Feedback kami dengan 100% Feedback Lebih dari 8500++ Transaksi<\/p>\n\n<p>(dan akan terus bertambah)<\/p>\n\n<p>Sehingga bisa menjaga EMBLEM LAPAK TERBAIK dan Gelar GOOD SELLER :D<\/p>\n\n<p>happy shooping gan :D<\/p>\n","seller_alert":null,"for_sale":true,"state_description":[],"premium_account":true,"top_merchant":true,"last_order_schedule":{},"seller_voucher":{},"waiting_payment":-1,"sold_count":0,"specs":{"Brand":"Casio"},"force_insurance":false,"free_shipping_coverage":[],"labels":[{"id":1592835,"name":"G-Shock Casio","slug":"g-shock-casio","description":null}],"tag_pages":[{"id":5678,"name":"Jam Tangan Casio Pria","has_landing_page":true},{"id":5618,"name":"Jam Tangan G Shock Pria","has_landing_page":true},{"id":9398,"name":"Jam Tangan Sevenfriday","has_landing_page":true}],"id":"88gdxx","url":"https://www.bukalapak.com/p/fashion-pria/jam-tangan-171/88gdxx-jual-jam-tangan-g-shock-casio-ga1000-edisi-pilot-navy-seal-digital-pria-anak-anak-fashion-murah","name":"Jam Tangan G Shock Casio GA1000 Edisi PILOT NAVY SEAL . digital pria & anak anak fashion murah ","active":true,"city":"Jakarta Utara","province":"DKI Jakarta","weight":300,"image_ids":[1211213711,1211213761,1211213801,1211213821],"images":["https://s1.bukalapak.com/img/1173121121/large/GA1000_30.JPG","https://s1.bukalapak.com/img/1673121121/large/GA1000_30_SIDE.JPG","https://s1.bukalapak.com/img/1083121121/large/GA1000_30_HAND.JPG","https://s1.bukalapak.com/img/1283121121/large/IMG_9123.JPG"],"small_images":["https://s1.bukalapak.com/img/1173121121/small/GA1000_30.JPG","https://s1.bukalapak.com/img/1673121121/small/GA1000_30_SIDE.JPG","https://s1.bukalapak.com/img/1083121121/small/GA1000_30_HAND.JPG","https://s1.bukalapak.com/img/1283121121/small/IMG_9123.JPG"],"desc":"TOLONG Membaca deskripsi ini sampai habis yah gan ??<br/>Di karenakan ada BONUS yg kami bagikan ??<br/><br/>Kualitas : Grade Original /Kw Super /Grade A++ / Mirror 1:1 ( Kami MENJAMIN BUKAN ABAL-ABAL)<br/><br/><br/>Semua fitur BERFUNGSI : <br/>-Tanggal <br/>-Jam<br/>-Hari <br/>-Detik<br/>-Stopwatch<br/>-Alarm <br/>-Lampu <br/>-Digital <br/>-Analog<br/><br/><br/>- Untuk Foto barang 100000% RealPic / Foto asli (GAK NYOMOT GAMBAR ORG/GOOGLE!!)<br/>- Foto Jam di pake di tangan?liat foto berikut nya yah ?? <br/>- Setiap packing an akan di bungkus dengan buble wrap , sehingga aman sampai tujuan ??<br/><br/><br/>**************** BONUS********************<br/>SETIAP pembelian sudah TERMASUK :<br/>- Box Gshock sesuai foto <br/>- BONUS BATRE SONY ORIGINAL <br/><br/><br/>Masih Ragu?tekan tombol Feedback kami <br/>untuk saat ini kami masih bisa menjaga konsistensi toko kami dengan 100% feedback dari 10.000++ transaksi lebih ??<br/><br/>Happy Shooping - SFSstore","condition":"new","stock":99,"favorited":false,"created_at":"2017-05-06T21:13:48.000+07:00","updated_at":"2017-05-23T19:44:33.000+07:00","product_sin":[],"rating":{"average_rate":0,"user_count":0},"current_variant_name":"","current_product_sku_id":490107186,"product_sku":[],"options":[],"interest_count":5,"last_relist_at":"2017-05-19T13:51:38.000+07:00","view_count":178},"original_price":120000,"discount_price":120000}]
         * installment : []
         * agent_commission : 0
         */

        private SellerBean seller;
        private int agent_commission;
        private List<ItemsBean> items;
        private List<InstallmentBeann> installment;

        public SellerBean getSeller() {
            return seller;
        }

        public void setSeller(SellerBean seller) {
            this.seller = seller;
        }

        public static class SellerBean implements Parcelable{
            /**
             * id : 1251687
             * username : sfswendy
             * name : Ninik Wijaya
             * gender : Laki-laki
             * avatar : https://s0.bukalapak.com/avt/5867761/medium/SFSSTORE.jpg
             * level : Good Seller
             * level_badge_url : https://www.bukalapak.com/images/badge/seller/xhdpi/level-6.png
             * lapak_name : Jaket Adidas windbreaker dan waterproof grade original
             * lapak_desc : SUPPLIER Jaket Adidas dan Nike WATERPROOF |
             SUPPLIER Jam Tangan CASIO G SHOCK &amp; -SEVENFRIDAY
             * lapak_header : https://s2.bukalapak.com/hdr/7329721/normal/IMG_4533.JPG
             * last_login : 2017-05-25T07:10:00.000+07:00
             * joined_at : 2014-09-08T14:51:45.000+07:00
             * verified_user : false
             * official : false
             * store_closed : false
             * schedule_close_store : false
             * close_date : 2016-12-11T17:23:23.000+07:00
             * reopen_date : null
             * close_reason : Toko kami tutup sementara
             dan akan kembali buka pada tanggal
             14/11/16 (Hari Rabu)
             Thx
             -SFS-
             * delivery_time : 17 jam
             * rejection : {"rejected":0,"recent_trans":100}
             * address : {"province":"DKI Jakarta","city":"Jakarta Utara"}
             * subscriber_amount : 1756
             * last_order_schedule : {}
             * premium_user : true
             * top_merchant : true
             * seller_voucher : {}
             * is_seller : true
             * feedbacks : {"positive":9533,"negative":0}
             */

            private int id;
            private String username;
            private String name;
            private String gender;
            private String avatar;
            private String level;
            private String level_badge_url;
            private String lapak_name;
            private String lapak_desc;
            private String lapak_header;
            private String last_login;
            private String joined_at;
            private boolean verified_user;
            private boolean official;
            private boolean store_closed;
            private boolean schedule_close_store;
            private String close_date;
            private String reopen_date;
            private String close_reason;
            private String delivery_time;
            private RejectionBean rejection; //ok
            private AddressBean address; //ok
            private int subscriber_amount;
            //            private LastOrderScheduleBean last_order_schedule;
            private boolean premium_user;
            private boolean top_merchant;
            //            private SellerVoucherBean seller_voucher;
            private boolean is_seller;
            private FeedbacksBean feedbacks; //ok

            protected SellerBean(Parcel in) {
                id = in.readInt();
                username = in.readString();
                name = in.readString();
                gender = in.readString();
                avatar = in.readString();
                level = in.readString();
                level_badge_url = in.readString();
                lapak_name = in.readString();
                lapak_desc = in.readString();
                lapak_header = in.readString();
                last_login = in.readString();
                joined_at = in.readString();
                verified_user = in.readByte() != 0;
                official = in.readByte() != 0;
                store_closed = in.readByte() != 0;
                schedule_close_store = in.readByte() != 0;
                close_date = in.readString();
                reopen_date = in.readString();
                close_reason = in.readString();
                delivery_time = in.readString();
                rejection = in.readParcelable(RejectionBean.class.getClassLoader());
                address = in.readParcelable(AddressBean.class.getClassLoader());
                subscriber_amount = in.readInt();
                premium_user = in.readByte() != 0;
                top_merchant = in.readByte() != 0;
                is_seller = in.readByte() != 0;
                feedbacks = in.readParcelable(FeedbacksBean.class.getClassLoader());
            }

            public static final Creator<SellerBean> CREATOR = new Creator<SellerBean>() {
                @Override
                public SellerBean createFromParcel(Parcel in) {
                    return new SellerBean(in);
                }

                @Override
                public SellerBean[] newArray(int size) {
                    return new SellerBean[size];
                }
            };

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getLevel_badge_url() {
                return level_badge_url;
            }

            public void setLevel_badge_url(String level_badge_url) {
                this.level_badge_url = level_badge_url;
            }

            public String getLapak_name() {
                return lapak_name;
            }

            public void setLapak_name(String lapak_name) {
                this.lapak_name = lapak_name;
            }

            public String getLapak_desc() {
                return lapak_desc;
            }

            public void setLapak_desc(String lapak_desc) {
                this.lapak_desc = lapak_desc;
            }

            public String getLapak_header() {
                return lapak_header;
            }

            public void setLapak_header(String lapak_header) {
                this.lapak_header = lapak_header;
            }

            public String getLast_login() {
                return last_login;
            }

            public void setLast_login(String last_login) {
                this.last_login = last_login;
            }

            public String getJoined_at() {
                return joined_at;
            }

            public void setJoined_at(String joined_at) {
                this.joined_at = joined_at;
            }

            public boolean isVerified_user() {
                return verified_user;
            }

            public void setVerified_user(boolean verified_user) {
                this.verified_user = verified_user;
            }

            public boolean isOfficial() {
                return official;
            }

            public void setOfficial(boolean official) {
                this.official = official;
            }

            public boolean isStore_closed() {
                return store_closed;
            }

            public void setStore_closed(boolean store_closed) {
                this.store_closed = store_closed;
            }

            public boolean isSchedule_close_store() {
                return schedule_close_store;
            }

            public void setSchedule_close_store(boolean schedule_close_store) {
                this.schedule_close_store = schedule_close_store;
            }

            public String getClose_date() {
                return close_date;
            }

            public void setClose_date(String close_date) {
                this.close_date = close_date;
            }

            public String getReopen_date() {
                return reopen_date;
            }

            public void setReopen_date(String reopen_date) {
                this.reopen_date = reopen_date;
            }

            public String getClose_reason() {
                return close_reason;
            }

            public void setClose_reason(String close_reason) {
                this.close_reason = close_reason;
            }

            public String getDelivery_time() {
                return delivery_time;
            }

            public void setDelivery_time(String delivery_time) {
                this.delivery_time = delivery_time;
            }

            public RejectionBean getRejection() {
                return rejection;
            }

            public void setRejection(RejectionBean rejection) {
                this.rejection = rejection;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(id);
                parcel.writeString(username);
                parcel.writeString(name);
                parcel.writeString(gender);
                parcel.writeString(avatar);
                parcel.writeString(level);
                parcel.writeString(level_badge_url);
                parcel.writeString(lapak_name);
                parcel.writeString(lapak_desc);
                parcel.writeString(lapak_header);
                parcel.writeString(last_login);
                parcel.writeString(joined_at);
                parcel.writeByte((byte) (verified_user ? 1 : 0));
                parcel.writeByte((byte) (official ? 1 : 0));
                parcel.writeByte((byte) (store_closed ? 1 : 0));
                parcel.writeByte((byte) (schedule_close_store ? 1 : 0));
                parcel.writeString(close_date);
                parcel.writeString(reopen_date);
                parcel.writeString(close_reason);
                parcel.writeString(delivery_time);
                parcel.writeParcelable(rejection, i);
                parcel.writeParcelable(address, i);
                parcel.writeInt(subscriber_amount);
                parcel.writeByte((byte) (premium_user ? 1 : 0));
                parcel.writeByte((byte) (top_merchant ? 1 : 0));
                parcel.writeByte((byte) (is_seller ? 1 : 0));
                parcel.writeParcelable(feedbacks, i);
            }

            public static class RejectionBean  implements Parcelable{
                /**
                 * rejected : 0
                 * recent_trans : 100
                 */

                private int rejected;
                private int recent_trans;

                protected RejectionBean(Parcel in) {
                    rejected = in.readInt();
                    recent_trans = in.readInt();
                }

                public static final Creator<RejectionBean> CREATOR = new Creator<RejectionBean>() {
                    @Override
                    public RejectionBean createFromParcel(Parcel in) {
                        return new RejectionBean(in);
                    }

                    @Override
                    public RejectionBean[] newArray(int size) {
                        return new RejectionBean[size];
                    }
                };

                public int getRejected() {
                    return rejected;
                }

                public void setRejected(int rejected) {
                    this.rejected = rejected;
                }

                public int getRecent_trans() {
                    return recent_trans;
                }

                public void setRecent_trans(int recent_trans) {
                    this.recent_trans = recent_trans;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(rejected);
                    parcel.writeInt(recent_trans);
                }
            }

            public AddressBean getAddress() {
                return address;
            }

            public void setAddress(AddressBean address) {
                this.address = address;
            }

            public static class AddressBean implements Parcelable{
                String province;
                String city;

                public AddressBean() {
                }

                protected AddressBean(Parcel in) {
                    province = in.readString();
                    city = in.readString();
                }

                public static final Creator<AddressBean> CREATOR = new Creator<AddressBean>() {
                    @Override
                    public AddressBean createFromParcel(Parcel in) {
                        return new AddressBean(in);
                    }

                    @Override
                    public AddressBean[] newArray(int size) {
                        return new AddressBean[size];
                    }
                };

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeString(province);
                    parcel.writeString(city);
                }
            }

            public int getSubscriber_amount() {
                return subscriber_amount;
            }

            public void setSubscriber_amount(int subscriber_amount) {
                this.subscriber_amount = subscriber_amount;
            }

//            public LastOrderScheduleBean getLast_order_schedule() {
//                return last_order_schedule;
//            }
//
//            public void setLast_order_schedule(LastOrderScheduleBean last_order_schedule) {
//                this.last_order_schedule = last_order_schedule;
//            }

            public boolean isPremium_user() {
                return premium_user;
            }

            public void setPremium_user(boolean premium_user) {
                this.premium_user = premium_user;
            }

            public boolean isTop_merchant() {
                return top_merchant;
            }

            public void setTop_merchant(boolean top_merchant) {
                this.top_merchant = top_merchant;
            }

//            public SellerVoucherBean getSeller_voucher() {
//                return seller_voucher;
//            }
//
//            public void setSeller_voucher(SellerVoucherBean seller_voucher) {
//                this.seller_voucher = seller_voucher;
//            }

            public boolean isIs_seller() {
                return is_seller;
            }

            public void setIs_seller(boolean is_seller) {
                this.is_seller = is_seller;
            }

            public FeedbacksBean getFeedbacks() {
                return feedbacks;
            }

            public void setFeedbacks(FeedbacksBean feedbacks) {
                this.feedbacks = feedbacks;
            }

            public static class FeedbacksBean implements Parcelable{
                /**
                 * positive : 9533
                 * negative : 0
                 */

                private int positive;
                private int negative;

                public FeedbacksBean() {
                }

                protected FeedbacksBean(Parcel in) {
                    positive = in.readInt();
                    negative = in.readInt();
                }

                public static final Creator<FeedbacksBean> CREATOR = new Creator<FeedbacksBean>() {
                    @Override
                    public FeedbacksBean createFromParcel(Parcel in) {
                        return new FeedbacksBean(in);
                    }

                    @Override
                    public FeedbacksBean[] newArray(int size) {
                        return new FeedbacksBean[size];
                    }
                };

                public int getPositive() {
                    return positive;
                }

                public void setPositive(int positive) {
                    this.positive = positive;
                }

                public int getNegative() {
                    return negative;
                }

                public void setNegative(int negative) {
                    this.negative = negative;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel parcel, int i) {
                    parcel.writeInt(positive);
                    parcel.writeInt(negative);
                }
            }





//            public static class SellerVoucherBean {
//            }


        }

        public int getAgent_commission() {
            return agent_commission;
        }

        public void setAgent_commission(int agent_commission) {
            this.agent_commission = agent_commission;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public List<InstallmentBeann> getInstallment() {
            return installment;
        }

        public void setInstallment(List<InstallmentBeann> installment) {
            this.installment = installment;

        }
        public static class InstallmentBeann implements Parcelable {
            private String bank_issuer;
            private int[] terms;

            public InstallmentBeann() {
            }

            protected InstallmentBeann(Parcel in) {
                bank_issuer = in.readString();
                terms = in.createIntArray();
            }

            public static final Creator<InstallmentBeann> CREATOR = new Creator<InstallmentBeann>() {
                @Override
                public InstallmentBeann createFromParcel(Parcel in) {
                    return new InstallmentBeann(in);
                }

                @Override
                public InstallmentBeann[] newArray(int size) {
                    return new InstallmentBeann[size];
                }
            };

            public String getBank_issuer() {
                return bank_issuer;
            }

            public void setBank_issuer(String bank_issuer) {
                this.bank_issuer = bank_issuer;
            }

            public int[] getTerms() {
                return terms;
            }

            public void setTerms(int[] terms) {
                this.terms = terms;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(bank_issuer);
                parcel.writeIntArray(terms);
            }
        }



        public static class ItemsBean {
            /**
             * id : 697916656
             * name : MODEL PALING LAKU ... G Shock Casio GA400 Gmix Full Red Merah dual time Jam Tangan Pria Termurah
             * quantity : 1
             * price : 120000
             * stock : 92
             * message : null
             * product : {"deal_info":{},"deal_request_state":"can request","price":120000,"category_id":171,"category":"Jam Tangan","category_structure":["Fashion Pria","Jam Tangan"],"courier":["GO-JEK GO-SEND","JNE REG","JNE YES"],"seller_username":"sfswendy","seller_name":"Ninik Wijaya","seller_id":1251687,"seller_avatar":"https://s0.bukalapak.com/avt/5867761/medium/SFSSTORE.jpg","seller_level":"Good Seller","seller_level_badge_url":"https://www.bukalapak.com/images/badge/seller/xhdpi/level-6.png","seller_delivery_time":"17 jam","seller_positive_feedback":9533,"seller_negative_feedback":0,"seller_term_condition":"<p>Barang yg kami jual di jamin PREMIUM QUALITY!!!<\/p>\n\n<p>apapun penyebut an nya ; Grade ORIGINAL , KW Super , Clone , Mirror 1:1 (DIJAMIN BUKAN ABAL2!!!)<\/p>\n\n<p>BONUS (KHUSUS PEMBELIAN JAM TANGAN)<\/p>\n\n<p>-Harga yg tertera sudah termasuk :<\/p>\n\n<p>*Jam<\/p>\n\n<p>*Box<\/p>\n\n<p>*Batre tambahan<\/p>\n\n<p>SETIAP PACKINGAN ANDA AKAN DI BUNGKUS RAPIH DENGAN BUBLE WRAP &amp; 2 Kali PROSES CEK (Sehingga sangat minim barang cacat / rusak :D )<\/p>\n\n<p>jadwal pengriman :<\/p>\n\n<p>-gojek akan di pick up jam 10.00 pagi - 5.00 sore<\/p>\n\n<p>-Jne di kirim jam 8 malem ke jne<\/p>\n\n<p>-jika anda mw ikut pengiriman hari yg sama (maximal transaksi jam 5 sore)<\/p>\n\n<p>-resi di input jam 12 malem ke atas<\/p>\n\n<p>(tidak perlu tanyakan mana resi , Karena klo sudah ada pasti segera kami input :D )<\/p>\n\n<p>*SANGAT TIDAK DI SARANKAN DI BAWA KE AIR<\/p>\n\n<p>-Nama nya KW sebagus apapun TETAP KW<\/p>\n\n<p>(TIDAK ADA RETUR DENGAN ALESAN MATI KARENA KENA AIR)<\/p>\n\n<p>MEMBELI=SETUJU<\/p>\n\n<p>Untuk dropship jangan lupa cantum kan nama dan no hp pengirim yah :)<\/p>\n\n<p>ada yg lbih murah?BANYAK!!<\/p>\n\n<p>TAPI KAMI BERANI DI ADU KUALITAS NYA :D<\/p>\n\n<p>RAGU???<\/p>\n\n<p>Baca Feedback kami dengan 100% Feedback Lebih dari 8500++ Transaksi<\/p>\n\n<p>(dan akan terus bertambah)<\/p>\n\n<p>Sehingga bisa menjaga EMBLEM LAPAK TERBAIK dan Gelar GOOD SELLER :D<\/p>\n\n<p>happy shooping gan :D<\/p>\n","seller_alert":null,"for_sale":true,"state_description":[],"premium_account":true,"top_merchant":true,"last_order_schedule":{},"seller_voucher":{},"waiting_payment":-10,"sold_count":6,"specs":{"Brand":"Casio"},"force_insurance":false,"free_shipping_coverage":[],"labels":[{"id":1592835,"name":"G-Shock Casio","slug":"g-shock-casio","description":null}],"tag_pages":[{"id":5678,"name":"Jam Tangan Casio Pria","has_landing_page":true},{"id":5618,"name":"Jam Tangan G Shock Pria","has_landing_page":true},{"id":9398,"name":"Jam Tangan Sevenfriday","has_landing_page":true}],"id":"8734s1","url":"https://www.bukalapak.com/p/fashion-pria/jam-tangan-171/8734s1-jual-model-paling-laku-g-shock-casio-ga400-gmix-full-red-merah-dual-time-jam-tangan-pria-termurah","name":"MODEL PALING LAKU ... G Shock Casio GA400 Gmix Full Red Merah dual time Jam Tangan Pria Termurah","active":true,"city":"Jakarta Utara","province":"DKI Jakarta","weight":300,"image_ids":[1204806601,1204806571,1204806606,1204806611],"images":["https://s1.bukalapak.com/img/1066084021/large/GA400_2___Copy.JPG","https://s1.bukalapak.com/img/1756084021/large/GA400_2.JPG","https://s1.bukalapak.com/img/6066084021/large/GA400_2_HAND___Copy.JPG","https://s1.bukalapak.com/img/1166084021/large/IMG_9123.JPG"],"small_images":["https://s1.bukalapak.com/img/1066084021/small/GA400_2___Copy.JPG","https://s1.bukalapak.com/img/1756084021/small/GA400_2.JPG","https://s1.bukalapak.com/img/6066084021/small/GA400_2_HAND___Copy.JPG","https://s1.bukalapak.com/img/1166084021/small/IMG_9123.JPG"],"desc":"TOLONG Membaca deskripsi ini sampai habis yah gan ??<br/>Di karenakan ada BONUS yg kami bagikan ??<br/><br/>Kualitas : Grade Original /Kw Super /Grade A++ / Mirror 1:1 ( Kami MENJAMIN BUKAN ABAL-ABAL)<br/><br/><br/>Semua fitur BERFUNGSI : <br/>-Tanggal <br/>-Jam<br/>-Hari <br/>-Detik<br/>-Stopwatch<br/>-Alarm <br/>-Lampu <br/>-Digital <br/>-Analog<br/><br/><br/>- Untuk Foto barang 100000% RealPic / Foto asli (GAK NYOMOT GAMBAR ORG/GOOGLE!!)<br/>- Foto Jam di pake di tangan?liat foto berikut nya yah ?? <br/>- Setiap packing an akan di bungkus dengan buble wrap , sehingga aman sampai tujuan ??<br/><br/><br/>**************** BONUS********************<br/>SETIAP pembelian sudah TERMASUK :<br/>- Box Gshock sesuai foto <br/>- BONUS BATRE SONY ORIGINAL <br/><br/><br/>Masih Ragu?tekan tombol Feedback kami <br/>untuk saat ini kami masih bisa menjaga konsistensi toko kami dengan 100% feedback dari 10.000++ transaksi lebih ??<br/><br/>Happy Shooping - SFSstore ??","condition":"new","stock":92,"favorited":false,"created_at":"2017-05-03T22:49:39.000+07:00","updated_at":"2017-05-25T05:46:54.000+07:00","product_sin":[],"rating":{"average_rate":"3.7","user_count":3},"current_variant_name":"","current_product_sku_id":487803031,"product_sku":[],"options":[],"interest_count":32,"last_relist_at":"2017-05-23T10:34:32.000+07:00","view_count":1085}
             * original_price : 120000
             * discount_price : 120000
             */

            private int id;
            private String name;
            private int quantity;
            private int price;
            private int stock;
            private String message;
            private ProductBean product;
            private int original_price;
            private int discount_price;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public ProductBean getProduct() {
                return product;
            }

            public void setProduct(ProductBean product) {
                this.product = product;
            }

            public int getOriginal_price() {
                return original_price;
            }

            public void setOriginal_price(int original_price) {
                this.original_price = original_price;
            }

            public int getDiscount_price() {
                return discount_price;
            }

            public void setDiscount_price(int discount_price) {
                this.discount_price = discount_price;
            }

            public static class ProductBean {


                private DealInfoBean deal_info; //ok
                private String deal_request_state;
                private int price;
                private int category_id;
                private String category;
                private List<String> category_structure;
                private List<String> courier;
                private String seller_username;
                private String seller_name;
                private int seller_id;
                private String seller_avatar;
                private String seller_level;
                private String seller_level_badge_url;
                private String seller_delivery_time;
                private int seller_positive_feedback;
                private int seller_negative_feedback;
                private String seller_term_condition;
//                private Object seller_alert;
                private boolean for_sale;
                private boolean premium_account;
                private boolean top_merchant;
//                private LastOrderScheduleBeanX last_order_schedule;
//                private SellerVoucherBeanX seller_voucher;
                private int waiting_payment;
                private int sold_count;
                private SpecsBean specs; //ok
                private boolean force_insurance;
                private String id;
                private String url;
                private String name;
                private boolean active;
                private String city;
                private String province;
                private int weight;
                private String desc;
                private String condition;
                private int stock;
                private boolean favorited;
                private String created_at;
                private String updated_at;
                private RatingBean rating; //ok
                private String current_variant_name;
                private int current_product_sku_id;
                private int interest_count;
                private String last_relist_at;
                private int view_count;


//                private List<?> state_description;
//                private List<?> free_shipping_coverage;
                private List<LabelsBean> labels;
                private List<TagPagesBean> tag_pages;
                private List<Long> image_ids;
                private List<String> images;
                private List<String> small_images;
//                private List<?> product_sin;
//                private List<?> product_sku;
//                private List<?> options;

                public DealInfoBean getDeal_info() {
                    return deal_info;
                }

                public void setDeal_info(DealInfoBean deal_info) {
                    this.deal_info = deal_info;
                }

                public static class DealInfoBean implements Parcelable{
                    public DealInfoBean() {
                    }

                    long original_price;
                    long discount_price;
                    int discount_percentage;
                    String discount_date;
                    String state;

                    protected DealInfoBean(Parcel in) {
                        original_price = in.readLong();
                        discount_price = in.readLong();
                        discount_percentage = in.readInt();
                        discount_date = in.readString();
                        state = in.readString();
                    }

                    public static final Creator<DealInfoBean> CREATOR = new Creator<DealInfoBean>() {
                        @Override
                        public DealInfoBean createFromParcel(Parcel in) {
                            return new DealInfoBean(in);
                        }

                        @Override
                        public DealInfoBean[] newArray(int size) {
                            return new DealInfoBean[size];
                        }
                    };

                    public long getOriginal_price() {
                        return original_price;
                    }

                    public void setOriginal_price(long original_price) {
                        this.original_price = original_price;
                    }

                    public long getDiscount_price() {
                        return discount_price;
                    }

                    public void setDiscount_price(long discount_price) {
                        this.discount_price = discount_price;
                    }

                    public int getDiscount_percentage() {
                        return discount_percentage;
                    }

                    public void setDiscount_percentage(int discount_percentage) {
                        this.discount_percentage = discount_percentage;
                    }

                    public String getDiscount_date() {
                        return discount_date;
                    }

                    public void setDiscount_date(String discount_date) {
                        this.discount_date = discount_date;
                    }

                    public String getState() {
                        return state;
                    }

                    public void setState(String state) {
                        this.state = state;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeLong(original_price);
                        parcel.writeLong(discount_price);
                        parcel.writeInt(discount_percentage);
                        parcel.writeString(discount_date);
                        parcel.writeString(state);
                    }
                }

                public String getDeal_request_state() {
                    return deal_request_state;
                }

                public void setDeal_request_state(String deal_request_state) {
                    this.deal_request_state = deal_request_state;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public List<String> getCategory_structure() {
                    return category_structure;
                }

                public void setCategory_structure(List<String> category_structure) {
                    this.category_structure = category_structure;
                }

                public String getSeller_username() {
                    return seller_username;
                }

                public void setSeller_username(String seller_username) {
                    this.seller_username = seller_username;
                }

                public String getSeller_name() {
                    return seller_name;
                }

                public void setSeller_name(String seller_name) {
                    this.seller_name = seller_name;
                }

                public int getSeller_id() {
                    return seller_id;
                }

                public void setSeller_id(int seller_id) {
                    this.seller_id = seller_id;
                }

                public String getSeller_avatar() {
                    return seller_avatar;
                }

                public void setSeller_avatar(String seller_avatar) {
                    this.seller_avatar = seller_avatar;
                }

                public String getSeller_level() {
                    return seller_level;
                }

                public void setSeller_level(String seller_level) {
                    this.seller_level = seller_level;
                }

                public String getSeller_level_badge_url() {
                    return seller_level_badge_url;
                }

                public void setSeller_level_badge_url(String seller_level_badge_url) {
                    this.seller_level_badge_url = seller_level_badge_url;
                }

                public String getSeller_delivery_time() {
                    return seller_delivery_time;
                }

                public void setSeller_delivery_time(String seller_delivery_time) {
                    this.seller_delivery_time = seller_delivery_time;
                }

                public int getSeller_positive_feedback() {
                    return seller_positive_feedback;
                }

                public void setSeller_positive_feedback(int seller_positive_feedback) {
                    this.seller_positive_feedback = seller_positive_feedback;
                }

                public int getSeller_negative_feedback() {
                    return seller_negative_feedback;
                }

                public void setSeller_negative_feedback(int seller_negative_feedback) {
                    this.seller_negative_feedback = seller_negative_feedback;
                }

                public String getSeller_term_condition() {
                    return seller_term_condition;
                }

                public void setSeller_term_condition(String seller_term_condition) {
                    this.seller_term_condition = seller_term_condition;
                }

//                public Object getSeller_alert() {
//                    return seller_alert;
//                }
//
//                public void setSeller_alert(Object seller_alert) {
//                    this.seller_alert = seller_alert;
//                }

                public boolean isFor_sale() {
                    return for_sale;
                }

                public void setFor_sale(boolean for_sale) {
                    this.for_sale = for_sale;
                }

                public boolean isPremium_account() {
                    return premium_account;
                }

                public void setPremium_account(boolean premium_account) {
                    this.premium_account = premium_account;
                }

                public boolean isTop_merchant() {
                    return top_merchant;
                }

                public void setTop_merchant(boolean top_merchant) {
                    this.top_merchant = top_merchant;
                }

//                public LastOrderScheduleBeanX getLast_order_schedule() {
//                    return last_order_schedule;
//                }
//
//                public void setLast_order_schedule(LastOrderScheduleBeanX last_order_schedule) {
//                    this.last_order_schedule = last_order_schedule;
//                }

//                public SellerVoucherBeanX getSeller_voucher() {
//                    return seller_voucher;
//                }
//
//                public void setSeller_voucher(SellerVoucherBeanX seller_voucher) {
//                    this.seller_voucher = seller_voucher;
//                }

                public int getWaiting_payment() {
                    return waiting_payment;
                }

                public void setWaiting_payment(int waiting_payment) {
                    this.waiting_payment = waiting_payment;
                }

                public int getSold_count() {
                    return sold_count;
                }

                public void setSold_count(int sold_count) {
                    this.sold_count = sold_count;
                }

                public SpecsBean getSpecs() {
                    return specs;
                }

                public void setSpecs(SpecsBean specs) {
                    this.specs = specs;
                }

                public static class SpecsBean implements Parcelable{
                    public SpecsBean() {
                    }

                    /**
                     * Brand : Casio
                     */


                    private String Brand;

                    protected SpecsBean(Parcel in) {
                        Brand = in.readString();
                    }

                    public static final Creator<SpecsBean> CREATOR = new Creator<SpecsBean>() {
                        @Override
                        public SpecsBean createFromParcel(Parcel in) {
                            return new SpecsBean(in);
                        }

                        @Override
                        public SpecsBean[] newArray(int size) {
                            return new SpecsBean[size];
                        }
                    };

                    public String getBrand() {
                        return Brand;
                    }

                    public void setBrand(String Brand) {
                        this.Brand = Brand;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeString(Brand);
                    }
                }

                public boolean isForce_insurance() {
                    return force_insurance;
                }

                public void setForce_insurance(boolean force_insurance) {
                    this.force_insurance = force_insurance;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public boolean isActive() {
                    return active;
                }

                public void setActive(boolean active) {
                    this.active = active;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public int getWeight() {
                    return weight;
                }

                public void setWeight(int weight) {
                    this.weight = weight;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getCondition() {
                    return condition;
                }

                public void setCondition(String condition) {
                    this.condition = condition;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }

                public boolean isFavorited() {
                    return favorited;
                }

                public void setFavorited(boolean favorited) {
                    this.favorited = favorited;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }

                public RatingBean getRating() {
                    return rating;
                }

                public void setRating(RatingBean rating) {
                    this.rating = rating;
                }

                public static class RatingBean implements Parcelable{
                    public RatingBean() {
                    }

                    /**

                     * average_rate : 3.7
                     * user_count : 3
                     */

                    private String average_rate;
                    private int user_count;

                    protected RatingBean(Parcel in) {
                        average_rate = in.readString();
                        user_count = in.readInt();
                    }

                    public static final Creator<RatingBean> CREATOR = new Creator<RatingBean>() {
                        @Override
                        public RatingBean createFromParcel(Parcel in) {
                            return new RatingBean(in);
                        }

                        @Override
                        public RatingBean[] newArray(int size) {
                            return new RatingBean[size];
                        }
                    };

                    public String getAverage_rate() {
                        return average_rate;
                    }

                    public void setAverage_rate(String average_rate) {
                        this.average_rate = average_rate;
                    }

                    public int getUser_count() {
                        return user_count;
                    }

                    public void setUser_count(int user_count) {
                        this.user_count = user_count;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeString(average_rate);
                        parcel.writeInt(user_count);
                    }
                }

                public String getCurrent_variant_name() {
                    return current_variant_name;
                }

                public void setCurrent_variant_name(String current_variant_name) {
                    this.current_variant_name = current_variant_name;
                }

                public int getCurrent_product_sku_id() {
                    return current_product_sku_id;
                }

                public void setCurrent_product_sku_id(int current_product_sku_id) {
                    this.current_product_sku_id = current_product_sku_id;
                }

                public int getInterest_count() {
                    return interest_count;
                }

                public void setInterest_count(int interest_count) {
                    this.interest_count = interest_count;
                }

                public String getLast_relist_at() {
                    return last_relist_at;
                }

                public void setLast_relist_at(String last_relist_at) {
                    this.last_relist_at = last_relist_at;
                }

                public int getView_count() {
                    return view_count;
                }

                public void setView_count(int view_count) {
                    this.view_count = view_count;
                }



                public List<String> getCourier() {
                    return courier;
                }

                public void setCourier(List<String> courier) {
                    this.courier = courier;
                }

//                public List<?> getState_description() {
//                    return state_description;
//                }
//
//                public void setState_description(List<?> state_description) {
//                    this.state_description = state_description;
//                }

//                public List<?> getFree_shipping_coverage() {
//                    return free_shipping_coverage;
//                }
//
//                public void setFree_shipping_coverage(List<?> free_shipping_coverage) {
//                    this.free_shipping_coverage = free_shipping_coverage;
//                }

                public List<LabelsBean> getLabels() {
                    return labels;
                }

                public void setLabels(List<LabelsBean> labels) {
                    this.labels = labels;
                }

                public static class LabelsBean implements Parcelable{
                    /**
                     * id : 1592835
                     * name : G-Shock Casio
                     * slug : g-shock-casio
                     * description : null
                     */

                    private int id;
                    private String name;
                    private String slug;
                    private String description;

                    protected LabelsBean(Parcel in) {
                        id = in.readInt();
                        name = in.readString();
                        slug = in.readString();
                        description = in.readString();
                    }

                    public static final Creator<LabelsBean> CREATOR = new Creator<LabelsBean>() {
                        @Override
                        public LabelsBean createFromParcel(Parcel in) {
                            return new LabelsBean(in);
                        }

                        @Override
                        public LabelsBean[] newArray(int size) {
                            return new LabelsBean[size];
                        }
                    };

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSlug() {
                        return slug;
                    }

                    public void setSlug(String slug) {
                        this.slug = slug;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeInt(id);
                        parcel.writeString(name);
                        parcel.writeString(slug);
                        parcel.writeString(description);
                    }
                }

                public List<TagPagesBean> getTag_pages() {
                    return tag_pages;
                }

                public void setTag_pages(List<TagPagesBean> tag_pages) {
                    this.tag_pages = tag_pages;
                }

                public static class TagPagesBean implements Parcelable{
                    /**
                     * id : 5678
                     * name : Jam Tangan Casio Pria
                     * has_landing_page : true
                     */

                    private int id;
                    private String name;
                    private boolean has_landing_page;

                    public TagPagesBean() {

                    }

                    protected TagPagesBean(Parcel in) {
                        id = in.readInt();
                        name = in.readString();
                        has_landing_page = in.readByte() != 0;
                    }

                    public static final Creator<TagPagesBean> CREATOR = new Creator<TagPagesBean>() {
                        @Override
                        public TagPagesBean createFromParcel(Parcel in) {
                            return new TagPagesBean(in);
                        }

                        @Override
                        public TagPagesBean[] newArray(int size) {
                            return new TagPagesBean[size];
                        }
                    };

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public boolean isHas_landing_page() {
                        return has_landing_page;
                    }

                    public void setHas_landing_page(boolean has_landing_page) {
                        this.has_landing_page = has_landing_page;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel parcel, int i) {
                        parcel.writeInt(id);
                        parcel.writeString(name);
                        parcel.writeByte((byte) (has_landing_page ? 1 : 0));
                    }
                }

                public List<Long> getImage_ids() {
                    return image_ids;
                }

                public void setImage_ids(List<Long> image_ids) {
                    this.image_ids = image_ids;
                }

                public List<String> getImages() {
                    return images;
                }

                public void setImages(List<String> images) {
                    this.images = images;
                }

                public List<String> getSmall_images() {
                    return small_images;
                }

                public void setSmall_images(List<String> small_images) {
                    this.small_images = small_images;
                }

//                public List<?> getProduct_sin() {
//                    return product_sin;
//                }
//
//                public void setProduct_sin(List<?> product_sin) {
//                    this.product_sin = product_sin;
//                }
//
//                public List<?> getProduct_sku() {
//                    return product_sku;
//                }
//
//                public void setProduct_sku(List<?> product_sku) {
//                    this.product_sku = product_sku;
//                }
//
//                public List<?> getOptions() {
//                    return options;
//                }
//
//                public void setOptions(List<?> options) {
//                    this.options = options;
//                }



//                public static class LastOrderScheduleBeanX {
//                }

//                public static class SellerVoucherBeanX {
//                }








            }
        }
    }


}
