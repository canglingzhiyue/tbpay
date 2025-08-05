package com.taobao.mytaobao.basement.Bridge;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex_framework.p;
import com.taobao.aranger.annotation.method.UIThread;

/* loaded from: classes7.dex */
public interface b {
    JSONObject a(com.taobao.android.weex_framework.bridge.b bVar);

    void a();

    void a(JSONObject jSONObject);

    void a(p pVar, JSONObject jSONObject);

    @UIThread
    void a(String str, String str2);

    void a(boolean z);

    void b();
}
