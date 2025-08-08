package com.alipay.android.msp.framework.cache;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SecurityCacheStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String get(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33696d7d", new Object[]{str, str2, new Boolean(z)});
        }
        String string = PrefUtils.getString(str, str2, "");
        if (StringUtils.isEmpty(string)) {
            return "";
        }
        if (a() != null) {
            return string;
        }
        return null;
    }

    private static ContextWrapper a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContextWrapper) ipChange.ipc$dispatch("1dbd7b63", new Object[0]);
        }
        try {
            Context context = GlobalHelper.getInstance().getContext();
            if (context == null) {
                return null;
            }
            return (Application) context.getApplicationContext();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static void set(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7c7aad", new Object[]{str, str2, str3, new Boolean(z)});
            return;
        }
        if (a() == null) {
            str3 = null;
        }
        PrefUtils.putString(str, str2, str3);
    }
}
