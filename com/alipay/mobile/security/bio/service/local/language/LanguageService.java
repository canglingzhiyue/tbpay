package com.alipay.mobile.security.bio.service.local.language;

import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class LanguageService extends LocalService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public int getCurrentLanguage() {
        StringBuilder sb;
        int i = Language.UNKNOWN.value;
        try {
            try {
                Class<?> cls = Class.forName("com.alipay.mobile.framework.locale.LocaleHelper");
                Method method = cls.getMethod("getInstance", new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke(cls, new Object[0]);
                Method method2 = cls.getMethod("getCurrentLanguage", new Class[0]);
                method2.setAccessible(true);
                i = ((Integer) method2.invoke(invoke, new Object[0])).intValue();
                sb = new StringBuilder();
            } catch (Exception e) {
                BioLog.e("Failed to getCurrentLanguage() : " + e.getMessage());
                sb = new StringBuilder();
            }
            sb.append("getCurrentLanguage() : language=");
            sb.append(i);
            BioLog.e(sb.toString());
            return i;
        } catch (Throwable th) {
            BioLog.e("getCurrentLanguage() : language=" + i);
            throw th;
        }
    }
}
