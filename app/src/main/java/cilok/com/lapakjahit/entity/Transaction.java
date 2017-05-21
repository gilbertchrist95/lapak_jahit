package cilok.com.lapakjahit.entity;

import java.util.List;

/**
 * Created by Alhaura on 19/05/2017.
 */

public class Transaction {

        private int id;
        private String state;
        private String updated_at;
        private boolean unread;
        private boolean quick_trans;
        private String transaction_id;
        private int amount;
        private int quantity;
        private String courier;
        private Object same_day_service_info;
        private Object pickup_service_info;
        private String buyer_notes;
        private Object dropshipper_name;
        private Object dropshipper_notes;
        private int shipping_fee;
        private int shipping_id;
        private String shipping_code;
        private String shipping_service;
        private int insurance_cost;
        private int subtotal_amount;
        private int total_amount;
        private int coded_amount;
        private Object uniq_code;
        private boolean use_seller_voucher;
        private boolean use_voucher;
        private int voucher_amount;
        private int promo_payment_amount;
        private int agent_commission_amount;
        private String payment_method;
        private String payment_method_name;
        private int payment_amount;
        private int remit_amount;
        private int service_fee;
        private Feedback feedback;
        private Object pickup_time;
        private Installment installment;
        private Consignee consignee;
        private Buyer buyer;
        private Seller seller;
        private Invoice invoice;
        private Object voucher;
        private String created_at;
        private Object deliver_before;
        private String pay_before;
        private Object reject_reason;
        private StateChanges state_changes;
        private boolean has_deal_product;
        private Object return_info;
        private int total_weight;
        private boolean need_action;
        private boolean virtual;
        private Object phone_credit;
        private Object logistic_booking;
        private String type;
        private Object replacement;
        private List<?> shipping_history;
        private List<Products> products;
        private List<AmountDetail> amount_detail;
        private List<?> actions;
        private List<?> return_reason;

        public Transaction(){}

        public int getId() {
            return id;
        }

