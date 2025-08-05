package com.taobao.themis.kernel.network;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class RequestParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String accountSite;
    public String api;
    private final String appId;
    public Map<String, String> headers;
    public String method = "GET";
    public boolean needLogin;
    public String oriUrl;
    public String traceId;
    public String version;

    static {
        kge.a(425914488);
        kge.a(1028243835);
    }

    public abstract Map<String, Object> toMap();

    public RequestParams(String str) {
        this.appId = str;
    }

    public final String getAppId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94038553", new Object[]{this}) : this.appId;
    }
}
