package com.taobao.themis.kernel.adapter;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes9.dex */
public interface IMonitorAdapter extends com.taobao.themis.kernel.basic.a {
    void trackAlarm(boolean z, String str, String str2, String str3, String str4, String str5);

    void trackCounter(String str, String str2, int i, String str3);

    void trackStat(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2);
}
