package com.taobao.appbundle.remote;

import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(21030958);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, true, WeexPopContainer.PARAMS_SHOW_LOADING, str2, 0L, 0, "");
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a(str, true, g4.b.i, str2, 0L, 0, "");
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a(str, false, "loading", str2, 0L, -1, str3);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            a(str, true, "loading_Leave", str2, 0L, 0, "");
        }
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
        } else {
            a(str, true, "loading", str2, j, 0, "");
        }
    }

    private static void a(String str, boolean z, String str2, String str3, long j, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2faebf", new Object[]{str, new Boolean(z), str2, str3, new Long(j), new Integer(i), str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", String.valueOf(z));
        hashMap.put("cost", String.valueOf(j));
        hashMap.put("errorCode", String.valueOf(i));
        hashMap.put("errorMsg", str4);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("REMOTE_FEATURE", 19999, str, str2, str3 != null ? str3 : "", hashMap).build());
    }
}
