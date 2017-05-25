package cilok.com.lapakjahit.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Alhaura on 19/05/2017.
 */

public class Transaction implements Parcelable {

    private long id;
    private String state;
    private String updated_at;
    private boolean unread;
    private boolean quick_trans;
    private String transaction_id;
    private long amount;
    private int quantity;
    private String courier;
    private String buyer_notes;
    //        private Object dropshipper_name;
    //        private Object dropshipper_notes;
    private long shipping_fee;
    private long shipping_id;
    private String shipping_code;
    private List<ShippingHistoryBean> shipping_history;
    private String shipping_service;
    private long insurance_cost;
    private long subtotal_amount;
    private long total_amount;
    private long coded_amount;
    private int uniq_code;
    private boolean use_seller_voucher;
    private boolean use_voucher;
    private long voucher_amount;
    private long promo_payment_amount;
    private long agent_commission_amount;
    private String payment_method;
    private String payment_method_name;
    private long payment_amount;
    private long remit_amount;
    private long service_fee;
    private Feedback feedback;
    private List<Product> products;
    private String pickup_time;
    private List<AmountDetail> amount_detail;
    private Installment installment;
    private Consignee consignee;
    private Buyer buyer;
    private Seller seller;
    private Invoice invoice;
    private VoucherBean voucher;
    private String created_at;
    private String deliver_before;
    private String pay_before;
    private String reject_reason;
    private StateChanges state_changes;
    private boolean has_deal_product;
    private String return_info;
    private long total_weight;
    private boolean need_action;
    private boolean virtual;
    //    private Object phone_credit;
    //    private Object logistic_booking;
    private String type;
    //    private Object replacement;


    //    private List<?> actions;
    //    private List<?> return_reason;

    public Transaction() {
    }

    protected Transaction(Parcel in) {
        id = in.readLong();
        state = in.readString();
        updated_at = in.readString();
        unread = in.readByte() != 0;
        quick_trans = in.readByte() != 0;
        transaction_id = in.readString();
        amount = in.readLong();
        quantity = in.readInt();
        courier = in.readString();
        buyer_notes = in.readString();
        shipping_fee = in.readLong();
        shipping_id = in.readLong();
        shipping_code = in.readString();
        shipping_history = in.createTypedArrayList(ShippingHistoryBean.CREATOR);
        shipping_service = in.readString();
        insurance_cost = in.readLong();
        subtotal_amount = in.readLong();
        total_amount = in.readLong();
        coded_amount = in.readLong();
        uniq_code = in.readInt();
        use_seller_voucher = in.readByte() != 0;
        use_voucher = in.readByte() != 0;
        voucher_amount = in.readLong();
        promo_payment_amount = in.readLong();
        agent_commission_amount = in.readLong();
        payment_method = in.readString();
        payment_method_name = in.readString();
        payment_amount = in.readLong();
        remit_amount = in.readLong();
        service_fee = in.readLong();
        feedback = in.readParcelable(Feedback.class.getClassLoader());
        products = in.createTypedArrayList(Product.CREATOR);
        pickup_time = in.readString();
        amount_detail = in.createTypedArrayList(AmountDetail.CREATOR);
        installment = in.readParcelable(Installment.class.getClassLoader());
        consignee = in.readParcelable(Consignee.class.getClassLoader());
        buyer = in.readParcelable(Buyer.class.getClassLoader());
        seller = in.readParcelable(Seller.class.getClassLoader());
        invoice = in.readParcelable(Invoice.class.getClassLoader());
        voucher = in.readParcelable(VoucherBean.class.getClassLoader());
        created_at = in.readString();
        deliver_before = in.readString();
        pay_before = in.readString();
        reject_reason = in.readString();
        state_changes = in.readParcelable(StateChanges.class.getClassLoader());
        has_deal_product = in.readByte() != 0;
        return_info = in.readString();
        total_weight = in.readLong();
        need_action = in.readByte() != 0;
        virtual = in.readByte() != 0;
        type = in.readString();
    }

