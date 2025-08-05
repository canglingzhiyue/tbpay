package com.taobao.android.weex.mega;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.b;

/* loaded from: classes6.dex */
public interface MegaModule extends WeexModule {
    void asyncCall(String str, String str2, JSONObject jSONObject, b bVar);

    WeexValue syncCall(String str, String str2, JSONObject jSONObject);
}
