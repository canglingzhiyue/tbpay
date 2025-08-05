package com.taobao.infoflow.core.engine.env.protocol;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface d {
    void a(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map);

    void a(String str, String str2, String str3, View view, JSONObject jSONObject);

    void a(String str, String str2, String str3, JSONObject jSONObject);

    void b(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map);

    void b(String str, String str2, String str3, View view, JSONObject jSONObject);

    void c(String str, String str2, float f, float f2, List<com.taobao.android.external.e> list, Map<String, String> map);
}
