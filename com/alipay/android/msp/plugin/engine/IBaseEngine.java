package com.alipay.android.msp.plugin.engine;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.alipay.android.msp.drivers.actions.EventAction;

/* loaded from: classes3.dex */
public interface IBaseEngine {
    String getApdidToken(Context context);

    Context getContext();

    int getMspLocale(String str);

    String getOaid(Context context);

    String getPackageName(Context context);

    Resources getResources(Activity activity);

    void invokePay(String str, String str2, EventAction eventAction, Activity activity);

    boolean isCurrentOrderInfoPaying(String str);

    void loadProperties(Context context);

    String readSecStorage(String str, String str2, boolean z);

    void resetResource();

    void setSecStorage(String str, String str2, String str3, boolean z);
}
