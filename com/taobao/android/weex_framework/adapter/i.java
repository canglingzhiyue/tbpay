package com.taobao.android.weex_framework.adapter;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexInstanceImpl;
import java.util.Map;

/* loaded from: classes6.dex */
public interface i {
    public static final String KEY_CRASH_INFO_JS_VERSION = "js_version";
    public static final String KEY_CRASH_INFO_URL = "page_url";

    void a(int i);

    void a(int i, JSONObject jSONObject);

    void a(int i, String str, String str2, String str3, int i2);

    void a(int i, String str, String str2, String str3, String str4, WeexInstanceImpl weexInstanceImpl);

    void a(int i, String str, String str2, String str3, String str4, String str5, int i2);

    void a(Map<String, String> map);

    void b(int i, String str, String str2);
}
