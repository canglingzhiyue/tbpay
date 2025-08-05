package com.taobao.browser;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.CommonJsApiManager;
import com.taobao.login4android.api.Login;
import tb.kge;

@Deprecated
/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1114690386);
    }

    public static synchronized void a(String str) {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                CommonJsApiManager.initCommonJsbridge();
            }
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : Login.isLoginUrl(str);
    }
}
