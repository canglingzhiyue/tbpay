package com.alipay.android.msp.plugin.engine;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IBizEngine {
    void bindSPMLog(Context context);

    JSONObject executeRpc(boolean z, String str, String str2, int i, Map<String, String> map);

    Object findUniService(String str, String str2);

    void onException(String str, Throwable th);

    void printLog(String str, int i);

    void renderH5View(Activity activity, ViewGroup viewGroup, String str, String str2, String str3);
}
