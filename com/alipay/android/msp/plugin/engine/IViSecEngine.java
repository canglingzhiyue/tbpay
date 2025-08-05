package com.alipay.android.msp.plugin.engine;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;

/* loaded from: classes3.dex */
public interface IViSecEngine {
    void cleanFpCache();

    String getCertsn();

    String getFpInfo(Context context);

    String getSecDataForMsp();

    String getVIData(String str);

    String getVIDataForPaySetting(String str);

    Activity getVidTopActivity();

    void hardwarePayOpt(int i, String str);

    boolean isVITaskExecuting(Context context);

    void setStartActivityContext(Context context);

    void unifiedStartByVerifyIdentity(int i, String str, String str2, String str3);

    void verifyId(String str, String str2, String str3, int i);

    void verifyIdentity(JSONObject jSONObject, Context context, int i, EventAction eventAction);
}
