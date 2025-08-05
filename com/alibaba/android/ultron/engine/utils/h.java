package com.alibaba.android.ultron.engine.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.android.ultron.engine.model.TemplateComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.biy;
import tb.bji;
import tb.jpe;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f2577a;

    static {
        kge.a(-804278292);
        f2577a = new Handler(Looper.getMainLooper());
    }

    public static String a(TemplateComponent templateComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55109151", new Object[]{templateComponent});
        }
        if (templateComponent.id == null) {
            templateComponent.id = Long.valueOf(f.a());
        }
        return templateComponent.tag + "_" + templateComponent.id;
    }

    public static String a(bji bjiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ad3369", new Object[]{bjiVar});
        }
        if (TextUtils.isEmpty(bjiVar.f25940a) || "null".equals(bjiVar.f25940a)) {
            bjiVar.f25940a = String.valueOf(f.a());
        }
        return bjiVar.b + "_" + bjiVar.f25940a;
    }

    public static boolean a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("840caf8a", new Object[]{context, str, obj})).booleanValue();
        }
        if (biy.a(context)) {
            return biy.a(str, obj);
        }
        return b(context, str, obj);
    }

    private static boolean b(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee3c37a9", new Object[]{context, str, obj})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        Object a2 = jpe.a(obj, str);
        if (a2 != null) {
            return c.a(context).a(a2.toString());
        }
        return false;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            try {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    f2577a.post(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                UnifyLog.d("UltronUtils", "runOnUIThread error", th.getMessage());
            }
        }
    }
}
