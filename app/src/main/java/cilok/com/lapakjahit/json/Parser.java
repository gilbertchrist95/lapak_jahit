package cilok.com.lapakjahit.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cilok.com.lapakjahit.entity.Cart;
import cilok.com.lapakjahit.entity.Custom1;
import cilok.com.lapakjahit.entity.Custom3;
import cilok.com.lapakjahit.entity.InboxMessage;
import cilok.com.lapakjahit.entity.Product;
import cilok.com.lapakjahit.entity.Transaction;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.extras.Keys;
import cilok.com.lapakjahit.log.L;

import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_address;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_agent_commission;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_avatar;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_cart;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_cart_status;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_city;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_close_date;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_close_reason;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_deal_request_state;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_delivery_time;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_discount_price;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_feedbacks;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_gender;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_is_seller;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_items;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_joined_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_lapak_desc;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_lapak_header;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_lapak_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_last_login;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_level_badge_url;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_message;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_negative;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_official;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_original_price;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_positive;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_premium_user;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_price;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_product;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_province;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_recent_trans;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_rejected;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_rejection;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_reopen_date;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_seller_level;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_stock;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_store_closed;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_subscriber_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_top_merchant;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_username;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCart.KEY_verified_user;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_bahan;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_bahan_dalam;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_bahan_luar;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_id_bahan;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_id_fungsi_bahan;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_id_jenis;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_keterangan_bahan;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_keterangan_ukuran;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_keterangan_warna;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_kode_hexa;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_motif;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_nama_bahan;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_nama_fashion;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_nama_kategori;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_nama_motif;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_path_gambar_motif;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_ukuran;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_url_gambar;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetCustomProduk.KEY_warna;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetProduct.*;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_agent_commission_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_amount_detail;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_amount_detail_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_amount_detail_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_buyer;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_buyer_email;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_buyer_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_buyer_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_buyer_notes;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_buyer_username;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_coded_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee_address;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee_area;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee_city;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee_phone;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee_post_code;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_consignee_province;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_courier;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_created_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_deliver_before;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_body;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_created_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_is_editable;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_positive;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_sender_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_sender_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_sender_type;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_transaction_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_transaction_no;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_updated_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_user_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_feedback_for_seller_user_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_has_deal_product;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_installment_term;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_insurance_cost;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_invoice;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_invoice_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_invoice_invoice_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_invoice_state;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_need_action;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_pay_before;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_payment_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_payment_method;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_payment_method_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_pickup_time;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_promo_payment_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_quantity;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_quick_trans;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_reject_reason;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_remit_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_return_info;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_seller;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_seller_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_seller_username;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_service_fee;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_shipping_code;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_shipping_fee;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_shipping_history;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_shipping_history_date;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_shipping_history_status;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_shipping_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_shipping_service;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_accepted_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_addressed_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_delivered_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_expired_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_paid_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_payment_chosen_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_received_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_state_changes_remitted_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_subtotal_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_total_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_total_weight;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_transaction_id;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_transactions;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_type;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_uniq_code;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_unread;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_updated_at;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_use_seller_voucher;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_use_voucher;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_virtual;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_voucher;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_voucher_amount;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_voucher_code;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_voucher_name;
import static cilok.com.lapakjahit.extras.Keys.EndpointGetTranscation.KEY_voucher_percentage_amount;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.*;
import static cilok.com.lapakjahit.extras.Keys.EnpointInboxMessage.KEY_ID;

/**
 * Created by Gilbert on 5/15/2017.
 */

public class Parser {
    public static ArrayList<InboxMessage> parseMessageInboxJson(JSONObject response) {
        ArrayList<InboxMessage> listInboxInboxMessage = new ArrayList<>();
        if (response != null && response.length() > 0) {
            try {
                JSONArray arrayInbox = response.getJSONArray(KEY_INBOX);
                for (int i = 0; i < arrayInbox.length(); i++) {

                    long id = -1;
                    String updatedAt = Constants.NA;
                    long partnerId = -1;
                    String partnerName = Constants.NA;
                    String urlPartnerAvatar = Constants.NA;
                    String partnerVerified = Constants.NA;
                    String partnerOfficial = Constants.NA;
                    long userId = -1;
                    String userName = Constants.NA;
                    String lastMessage = Constants.NA;
                    String lastMessageRead = Constants.NA;
                    String lastMessageSent = Constants.NA;

                    JSONObject currentInboxMessage = arrayInbox.getJSONObject(i);
                    //get the id of the current movie

//                    id = currentInboxMessage.getLong(KEY_ID);
                    id = Long.parseLong(currentInboxMessage.getString(Keys.EnpointInboxMessage.KEY_ID));
                    ;
                    if (Utils.contains(currentInboxMessage, KEY_UPDATED_AT)) {
                        updatedAt = currentInboxMessage.getString(KEY_UPDATED_AT);
                    }
//                    partnerId = currentInboxMessage.getLong(KEY_PARTNER_ID);
                    partnerId = Long.parseLong(currentInboxMessage.getString(KEY_PARTNER_ID));
                    partnerName = currentInboxMessage.getString(KEY_PARTNER_NAME);
                    urlPartnerAvatar = currentInboxMessage.getString(KEY_PARTNER_AVATAR);
                    partnerVerified = String.valueOf(currentInboxMessage.getBoolean(KEY_PARTNER_VERIFIED));
                    partnerOfficial = String.valueOf(currentInboxMessage.getBoolean(KEY_PARTNER_OFFICIAL));
//                    userId = currentInboxMessage.getLong(KEY_USER_ID);
                    userId = Long.parseLong(currentInboxMessage.getString(KEY_USER_ID));
                    userName = currentInboxMessage.getString(KEY_USER_NAME);


                    lastMessage = currentInboxMessage.getString(KEY_LAST_MESSAGE);


                    lastMessageRead = String.valueOf(currentInboxMessage.getBoolean(KEY_LAST_MESSAGE_READ));
                    lastMessageSent = String.valueOf(currentInboxMessage.getString(KEY_LAST_MESSAGE_SENT));

                    InboxMessage inboxMessage = new InboxMessage();
                    inboxMessage.setId(id);
                    inboxMessage.setUpdatedAt(updatedAt);
                    inboxMessage.setPartnerId(partnerId);
                    inboxMessage.setPartnerName(partnerName);
                    inboxMessage.setUrlPartnerAvatar(urlPartnerAvatar);
                    inboxMessage.setPartnerVerified(partnerVerified);
                    inboxMessage.setPartnerOfficial(partnerOfficial);
                    inboxMessage.setUserId(userId);
                    inboxMessage.setUserName(userName);
                    inboxMessage.setLastMessage(lastMessage);
                    inboxMessage.setLastMessageRead(lastMessageRead);
                    inboxMessage.setLastMessageSent(lastMessageSent);

                    if (id != -1) {
                        listInboxInboxMessage.add(inboxMessage);
                    }

                }
            } catch (JSONException e) {

            }
        }
        L.m(listInboxInboxMessage.size() + " rows fetched");
        return listInboxInboxMessage;
    }

