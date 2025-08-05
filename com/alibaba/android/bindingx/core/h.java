package com.alibaba.android.bindingx.core;

import android.util.Log;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2229a;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        }
    }

    static {
        kge.a(-1616306017);
        f2229a = false;
    }

    public static void a(Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map == null || (obj = map.get("debug")) == null) {
        } else {
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            } else if (obj instanceof String) {
                z = "true".equals((String) obj);
            }
            f2229a = z;
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (!f2229a) {
        } else {
            Log.e(BindingXConstants.TAG, str);
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else if (!f2229a) {
        } else {
            Log.e(BindingXConstants.TAG, str, th);
        }
    }
}
