package cilok.com.lapakjahit.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import cilok.com.lapakjahit.log.L;

/**
 * Created by Gilbert on 5/19/2017.
 */

public class ProductFavorite implements Parcelable{

    private String deal_request_state; //ok
    private long price; //ok
    private int category_id; //ok
    private String category; // ok
    private String[] category_structure; //ok
    private String[] courier; //ok
    private String seller_username;
    private String seller_name;
    private long seller_id;
    private String seller_avatar;
    private String seller_level;
    private String seller_level_badge_url;
    private String seller_delivery_time;
    private int seller_positive_feedback;
    private int seller_negative_feedback;
    private String seller_term_condition;
    private String seller_alert;
    private boolean for_sale;
    private String[] state_description;
    private boolean premium_account;
    private boolean top_merchant;
//"last_order_schedule"
    private String[] seller_voucher;
    private int waiting_payment;
    private int sold_count;
    private SpecsBean specs;
    private boolean force_insurance;
    //    private List<?> free_shipping_coverage; //dak pake
    private String id;
    private String url;
    private String name;
    private boolean active;
    private String city;
    private String province;
    private int weight;
    private long[] image_ids;
    private String[] images;
    private String[] small_images;
    private String desc;
    private String condition;
    private int stock;
    private boolean favorited;
    private String created_at;
    private String updated_at;
//    private List<String> product_sin;//dak pake
    private RatingBean rating;
//    private String current_variant_name;
//    private int current_product_sku_id;
//  private List<String> product_sku;
//private List<String> options;
    private List<WholesaleBean> wholesale; //biso iyo bisa idak
    private List<InstallmentBean> installment; //biso iyo bisa idak
    private String min_installment_price; //biso iyo biso idak
    private int interest_count;
    private String last_relist_at;
    private int view_count;
//    private List<LabelsBean> labels;
//    private List<TagPagesBean> tag_pages;


    public static final Creator<ProductFavorite> CREATOR = new Creator<ProductFavorite>() {
        @Override
        public ProductFavorite createFromParcel(Parcel in) {
            return new ProductFavorite(in);
        }

        @Override
        public ProductFavorite[] newArray(int size) {
            return new ProductFavorite[size];
        }
    };

    public String getDeal_request_state() {
        return deal_request_state;
    }

