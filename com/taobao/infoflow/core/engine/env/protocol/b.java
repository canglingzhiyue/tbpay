package com.taobao.infoflow.core.engine.env.protocol;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* loaded from: classes.dex */
public interface b {
    void a(Application application, String str, String str2, String str3, Map<String, String> map);

    void a(JSONObject jSONObject);

    void a(String str, String str2, String str3, Map<String, String> map);

    void b(JSONObject jSONObject);

    void b(String str, String str2, String str3, Map<String, String> map);
}
