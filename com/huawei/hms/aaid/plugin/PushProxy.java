package com.huawei.hms.aaid.plugin;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import org.json.JSONObject;
import tb.cxr;

/* loaded from: classes4.dex */
public interface PushProxy {
    void deleteAllToken(Context context) throws ApiException;

    void deleteToken(Context context, String str, String str2) throws ApiException;

    JSONObject getPlatform();

    String getProxyType();

    void getToken(Context context, String str, String str2) throws ApiException;

    cxr<Void> subscribe(Context context, String str, String str2);

    cxr<Void> turnOff(Context context, String str);

    cxr<Void> turnOn(Context context, String str);

    cxr<Void> unsubscribe(Context context, String str, String str2);
}
