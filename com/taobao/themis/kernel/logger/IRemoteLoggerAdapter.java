package com.taobao.themis.kernel.logger;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes9.dex */
public interface IRemoteLoggerAdapter extends com.taobao.themis.kernel.basic.a {
    void d(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void e(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void i(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void v(String str, String str2, String str3, String str4, JSONObject jSONObject);

    void w(String str, String str2, String str3, String str4, JSONObject jSONObject);
}
