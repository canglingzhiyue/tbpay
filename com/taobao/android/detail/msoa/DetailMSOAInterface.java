package com.taobao.android.detail.msoa;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.msoa.annotation.ServiceRouter;

@ServiceRouter(bundleName = "com.taobao.android.detail", implClass = DetailMSOAImpl.class)
/* loaded from: classes4.dex */
public interface DetailMSOAInterface {
    void addSMCart(String str, String str2, String str3, String str4);

    void showFloatPage(String str, String str2, String str3);

    void showSku(String str, String str2, String str3);

    void showSku(String str, String str2, String str3, JSONObject jSONObject);

    void showSku3(String str, String str2, String str3, JSONObject jSONObject);
}
