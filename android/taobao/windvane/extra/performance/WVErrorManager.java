package android.taobao.windvane.extra.performance;

import android.taobao.windvane.c;
import android.taobao.windvane.config.j;
import android.taobao.windvane.ha.b;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.adl;
import tb.kge;

/* loaded from: classes2.dex */
public class WVErrorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVErrorManager";

    static {
        kge.a(-1284956698);
    }

    public void reportJSError(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37294e5a", new Object[]{this, str, str2, str3, str4, new Boolean(z)});
            return;
        }
        if (!TextUtils.isEmpty(str) && adl.a().b(str) != null) {
            m.b(TAG, "found grey page: " + str);
        }
        String h = c.a().b().h();
        if (h != null && Math.random() >= Double.parseDouble(h)) {
            return;
        }
        if (!j.commonConfig.aN) {
            b.a("WINDVANE_JS_ERROR", str, str3, str2, str4, str);
        } else if (z) {
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                return;
            }
            b.a("WINDVANE_JS_ERROR", str, str3, str2, str4, str);
            m.e(TAG, "isUCWebview upload jserror message:" + str2 + " stack:" + str3);
        } else {
            b.a("WINDVANE_JS_ERROR", str, str3, str2, str4, str);
            m.e(TAG, "notUCWebview upload jserror errorMessage:" + str2);
        }
    }
}