    public static ArrayList<Product> parseListProducts(JSONObject response) {
        ArrayList<Product> listFavoriteProduct = new ArrayList<>();
        if (response != null && response.length() > 0) {
            try {
                JSONArray arrayFavorites = response.getJSONArray(KEY_PRODUCTS);
                for (int i = 0; i < arrayFavorites.length(); i++) {
                    String deal_request_state = Constants.NA;
                    long price = -1;
                    int category_id = -1;
                    String category = Constants.NA;
                    String[] category_structure = {""};
                    String[] courier = {""};
                    String seller_username = Constants.NA;
                    String seller_name = Constants.NA;
                    long seller_id = -1;
                    String seller_avatar = Constants.NA;
                    String seller_level = Constants.NA;
                    String seller_level_badge_url = Constants.NA;
                    String seller_delivery_time = Constants.NA;
                    int seller_positive_feedback = -1;
                    int seller_negative_feedback = -1;
                    String seller_term_condition = Constants.NA;
                    String seller_alert = Constants.NA;
                    boolean for_sale;
                    String[] state_description = {};
                    boolean premium_account = false;
                    boolean top_merchant;
                    //last order schedule dak pake
                    String[] seller_voucher = {};
                    int waiting_payment;
                    int sold_count;
                    Product.SpecsBean specs = new Product.SpecsBean();
                    String[] specsUkuran = {};
                    String specsBrand = Constants.NA;
                    boolean force_insurance;

                    String id = Constants.NA;
                    String url = Constants.NA;
                    String name = Constants.NA;
                    boolean active = true;
                    String city = Constants.NA;
                    String province = Constants.NA;
                    int weight = -1;
                    long[] image_ids = {};
                    String[] images = {};
                    String[] small_images = {};
                    String desc = Constants.NA;
                    String condition = Constants.NA;
                    int stock = -1;
                    boolean favorited = false;
                    String created_at = Constants.NA;
                    String updated_at = Constants.NA;
                    Product.RatingBean rating = new Product.RatingBean(); //pasti ado
                    Product.DealInfoBean dealInfo = new Product.DealInfoBean(); //biso ado biso idak
                    String average_rate = Constants.NA;
                    int user_count = -1;
                    List<Product.WholesaleBean> wholesale = new ArrayList<>(); //biso iyo bisa idak
                    List<Product.InstallmentBean> installment = new ArrayList<>(); //biso iyo bisa idak
                    String min_installment_price = Constants.NA; //biso iyo biso idak
                    int interest_count = -1;
                    String last_relist_at = Constants.NA;
                    int view_count = -1;


                    JSONObject currentProduct = arrayFavorites.getJSONObject(i);
                    deal_request_state = currentProduct.getString(KEY_REQUEST_STATE);
                    price = currentProduct.getLong(KEY_PRICE);
                    category_id = (Utils.contains(currentProduct, KEY_CATEGORY_ID)) ? currentProduct.getInt(KEY_CATEGORY_ID) : -1;
                    category = (Utils.contains(currentProduct, KEY_CATEGORY)) ? currentProduct.getString(KEY_CATEGORY) : Constants.NA;
                    if (Utils.contains(currentProduct, KEY_CATEGORY_STRUCTURE)) {
                        JSONArray arrCaterory_structure = currentProduct.getJSONArray(KEY_CATEGORY_STRUCTURE);
                        category_structure = new String[arrCaterory_structure.length()];
                        for (int j = 0; j < arrCaterory_structure.length(); j++) {
                            category_structure[j] = arrCaterory_structure.getString(j);
                        }
                    }
                    JSONArray arrCourier = currentProduct.getJSONArray(KEY_COURIER);
                    courier = new String[arrCourier.length()];
                    for (int j = 0; j < arrCourier.length(); j++) {
                        courier[j] = arrCourier.getString(j);
                    }
                    seller_username = currentProduct.getString(KEY_SELLER_USERNAME);
                    seller_name = currentProduct.getString(KEY_SELLER_NAME);
                    seller_id = currentProduct.getLong(KEY_SELLER_ID);
                    seller_avatar = currentProduct.getString(KEY_SELLER_AVATAR);
                    seller_level = currentProduct.getString(KEY_SELLER_lEVEL);
                    seller_level_badge_url = currentProduct.getString(KEY_SELLER_LEVEL_BADGE_URL);
                    seller_delivery_time = currentProduct.getString(KEY_SELLER_DELIVERY_TIME);
                    seller_positive_feedback = currentProduct.getInt(KEY_SELLER_POSITIVE_FEEDBACK);
                    seller_negative_feedback = currentProduct.getInt(KEY_SELLER_NEGATIVE_FEEDBACK);
                    seller_term_condition = currentProduct.getString(KEY_SELLER_TERM_CONDITION);
                    if (Utils.contains(currentProduct, KEY_SELLER_ALERT))
                        seller_alert = currentProduct.getString(KEY_SELLER_ALERT);
                    for_sale = currentProduct.getBoolean(KEY_FOR_SALE);
                    //
                    premium_account = currentProduct.getBoolean(KEY_PREMIUM_ACCOUNT);
                    top_merchant = currentProduct.getBoolean(KEY_TOP_MERCHANT);
//                    if (Utils.contains(currentProduct,KEY_SELLER_VOUCHER)){
//                        L.m("Jalan");
//                        JSONArray arrSeller_Voucher = currentProduct.getJSONArray(KEY_SELLER_VOUCHER);
//                        if (arrSeller_Voucher.length() != 0) {
//                            seller_voucher = new String[arrSeller_Voucher.length()];
//                        }
//                        for (int j = 0; j < seller_voucher.length; j++) {
//                            seller_voucher[j] = arrSeller_Voucher.getString(j);
//                        }
//                    }

                    waiting_payment = currentProduct.getInt(KEY_WAITING_PAYMENT);
                    sold_count = currentProduct.getInt(KEY_SOLD_COUNT);
                    JSONObject jsonSpecs = currentProduct.getJSONObject(KEY_SPECS);
                    if (Utils.contains(jsonSpecs, KEY_SPECS_BRAND))
                        specsBrand = jsonSpecs.getString(KEY_SPECS_BRAND);
                    if (Utils.contains(jsonSpecs, KEY_SPECS_UKURAN)) {
                        JSONArray arrSpecs_Ukuran = jsonSpecs.getJSONArray(KEY_SPECS_UKURAN);
                        specsUkuran = new String[arrSpecs_Ukuran.length()];
                        for (int j = 0; j < arrSpecs_Ukuran.length(); j++) {
                            specsUkuran[j] = arrSpecs_Ukuran.getString(j);
                        }
                    }
                    force_insurance = currentProduct.getBoolean(KEY_FORCE_INSURANCE);
                    if (Utils.contains(currentProduct, Keys.EndpointGetProduct.KEY_ID)) {
                        id = currentProduct.getString(KEY_ID);
                    }
                    url = currentProduct.getString(KEY_URL);
                    name = currentProduct.getString(KEY_NAME);
                    active = currentProduct.getBoolean(KEY_ACTIVE);
                    city = currentProduct.getString(KEY_CITY);
                    province = currentProduct.getString(KEY_PROVINCE);
                    weight = currentProduct.getInt(KEY_WEIGHT);
                    if (Utils.contains(currentProduct, KEY_IMAGE_IDS)) {
                        JSONArray arrImage_ids = currentProduct.getJSONArray(KEY_IMAGE_IDS);
                        image_ids = new long[arrImage_ids.length()];
                        for (int j = 0; j < arrImage_ids.length(); j++) {
                            image_ids[j] = arrImage_ids.getInt(j);
                        }
                    }
                    if (Utils.contains(currentProduct, KEY_IMAGE)) {
                        JSONArray arrImage = currentProduct.getJSONArray(KEY_IMAGE);
                        images = new String[arrImage.length()];
                        for (int j = 0; j < arrImage.length(); j++) {
                            images[j] = arrImage.getString(j);
                        }
                    }
                    if (Utils.contains(currentProduct, KEY_SMALL_IMAGE)) {
                        JSONArray arrImageSmall = currentProduct.getJSONArray(KEY_SMALL_IMAGE);
                        small_images = new String[arrImageSmall.length()];
                        for (int j = 0; j < arrImageSmall.length(); j++) {
                            small_images[j] = arrImageSmall.getString(j);
                        }
                    }
                    desc = currentProduct.getString(KEY_DESC);
                    condition = currentProduct.getString(KEY_CONDITION);
                    stock = currentProduct.getInt(KEY_STOCK);
                    favorited = currentProduct.getBoolean(KEY_FAVORITED);
                    created_at = currentProduct.getString(KEY_CREATED_AT);
                    updated_at = currentProduct.getString(KEY_UPDATE_AT);
                    if (Utils.contains(currentProduct, KEY_RATING)) {
                        JSONObject objRating = currentProduct.getJSONObject(KEY_RATING);
                        if (objRating.getInt(KEY_RATING_AVERAGE_RATE) != 0)
                            average_rate = objRating.getString(KEY_RATING_AVERAGE_RATE);
                        user_count = objRating.getInt(KEY_USER_COUNT);
                    }
                    if (Utils.contains(currentProduct, KEY_WHOSALE)) {
                        JSONArray arrayWhosale = currentProduct.getJSONArray(KEY_WHOSALE);
                        Product.WholesaleBean wholesaleBean = new Product.WholesaleBean();
                        for (int j = 0; j < arrayWhosale.length(); j++) {
                            JSONObject currentWhosale = arrayWhosale.getJSONObject(j);
                            int lower_bound = currentWhosale.getInt("lower_bound");
                            long price_whosale = currentWhosale.getLong("price");
                            wholesaleBean.setLower_bound(lower_bound);
                            wholesaleBean.setPrice(price_whosale);
                            wholesale.add(wholesaleBean);
                        }
                    }
                    long original_price = -1;
                    long discount_price = -1;
                    int discount_percetage = -1;
                    String discount_date = Constants.NA;
                    String state = Constants.NA;
                    if (Utils.contains(currentProduct, KEY_DEAL_INFO)) {
                        JSONObject objDeal = currentProduct.getJSONObject(KEY_DEAL_INFO);
                        original_price = (Utils.contains(objDeal, KEY_DEAL_INFO_ORIGINAL_PRICE) ?
                                objDeal.getLong(KEY_DEAL_INFO_ORIGINAL_PRICE) : -1);
                        discount_price = (Utils.contains(objDeal, KEY_DEAL_INFO_DISCOUNT_PRICE) ?
                                objDeal.getLong(KEY_DEAL_INFO_DISCOUNT_PRICE) : -1);
                        discount_percetage = (Utils.contains(objDeal, KEY_DEAL_INFO_DISCOUNT_PERCENTAGE) ?
                                objDeal.getInt(KEY_DEAL_INFO_DISCOUNT_PERCENTAGE) : -1);
                        discount_date = (Utils.contains(objDeal, KEY_DEAL_INFO_DISCOUNT_DATE) ?
                                objDeal.getString(KEY_DEAL_INFO_DISCOUNT_DATE) : Constants.NA);
                        state = (Utils.contains(objDeal, KEY_DEAL_INFO_STATE) ?
                                objDeal.getString(KEY_DEAL_INFO_STATE) : Constants.NA);

                    }
                    dealInfo.setOriginal_price(original_price);
                    dealInfo.setDiscount_price(discount_price);
                    dealInfo.setDiscount_percentage(discount_percetage);
                    dealInfo.setDiscount_date(discount_date);
                    dealInfo.setState(state);
//                    L.m("Original: " + dealInfo.getOriginal_price());
//                    L.m("Diskon: " + dealInfo.getDiscount_percentage());
                    if (Utils.contains(currentProduct, KEY_INSTALLMENT)) {
                        JSONArray arrayInstalment = currentProduct.getJSONArray(KEY_INSTALLMENT);
                        Product.InstallmentBean installmentBean = new Product.InstallmentBean();
                        for (int j = 0; j < arrayInstalment.length(); j++) {
                            JSONObject currentInstallment = arrayInstalment.getJSONObject(j);
                            String bank_issuer = currentInstallment.getString(KEY_BANK_ISSUER);

                            JSONArray arrayTerm = currentInstallment.getJSONArray(KEY_TERM);
                            int[] terms = new int[arrayTerm.length()];
                            for (int k = 0; k < arrayTerm.length(); k++) {
                                terms[k] = arrayTerm.getInt(k);
                            }
                            String bank_issuer_name = currentInstallment.getString(KEY_BANK_ISSUER_NAME);
                            String bank_acquirer = currentInstallment.getString(KEY_BANK_ACQUIRER);
                            String url_logo = currentInstallment.getString(KEY_URL_LOGO);
                            installmentBean.setBank_issuer(bank_issuer);
                            installmentBean.setTerms(terms);
                            installmentBean.setBank_issuer_name(bank_issuer_name);
                            installmentBean.setBank_acquirer(bank_acquirer);
                            installmentBean.setUrl_logo(url_logo);
                            installment.add(installmentBean);
                        }
                    }
                    if (Utils.contains(currentProduct, KEY_URL_MIN_INSTALMENT_PRICE)) {
                        min_installment_price = currentProduct.getString(KEY_URL_MIN_INSTALMENT_PRICE);
                    }
                    interest_count = currentProduct.getInt(KEY_INTEREST_COUNT);
                    last_relist_at = currentProduct.getString(KEY_LAST_RELIST_AT);
                    view_count = currentProduct.getInt(KEY_VIEW_COUNT);


                    Product product = new Product();
                    product.setDeal_request_state(deal_request_state);
                    product.setPrice(price);
                    product.setCategory_id(category_id);
                    product.setCategory(category);
                    product.setCategory_structure(category_structure);
                    product.setCourier(courier);
                    product.setSeller_username(seller_username);
                    product.setSeller_name(seller_name);
                    product.setSeller_id(seller_id);
                    product.setSeller_avatar(seller_avatar);
                    product.setSeller_level(seller_level);
                    product.setSeller_level_badge_url(seller_level_badge_url);
                    product.setSeller_delivery_time(seller_delivery_time);
                    product.setSeller_positive_feedback(seller_positive_feedback);
                    product.setSeller_negative_feedback(seller_negative_feedback);
                    product.setSeller_term_condition(seller_term_condition);
                    product.setSeller_alert(seller_alert);
                    product.setFor_sale(for_sale);
                    product.setState_description(state_description);
                    product.setPremium_account(premium_account);
                    product.setTop_merchant(top_merchant);
                    product.setSeller_voucher(seller_voucher);
                    product.setWaiting_payment(waiting_payment);
                    product.setSold_count(sold_count);
                    specs.setBrand(specsBrand);
                    specs.setUkuran(specsUkuran);
                    product.setSpecs(specs);
                    product.setForce_insurance(force_insurance);
                    product.setId(id);
                    product.setUrl(url);
                    product.setName(name);
                    product.setActive(active);
                    product.setCity(city);
                    product.setProvince(province);
                    product.setWeight(weight);
                    product.setImage_ids(image_ids);
                    product.setImages(images);
                    product.setSmall_images(small_images);
                    product.setDesc(desc);
                    product.setCondition(condition);
                    product.setStock(stock);
                    product.setFavorited(favorited);
                    product.setCreated_at(created_at);
                    product.setUpdated_at(updated_at);
                    rating.setAverage_rate(average_rate);
                    rating.setUser_count(user_count);
                    product.setRating(rating);
                    product.setWholesale(wholesale);
                    product.setInstallment(installment);
                    product.setMin_installment_price(min_installment_price);
                    product.setInterest_count(interest_count);
                    product.setLast_relist_at(last_relist_at);
                    product.setView_count(view_count);
                    product.setDealInfo(dealInfo);
                    listFavoriteProduct.add(product);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return listFavoriteProduct;
    }

    public static ArrayList<Transaction> parseTransaction(JSONObject response, String typeTransaction, String userId) {
        List<String> stateTagihan = Arrays.asList("pending", "addressed", "payment_chosen", "confirm_payment", "expired", "cancelled", "rejected");
        List<String> statePembelian = Arrays.asList("paid", "delivered", "received", "remitted", "refunded");
        List<String> statePenjualan = Arrays.asList("deliver", "reject", "rejected", "actions", "refunded");
        ArrayList<Transaction> listTransactions = new ArrayList<>();
        try {
            if (response != null && response.getString("status").equals("OK")) {
                try {
                    JSONArray arrayTransaction = response.getJSONArray(KEY_transactions);
                    for (int i = 0; i < arrayTransaction.length(); i++) {
                        long id = -1;
                        String update_at = Constants.NA;
                        boolean unread = false;
                        boolean quick_trans;
                        String transaction_id;
                        long amount;
                        int quantity;
                        String courier;
                        String buyer_notes;
                        //        private Object dropshipper_name;
                        //        private Object dropshipper_notes;
                        long shipping_fee;
                        long shipping_id;
                        String shipping_code;
                        List<Transaction.ShippingHistoryBean> shipping_history = new ArrayList<>();
                        String shipping_service;
                        long insurance_cost;
                        long subtotal_amount;
                        long total_amount;
                        long coded_amount;
                        int uniq_code = -1;
                        boolean use_seller_voucher;
                        boolean use_voucher;
                        long voucher_amount;
                        long promo_payment_amount;
                        long agent_commission_amount;
                        String payment_method;
                        String payment_method_name;
                        long payment_amount;
                        long remit_amount;
                        long service_fee;
                        Transaction.Feedback feedback = new Transaction.Feedback();
                        List<Product> listProduct = new ArrayList<>();
                        String pickup_time = Constants.NA;
                        List<Transaction.AmountDetail> amount_detail = new ArrayList<>();
                        Transaction.Installment installment = new Transaction.Installment();
                        Transaction.Consignee consignee = new Transaction.Consignee();
                        Transaction.Buyer buyer = new Transaction.Buyer();
                        long buyer_id = -1;
                        String buyer_name = Constants.NA;
                        String buyer_username = Constants.NA;
                        String buyer_email = Constants.NA;
                        Transaction.Seller seller = new Transaction.Seller();
                        long seller_id = -1;
                        String seller_name = Constants.NA;
                        String seller_username = Constants.NA;
                        Transaction.Invoice invoice = new Transaction.Invoice();
                        long invoice_id = -1;
                        String invoice_invoice_id = Constants.NA;
                        String invoice_state = Constants.NA;
                        Transaction.VoucherBean voucherBean = new Transaction.VoucherBean();
                        String voucher_code = Constants.NA;
                        String voucher_name = Constants.NA;
                        long voucherB_amount = -1;
                        long voucher_percentage_amount = -1;
                        String created_at = Constants.NA;
                        String deliver_before = Constants.NA;
                        String pay_before = Constants.NA;
                        String reject_reason = Constants.NA;
                        Transaction.StateChanges state_changes = new Transaction.StateChanges();
                        String state_changes_addressed_at = Constants.NA;
                        String state_changes_payment_chosen_at = Constants.NA;
                        String state_changes_paid_at = Constants.NA;
                        String state_changes_accepted_at = Constants.NA;
                        String state_changes_delivered_at = Constants.NA;
                        String state_changes_received_at = Constants.NA;
                        String state_changes_remitted_at = Constants.NA;
                        String state_changes_expired_at = Constants.NA;
                        boolean has_deal_product = false;
                        String return_info = Constants.NA;
                        long total_weight = -1;
                        boolean need_action = false;
                        boolean virtual = false;
                        //    private Object phone_credit;
                        //    private Object logistic_booking;
                        String type = Constants.NA;
                        //    private Object replacement;

                        JSONObject currentTransaction = arrayTransaction.getJSONObject(i);
                        id = currentTransaction.getLong(KEY_id);

                        String state = currentTransaction.getString(KEY_state);

                        L.m(typeTransaction + ": " + state);
                        update_at = currentTransaction.getString(KEY_updated_at);
                        unread = currentTransaction.getBoolean(KEY_unread);
                        quick_trans = currentTransaction.getBoolean(KEY_quick_trans);
                        transaction_id = currentTransaction.getString(KEY_transaction_id);
                        amount = currentTransaction.getLong(KEY_amount);
                        quantity = currentTransaction.getInt(KEY_quantity);
                        courier = currentTransaction.getString(KEY_courier);
                        buyer_notes = currentTransaction.getString(KEY_buyer_notes);
                        shipping_fee = currentTransaction.getLong(KEY_shipping_fee);
                        shipping_id = currentTransaction.getLong(KEY_shipping_id);
                        shipping_code = currentTransaction.getString(KEY_shipping_code);
                        if (Utils.contains(currentTransaction, KEY_shipping_history)) {
                            Transaction.ShippingHistoryBean shippingHistoryBean = new Transaction.ShippingHistoryBean();
                            JSONArray arrayShippingHistory = currentTransaction.getJSONArray(KEY_shipping_history);
                            if (arrayShippingHistory.length() > 0) {
                                for (int j = 0; j < arrayShippingHistory.length(); j++) {
                                    String date = Constants.NA;
                                    String status = Constants.NA;

                                    JSONObject currentShippingHistory = arrayShippingHistory.getJSONObject(j);
                                    date = currentShippingHistory.getString(KEY_shipping_history_date);
                                    status = currentShippingHistory.getString(KEY_shipping_history_status);

                                    shippingHistoryBean.setDate(date);
                                    shippingHistoryBean.setStatus(status);
                                    shipping_history.add(shippingHistoryBean);
                                }
                            }
                        }
                        shipping_service = currentTransaction.getString(KEY_shipping_service);
                        insurance_cost = currentTransaction.getLong(KEY_insurance_cost);
                        subtotal_amount = currentTransaction.getLong(KEY_subtotal_amount);
                        total_amount = currentTransaction.getLong(KEY_total_amount);
                        coded_amount = currentTransaction.getLong(KEY_coded_amount);
                        if (Utils.contains(currentTransaction, KEY_uniq_code))
                            uniq_code = currentTransaction.getInt(KEY_uniq_code);
                        use_seller_voucher = currentTransaction.getBoolean(KEY_use_seller_voucher);
                        use_voucher = currentTransaction.getBoolean(KEY_use_voucher);
                        voucher_amount = currentTransaction.getLong(KEY_voucher_amount);
                        promo_payment_amount = currentTransaction.getLong(KEY_promo_payment_amount);
                        agent_commission_amount = currentTransaction.getLong(KEY_agent_commission_amount);
                        payment_method = currentTransaction.getString(KEY_payment_method);
                        payment_method_name = currentTransaction.getString(KEY_payment_method_name);
                        payment_amount = currentTransaction.getLong(KEY_payment_amount);
                        remit_amount = currentTransaction.getLong(KEY_remit_amount);
                        service_fee = currentTransaction.getLong(KEY_service_fee);
                        JSONObject objectFeedback = currentTransaction.getJSONObject(KEY_feedback);
                        if (Utils.contains(objectFeedback, KEY_feedback_for_seller)) {
                            JSONObject objectFor_Seller = objectFeedback.getJSONObject(KEY_feedback_for_seller);
                            Transaction.ForSallerBean forSallerBean = new Transaction.ForSallerBean();
                            if (Utils.contains(objectFor_Seller, KEY_feedback_for_seller)) {

                                long _id = objectFor_Seller.getLong(KEY_feedback_for_seller_id);
                                long _transaction_id = objectFor_Seller.getLong(KEY_feedback_for_seller_transaction_id);
                                long transaction_no = objectFor_Seller.getLong(KEY_feedback_for_seller_transaction_no);
                                long sender_id = objectFor_Seller.getLong(KEY_feedback_for_seller_sender_id);
                                String sender_name = objectFor_Seller.getString(KEY_feedback_for_seller_sender_name);
                                String sender_type = objectFor_Seller.getString(KEY_feedback_for_seller_sender_type);
                                long user_id = objectFor_Seller.getLong(KEY_feedback_for_seller_user_id);
                                String user_name = objectFor_Seller.getString(KEY_feedback_for_seller_user_name);
                                String body = objectFor_Seller.getString(KEY_feedback_for_seller_body);
                                boolean positive = objectFor_Seller.getBoolean(KEY_feedback_for_seller_positive);
                                String _created_at = objectFor_Seller.getString(KEY_feedback_for_seller_created_at);
                                String updated_at = objectFor_Seller.getString(KEY_feedback_for_seller_updated_at);
                                boolean is_editable = objectFor_Seller.getBoolean(KEY_feedback_for_seller_is_editable);

                                forSallerBean.setId(_id);
                                forSallerBean.setTransaction_id(_transaction_id);
                                forSallerBean.setTransaction_no(transaction_no);
                                forSallerBean.setSender_id(sender_id);
                                forSallerBean.setSender_name(sender_name);
                                forSallerBean.setSender_type(sender_type);
                                forSallerBean.setUser_id(user_id);
                                forSallerBean.setUser_name(user_name);
                                forSallerBean.setBody(body);
                                forSallerBean.setPositive(positive);
                                forSallerBean.setCreated_at(_created_at);
                                forSallerBean.setUpdated_at(updated_at);
                                forSallerBean.setIs_editable(is_editable);
                            }
                            feedback.setFor_seller(forSallerBean);
                        }
                        listProduct = parseListProducts(currentTransaction);
                        if (Utils.contains(currentTransaction, KEY_pickup_time)) {
                            pickup_time = currentTransaction.getString(KEY_pickup_time);
                        }
                        JSONArray arrayAmountDetail = currentTransaction.getJSONArray(KEY_amount_detail);
                        for (int j = 0; j < arrayAmountDetail.length(); j++) {
                            JSONObject objectAmountDetail = arrayAmountDetail.getJSONObject(j);
                            Transaction.AmountDetail amountDetail = new Transaction.AmountDetail();
                            String name = objectAmountDetail.getString(KEY_amount_detail_name);
                            long _amount = (Utils.contains(objectAmountDetail, KEY_amount_detail_amount)) ? objectAmountDetail.getLong(KEY_amount_detail_amount) : -1;
                            amountDetail.setName(name);
                            amountDetail.setAmount(_amount);
                            amount_detail.add(amountDetail);
                        }
                        if (Utils.contains(currentTransaction, KEY_INSTALLMENT)) {
                            JSONObject objInstalmment = currentTransaction.getJSONObject(KEY_INSTALLMENT);
                            int term = -1;
                            String banl_issuer = Constants.NA;
                            if (Utils.contains(objInstalmment, KEY_installment_term)) {
                                term = objInstalmment.getInt(KEY_installment_term);
                            }
                            if (Utils.contains(objInstalmment, KEY_BANK_ISSUER)) {
                                banl_issuer = objInstalmment.getString(KEY_BANK_ISSUER);
                            }
                            installment.setTerm(term);
                            installment.setBank_issuer(banl_issuer);
                        }
                        if (Utils.contains(currentTransaction, KEY_consignee)) {
                            JSONObject objectConsignee = currentTransaction.getJSONObject(KEY_consignee);
                            String name = Constants.NA;
                            String phone = Constants.NA;
                            String address = Constants.NA;
                            String area = Constants.NA;
                            String city = Constants.NA;
                            String province = Constants.NA;
                            String post_code = Constants.NA;

                            if (Utils.contains(objectConsignee, KEY_consignee_name)) {
                                name = objectConsignee.getString(KEY_consignee_name);
                            }
                            if (Utils.contains(objectConsignee, KEY_consignee_phone))
                                phone = objectConsignee.getString(KEY_consignee_phone);
                            if (Utils.contains(objectConsignee, KEY_consignee_address))
                                address = objectConsignee.getString(KEY_consignee_address);
                            if (Utils.contains(objectConsignee, KEY_consignee_area))
                                area = objectConsignee.getString(KEY_consignee_area);
                            if (Utils.contains(objectConsignee, KEY_consignee_city))
                                city = objectConsignee.getString(KEY_consignee_city);
                            if (Utils.contains(objectConsignee, KEY_consignee_province))
                                province = objectConsignee.getString(KEY_consignee_province);
                            if (Utils.contains(objectConsignee, KEY_consignee_post_code))
                                post_code = objectConsignee.getString(KEY_consignee_post_code);

                            consignee.setName(name);
                            consignee.setPhone(phone);
                            consignee.setAddress(address);
                            consignee.setArea(area);
                            consignee.setCity(city);
                            consignee.setProvince(province);
                            consignee.setPost_code(post_code);
                        }
                        JSONObject objectBuyer = currentTransaction.getJSONObject(KEY_buyer);
                        buyer_id = objectBuyer.getLong(KEY_buyer_id);
                        buyer_name = objectBuyer.getString(KEY_buyer_name);
                        buyer_username = objectBuyer.getString(KEY_buyer_username);
                        buyer_email = objectBuyer.getString(KEY_buyer_email);
                        buyer.setId(buyer_id);
                        buyer.setName(buyer_name);
                        buyer.setUsername(buyer_username);
                        buyer.setEmail(buyer_email);
                        JSONObject objectSeller = currentTransaction.getJSONObject(KEY_seller);
                        seller_id = objectSeller.getLong(KEY_buyer_id);
                        seller_name = objectSeller.getString(KEY_seller_name);
                        seller_username = objectSeller.getString(KEY_seller_username);
                        seller.setId(seller_id);
                        seller.setName(seller_name);
                        seller.setUsername(seller_username);
                        if (Utils.contains(currentTransaction, KEY_invoice)) {
                            JSONObject objectInvoice = currentTransaction.getJSONObject(KEY_invoice);
                            invoice_id = objectInvoice.getLong(KEY_invoice_id);
                            invoice_invoice_id = objectInvoice.getString(KEY_invoice_invoice_id);
                            invoice_state = objectInvoice.getString(KEY_invoice_state);
                            invoice.setId(invoice_id);
                            invoice.setInvoice_id(invoice_invoice_id);
                            invoice.setState(invoice_state);
                        }
                        if (Utils.contains(currentTransaction, KEY_voucher)) {
                            JSONObject objectVoucher = currentTransaction.getJSONObject(KEY_voucher);
                            if (Utils.contains(objectVoucher, KEY_voucher_code))
                                voucher_code = objectVoucher.getString(KEY_voucher_code);
                            if (Utils.contains(objectVoucher, KEY_voucher_name))
                                voucher_name = objectVoucher.getString(KEY_voucher_name);
                            if (Utils.contains(objectVoucher, KEY_voucher_amount))
                                voucherB_amount = objectVoucher.getLong(KEY_voucher_amount);
                            if (Utils.contains(objectVoucher, KEY_voucher_percentage_amount))
                                voucher_percentage_amount = objectVoucher.getLong(KEY_voucher_percentage_amount);
                            voucherBean.setCode(voucher_code);
                            voucherBean.setName(voucher_name);
                            voucherBean.setAmount(voucherB_amount);
                            voucherBean.setPercentage_amount(voucher_percentage_amount);
                        }


                        created_at = currentTransaction.getString(KEY_created_at);
                        deliver_before = currentTransaction.getString(KEY_deliver_before);
                        pay_before = currentTransaction.getString(KEY_pay_before);
                        reject_reason = currentTransaction.getString(KEY_reject_reason);

                        JSONObject objectStateChange = currentTransaction.getJSONObject(KEY_state_changes);
                        state_changes_addressed_at = (Utils.contains(objectStateChange, KEY_state_changes_addressed_at)) ?
                                objectStateChange.getString(KEY_state_changes_addressed_at) : Constants.NA;
                        state_changes_payment_chosen_at = (Utils.contains(objectStateChange, KEY_state_changes_payment_chosen_at)) ?
                                objectStateChange.getString(KEY_state_changes_payment_chosen_at) : Constants.NA;
                        state_changes_paid_at = (Utils.contains(objectStateChange, KEY_state_changes_paid_at)) ?
                                objectStateChange.getString(KEY_state_changes_paid_at) : Constants.NA;
                        state_changes_accepted_at = (Utils.contains(objectStateChange, KEY_state_changes_accepted_at)) ?
                                objectStateChange.getString(KEY_state_changes_accepted_at) : Constants.NA;
                        state_changes_delivered_at = (Utils.contains(objectStateChange, KEY_state_changes_delivered_at)) ?
                                objectStateChange.getString(KEY_state_changes_delivered_at) : Constants.NA;
                        state_changes_received_at = (Utils.contains(objectStateChange, KEY_state_changes_received_at)) ?
                                objectStateChange.getString(KEY_state_changes_received_at) : Constants.NA;
                        state_changes_remitted_at = (Utils.contains(objectStateChange, KEY_state_changes_remitted_at)) ?
                                objectStateChange.getString(KEY_state_changes_remitted_at) : Constants.NA;
                        state_changes_expired_at = (Utils.contains(objectStateChange, KEY_state_changes_expired_at)) ?
                                objectStateChange.getString(KEY_state_changes_expired_at) : Constants.NA;
                        state_changes.setAddressed_at(state_changes_addressed_at);
                        state_changes.setPayment_chosen_at(state_changes_payment_chosen_at);
                        state_changes.setPaid_at(state_changes_paid_at);
                        state_changes.setAccepted_at(state_changes_accepted_at);
                        state_changes.setDelivered_at(state_changes_delivered_at);
                        state_changes.setReceived_at(state_changes_received_at);
                        state_changes.setRemitted_at(state_changes_remitted_at);
                        state_changes.setExpired_at(state_changes_expired_at);

                        has_deal_product = (Utils.contains(currentTransaction, KEY_has_deal_product)) ?
                                currentTransaction.getBoolean(KEY_has_deal_product) : false;
                        return_info = (Utils.contains(currentTransaction, KEY_return_info)) ?
                                currentTransaction.getString(KEY_return_info) : Constants.NA;
                        total_weight = currentTransaction.getLong(KEY_total_weight);
                        need_action = (Utils.contains(currentTransaction, KEY_need_action)) ?
                                currentTransaction.getBoolean(KEY_need_action) : false;
                        virtual = (Utils.contains(currentTransaction, KEY_virtual)) ?
                                currentTransaction.getBoolean(KEY_virtual) : false;
                        type = currentTransaction.getString(KEY_type);


                        Transaction transaction = new Transaction();
                        transaction.setId(id);
                        transaction.setState(invoice_state);
                        transaction.setUpdated_at(update_at);
                        transaction.setUnread(unread);
                        transaction.setQuick_trans(quick_trans);
                        transaction.setTransaction_id(transaction_id);
                        transaction.setAmount(amount);
                        transaction.setQuantity(quantity);
                        transaction.setCourier(courier);
                        transaction.setBuyer_notes(buyer_notes);
                        transaction.setShipping_fee(shipping_fee);
                        transaction.setShipping_id(shipping_id);
                        transaction.setShipping_code(shipping_code);
                        transaction.setShipping_history(shipping_history);
                        transaction.setShipping_service(shipping_service);
                        transaction.setInsurance_cost(insurance_cost);
                        transaction.setSubtotal_amount(subtotal_amount);
                        transaction.setTotal_amount(total_amount);
                        transaction.setCoded_amount(coded_amount);
                        transaction.setUniq_code(uniq_code);
                        transaction.setUse_seller_voucher(use_seller_voucher);
                        transaction.setUse_voucher(use_voucher);
                        transaction.setVoucher_amount(voucher_amount);
                        transaction.setPromo_payment_amount(promo_payment_amount);
                        transaction.setAgent_commission_amount(agent_commission_amount);
                        transaction.setPayment_method(payment_method);
                        transaction.setPayment_method_name(payment_method_name);
                        transaction.setPayment_amount(payment_amount);
                        transaction.setRemit_amount(remit_amount);
                        transaction.setService_fee(service_fee);
                        transaction.setFeedback(feedback);
                        transaction.setProducts(listProduct);
                        transaction.setPickup_time(pickup_time);
                        transaction.setInstallment(installment);
                        transaction.setConsignee(consignee);
                        transaction.setBuyer(buyer);
                        transaction.setSeller(seller);
                        transaction.setInvoice(invoice);
                        transaction.setVoucher(voucherBean);
                        transaction.setCreated_at(created_at);
                        transaction.setDeliver_before(deliver_before);
                        transaction.setPay_before(pay_before);
                        transaction.setReject_reason(reject_reason);
                        transaction.setState_changes(state_changes);
                        transaction.setHas_deal_product(has_deal_product);
                        transaction.setReturn_info(return_info);
                        transaction.setTotal_weight(total_weight);
                        transaction.setNeed_action(need_action);
                        transaction.setVirtual(virtual);
                        transaction.setType(type);


                        if (typeTransaction.equals("tagihan") && stateTagihan.contains(state)) {
                            listTransactions.add(transaction);
                        } else if (typeTransaction.equals("pembelian") && statePembelian.contains(state)) {
                            listTransactions.add(transaction);
                        } else if (typeTransaction.equals("penjualan") && userId.equals(String.valueOf(seller_id))) {
                            listTransactions.add(transaction);
                        }
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listTransactions;
    }

    public static ArrayList<Cart> parseCarts(JSONObject response) {
        ArrayList<Cart> listCarts = new ArrayList<>();
        try {
            if (response != null && response.getString(KEY_cart_status).equals("OK")) {
                JSONArray arrayCart = response.getJSONArray(KEY_cart);
                L.m(arrayCart.length() + "");
                for (int i = 0; i < arrayCart.length(); i++) {
                    Cart.SellerBean sellerBean = new Cart.SellerBean();
                    long sellerId = -1;
                    String sellerusername = Constants.NA;
                    String sellername = Constants.NA;
                    String sellergender = Constants.NA;
                    String selleravatar = Constants.NA;
                    String sellerlevel = Constants.NA;
                    String sellerlevel_badge_url = Constants.NA;
                    String sellerlapak_name = Constants.NA;
                    String sellerlapak_desc = Constants.NA;
                    String sellerlapak_header = Constants.NA;
                    String sellerlast_login = Constants.NA;
                    String sellerjoined_at = Constants.NA;
                    boolean sellerverified_user = false;
                    boolean sellerofficial = false;
                    boolean sellerstore_closed = false;
//                    boolean sellerschedule_close_store = false;
                    String sellerclose_date = Constants.NA;
                    String sellerreopen_date = Constants.NA;
                    String sellerclose_reason = Constants.NA;
                    String sellerdelivery_time = Constants.NA;
                    Cart.SellerBean.RejectionBean rejection = new Cart.SellerBean.RejectionBean();
                    int rejectionRejected = -1;
                    int rejectionRecent_trans = -1;
                    Cart.SellerBean.AddressBean address = new Cart.SellerBean.AddressBean();
                    String addressProvince = Constants.NA;
                    String addressCity = Constants.NA;
                    int subscriber_amount = -1;
                    boolean premium_user = false;
                    boolean top_merchant = false;
                    boolean is_seller;
                    Cart.SellerBean.FeedbacksBean feedbacks = new Cart.SellerBean.FeedbacksBean();
                    int feedbackspositive = -1;
                    int feedbacksnegative = -1;
                    List<Cart.ItemsBean> itemsBeen = new ArrayList<>();
                    long agent_commission = -1;
                    List<Cart.InstallmentBeann> installment = new ArrayList<>();

                    JSONObject currentCart = arrayCart.getJSONObject(i);

                    JSONObject objectSeller = currentCart.getJSONObject(Keys.EndpointGetCart.KEY_seller);
                    sellerId = objectSeller.getLong(Keys.EndpointGetCart.KEY_id);
                    sellerusername = objectSeller.getString(KEY_username);
                    sellername = objectSeller.getString(KEY_name);
                    sellergender = objectSeller.getString(KEY_gender);
                    selleravatar = objectSeller.getString(KEY_avatar);
                    sellerlevel = (Utils.contains(objectSeller, KEY_seller_level)) ? objectSeller.getString(KEY_seller_level) : Constants.NA;
                    sellerlevel_badge_url = objectSeller.getString(KEY_level_badge_url);
                    sellerlapak_name = objectSeller.getString(KEY_lapak_name);
                    sellerlapak_desc = (Utils.contains(objectSeller, KEY_lapak_desc)) ? objectSeller.getString(KEY_lapak_desc) : Constants.NA;
                    sellerlapak_header = objectSeller.getString(KEY_lapak_header);
                    sellerlast_login = objectSeller.getString(KEY_last_login);
                    sellerjoined_at = objectSeller.getString(KEY_joined_at);
                    sellerverified_user = objectSeller.getBoolean(KEY_verified_user);
                    sellerofficial = objectSeller.getBoolean(KEY_official);
                    sellerstore_closed = objectSeller.getBoolean(KEY_store_closed);
                    sellerclose_date = (Utils.contains(objectSeller, KEY_close_date)) ? objectSeller.getString(KEY_close_date) : Constants.NA;
                    sellerreopen_date = (Utils.contains(objectSeller, KEY_reopen_date)) ? objectSeller.getString(KEY_reopen_date) : Constants.NA;
                    sellerclose_reason = (Utils.contains(objectSeller, KEY_close_reason)) ? objectSeller.getString(KEY_close_reason) : Constants.NA;
                    sellerdelivery_time = (Utils.contains(objectSeller, KEY_delivery_time)) ? objectSeller.getString(KEY_delivery_time) : Constants.NA;

                    JSONObject objectRejection = objectSeller.getJSONObject(KEY_rejection);
                    rejectionRejected = objectRejection.getInt(KEY_rejected);
                    rejectionRecent_trans = objectRejection.getInt(KEY_recent_trans);
                    rejection.setRejected(rejectionRejected);
                    rejection.setRecent_trans(rejectionRecent_trans);

                    JSONObject objectAdress = objectSeller.getJSONObject(KEY_address);
                    addressProvince = (Utils.contains(objectAdress, KEY_province)) ? objectAdress.getString(KEY_province) : Constants.NA;
                    addressCity = (Utils.contains(objectAdress, KEY_city)) ? objectAdress.getString(KEY_city) : Constants.NA;
                    address.setProvince(addressProvince);
                    address.setCity(addressCity);

                    subscriber_amount = objectSeller.getInt(KEY_subscriber_amount);
                    premium_user = objectSeller.getBoolean(KEY_premium_user);
                    top_merchant = objectSeller.getBoolean(KEY_top_merchant);
                    is_seller = objectSeller.getBoolean(KEY_is_seller);

                    JSONObject objectFeedbacks = objectSeller.getJSONObject(KEY_feedbacks);
                    feedbackspositive = (Utils.contains(objectFeedbacks, KEY_positive)) ? objectFeedbacks.getInt(KEY_positive) : -1;
                    feedbacksnegative = (Utils.contains(objectFeedbacks, KEY_negative)) ? objectFeedbacks.getInt(KEY_negative) : -1;
                    feedbacks.setPositive(feedbackspositive);
                    feedbacks.setNegative(feedbacksnegative);

                    JSONArray arrayItems = currentCart.getJSONArray(KEY_items);
                    for (int j = 0; j < arrayItems.length(); j++) {
                        JSONObject currentItems = arrayItems.getJSONObject(j);
                        Cart.ItemsBean itemsBean = new Cart.ItemsBean();
                        long id = -1;
                        String name = Constants.NA;
                        int quantity = -1;
                        long price = -1;
                        int stock = -1;
                        String message = Constants.NA;
                        Product product = new Product();
                        long original_price = -1;
                        long discount_price = -1;

                        id = currentItems.getLong(Keys.EndpointGetCart.KEY_id);
                        name = currentItems.getString(KEY_name);
                        quantity = currentItems.getInt(KEY_quantity);
                        price = currentItems.getLong(KEY_price);
                        stock = currentItems.getInt(KEY_stock);
                        message = currentItems.getString(KEY_message);
                        JSONObject objectProduct = currentItems.getJSONObject(KEY_product);
                        product = parseProduct(objectProduct);
                        original_price = currentItems.getLong(KEY_original_price);
                        discount_price = currentItems.getLong(KEY_discount_price);

                        itemsBean.setId(id);
                        itemsBean.setName(name);
                        itemsBean.setQuantity(quantity);
                        itemsBean.setPrice(price);
                        itemsBean.setStock(stock);
                        itemsBean.setMessage(message);
                        itemsBean.setProduct(product);
                        itemsBean.setOriginal_price(original_price);
                        itemsBean.setDiscount_price(discount_price);

                        itemsBeen.add(itemsBean);

                    }


                    sellerBean.setId(sellerId);
                    sellerBean.setUsername(sellerusername);
                    sellerBean.setName(sellername);
                    sellerBean.setGender(sellergender);
                    sellerBean.setAvatar(selleravatar);
                    sellerBean.setLevel(sellerlevel);
                    sellerBean.setLevel_badge_url(sellerlevel_badge_url);
                    sellerBean.setLapak_name(sellerlapak_name);
                    sellerBean.setLapak_desc(sellerlapak_desc);
                    sellerBean.setLapak_header(sellerlapak_header);
                    sellerBean.setLast_login(sellerlast_login);
                    sellerBean.setJoined_at(sellerjoined_at);
                    sellerBean.setVerified_user(sellerverified_user);
                    sellerBean.setOfficial(sellerofficial);
                    sellerBean.setStore_closed(sellerstore_closed);
                    sellerBean.setClose_date(sellerclose_date);
                    sellerBean.setReopen_date(sellerreopen_date);
                    sellerBean.setClose_reason(sellerclose_reason);
                    sellerBean.setDelivery_time(sellerdelivery_time);
                    sellerBean.setRejection(rejection);
                    sellerBean.setAddress(address);
                    sellerBean.setSubscriber_amount(subscriber_amount);
                    sellerBean.setPremium_user(premium_user);
                    sellerBean.setTop_merchant(top_merchant);
                    sellerBean.setIs_seller(is_seller);
                    sellerBean.setFeedbacks(feedbacks);

                    agent_commission = (Utils.contains(currentCart, KEY_agent_commission)) ? currentCart.getLong(KEY_agent_commission) : -1;


                    if (Utils.contains(currentCart, KEY_INSTALLMENT)) {
                        JSONArray arrayInstalment = currentCart.getJSONArray(KEY_INSTALLMENT);
                        Cart.InstallmentBeann installmentBean = new Cart.InstallmentBeann();
                        for (int j = 0; j < arrayInstalment.length(); j++) {
                            JSONObject currentInstallment = arrayInstalment.getJSONObject(j);
                            String bank_issuer = currentInstallment.getString(KEY_BANK_ISSUER);

                            JSONArray arrayTerm = currentInstallment.getJSONArray(KEY_TERM);
                            int[] terms = new int[arrayTerm.length()];
                            for (int k = 0; k < arrayTerm.length(); k++) {
                                terms[k] = arrayTerm.getInt(k);
                            }
                            installmentBean.setBank_issuer(bank_issuer);
                            installmentBean.setTerms(terms);

                            installment.add(installmentBean);
                        }
                    }


                    Cart cart = new Cart();
                    cart.setSeller(sellerBean);
                    cart.setItems(itemsBeen);
                    cart.setAgent_commission(agent_commission);
                    cart.setInstallment(installment);


                    listCarts.add(cart);

                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listCarts;
    }

    public static Product parseProduct(JSONObject response) {
        Product product = new Product();
        String deal_request_state = Constants.NA;
        long price = -1;
        int category_id = -1;
        String category = Constants.NA;
        String[] category_structure = {""};
        String[] courier = {""};
        String seller_username = Constants.NA;
        String seller_name = Constants.NA;
        long seller_id = -1;
        String seller_avatar = Constants.NA;
        String seller_level = Constants.NA;
        String seller_level_badge_url = Constants.NA;
        String seller_delivery_time = Constants.NA;
        int seller_positive_feedback = -1;
        int seller_negative_feedback = -1;
        String seller_term_condition = Constants.NA;
        String seller_alert = Constants.NA;
        boolean for_sale;
        String[] state_description = {};
        boolean premium_account = false;
        boolean top_merchant;
        //last order schedule dak pake
        String[] seller_voucher = {};
        int waiting_payment;
        int sold_count;
        Product.SpecsBean specs = new Product.SpecsBean();
        String[] specsUkuran = {};
        String specsBrand = Constants.NA;
        boolean force_insurance;

        String id = Constants.NA;
        String url = Constants.NA;
        String name = Constants.NA;
        boolean active = true;
        String city = Constants.NA;
        String province = Constants.NA;
        int weight = -1;
        long[] image_ids = {};
        String[] images = {};
        String[] small_images = {};
        String desc = Constants.NA;
        String condition = Constants.NA;
        int stock = -1;
        boolean favorited = false;
        String created_at = Constants.NA;
        String updated_at = Constants.NA;
        Product.RatingBean rating = new Product.RatingBean(); //pasti ado
        Product.DealInfoBean dealInfo = new Product.DealInfoBean(); //biso ado biso idak
        String average_rate = Constants.NA;
        int user_count = -1;
        List<Product.WholesaleBean> wholesale = new ArrayList<>(); //biso iyo bisa idak
        List<Product.InstallmentBean> installment = new ArrayList<>(); //biso iyo bisa idak
        String min_installment_price = Constants.NA; //biso iyo biso idak
        int interest_count = -1;
        String last_relist_at = Constants.NA;
        int view_count = -1;


        JSONObject currentProduct = null;
        try {
            currentProduct = response;
            deal_request_state = (Utils.contains(currentProduct,KEY_deal_request_state))?currentProduct.getString(KEY_deal_request_state):Constants.NA;
            price = currentProduct.getLong(KEY_PRICE);
            category_id = (Utils.contains(currentProduct, KEY_CATEGORY_ID)) ? currentProduct.getInt(KEY_CATEGORY_ID) : -1;
            category = (Utils.contains(currentProduct, KEY_CATEGORY)) ? currentProduct.getString(KEY_CATEGORY) : Constants.NA;
            if (Utils.contains(currentProduct, KEY_CATEGORY_STRUCTURE)) {
                JSONArray arrCaterory_structure = currentProduct.getJSONArray(KEY_CATEGORY_STRUCTURE);
                category_structure = new String[arrCaterory_structure.length()];
                for (int j = 0; j < arrCaterory_structure.length(); j++) {
                    category_structure[j] = arrCaterory_structure.getString(j);
                }
            }
            JSONArray arrCourier = currentProduct.getJSONArray(KEY_COURIER);
            courier = new String[arrCourier.length()];
            for (int j = 0; j < arrCourier.length(); j++) {
                courier[j] = arrCourier.getString(j);
            }
            seller_username = currentProduct.getString(KEY_SELLER_USERNAME);
            seller_name = currentProduct.getString(KEY_SELLER_NAME);
            seller_id = currentProduct.getLong(KEY_SELLER_ID);
            seller_avatar = currentProduct.getString(KEY_SELLER_AVATAR);
            seller_level = currentProduct.getString(KEY_SELLER_lEVEL);
            seller_level_badge_url = currentProduct.getString(KEY_SELLER_LEVEL_BADGE_URL);
            seller_delivery_time = currentProduct.getString(KEY_SELLER_DELIVERY_TIME);
            seller_positive_feedback = currentProduct.getInt(KEY_SELLER_POSITIVE_FEEDBACK);
            seller_negative_feedback = currentProduct.getInt(KEY_SELLER_NEGATIVE_FEEDBACK);
            seller_term_condition = currentProduct.getString(KEY_SELLER_TERM_CONDITION);
            if (Utils.contains(currentProduct, KEY_SELLER_ALERT))
                seller_alert = currentProduct.getString(KEY_SELLER_ALERT);
            for_sale = currentProduct.getBoolean(KEY_FOR_SALE);
            //
            premium_account = currentProduct.getBoolean(KEY_PREMIUM_ACCOUNT);
            top_merchant = currentProduct.getBoolean(KEY_TOP_MERCHANT);
//                    if (Utils.contains(currentProduct,KEY_SELLER_VOUCHER)){
//                        L.m("Jalan");
//                        JSONArray arrSeller_Voucher = currentProduct.getJSONArray(KEY_SELLER_VOUCHER);
//                        if (arrSeller_Voucher.length() != 0) {
//                            seller_voucher = new String[arrSeller_Voucher.length()];
//                        }
//                        for (int j = 0; j < seller_voucher.length; j++) {
//                            seller_voucher[j] = arrSeller_Voucher.getString(j);
//                        }
//                    }

            waiting_payment = currentProduct.getInt(KEY_WAITING_PAYMENT);
            sold_count = currentProduct.getInt(KEY_SOLD_COUNT);
            JSONObject jsonSpecs = currentProduct.getJSONObject(KEY_SPECS);
            if (Utils.contains(jsonSpecs, KEY_SPECS_BRAND))
                specsBrand = jsonSpecs.getString(KEY_SPECS_BRAND);
            if (Utils.contains(jsonSpecs, KEY_SPECS_UKURAN)) {
//                JSONArray arrSpecs_Ukuran = jsonSpecs.getJSONArray(KEY_SPECS_UKURAN);
//                specsUkuran = new String[arrSpecs_Ukuran.length()];
//                for (int j = 0; j < arrSpecs_Ukuran.length(); j++) {
//                    specsUkuran[j] = arrSpecs_Ukuran.getString(j);
//                }
            }
            force_insurance = currentProduct.getBoolean(KEY_FORCE_INSURANCE);
            if (Utils.contains(currentProduct, Keys.EndpointGetProduct.KEY_ID)) {
                id = currentProduct.getString(KEY_ID);
            }
            url = currentProduct.getString(KEY_URL);
            name = currentProduct.getString(KEY_NAME);
            active = currentProduct.getBoolean(KEY_ACTIVE);
            city = currentProduct.getString(KEY_CITY);
            province = currentProduct.getString(KEY_PROVINCE);
            weight = currentProduct.getInt(KEY_WEIGHT);
            if (Utils.contains(currentProduct, KEY_IMAGE_IDS)) {
                JSONArray arrImage_ids = currentProduct.getJSONArray(KEY_IMAGE_IDS);
                image_ids = new long[arrImage_ids.length()];
                for (int j = 0; j < arrImage_ids.length(); j++) {
                    image_ids[j] = arrImage_ids.getInt(j);
                }
            }
            if (Utils.contains(currentProduct, KEY_IMAGE)) {
                JSONArray arrImage = currentProduct.getJSONArray(KEY_IMAGE);
                images = new String[arrImage.length()];
                for (int j = 0; j < arrImage.length(); j++) {
                    images[j] = arrImage.getString(j);
                }
            }
            if (Utils.contains(currentProduct, KEY_SMALL_IMAGE)) {
                JSONArray arrImageSmall = currentProduct.getJSONArray(KEY_SMALL_IMAGE);
                small_images = new String[arrImageSmall.length()];
                for (int j = 0; j < arrImageSmall.length(); j++) {
                    small_images[j] = arrImageSmall.getString(j);
                }
            }
            desc = currentProduct.getString(KEY_DESC);
            condition = currentProduct.getString(KEY_CONDITION);
            stock = currentProduct.getInt(KEY_STOCK);
            favorited = currentProduct.getBoolean(KEY_FAVORITED);
            created_at = currentProduct.getString(KEY_CREATED_AT);
            updated_at = currentProduct.getString(KEY_UPDATE_AT);
            if (Utils.contains(currentProduct, KEY_RATING)) {
                JSONObject objRating = currentProduct.getJSONObject(KEY_RATING);
                if (objRating.getInt(KEY_RATING_AVERAGE_RATE) != 0)
                    average_rate = objRating.getString(KEY_RATING_AVERAGE_RATE);
                user_count = objRating.getInt(KEY_USER_COUNT);
            }
            if (Utils.contains(currentProduct, KEY_WHOSALE)) {
                JSONArray arrayWhosale = currentProduct.getJSONArray(KEY_WHOSALE);
                Product.WholesaleBean wholesaleBean = new Product.WholesaleBean();
                for (int j = 0; j < arrayWhosale.length(); j++) {
                    JSONObject currentWhosale = arrayWhosale.getJSONObject(j);
                    int lower_bound = currentWhosale.getInt("lower_bound");
                    long price_whosale = currentWhosale.getLong("price");
                    wholesaleBean.setLower_bound(lower_bound);
                    wholesaleBean.setPrice(price_whosale);
                    wholesale.add(wholesaleBean);
                }
            }
            long original_price = -1;
            long discount_price = -1;
            int discount_percetage = -1;
            String discount_date = Constants.NA;
            String state = Constants.NA;
            if (Utils.contains(currentProduct, KEY_DEAL_INFO)) {
                JSONObject objDeal = currentProduct.getJSONObject(KEY_DEAL_INFO);
                original_price = (Utils.contains(objDeal, KEY_DEAL_INFO_ORIGINAL_PRICE) ?
                        objDeal.getLong(KEY_DEAL_INFO_ORIGINAL_PRICE) : -1);
                discount_price = (Utils.contains(objDeal, KEY_DEAL_INFO_DISCOUNT_PRICE) ?
                        objDeal.getLong(KEY_DEAL_INFO_DISCOUNT_PRICE) : -1);
                discount_percetage = (Utils.contains(objDeal, KEY_DEAL_INFO_DISCOUNT_PERCENTAGE) ?
                        objDeal.getInt(KEY_DEAL_INFO_DISCOUNT_PERCENTAGE) : -1);
                discount_date = (Utils.contains(objDeal, KEY_DEAL_INFO_DISCOUNT_DATE) ?
                        objDeal.getString(KEY_DEAL_INFO_DISCOUNT_DATE) : Constants.NA);
                state = (Utils.contains(objDeal, KEY_DEAL_INFO_STATE) ?
                        objDeal.getString(KEY_DEAL_INFO_STATE) : Constants.NA);

            }
            dealInfo.setOriginal_price(original_price);
            dealInfo.setDiscount_price(discount_price);
            dealInfo.setDiscount_percentage(discount_percetage);
            dealInfo.setDiscount_date(discount_date);
            dealInfo.setState(state);
//                    L.m("Original: " + dealInfo.getOriginal_price());
//                    L.m("Diskon: " + dealInfo.getDiscount_percentage());
            if (Utils.contains(currentProduct, KEY_INSTALLMENT)) {
                JSONArray arrayInstalment = currentProduct.getJSONArray(KEY_INSTALLMENT);
                Product.InstallmentBean installmentBean = new Product.InstallmentBean();
                for (int j = 0; j < arrayInstalment.length(); j++) {
                    JSONObject currentInstallment = arrayInstalment.getJSONObject(j);
                    String bank_issuer = currentInstallment.getString(KEY_BANK_ISSUER);

                    JSONArray arrayTerm = currentInstallment.getJSONArray(KEY_TERM);
                    int[] terms = new int[arrayTerm.length()];
                    for (int k = 0; k < arrayTerm.length(); k++) {
                        terms[k] = arrayTerm.getInt(k);
                    }
                    String bank_issuer_name = currentInstallment.getString(KEY_BANK_ISSUER_NAME);
                    String bank_acquirer = currentInstallment.getString(KEY_BANK_ACQUIRER);
                    String url_logo = currentInstallment.getString(KEY_URL_LOGO);
                    installmentBean.setBank_issuer(bank_issuer);
                    installmentBean.setTerms(terms);
                    installmentBean.setBank_issuer_name(bank_issuer_name);
                    installmentBean.setBank_acquirer(bank_acquirer);
                    installmentBean.setUrl_logo(url_logo);
                    installment.add(installmentBean);
                }
            }
            if (Utils.contains(currentProduct, KEY_URL_MIN_INSTALMENT_PRICE)) {
                min_installment_price = currentProduct.getString(KEY_URL_MIN_INSTALMENT_PRICE);
            }
            interest_count = currentProduct.getInt(KEY_INTEREST_COUNT);
            last_relist_at = currentProduct.getString(KEY_LAST_RELIST_AT);
            view_count = currentProduct.getInt(KEY_VIEW_COUNT);


            product.setDeal_request_state(deal_request_state);
            product.setPrice(price);
            product.setCategory_id(category_id);
            product.setCategory(category);
            product.setCategory_structure(category_structure);
            product.setCourier(courier);
            product.setSeller_username(seller_username);
            product.setSeller_name(seller_name);
            product.setSeller_id(seller_id);
            product.setSeller_avatar(seller_avatar);
            product.setSeller_level(seller_level);
            product.setSeller_level_badge_url(seller_level_badge_url);
            product.setSeller_delivery_time(seller_delivery_time);
            product.setSeller_positive_feedback(seller_positive_feedback);
            product.setSeller_negative_feedback(seller_negative_feedback);
            product.setSeller_term_condition(seller_term_condition);
            product.setSeller_alert(seller_alert);
            product.setFor_sale(for_sale);
            product.setState_description(state_description);
            product.setPremium_account(premium_account);
            product.setTop_merchant(top_merchant);
            product.setSeller_voucher(seller_voucher);
            product.setWaiting_payment(waiting_payment);
            product.setSold_count(sold_count);
            specs.setBrand(specsBrand);
            specs.setUkuran(specsUkuran);
            product.setSpecs(specs);
            product.setForce_insurance(force_insurance);
            product.setId(id);
            product.setUrl(url);
            product.setName(name);
            product.setActive(active);
            product.setCity(city);
            product.setProvince(province);
            product.setWeight(weight);
            product.setImage_ids(image_ids);
            product.setImages(images);
            product.setSmall_images(small_images);
            product.setDesc(desc);
            product.setCondition(condition);
            product.setStock(stock);
            product.setFavorited(favorited);
            product.setCreated_at(created_at);
            product.setUpdated_at(updated_at);
            rating.setAverage_rate(average_rate);
            rating.setUser_count(user_count);
            product.setRating(rating);
            product.setWholesale(wholesale);
            product.setInstallment(installment);
            product.setMin_installment_price(min_installment_price);
            product.setInterest_count(interest_count);
            product.setLast_relist_at(last_relist_at);
            product.setView_count(view_count);
            product.setDealInfo(dealInfo);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return product;
    }

    public static Custom1 parseCustomList1(JSONObject responseProductBL, JSONObject responseProductCustom) {
        Custom1 custom1 = new Custom1();
        Product product = new Product();
        List<Custom1.KategoriBean> kategori = new ArrayList<>();
        Custom1.KategoriBean kategoriBean = new Custom1.KategoriBean();
        List<Custom1.BahanBean> bahan = new ArrayList<>();
        List<Custom1.UkuranBean> ukuran = new ArrayList<>();
        List<Custom1.WarnaBean> warna = new ArrayList<>();
        List<Custom1.MotifBean> motif = new ArrayList<>();

        try {
            product = parseProduct(responseProductBL.getJSONObject(KEY_PRODUCT));

            JSONArray arrayKategori = responseProductCustom.getJSONArray(Keys.EndpointGetCustomProduk.KEY_kategori);
            JSONObject objectKategori = arrayKategori.getJSONObject(0);
            String nama_fashion = objectKategori.getString(KEY_nama_fashion);
            String nama_kategori = objectKategori.getString(KEY_nama_kategori);
            String id_jenis = objectKategori.getString(KEY_id_jenis);
            kategoriBean.setId_jenis(id_jenis);
            kategoriBean.setNama_fashion(nama_fashion);
            kategoriBean.setNama_kategori(nama_kategori);
            kategori.add(kategoriBean);

            JSONArray arrayBahan = responseProductCustom.getJSONArray(Keys.EndpointGetCustomProduk.KEY_bahan);
            for (int i = 0; i < arrayBahan.length(); i++) {
                JSONObject currentBahan = arrayBahan.getJSONObject(i);
                Custom1.BahanBean bahanBean = new Custom1.BahanBean();
                String namaBahan = currentBahan.getString(KEY_nama_bahan);
                String keterangan_bahan = currentBahan.getString(KEY_keterangan_bahan);
                bahanBean.setNama_bahan(namaBahan);
                bahanBean.setKeterangan_bahan(keterangan_bahan);
                bahan.add(bahanBean);
            }

            JSONArray arrayUkuran = responseProductCustom.getJSONArray(Keys.EndpointGetCustomProduk.KEY_ukuran);
            for (int i = 0; i < arrayUkuran.length(); i++) {
                JSONObject currentUkuran = arrayUkuran.getJSONObject(i);
                Custom1.UkuranBean ukuranBean = new Custom1.UkuranBean();
                String ukuranCustom = currentUkuran.getString(KEY_ukuran);
                String keteranganProduk = currentUkuran.getString(KEY_keterangan_ukuran);
                ukuranBean.setUkuran(ukuranCustom);
                ukuranBean.setKeterangan_ukuran(keteranganProduk);
                ukuran.add(ukuranBean);
            }

            JSONArray arrayWarna = responseProductCustom.getJSONArray(KEY_warna);
            for (int i = 0; i < arrayWarna.length(); i++) {
                JSONObject currentWarna = arrayWarna.getJSONObject(i);
                Custom1.WarnaBean warnaBean = new Custom1.WarnaBean();
                String kode_hexa = currentWarna.getString(KEY_kode_hexa);
                String keterangan_warna = currentWarna.getString(KEY_keterangan_warna);
                warnaBean.setKode_hexa(kode_hexa);
                warnaBean.setKeterangan_warna(keterangan_warna);
                warna.add(warnaBean);
            }

            JSONArray arrayMotif = responseProductCustom.getJSONArray(KEY_motif);
            for (int i = 0; i < arrayMotif.length(); i++) {
                JSONObject currentMotif = arrayMotif.getJSONObject(i);
                Custom1.MotifBean motifBean = new Custom1.MotifBean();
                String nama_motif = currentMotif.getString(KEY_nama_motif);
                String path_gambar_motif = currentMotif.getString(KEY_path_gambar_motif);
                String url_gambar = currentMotif.getString(KEY_url_gambar);
                motifBean.setNama_motif(nama_motif);
                motifBean.setPath_gambar_motif(path_gambar_motif);
                motifBean.setUrl_gambar(url_gambar);
                motif.add(motifBean);
            }


            custom1.setProduct(product);
            custom1.setKategori(kategori);
            custom1.setUkuran(ukuran);
            custom1.setBahan(bahan);
            custom1.setWarna(warna);
            custom1.setMotif(motif);

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return custom1;
    }

    public static Custom3 parseCustomList2(JSONObject responseProductBL, JSONObject responseProducrCustom2) {


        Custom3 custom3 = new Custom3();
        Custom3 custom2 = new Custom3();
        Product product = new Product();
        List<Custom3.KategoriBean> kategori = new ArrayList<>();
        Custom3.KategoriBean kategoriBean = new Custom3.KategoriBean();
        Custom3.BahanBean bahan = new Custom3.BahanBean();
        List<Custom3.UkuranBean> ukuran = new ArrayList<>();
        List<Custom3.WarnaBean> warna = new ArrayList<>();
        List<Custom3.MotifBean> motif = new ArrayList<>();

        try {
            product = parseProduct(responseProductBL);

            JSONArray arrayKategori = responseProducrCustom2.getJSONArray(Keys.EndpointGetCustomProduk.KEY_kategori);
            JSONObject objectKategori = arrayKategori.getJSONObject(0);
            String nama_fashion = objectKategori.getString(KEY_nama_fashion);
            String nama_kategori = objectKategori.getString(KEY_nama_kategori);
            String id_jenis = objectKategori.getString(KEY_id_jenis);
            kategoriBean.setId_jenis(id_jenis);
            kategoriBean.setNama_fashion(nama_fashion);
            kategoriBean.setNama_kategori(nama_kategori);
            kategori.add(kategoriBean);

            JSONObject objectBahan = responseProducrCustom2.getJSONObject(KEY_bahan);
            Custom3.BahanBean bahanBean2 = new Custom3.BahanBean();
            JSONArray arrayBahanluar = objectBahan.getJSONArray(KEY_bahan_luar);

            List<Custom3.BahanBean.BahanLuarBean> bahanLuar = new ArrayList<>();
            for (int j = 0; j < arrayBahanluar.length(); j++) {
                Custom3.BahanBean.BahanLuarBean bahanLuarBean = new Custom3.BahanBean.BahanLuarBean();
                JSONObject objectBahanLuar = arrayBahanluar.getJSONObject(j);
                String id_bahan = objectBahanLuar.getString(KEY_id_bahan);
                String id_fungsi_bahan = objectBahanLuar.getString(KEY_id_fungsi_bahan);
                String nama_bahan = objectBahanLuar.getString(KEY_nama_bahan);
                String keterangan_bahan = (Utils.contains(objectBahanLuar, KEY_keterangan_bahan)) ?
                        objectBahanLuar.getString(KEY_keterangan_bahan) : Constants.NA;
                bahanLuarBean.setId_bahan(id_bahan);
                bahanLuarBean.setId_fungsi_bahan(id_fungsi_bahan);
                bahanLuarBean.setNama_bahan(nama_bahan);
                bahanLuarBean.setKeterangan_bahan(keterangan_bahan);
                bahanLuar.add(bahanLuarBean);
            }

            JSONArray arrayBahanDalam = objectBahan.getJSONArray(KEY_bahan_dalam);
            List<Custom3.BahanBean.BahanDalamBean> bahanDalam = new ArrayList<>();
            for (int j = 0; j < arrayBahanDalam.length(); j++) {
                Custom3.BahanBean.BahanDalamBean bahanDalamBean = new Custom3.BahanBean.BahanDalamBean();
                JSONObject objectBahanDalam = arrayBahanDalam.getJSONObject(j);
                String id_bahan = objectBahanDalam.getString(KEY_id_bahan);
                String id_fungsi_bahan = objectBahanDalam.getString(KEY_id_fungsi_bahan);
                String nama_bahan = objectBahanDalam.getString(KEY_nama_bahan);
                String keterangan_bahan = (Utils.contains(objectBahanDalam, KEY_keterangan_bahan)) ?
                        objectBahanDalam.getString(KEY_keterangan_bahan) : Constants.NA;
                bahanDalamBean.setId_bahan(id_bahan);
                bahanDalamBean.setId_fungsi_bahan(id_fungsi_bahan);
                bahanDalamBean.setNama_bahan(nama_bahan);
                bahanDalamBean.setKeterangan_bahan(keterangan_bahan);
                bahanDalam.add(bahanDalamBean);
            }

            bahanBean2.setBahan_luar(bahanLuar);
            bahanBean2.setBahan_dalam(bahanDalam);


            JSONArray arrayUkuran = responseProducrCustom2.getJSONArray(Keys.EndpointGetCustomProduk.KEY_ukuran);
            for (int i = 0; i < arrayUkuran.length(); i++) {
                JSONObject currentUkuran = arrayUkuran.getJSONObject(i);
                Custom3.UkuranBean ukuranBean = new Custom3.UkuranBean();
                String ukuranCustom = currentUkuran.getString(KEY_ukuran);
                String keteranganProduk = currentUkuran.getString(KEY_keterangan_ukuran);
                ukuranBean.setUkuran(ukuranCustom);
                ukuranBean.setKeterangan_ukuran(keteranganProduk);
                ukuran.add(ukuranBean);
            }

            JSONArray arrayWarna = responseProducrCustom2.getJSONArray(KEY_warna);
            for (int i = 0; i < arrayWarna.length(); i++) {
                JSONObject currentWarna = arrayWarna.getJSONObject(i);
                Custom3.WarnaBean warnaBean = new Custom3.WarnaBean();
                String kode_hexa = currentWarna.getString(KEY_kode_hexa);
                String keterangan_warna = currentWarna.getString(KEY_keterangan_warna);
                warnaBean.setKode_hexa(kode_hexa);
                warnaBean.setKeterangan_warna(keterangan_warna);
                warna.add(warnaBean);
            }

            JSONArray arrayMotif = responseProductBL.getJSONArray(KEY_motif);
            for (int i = 0; i < arrayMotif.length(); i++) {
                JSONObject currentMotif = arrayMotif.getJSONObject(i);
                Custom3.MotifBean motifBean = new Custom3.MotifBean();
                String nama_motif = currentMotif.getString(KEY_nama_motif);
                String path_gambar_motif = currentMotif.getString(KEY_path_gambar_motif);
                String url_gambar = currentMotif.getString(KEY_url_gambar);
                motifBean.setNama_motif(nama_motif);
                motifBean.setPath_gambar_motif(path_gambar_motif);
                motifBean.setUrl_gambar(url_gambar);
                motif.add(motifBean);
            }


            custom3.setProduct(product);
            custom3.setKategori(kategori);
            custom3.setUkuran(ukuran);
            custom3.setBahan(bahan);
            custom3.setWarna(warna);
            custom3.setMotif(motif);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return custom3;
    }


}
