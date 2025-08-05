package com.alipay.mobile.common.transportext.util;

import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class TransExtLibraryLoadUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void loadLibrary(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac71bdce", new Object[]{str, new Boolean(z)});
            return;
        }
        if (z) {
            LogCatUtil.info("AmnetLibraryLoadUtils", "[loadLibrary] Not support v7aOptimize.");
        }
        try {
            AppInfoUtil.loadLibrary(str);
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetLibraryLoadUtils", "[loadLibrary] Exception = " + th.toString());
            try {
                System.loadLibrary(str);
            } catch (Throwable unused) {
                LogCatUtil.warn("AmnetLibraryLoadUtils", "[loadLibrary] Fail to load lib use system api, Exception = " + th.toString());
            }
        }
    }
}