    public void setDeal_request_state(String deal_request_state) {
        this.deal_request_state = deal_request_state;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
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

    public String[] getCategory_structure() {
        return category_structure;
    }

    public void setCategory_structure(String[] category_structure) {
        this.category_structure = category_structure;
    }

    public String[] getCourier() {
        return courier;
    }

    public void setCourier(String[] courier) {
        this.courier = courier;
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

    public long getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(long seller_id) {
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

    public String getSeller_alert() {
        return seller_alert;
    }

    public void setSeller_alert(String seller_alert) {
        this.seller_alert = seller_alert;
    }

    public boolean isFor_sale() {
        return for_sale;
    }

    public void setFor_sale(boolean for_sale) {
        this.for_sale = for_sale;
    }

    public String[] getState_description() {
        return state_description;
    }

    public void setState_description(String[] state_description) {
        this.state_description = state_description;
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


    public String[] getSeller_voucher() {
        return seller_voucher;
    }

    public void setSeller_voucher(String[] seller_voucher) {
        this.seller_voucher = seller_voucher;
    }

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

//    public String getCurrent_variant_name() {
//        return current_variant_name;
//    }
//
//    public void setCurrent_variant_name(String current_variant_name) {
//        this.current_variant_name = current_variant_name;
//    }

//    public int getCurrent_product_sku_id() {
//        return current_product_sku_id;
//    }
//
//    public void setCurrent_product_sku_id(int current_product_sku_id) {
//        this.current_product_sku_id = current_product_sku_id;
//    }

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

    public String getMin_installment_price() {
        return min_installment_price;
    }

    public void setMin_installment_price(String min_installment_price) {
        this.min_installment_price = min_installment_price;
    }






//    public List<LabelsBean> getLabels() {
//        return labels;
//    }
//
//    public void setLabels(List<LabelsBean> labels) {
//        this.labels = labels;
//    }
//
//    public List<TagPagesBean> getTag_pages() {
//        return tag_pages;
//    }
//
//    public void setTag_pages(List<TagPagesBean> tag_pages) {
//        this.tag_pages = tag_pages;
//    }

    public long[] getImage_ids() {
        return image_ids;
    }

    public void setImage_ids(long[] image_ids) {
        this.image_ids = image_ids;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public String[] getSmall_images() {
        return small_images;
    }

    public void setSmall_images(String[] small_images) {
        this.small_images = small_images;
    }

//    public List<?> getProduct_sin() {
//        return product_sin;
//    }
//
//    public void setProduct_sin(List<?> product_sin) {
//        this.product_sin = product_sin;
//    }

//    public List<?> getProduct_sku() {
//        return product_sku;
//    }
//
//    public void setProduct_sku(List<?> product_sku) {
//        this.product_sku = product_sku;
//    }
//
//    public List<?> getOptions() {
//        return options;
//    }
//
//    public void setOptions(List<?> options) {
//        this.options = options;
//    }

    public List<InstallmentBean> getInstallment() {
        return installment;
    }

    public void setInstallment(List<InstallmentBean> installment) {
        this.installment = installment;
    }

    public List<WholesaleBean> getWholesale() {
        return wholesale;
    }

    public void setWholesale(List<WholesaleBean> wholesale) {
        this.wholesale = wholesale;
    }

    public ProductFavorite(Parcel input){
        rating = input.readParcelable(getClass().getClassLoader());
    }





    public static class SpecsBean {
        /**
         * brand : Suzuki
         */
        private String[] ukuran;
        private String brand;

        public void setUkuran(String[] ukuran) {
            this.ukuran = ukuran;
        }

        public String[] getUkuran() {
            return ukuran;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }
    }

    public static class RatingBean {
        /**
         * average_rate : 4.8
         * user_count : 22
         */

        private String average_rate;
        private int user_count;

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


    }

    public static class LabelsBean {
        /**
         * id : 667714
         * name : Cover Dashboard
         * slug : cover-dashboard
         * description : Pelindung Dashboard mobil dari sengatan sinar matahari dan meredam pantulan pada dashboard yang membuat silau pandangan saat mengemudi.
         */

        private int id;
        private String name;
        private String slug;
        private String description;

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
    }

    public static class TagPagesBean {
        /**
         * id : 4241
         * name : Aksesoris Ertiga
         * has_landing_page : true
         */

        private int id;
        private String name;
        private boolean has_landing_page;

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
    }

    public static class InstallmentBean {
        /**
         * bank_issuer : anz
         * terms : [12,6,3]
         * bank_issuer_name : Bank ANZ Indonesia
         * bank_acquirer : bni
         * url_logo : https://www.bukalapak.com/images/banks/anz.jpg
         */

        private String bank_issuer;
        private String bank_issuer_name;
        private String bank_acquirer;
        private String url_logo;
        private int[] terms;

        public String getBank_issuer() {
            return bank_issuer;
        }

        public void setBank_issuer(String bank_issuer) {
            this.bank_issuer = bank_issuer;
        }

        public String getBank_issuer_name() {
            return bank_issuer_name;
        }

        public void setBank_issuer_name(String bank_issuer_name) {
            this.bank_issuer_name = bank_issuer_name;
        }

        public String getBank_acquirer() {
            return bank_acquirer;
        }

        public void setBank_acquirer(String bank_acquirer) {
            this.bank_acquirer = bank_acquirer;
        }

        public String getUrl_logo() {
            return url_logo;
        }

        public void setUrl_logo(String url_logo) {
            this.url_logo = url_logo;
        }

        public int[] getTerms() {
            return terms;
        }

        public void setTerms(int[] terms) {
            this.terms = terms;
        }
    }

    public static class WholesaleBean {
        /**
         * lower_bound : 3
         * price : 27000
         */

        private int lower_bound;
        private long price;

        public int getLower_bound() {
            return lower_bound;
        }

        public void setLower_bound(int lower_bound) {
            this.lower_bound = lower_bound;
        }

        public long getPrice() {
            return price;
        }

        public void setPrice(long price) {
            this.price = price;
        }
    }

    @Override
    public int describeContents() {
        L.m(" Contents Product");
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(deal_request_state);
        parcel.writeLong(price);
        parcel.writeInt(category_id);
        parcel.writeString(category);
        parcel.writeStringArray(category_structure);
        parcel.writeStringArray(courier);
        parcel.writeString(seller_username);
        parcel.writeString(seller_name);
        parcel.writeLong(seller_id);
        parcel.writeString(seller_avatar);
        parcel.writeString(seller_level);
        parcel.writeString(seller_level_badge_url);
        parcel.writeString(seller_delivery_time);
        parcel.writeInt(seller_positive_feedback);
        parcel.writeInt(seller_negative_feedback);
        parcel.writeString(seller_term_condition);
        parcel.writeString(seller_alert);
        parcel.writeByte((byte)(for_sale?1:0));
        parcel.writeStringArray(state_description);


    }


}
