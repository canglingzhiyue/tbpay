package com.taobao.android.purchase.core.address;

import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public interface c {
    public static final int ABROAD_AGENCY_ADDRESS = 3;
    public static final int ADDRESS = 0;
    public static final int AGENCY_ADDRESS = 1;
    public static final int AGENCY_RECEIVE_ABROAD_AGENCY_ADDRESS = 4;
    public static final int AGENCY_RECEIVE_ADDRESS = 0;
    public static final int AGENCY_RECEIVE_AGENCY_ADDRESS = 1;
    public static final int AGENCY_RECEIVE_ALL_SUPPORT_ADDRESS = 3;
    public static final int AGENCY_RECEIVE_STORE_ADDRESS = 2;
    public static final String K_ADDRESS_TYPE = "selectedAddressType";
    public static final String K_AGENCY_RECV = "agencyReceive";
    public static final String K_AGENCY_RECV_H5 = "agencyReceiveH5Url";
    public static final String K_AGENCY_RECV_HEPL = "agencyReceiveHelpUrl";
    public static final String K_AGENCY_SOURCE = "source";
    public static final String K_DELIVERY_ID = "deliveryId";
    public static final String K_ENABLE_ABROAD_STATION = "enableAbroadStation";
    public static final String K_ENABLE_AGENCY = "enableAgency";
    public static final String K_LINK_ADDRESS_ID = "linkAddressId";
    public static final String K_SELECTED_ADDRESS_ID = "chooseDeliveryID";
    public static final String K_SELLER_ID = "sellerId";
    public static final String K_SITES = "sites";
    public static final String K_SITE_INFO = "siteInfo";
    public static final String K_SUPPORT_ABROAD_STATION = "supportAbroadStation";
    public static final String K_TEMP_DATA = "tempData";
    public static final int STORE_ADDRESS = 2;
    public static final int USE_RECEIVE_TYPE_ABROAD_STATION = 4;
    public static final int USE_RECEIVE_TYPE_IGNORE = 0;
    public static final int USE_RECEIVE_TYPE_NORMAL = 1;
    public static final int USE_RECEIVE_TYPE_SELF_PICK = 3;
    public static final int USE_RECEIVE_TYPE_STATION = 2;
    public static final int V_REQUEST_ADD_ADDRESS_REQUEST_CODE = 69;
    public static final int V_REQUEST_ADD_ADDRESS_REQUEST_CODE_LBS = 70;
    public static final int V_REQUEST_ADD_ADDRESS_REQUEST_CODE_LBS_ERROR = 71;
    public static final int V_REQUEST_SELECT_ADDRESS_REQUEST_CODE = 52;
    public static final int V_REQUEST_SELECT_ADDRESS_REQUEST_CODE_LBS = 53;
    public static final int V_REQUEST_SELECT_ADDRESS_REQUEST_CODE_LBS_ERROR = 54;
    public static final int V_RESULT_CODE_FOR_NO_ADDRESS = 772;
    public static final String NO_ADDRESS_ERROR_MSG = com.alibaba.ability.localization.b.a(R.string.purchase_taobao_app_1029_1_19090);
    public static final String TO_SET_ADDRESS_ERROR_MSG = com.alibaba.ability.localization.b.a(R.string.purchase_taobao_app_1029_1_19089);
}
