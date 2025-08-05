package android.taobao.windvane.monitor;

import android.taobao.windvane.extra.performance2.WVWPData;

/* loaded from: classes2.dex */
public interface n {
    void WebViewWrapType(String str);

    void commitCoreInitTime(long j, String str);

    void commitCoreTypeByPV(String str, String str2, String str3, String str4);

    void commitUseWebgl(String str);

    void commitWebMultiType(String str, int i, int i2);

    void commitWebMultiTypeByPV(String str, String str2, String str3, String str4, String str5, String str6);

    void commitWhitePageData(WVWPData wVWPData);
}