    public static final Creator<Transaction> CREATOR = new Creator<Transaction>() {
        @Override
        public Transaction createFromParcel(Parcel in) {
            return new Transaction(in);
        }

        @Override
        public Transaction[] newArray(int size) {
            return new Transaction[size];
        }
    };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public boolean isQuick_trans() {
        return quick_trans;
    }

    public void setQuick_trans(boolean quick_trans) {
        this.quick_trans = quick_trans;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

//    public String getSame_day_service_info() {
//        return same_day_service_info;
//    }
//
//    public void setSame_day_service_info(String same_day_service_info) {
//        this.same_day_service_info = same_day_service_info;
//    }
//
//    public Object getPickup_service_info() {
//            return pickup_service_info;
//        }
//
//        public void setPickup_service_info(Object pickup_service_info) {
//            this.pickup_service_info = pickup_service_info;
//        }

    public String getBuyer_notes() {
        return buyer_notes;
    }

    public void setBuyer_notes(String buyer_notes) {
        this.buyer_notes = buyer_notes;
    }

//        public Object getDropshipper_name() {
//            return dropshipper_name;
//        }
//
//        public void setDropshipper_name(Object dropshipper_name) {
//            this.dropshipper_name = dropshipper_name;
//        }
//
//        public Object getDropshipper_notes() {
//            return dropshipper_notes;
//        }
//
//        public void setDropshipper_notes(Object dropshipper_notes) {
//            this.dropshipper_notes = dropshipper_notes;
//        }

    public long getShipping_fee() {
        return shipping_fee;
    }

    public void setShipping_fee(long shipping_fee) {
        this.shipping_fee = shipping_fee;
    }

    public long getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(long shipping_id) {
        this.shipping_id = shipping_id;
    }

    public String getShipping_code() {
        return shipping_code;
    }

    public void setShipping_code(String shipping_code) {
        this.shipping_code = shipping_code;
    }

    public List<ShippingHistoryBean> getShipping_history() {
        return shipping_history;
    }

    public void setShipping_history(List<ShippingHistoryBean> shipping_history) {
        this.shipping_history = shipping_history;
    }


    public static class ShippingHistoryBean implements Parcelable {
        String date;
        String status;

        public ShippingHistoryBean() {
        }

        protected ShippingHistoryBean(Parcel in) {
            date = in.readString();
            status = in.readString();
        }

        public static final Creator<ShippingHistoryBean> CREATOR = new Creator<ShippingHistoryBean>() {
            @Override
            public ShippingHistoryBean createFromParcel(Parcel in) {
                return new ShippingHistoryBean(in);
            }

            @Override
            public ShippingHistoryBean[] newArray(int size) {
                return new ShippingHistoryBean[size];
            }
        };

        public void setDate(String date) {
            this.date = date;
        }

        public String getDate() {
            return date;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(date);
            parcel.writeString(status);
        }
    }


    public String getShipping_service() {
        return shipping_service;
    }

    public void setShipping_service(String shipping_service) {
        this.shipping_service = shipping_service;
    }

    public long getInsurance_cost() {
        return insurance_cost;
    }

    public void setInsurance_cost(long insurance_cost) {
        this.insurance_cost = insurance_cost;
    }

    public long getSubtotal_amount() {
        return subtotal_amount;
    }

    public void setSubtotal_amount(long subtotal_amount) {
        this.subtotal_amount = subtotal_amount;
    }

    public long getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(long total_amount) {
        this.total_amount = total_amount;
    }

    public long getCoded_amount() {
        return coded_amount;
    }

    public void setCoded_amount(long coded_amount) {
        this.coded_amount = coded_amount;
    }

    public int getUniq_code() {
        return uniq_code;
    }

    public void setUniq_code(int uniq_code) {
        this.uniq_code = uniq_code;
    }

    public boolean isUse_seller_voucher() {
        return use_seller_voucher;
    }

    public void setUse_seller_voucher(boolean use_seller_voucher) {
        this.use_seller_voucher = use_seller_voucher;
    }

    public boolean isUse_voucher() {
        return use_voucher;
    }

    public void setUse_voucher(boolean use_voucher) {
        this.use_voucher = use_voucher;
    }

    public long getVoucher_amount() {
        return voucher_amount;
    }

    public void setVoucher_amount(long voucher_amount) {
        this.voucher_amount = voucher_amount;
    }

    public long getPromo_payment_amount() {
        return promo_payment_amount;
    }

    public void setPromo_payment_amount(long promo_payment_amount) {
        this.promo_payment_amount = promo_payment_amount;
    }

    public long getAgent_commission_amount() {
        return agent_commission_amount;
    }

    public void setAgent_commission_amount(long agent_commission_amount) {
        this.agent_commission_amount = agent_commission_amount;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getPayment_method_name() {
        return payment_method_name;
    }

    public void setPayment_method_name(String payment_method_name) {
        this.payment_method_name = payment_method_name;
    }

    public long getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(long payment_amount) {
        this.payment_amount = payment_amount;
    }

    public long getRemit_amount() {
        return remit_amount;
    }

    public void setRemit_amount(long remit_amount) {
        this.remit_amount = remit_amount;
    }

    public long getService_fee() {
        return service_fee;
    }

    public void setService_fee(long service_fee) {
        this.service_fee = service_fee;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public static class Feedback implements Parcelable {
        public Feedback() {

        }

        /**
         * for_seller : null
         * for_buyer : null
         */

        private ForSallerBean for_seller;
//        private Object for_buyer;

        public Feedback(Parcel in) {
            for_seller = in.readParcelable(ForSallerBean.class.getClassLoader());
        }

        public static final Creator<Feedback> CREATOR = new Creator<Feedback>() {
            @Override
            public Feedback createFromParcel(Parcel in) {
                return new Feedback(in);
            }

            @Override
            public Feedback[] newArray(int size) {
                return new Feedback[size];
            }
        };

        public ForSallerBean getFor_seller() {
            return for_seller;
        }

        public void setFor_seller(ForSallerBean for_seller) {
            this.for_seller = for_seller;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(for_seller, i);
        }

//        public Object getFor_buyer() {
//            return for_buyer;
//        }
//
//        public void setFor_buyer(Object for_buyer) {
//            this.for_buyer = for_buyer;
//        }
    }

    public static class ForSallerBean implements Parcelable {
        long id;
        long transaction_id;
        long transaction_no;
        long sender_id;
        String sender_name;
        String sender_type;
        long user_id;
        String user_name;
        String body;
        boolean positive;
        String created_at;
        String updated_at;
        String replies;
        boolean is_editable;

        public ForSallerBean() {
        }

        protected ForSallerBean(Parcel in) {
            id = in.readLong();
            transaction_id = in.readLong();
            transaction_no = in.readLong();
            sender_id = in.readLong();
            sender_name = in.readString();
            sender_type = in.readString();
            user_id = in.readLong();
            user_name = in.readString();
            body = in.readString();
            positive = in.readByte() != 0;
            created_at = in.readString();
            updated_at = in.readString();
            replies = in.readString();
            is_editable = in.readByte() != 0;
        }

        public static final Creator<ForSallerBean> CREATOR = new Creator<ForSallerBean>() {
            @Override
            public ForSallerBean createFromParcel(Parcel in) {
                return new ForSallerBean(in);
            }

            @Override
            public ForSallerBean[] newArray(int size) {
                return new ForSallerBean[size];
            }
        };

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getTransaction_id() {
            return transaction_id;
        }

        public void setTransaction_id(long transaction_id) {
            this.transaction_id = transaction_id;
        }

        public long getTransaction_no() {
            return transaction_no;
        }

        public void setTransaction_no(long transaction_no) {
            this.transaction_no = transaction_no;
        }

        public long getSender_id() {
            return sender_id;
        }

        public void setSender_id(long sender_id) {
            this.sender_id = sender_id;
        }

        public String getSender_name() {
            return sender_name;
        }

        public void setSender_name(String sender_name) {
            this.sender_name = sender_name;
        }

        public String getSender_type() {
            return sender_type;
        }

        public void setSender_type(String sender_type) {
            this.sender_type = sender_type;
        }

        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public boolean isPositive() {
            return positive;
        }

        public void setPositive(boolean positive) {
            this.positive = positive;
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

        public String getReplies() {
            return replies;
        }

        public void setReplies(String replies) {
            this.replies = replies;
        }

        public boolean is_editable() {
            return is_editable;
        }

        public void setIs_editable(boolean is_editable) {
            this.is_editable = is_editable;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(id);
            parcel.writeLong(transaction_id);
            parcel.writeLong(transaction_no);
            parcel.writeLong(sender_id);
            parcel.writeString(sender_name);
            parcel.writeString(sender_type);
            parcel.writeLong(user_id);
            parcel.writeString(user_name);
            parcel.writeString(body);
            parcel.writeByte((byte) (positive ? 1 : 0));
            parcel.writeString(created_at);
            parcel.writeString(updated_at);
            parcel.writeString(replies);
            parcel.writeByte((byte) (is_editable ? 1 : 0));
        }
    }

    public String getPickup_time() {
        return pickup_time;
    }

    public void setPickup_time(String pickup_time) {
        this.pickup_time = pickup_time;
    }

    public List<AmountDetail> getAmount_detail() {
        return amount_detail;
    }

    public void setAmount_detail(List<AmountDetail> amount_detail) {
        this.amount_detail = amount_detail;
    }

    public static class AmountDetail implements Parcelable {
        String name;
        long amount;

        public AmountDetail() {
        }

        protected AmountDetail(Parcel in) {
            name = in.readString();
            amount = in.readLong();
        }

        public static final Creator<AmountDetail> CREATOR = new Creator<AmountDetail>() {
            @Override
            public AmountDetail createFromParcel(Parcel in) {
                return new AmountDetail(in);
            }

            @Override
            public AmountDetail[] newArray(int size) {
                return new AmountDetail[size];
            }
        };

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getAmount() {
            return amount;
        }

        public void setAmount(long amount) {
            this.amount = amount;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name);
            parcel.writeLong(amount);
        }
    }

    public Installment getInstallment() {
        return installment;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }

    public static class Installment implements Parcelable {
        public Installment() {

        }

        /**
         * term : null
         * bank_issuer : null
         */


        private int term;
        private String bank_issuer;

        protected Installment(Parcel in) {
            term = in.readInt();
            bank_issuer = in.readString();
        }

        public static final Creator<Installment> CREATOR = new Creator<Installment>() {
            @Override
            public Installment createFromParcel(Parcel in) {
                return new Installment(in);
            }

            @Override
            public Installment[] newArray(int size) {
                return new Installment[size];
            }
        };

        public int getTerm() {
            return term;
        }

        public void setTerm(int term) {
            this.term = term;
        }

        public String getBank_issuer() {
            return bank_issuer;
        }

        public void setBank_issuer(String bank_issuer) {
            this.bank_issuer = bank_issuer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(term);
            parcel.writeString(bank_issuer);
        }
    }

    public Consignee getConsignee() {
        return consignee;
    }

    public void setConsignee(Consignee consignee) {
        this.consignee = consignee;
    }

    public static class Consignee implements Parcelable {
        public Consignee() {
        }

        /**
         * name : Gilbert Christoper
         * phone : 08982991745
         * address : Jalan Jendral Sudirman No.2276 RT 31 RW 02
         * Toko Maju Jaya Simpang Sekip
         * area : Ilir Timur I
         * city : Palembang
         * province : Sumatera Selatan
         * post_code : 30126
         */


        private String name;
        private String phone;
        private String address;
        private String area;
        private String city;
        private String province;
        private String post_code;

        protected Consignee(Parcel in) {
            name = in.readString();
            phone = in.readString();
            address = in.readString();
            area = in.readString();
            city = in.readString();
            province = in.readString();
            post_code = in.readString();
        }

        public static final Creator<Consignee> CREATOR = new Creator<Consignee>() {
            @Override
            public Consignee createFromParcel(Parcel in) {
                return new Consignee(in);
            }

            @Override
            public Consignee[] newArray(int size) {
                return new Consignee[size];
            }
        };

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
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

        public String getPost_code() {
            return post_code;
        }

        public void setPost_code(String post_code) {
            this.post_code = post_code;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name);
            parcel.writeString(phone);
            parcel.writeString(address);
            parcel.writeString(area);
            parcel.writeString(city);
            parcel.writeString(province);
            parcel.writeString(post_code);
        }
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public static class Buyer implements Parcelable {
        public Buyer() {
        }

        /**
         * id : 3051175
         * name : Gilbert Christoper
         * username : gilbertchrist95
         * email : gilbertchrist95@gmail.com
         */


        private long id;
        private String name;
        private String username;
        private String email;

        protected Buyer(Parcel in) {
            id = in.readLong();
            name = in.readString();
            username = in.readString();
            email = in.readString();
        }

        public static final Creator<Buyer> CREATOR = new Creator<Buyer>() {
            @Override
            public Buyer createFromParcel(Parcel in) {
                return new Buyer(in);
            }

            @Override
            public Buyer[] newArray(int size) {
                return new Buyer[size];
            }
        };

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(id);
            parcel.writeString(name);
            parcel.writeString(username);
            parcel.writeString(email);
        }
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public static class Seller implements Parcelable {
        public Seller() {
        }

        /**
         * id : 13268428
         * name : Toko buku Paling Murah
         * username : lukanya
         */

        private long id;
        private String name;
        private String username;

        protected Seller(Parcel in) {
            id = in.readLong();
            name = in.readString();
            username = in.readString();
        }

        public static final Creator<Seller> CREATOR = new Creator<Seller>() {
            @Override
            public Seller createFromParcel(Parcel in) {
                return new Seller(in);
            }

            @Override
            public Seller[] newArray(int size) {
                return new Seller[size];
            }
        };

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(id);
            parcel.writeString(name);
            parcel.writeString(username);
        }
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public static class Invoice implements Parcelable {
        /**
         * id : 116243576
         * invoice_id : BL171138H8Q2INV
         * state : expired
         */

        private long id;
        private String invoice_id;
        private String state;

        public Invoice() {
        }

        protected Invoice(Parcel in) {
            id = in.readLong();
            invoice_id = in.readString();
            state = in.readString();
        }

        public static final Creator<Invoice> CREATOR = new Creator<Invoice>() {
            @Override
            public Invoice createFromParcel(Parcel in) {
                return new Invoice(in);
            }

            @Override
            public Invoice[] newArray(int size) {
                return new Invoice[size];
            }
        };

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getInvoice_id() {
            return invoice_id;
        }

        public void setInvoice_id(String invoice_id) {
            this.invoice_id = invoice_id;
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
            parcel.writeLong(id);
            parcel.writeString(invoice_id);
            parcel.writeString(state);
        }
    }

    public VoucherBean getVoucher() {
        return voucher;
    }

    public void setVoucher(VoucherBean voucher) {
        this.voucher = voucher;
    }

    public static class VoucherBean implements Parcelable {
        String code;
        String name;
        long amount;
        long percentage_amount;

        public VoucherBean() {
        }

        protected VoucherBean(Parcel in) {
            code = in.readString();
            name = in.readString();
            amount = in.readLong();
            percentage_amount = in.readLong();
        }

        public static final Creator<VoucherBean> CREATOR = new Creator<VoucherBean>() {
            @Override
            public VoucherBean createFromParcel(Parcel in) {
                return new VoucherBean(in);
            }

            @Override
            public VoucherBean[] newArray(int size) {
                return new VoucherBean[size];
            }
        };

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getAmount() {
            return amount;
        }

        public void setAmount(long amount) {
            this.amount = amount;
        }

        public long getPercentage_amount() {
            return percentage_amount;
        }

        public void setPercentage_amount(long percentage_amount) {
            this.percentage_amount = percentage_amount;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(code);
            parcel.writeString(name);
            parcel.writeLong(amount);
            parcel.writeLong(percentage_amount);
        }
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDeliver_before() {
        return deliver_before;
    }

    public void setDeliver_before(String deliver_before) {
        this.deliver_before = deliver_before;
    }

    public String getPay_before() {
        return pay_before;
    }

    public void setPay_before(String pay_before) {
        this.pay_before = pay_before;
    }

    public String getReject_reason() {
        return reject_reason;
    }

    public void setReject_reason(String reject_reason) {
        this.reject_reason = reject_reason;
    }

    public StateChanges getState_changes() {
        return state_changes;
    }

    public void setState_changes(StateChanges state_changes) {
        this.state_changes = state_changes;
    }

    public static class StateChanges implements Parcelable {

        private String addressed_at;
        private String payment_chosen_at;
        private String paid_at;
        private String accepted_at;
        private String delivered_at;
        private String received_at;
        private String remitted_at;
        private String expired_at;

        public StateChanges() {
        }

        protected StateChanges(Parcel in) {
            addressed_at = in.readString();
            payment_chosen_at = in.readString();
            paid_at = in.readString();
            accepted_at = in.readString();
            delivered_at = in.readString();
            received_at = in.readString();
            remitted_at = in.readString();
            expired_at = in.readString();
        }

        public static final Creator<StateChanges> CREATOR = new Creator<StateChanges>() {
            @Override
            public StateChanges createFromParcel(Parcel in) {
                return new StateChanges(in);
            }

            @Override
            public StateChanges[] newArray(int size) {
                return new StateChanges[size];
            }
        };

        public String getAccepted_at() {
            return accepted_at;
        }

        public void setAccepted_at(String accepted_at) {
            this.accepted_at = accepted_at;
        }

        public String getRemitted_at() {
            return remitted_at;
        }

        public void setRemitted_at(String remitted_at) {
            this.remitted_at = remitted_at;
        }

        public String getReceived_at() {
            return received_at;
        }

        public void setReceived_at(String received_at) {
            this.received_at = received_at;
        }

        public void setDelivered_at(String delivered_at) {
            this.delivered_at = delivered_at;
        }

        public String getDelivered_at() {
            return delivered_at;
        }

        public void setPaid_at(String paid_at) {
            this.paid_at = paid_at;
        }

        public String getPaid_at() {
            return paid_at;
        }

        public String getAddressed_at() {
            return addressed_at;
        }

        public void setAddressed_at(String addressed_at) {
            this.addressed_at = addressed_at;
        }

        public String getPayment_chosen_at() {
            return payment_chosen_at;
        }

        public void setPayment_chosen_at(String payment_chosen_at) {
            this.payment_chosen_at = payment_chosen_at;
        }

        public String getExpired_at() {
            return expired_at;
        }

        public void setExpired_at(String expired_at) {
            this.expired_at = expired_at;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(addressed_at);
            parcel.writeString(payment_chosen_at);
            parcel.writeString(paid_at);
            parcel.writeString(accepted_at);
            parcel.writeString(delivered_at);
            parcel.writeString(received_at);
            parcel.writeString(remitted_at);
            parcel.writeString(expired_at);
        }
    }

    public boolean isHas_deal_product() {
        return has_deal_product;
    }

    public void setHas_deal_product(boolean has_deal_product) {
        this.has_deal_product = has_deal_product;
    }

    public String getReturn_info() {
        return return_info;
    }

    public void setReturn_info(String return_info) {
        this.return_info = return_info;
    }

    public long getTotal_weight() {
        return total_weight;
    }

    public void setTotal_weight(long total_weight) {
        this.total_weight = total_weight;
    }

    public boolean isNeed_action() {
        return need_action;
    }

    public void setNeed_action(boolean need_action) {
        this.need_action = need_action;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

//    public Object getPhone_credit() {
//        return phone_credit;
//    }
//
//    public void setPhone_credit(Object phone_credit) {
//        this.phone_credit = phone_credit;
//    }
//
//    public Object getLogistic_booking() {
//        return logistic_booking;
//    }
//
//    public void setLogistic_booking(Object logistic_booking) {
//        this.logistic_booking = logistic_booking;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Object getReplacement() {
//        return replacement;
//    }
//
//    public void setReplacement(Object replacement) {
//        this.replacement = replacement;
//    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


//    public List<?> getActions() {
//        return actions;
//    }
//
//    public void setActions(List<?> actions) {
//        this.actions = actions;
//    }
//
//    public List<?> getReturn_reason() {
//        return return_reason;
//    }
//
//    public void setReturn_reason(List<?> return_reason) {
//        this.return_reason = return_reason;
//    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(state);
        parcel.writeString(updated_at);
        parcel.writeByte((byte) (unread ? 1 : 0));
        parcel.writeByte((byte) (quick_trans ? 1 : 0));
        parcel.writeString(transaction_id);
        parcel.writeLong(amount);
        parcel.writeInt(quantity);
        parcel.writeString(courier);
        parcel.writeString(buyer_notes);
        parcel.writeLong(shipping_fee);
        parcel.writeLong(shipping_id);
        parcel.writeString(shipping_code);
        parcel.writeTypedList(shipping_history);
        parcel.writeString(shipping_service);
        parcel.writeLong(insurance_cost);
        parcel.writeLong(subtotal_amount);
        parcel.writeLong(total_amount);
        parcel.writeLong(coded_amount);
        parcel.writeInt(uniq_code);
        parcel.writeByte((byte) (use_seller_voucher ? 1 : 0));
        parcel.writeByte((byte) (use_voucher ? 1 : 0));
        parcel.writeLong(voucher_amount);
        parcel.writeLong(promo_payment_amount);
        parcel.writeLong(agent_commission_amount);
        parcel.writeString(payment_method);
        parcel.writeString(payment_method_name);
        parcel.writeLong(payment_amount);
        parcel.writeLong(remit_amount);
        parcel.writeLong(service_fee);
        parcel.writeParcelable(feedback, i);
        parcel.writeTypedList(products);
        parcel.writeString(pickup_time);
        parcel.writeTypedList(amount_detail);
        parcel.writeParcelable(installment, i);
        parcel.writeParcelable(consignee, i);
        parcel.writeParcelable(buyer, i);
        parcel.writeParcelable(seller, i);
        parcel.writeParcelable(invoice, i);
        parcel.writeParcelable(voucher, i);
        parcel.writeString(created_at);
        parcel.writeString(deliver_before);
        parcel.writeString(pay_before);
        parcel.writeString(reject_reason);
        parcel.writeParcelable(state_changes, i);
        parcel.writeByte((byte) (has_deal_product ? 1 : 0));
        parcel.writeString(return_info);
        parcel.writeLong(total_weight);
        parcel.writeByte((byte) (need_action ? 1 : 0));
        parcel.writeByte((byte) (virtual ? 1 : 0));
        parcel.writeString(type);
    }


}
