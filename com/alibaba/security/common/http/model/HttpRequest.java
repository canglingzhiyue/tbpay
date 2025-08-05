package com.alibaba.security.common.http.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class HttpRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "clientInfo")
    public String clientInfo;
    @JSONField(name = BaseJsExecutor.NAME_VERIFY_TOKEN)
    public String verifyToken;

    public HttpRequest(String str, String str2) {
        this.verifyToken = str;
        this.clientInfo = str2;
    }

    public abstract String apiName();

    public String body() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("270aae97", new Object[]{this}) : b.a(this);
    }

    public abstract Class classType();
}
