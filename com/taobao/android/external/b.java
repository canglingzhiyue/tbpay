package com.taobao.android.external;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes.dex */
public interface b {
    boolean isEnabled();

    UCPReachViewOpenState openReachView(JSONObject jSONObject, JSONObject jSONObject2);

    void registerStateSynchronizer(a aVar);
}
