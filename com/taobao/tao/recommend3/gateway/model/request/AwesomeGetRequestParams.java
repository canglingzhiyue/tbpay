package com.taobao.tao.recommend3.gateway.model.request;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes.dex */
public class AwesomeGetRequestParams implements Serializable, IMTOPDataObject {
    public String acookie;
    public String address;
    public String areaCode;
    public String areaName;
    public String cityCode;
    public String cityName;
    public String commonBizParams;
    public String countryCode;
    public String countryName;
    public String edition;
    public String globalLbs;
    public String latitude;
    public String longitude;
    public String nick;
    public long poiRefreshTime;
    public String previewParam;
    public String provinceCode;
    public String provinceName;
    public JSONObject switchVersionRequest;
    public String townName;
    public String userId;
    public String utdid;
    public String API_NAME = "mtop.taobao.wireless.home.newface.awesome.get";
    public String VERSION = "1.0";
    public final boolean NEED_ECODE = false;
    public final boolean NEED_SESSION = true;
    public String gatewayVersion = "2.0";
    public Map<String, AwesomeGetContainerParams> containerParams = new HashMap(4);
    public boolean tryRequest = false;

    static {
        kge.a(286547481);
        kge.a(1028243835);
        kge.a(-350052935);
    }
}
