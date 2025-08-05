package com.taobao.android.address.wrapper;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class AddressParams implements Serializable {
    public boolean abroadStation;
    public String accurateAddressInfo;
    public String agencyReceive;
    public String agencyReceiveH5Url;
    public String agencyReceiveHelpUrl;
    public String bizcode;
    public String deliverAddrList;
    public String deliverId;
    public String extMap;
    public JSONObject extNativeJson;
    public JSONObject extUrlJson;
    public boolean needChangeKinship;
    public String relationId;
    public String sellerID;
    public String sites;
    public String source;
    public boolean supportStation;
    public HashMap<String, String> tempData;
}
