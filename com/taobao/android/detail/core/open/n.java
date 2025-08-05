package com.taobao.android.detail.core.open;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, g> f9779a;

    static {
        kge.a(-673428237);
        f9779a = new ConcurrentHashMap<>();
        emu.a("com.taobao.android.detail.core.open.SdkManager");
    }

    private static g b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("6642361d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || !f9779a.containsKey(str)) {
            return null;
        }
        return f9779a.get(str);
    }

    public static g a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("71183e2e", new Object[]{obj});
        }
        if (obj != null) {
            return b(c(obj));
        }
        return null;
    }

    private static String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3897149a", new Object[]{obj});
        }
        return obj.getClass().getSimpleName() + obj.hashCode();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str) || !f9779a.containsKey(str)) {
        } else {
            g remove = f9779a.remove(str);
            if (!(remove instanceof h)) {
                return;
            }
            ((h) remove).i();
        }
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
        } else if (obj == null) {
        } else {
            a(obj.getClass().getSimpleName() + obj.hashCode());
        }
    }

    public static void a(Object obj, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e823f36", new Object[]{obj, gVar});
        } else if (a(obj) != null) {
        } else {
            f9779a.put(c(obj), gVar);
        }
    }
}
