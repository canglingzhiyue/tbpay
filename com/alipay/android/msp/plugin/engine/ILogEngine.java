package com.alipay.android.msp.plugin.engine;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.log.PageInfo;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ILogEngine {
    String getChinfoChainUUID();

    PageInfo getCurrentReferPageInfo();

    String getSpmSessionId();

    void userFeedback(String str, String str2, String str3);

    void userFeedbackForServer(String str, String str2, String str3, boolean z, boolean z2, boolean z3, Map<String, String> map, Context context, String str4, String str5, JSONObject jSONObject, int i, Map<String, String> map2);

    void walletBehaviorLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11);

    void walletEventLog(String str, String str2, Map<String, String> map);

    void walletSpmTrack(Object obj, String str, String str2, String str3, String str4, Map<String, String> map, String str5);
}
