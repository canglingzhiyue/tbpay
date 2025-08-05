package com.alipay.android.msp.language;

import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.phone.mobilesdk.dynamiclanguage.DynamicLanguage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LanguageHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String PREFIX = "cashier_android_";

    public static String localizedStringForKey(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea9f7a8c", new Object[]{str, str2, objArr});
        }
        if (PhoneCashierMspEngine.getMspWallet().useDynamicLanguage()) {
            LogUtil.record(2, "LanguageHelper:useDynamicLanguage", "enableBailing");
            if (str != null && !str.startsWith(PREFIX)) {
                str = PREFIX + str;
            }
            try {
                return DynamicLanguage.getInstance().localizedStringForKey(str, str2, objArr);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return (str2 == null || objArr == null || objArr.length == 0) ? str2 : String.format(str2, objArr);
    }
}
