package com.taobao.tao.content.business;

import mtopsdk.mtop.domain.IMTOPDataObject;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ContentBusinessModel implements IMTOPDataObject {
    public String actionSource;
    public String adUserId;
    public String contentId;
    public JSONObject context;
    public String ct;
    public JSONObject dataAttributes;
    public String itemId;
    public JSONArray itemIds;
    public String pageName;
    public String sId;
    public String scenceId;
    public String source;
    public String sourceType = "2";
    public String tcpBid;
    public String trackSource;
    public String trackSubSource;
    public String url;

    static {
        kge.a(-271261239);
        kge.a(-350052935);
    }
}
