package cilok.com.lapakjahit.json;

import android.os.CpuUsageInfo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import cilok.com.lapakjahit.entity.InboxMessage;
import cilok.com.lapakjahit.entity.ProductFavorite;
import cilok.com.lapakjahit.extras.Constants;
import cilok.com.lapakjahit.extras.Keys;
import cilok.com.lapakjahit.extras.Util;
import cilok.com.lapakjahit.log.L;

import static cilok.com.lapakjahit.extras.Keys.EndpointGetFavorites.*;
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

    public static ArrayList<ProductFavorite> parseProductFavorites(JSONObject response) {
        ArrayList<ProductFavorite> listFavoriteProduct = new ArrayList<>();
        if (response != null && response.length() > 0) {
            try {
                JSONArray arrayFavorites = response.getJSONArray(KEY_PRODUCT);
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
                    ProductFavorite.SpecsBean specs = new ProductFavorite.SpecsBean();
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
                    ProductFavorite.RatingBean rating = new ProductFavorite.RatingBean(); //pasti ado
                    String average_rate = Constants.NA;
                    int user_count = -1;
                    List<ProductFavorite.WholesaleBean> wholesale = new ArrayList<>(); //biso iyo bisa idak
                    List<ProductFavorite.InstallmentBean> installment = new ArrayList<>(); //biso iyo bisa idak
                    String min_installment_price = Constants.NA; //biso iyo biso idak
                    int interest_count = -1;
                    String last_relist_at = Constants.NA;
                    int view_count = -1;


                    JSONObject currentProduct = arrayFavorites.getJSONObject(i);
                    deal_request_state = currentProduct.getString(KEY_REQUEST_STATE);
                    price = currentProduct.getLong(KEY_PRICE);
                    category_id = currentProduct.getInt(KEY_CATEGORY_ID);
                    category = currentProduct.getString(KEY_CATEGORY);
                    JSONArray arrCaterory_structure = currentProduct.getJSONArray(KEY_CATEGORY_STRUCTURE);
                    category_structure = new String[arrCaterory_structure.length()];
                    for (int j = 0; j < arrCaterory_structure.length(); j++) {
                        category_structure[j] = arrCaterory_structure.getString(j);
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
                    if (Utils.contains(currentProduct, Keys.EndpointGetFavorites.KEY_ID)) {
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
                        average_rate = objRating.getString(KEY_RATING_AVERAGE_RATE);
                        user_count = objRating.getInt(KEY_USER_COUNT);
                    }
                    if (Utils.contains(currentProduct, KEY_WHOSALE)) {
                        JSONArray arrayWhosale = currentProduct.getJSONArray(KEY_WHOSALE);
                        ProductFavorite.WholesaleBean wholesaleBean = new ProductFavorite.WholesaleBean();
                        for (int j = 0; j < arrayWhosale.length(); j++) {
                            JSONObject currentWhosale = arrayWhosale.getJSONObject(j);
                            int lower_bound = currentWhosale.getInt("lower_bound");
                            long price_whosale = currentWhosale.getLong("price");
                            wholesaleBean.setLower_bound(lower_bound);
                            wholesaleBean.setPrice(price_whosale);
                            wholesale.add(wholesaleBean);
                        }
                    }
                    if (Utils.contains(currentProduct,KEY_INSTALLMENT)){
                        JSONArray arrayInstalment = currentProduct.getJSONArray(KEY_INSTALLMENT);
                        ProductFavorite.InstallmentBean installmentBean = new ProductFavorite.InstallmentBean();
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
                    if (Utils.contains(currentProduct,KEY_URL_MIN_INSTALMENT_PRICE)){
                        min_installment_price = currentProduct.getString(KEY_URL_MIN_INSTALMENT_PRICE);
                    }
                    interest_count = currentProduct.getInt(KEY_INTEREST_COUNT);
                    last_relist_at = currentProduct.getString(KEY_LAST_RELIST_AT);
                    view_count = currentProduct.getInt(KEY_VIEW_COUNT);


                    ProductFavorite productFavorite = new ProductFavorite();
                    productFavorite.setDeal_request_state(deal_request_state);
                    productFavorite.setPrice(price);
                    productFavorite.setCategory_id(category_id);
                    productFavorite.setCategory(category);
                    productFavorite.setCategory_structure(category_structure);
                    productFavorite.setCourier(courier);
                    productFavorite.setSeller_username(seller_username);
                    productFavorite.setSeller_name(seller_name);
                    productFavorite.setSeller_id(seller_id);
                    productFavorite.setSeller_avatar(seller_avatar);
                    productFavorite.setSeller_level(seller_level);
                    productFavorite.setSeller_level_badge_url(seller_level_badge_url);
                    productFavorite.setSeller_delivery_time(seller_delivery_time);
                    productFavorite.setSeller_positive_feedback(seller_positive_feedback);
                    productFavorite.setSeller_negative_feedback(seller_negative_feedback);
                    productFavorite.setSeller_term_condition(seller_term_condition);
                    productFavorite.setSeller_alert(seller_alert);
                    productFavorite.setFor_sale(for_sale);
                    productFavorite.setState_description(state_description);
                    productFavorite.setPremium_account(premium_account);
                    productFavorite.setTop_merchant(top_merchant);
                    productFavorite.setSeller_voucher(seller_voucher);
                    productFavorite.setWaiting_payment(waiting_payment);
                    productFavorite.setSold_count(sold_count);
                    specs.setBrand(specsBrand);
                    specs.setUkuran(specsUkuran);
                    productFavorite.setSpecs(specs);
                    productFavorite.setForce_insurance(force_insurance);
                    productFavorite.setId(id);
                    productFavorite.setUrl(url);
                    productFavorite.setName(name);
                    productFavorite.setActive(active);
                    productFavorite.setCity(city);
                    productFavorite.setProvince(province);
                    productFavorite.setWeight(weight);
                    productFavorite.setImage_ids(image_ids);
                    productFavorite.setImages(images);
                    productFavorite.setSmall_images(small_images);
                    productFavorite.setDesc(desc);
                    productFavorite.setCondition(condition);
                    productFavorite.setStock(stock);
                    productFavorite.setFavorited(favorited);
                    productFavorite.setCreated_at(created_at);
                    productFavorite.setUpdated_at(updated_at);
                    rating.setAverage_rate(average_rate);
                    rating.setUser_count(user_count);
                    productFavorite.setRating(rating);
                    productFavorite.setWholesale(wholesale);
                    productFavorite.setInstallment(installment);
                    productFavorite.setMin_installment_price(min_installment_price);
                    productFavorite.setInterest_count(interest_count);
                    productFavorite.setLast_relist_at(last_relist_at);
                    productFavorite.setView_count(view_count);

                    listFavoriteProduct.add(productFavorite);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return listFavoriteProduct;
    }
}
