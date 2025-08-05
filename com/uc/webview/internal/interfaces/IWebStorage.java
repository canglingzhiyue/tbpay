package com.uc.webview.internal.interfaces;

import android.webkit.ValueCallback;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IWebStorage {
    void deleteAllData();

    void deleteOrigin(String str);

    void getOrigins(ValueCallback<Map> valueCallback);

    void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback);

    void getUsageForOrigin(String str, ValueCallback<Long> valueCallback);

    @Deprecated
    void setQuotaForOrigin(String str, long j);
}