        public void setId(int id) {
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

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
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

        public Object getSame_day_service_info() {
            return same_day_service_info;
        }

        public void setSame_day_service_info(Object same_day_service_info) {
            this.same_day_service_info = same_day_service_info;
        }

        public Object getPickup_service_info() {
            return pickup_service_info;
        }

        public void setPickup_service_info(Object pickup_service_info) {
            this.pickup_service_info = pickup_service_info;
        }

        public String getBuyer_notes() {
            return buyer_notes;
        }

        public void setBuyer_notes(String buyer_notes) {
            this.buyer_notes = buyer_notes;
        }

        public Object getDropshipper_name() {
            return dropshipper_name;
        }

        public void setDropshipper_name(Object dropshipper_name) {
            this.dropshipper_name = dropshipper_name;
        }

        public Object getDropshipper_notes() {
            return dropshipper_notes;
        }

        public void setDropshipper_notes(Object dropshipper_notes) {
            this.dropshipper_notes = dropshipper_notes;
        }

        public int getShipping_fee() {
            return shipping_fee;
        }

        public void setShipping_fee(int shipping_fee) {
            this.shipping_fee = shipping_fee;
        }

        public int getShipping_id() {
            return shipping_id;
        }

        public void setShipping_id(int shipping_id) {
            this.shipping_id = shipping_id;
        }

        public String getShipping_code() {
            return shipping_code;
        }

        public void setShipping_code(String shipping_code) {
            this.shipping_code = shipping_code;
        }

        public String getShipping_service() {
            return shipping_service;
        }

        public void setShipping_service(String shipping_service) {
            this.shipping_service = shipping_service;
        }

        public int getInsurance_cost() {
            return insurance_cost;
        }

        public void setInsurance_cost(int insurance_cost) {
            this.insurance_cost = insurance_cost;
        }

        public int getSubtotal_amount() {
            return subtotal_amount;
        }

        public void setSubtotal_amount(int subtotal_amount) {
            this.subtotal_amount = subtotal_amount;
        }

        public int getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(int total_amount) {
            this.total_amount = total_amount;
        }

        public int getCoded_amount() {
            return coded_amount;
        }

        public void setCoded_amount(int coded_amount) {
            this.coded_amount = coded_amount;
        }

        public Object getUniq_code() {
            return uniq_code;
        }

        public void setUniq_code(Object uniq_code) {
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

        public int getVoucher_amount() {
            return voucher_amount;
        }

        public void setVoucher_amount(int voucher_amount) {
            this.voucher_amount = voucher_amount;
        }

        public int getPromo_payment_amount() {
            return promo_payment_amount;
        }

        public void setPromo_payment_amount(int promo_payment_amount) {
            this.promo_payment_amount = promo_payment_amount;
        }

        public int getAgent_commission_amount() {
            return agent_commission_amount;
        }

        public void setAgent_commission_amount(int agent_commission_amount) {
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

        public int getPayment_amount() {
            return payment_amount;
        }

        public void setPayment_amount(int payment_amount) {
            this.payment_amount = payment_amount;
        }

        public int getRemit_amount() {
            return remit_amount;
        }

        public void setRemit_amount(int remit_amount) {
            this.remit_amount = remit_amount;
        }

        public int getService_fee() {
            return service_fee;
        }

        public void setService_fee(int service_fee) {
            this.service_fee = service_fee;
        }

        public Feedback getFeedback() {
            return feedback;
        }

        public void setFeedback(Feedback feedback) {
            this.feedback = feedback;
        }

        public Object getPickup_time() {
            return pickup_time;
        }

        public void setPickup_time(Object pickup_time) {
            this.pickup_time = pickup_time;
        }

        public Installment getInstallment() {
            return installment;
        }

        public void setInstallment(Installment installment) {
            this.installment = installment;
        }

        public Consignee getConsignee() {
            return consignee;
        }

        public void setConsignee(Consignee consignee) {
            this.consignee = consignee;
        }

        public Buyer getBuyer() {
            return buyer;
        }

        public void setBuyer(Buyer buyer) {
            this.buyer = buyer;
        }

        public Seller getSeller() {
            return seller;
        }

        public void setSeller(Seller seller) {
            this.seller = seller;
        }

        public Invoice getInvoice() {
            return invoice;
        }

        public void setInvoice(Invoice invoice) {
            this.invoice = invoice;
        }

        public Object getVoucher() {
            return voucher;
        }

        public void setVoucher(Object voucher) {
            this.voucher = voucher;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public Object getDeliver_before() {
            return deliver_before;
        }

        public void setDeliver_before(Object deliver_before) {
            this.deliver_before = deliver_before;
        }

        public String getPay_before() {
            return pay_before;
        }

        public void setPay_before(String pay_before) {
            this.pay_before = pay_before;
        }

        public Object getReject_reason() {
            return reject_reason;
        }

        public void setReject_reason(Object reject_reason) {
            this.reject_reason = reject_reason;
        }

        public StateChanges getState_changes() {
            return state_changes;
        }

        public void setState_changes(StateChanges state_changes) {
            this.state_changes = state_changes;
        }

        public boolean isHas_deal_product() {
            return has_deal_product;
        }

        public void setHas_deal_product(boolean has_deal_product) {
            this.has_deal_product = has_deal_product;
        }

        public Object getReturn_info() {
            return return_info;
        }

        public void setReturn_info(Object return_info) {
            this.return_info = return_info;
        }

        public int getTotal_weight() {
            return total_weight;
        }

        public void setTotal_weight(int total_weight) {
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

        public Object getPhone_credit() {
            return phone_credit;
        }

        public void setPhone_credit(Object phone_credit) {
            this.phone_credit = phone_credit;
        }

        public Object getLogistic_booking() {
            return logistic_booking;
        }

        public void setLogistic_booking(Object logistic_booking) {
            this.logistic_booking = logistic_booking;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getReplacement() {
            return replacement;
        }

        public void setReplacement(Object replacement) {
            this.replacement = replacement;
        }

        public List<?> getShipping_history() {
            return shipping_history;
        }

        public void setShipping_history(List<?> shipping_history) {
            this.shipping_history = shipping_history;
        }

        public List<Products> getProducts() {
            return products;
        }

        public void setProducts(List<Products> products) {
            this.products = products;
        }

        public List<AmountDetail> getAmount_detail() {
            return amount_detail;
        }

        public void setAmount_detail(List<AmountDetail> amount_detail) {
            this.amount_detail = amount_detail;
        }

        public List<?> getActions() {
            return actions;
        }

        public void setActions(List<?> actions) {
            this.actions = actions;
        }

        public List<?> getReturn_reason() {
            return return_reason;
        }

        public void setReturn_reason(List<?> return_reason) {
            this.return_reason = return_reason;
        }

        public static class Feedback {
            /**
             * for_seller : null
             * for_buyer : null
             */

            private Object for_seller;
            private Object for_buyer;

            public Object getFor_seller() {
                return for_seller;
            }

            public void setFor_seller(Object for_seller) {
                this.for_seller = for_seller;
            }

            public Object getFor_buyer() {
                return for_buyer;
            }

            public void setFor_buyer(Object for_buyer) {
                this.for_buyer = for_buyer;
            }
        }

        public static class Installment {
            /**
             * term : null
             * bank_issuer : null
             */

            private Object term;
            private Object bank_issuer;

            public Object getTerm() {
                return term;
            }

            public void setTerm(Object term) {
                this.term = term;
            }

            public Object getBank_issuer() {
                return bank_issuer;
            }

            public void setBank_issuer(Object bank_issuer) {
                this.bank_issuer = bank_issuer;
            }
        }

        public static class Consignee {
            /**
             * name : Gilbert Christoper
             * phone : 08982991745
             * address : Jalan Jendral Sudirman No.2276 RT 31 RW 02
             Toko Maju Jaya Simpang Sekip
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
        }

        public static class Buyer {
            /**
             * id : 3051175
             * name : Gilbert Christoper
             * username : gilbertchrist95
             * email : gilbertchrist95@gmail.com
             */

            private int id;
            private String name;
            private String username;
            private String email;

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
        }

        public static class Seller {
            /**
             * id : 13268428
             * name : Toko buku Paling Murah
             * username : lukanya
             */

            private int id;
            private String name;
            private String username;

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

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }

        public static class Invoice {
            /**
             * id : 116243576
             * invoice_id : BL171138H8Q2INV
             * state : expired
             */

            private int id;
            private String invoice_id;
            private String state;

            public int getId() {
                return id;
            }

            public void setId(int id) {
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
        }

        public static class StateChanges {

            private String addressed_at;
            private String payment_chosen_at;
            private String expired_at;

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
        }

        public static class Products {

            private DealInfo deal_info;
            private String deal_request_state;
            private int price;
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
            private Object seller_alert;
            private boolean for_sale;
            private boolean premium_account;
            private boolean top_merchant;
            private Object last_order_schedule;
            private SellerVoucher seller_voucher;
            private int waiting_payment;
            private int sold_count;
            private Specs specs;
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
            private Rating rating;
            private String current_variant_name;
            private int current_product_sku_id;
            private int category_id;
            private String category;
            private int interest_count;
            private String last_relist_at;
            private int view_count;
            private int order_quantity;
            private int accepted_price;
            private List<String> courier;
            private List<?> state_description;
            private List<?> free_shipping_coverage;
            private List<Integer> image_ids;
            private List<String> images;
            private List<String> small_images;
            private List<?> product_sin;
            private List<?> product_sku;
            private List<?> options;
            private List<String> category_structure;

            public DealInfo getDeal_info() {
                return deal_info;
            }

            public void setDeal_info(DealInfo deal_info) {
                this.deal_info = deal_info;
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

            public Object getSeller_alert() {
                return seller_alert;
            }

            public void setSeller_alert(Object seller_alert) {
                this.seller_alert = seller_alert;
            }

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

            public Object getLast_order_schedule() {
                return last_order_schedule;
            }

            public void setLast_order_schedule(Object last_order_schedule) {
                this.last_order_schedule = last_order_schedule;
            }

            public SellerVoucher getSeller_voucher() {
                return seller_voucher;
            }

            public void setSeller_voucher(SellerVoucher seller_voucher) {
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

            public Specs getSpecs() {
                return specs;
            }

            public void setSpecs(Specs specs) {
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

            public Rating getRating() {
                return rating;
            }

            public void setRating(Rating rating) {
                this.rating = rating;
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

            public int getOrder_quantity() {
                return order_quantity;
            }

            public void setOrder_quantity(int order_quantity) {
                this.order_quantity = order_quantity;
            }

            public int getAccepted_price() {
                return accepted_price;
            }

            public void setAccepted_price(int accepted_price) {
                this.accepted_price = accepted_price;
            }

            public List<String> getCourier() {
                return courier;
            }

            public void setCourier(List<String> courier) {
                this.courier = courier;
            }

            public List<?> getState_description() {
                return state_description;
            }

            public void setState_description(List<?> state_description) {
                this.state_description = state_description;
            }

            public List<?> getFree_shipping_coverage() {
                return free_shipping_coverage;
            }

            public void setFree_shipping_coverage(List<?> free_shipping_coverage) {
                this.free_shipping_coverage = free_shipping_coverage;
            }

            public List<Integer> getImage_ids() {
                return image_ids;
            }

            public void setImage_ids(List<Integer> image_ids) {
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

            public List<?> getProduct_sin() {
                return product_sin;
            }

            public void setProduct_sin(List<?> product_sin) {
                this.product_sin = product_sin;
            }

            public List<?> getProduct_sku() {
                return product_sku;
            }

            public void setProduct_sku(List<?> product_sku) {
                this.product_sku = product_sku;
            }

            public List<?> getOptions() {
                return options;
            }

            public void setOptions(List<?> options) {
                this.options = options;
            }

            public List<String> getCategory_structure() {
                return category_structure;
            }

            public void setCategory_structure(List<String> category_structure) {
                this.category_structure = category_structure;
            }

            public static class DealInfo {
            }

            public static class SellerVoucher {
            }

            public static class Specs {

                private String brand;

                public String getBrand() {
                    return brand;
                }

                public void setBrand(String brand) {
                    this.brand = brand;
                }
            }

            public static class Rating {

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
        }

        public static class AmountDetail {

            private String name;
            private int amount;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }
        }
}
