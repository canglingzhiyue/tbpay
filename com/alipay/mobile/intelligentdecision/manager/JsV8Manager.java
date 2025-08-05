package com.alipay.mobile.intelligentdecision.manager;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* loaded from: classes3.dex */
public class JsV8Manager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile JsV8Manager f5745a;

    private JsV8Manager() {
    }

    public static JsV8Manager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsV8Manager) ipChange.ipc$dispatch("b76449ab", new Object[0]);
        }
        if (f5745a == null) {
            synchronized (JsV8Manager.class) {
                if (f5745a == null) {
                    f5745a = new JsV8Manager();
                }
            }
        }
        return f5745a;
    }

    public static Object a(String str, FBDocument.Duktape duktape) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ba6cb51", new Object[]{str, duktape});
        }
        if (duktape == null) {
            return null;
        }
        return duktape.evaluate(str);
    }

    public static void a(FBDocument.Duktape duktape) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c3b637", new Object[]{duktape});
        } else if (duktape == null) {
        } else {
            try {
                duktape.close();
            } catch (Throwable unused) {
            }
        }
    }
}
