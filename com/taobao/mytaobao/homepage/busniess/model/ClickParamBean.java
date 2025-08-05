package com.taobao.mytaobao.homepage.busniess.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ClickParamBean implements Serializable {
    public static final String KEY = "clickParam";
    public String arg1;
    public String arg2;
    public String arg3;
    public JSONObject args;
    public String eventId;
    public Map<String, String> nextPage;
    public String page;

    static {
        kge.a(744037217);
        kge.a(1028243835);
    }
}
