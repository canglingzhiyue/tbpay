package com.taobao.android.external;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class UCPReachViewState implements Serializable {
    @JSONField(name = "bizTrackInfo")
    public JSONObject bizInfo;
    @JSONField(name = "errorCode")
    public int code;
    public JSONObject debugInfo;
    public String group;
    public String key;
    @JSONField(name = "errorMessage")
    public String msg;
    public JSONObject trackInfo;

    static {
        kge.a(28571818);
        kge.a(1028243835);
    }
}
