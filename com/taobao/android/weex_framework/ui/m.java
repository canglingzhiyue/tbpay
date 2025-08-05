package com.taobao.android.weex_framework.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes6.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f16081a;
    private static final Map<String, d> b;
    private static final Set<String> c;
    private static final Map<String, Integer> d;
    private static final Map<String, com.taobao.android.weex_framework.platform.c> e;

    static {
        kge.a(-1171249230);
        f16081a = new AtomicInteger(1);
        b = new ConcurrentHashMap();
        c = new ConcurrentSkipListSet();
        d = new HashMap();
        e = new ConcurrentHashMap();
    }

    public static l a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("816e8146", new Object[]{str}) : b.get(str);
    }

    public static void a(String str, Class<? extends INode> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else {
            a(str, cls, false);
        }
    }

    public static void a(String str, Class<? extends INode> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e0a6e9", new Object[]{str, cls, new Boolean(z)});
        } else {
            a(str, new k(cls), z);
        }
    }

    public static void a(String str, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b91f8", new Object[]{str, dVar, new Boolean(z)});
            return;
        }
        b.put(str, dVar);
        if (!z) {
            return;
        }
        if (MUSEngine.isInitDone()) {
            if (!MUSCommonNativeBridge.a(MUSValue.ofString(str))) {
                MUSEngine.resetDelayedNativeRegisterState();
            }
        } else {
            MUSEngine.resetDelayedNativeRegisterState();
        }
        c.add(str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        for (String str : c) {
            if (!MUSCommonNativeBridge.a(MUSValue.ofString(str))) {
                return false;
            }
        }
        return true;
    }

    public static void a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bdaac5c", new Object[]{str, dVar});
        } else {
            a(str, dVar, false);
        }
    }

    public static void a(String str, com.taobao.android.weex_framework.platform.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb297be", new Object[]{str, cVar});
        } else {
            e.put(str, cVar);
        }
    }

    public static com.taobao.android.weex_framework.platform.c b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.platform.c) ipChange.ipc$dispatch("1d867d4f", new Object[]{str}) : e.get(str);
    }

    public static Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[0]) : e.keySet();
    }

    public static void c(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        d dVar = b.get(str);
        String str4 = null;
        if (dVar != null) {
            str3 = null;
            str4 = dVar.a();
            str2 = null;
        } else {
            com.taobao.android.weex_framework.platform.c cVar = e.get(str.toLowerCase());
            if (cVar != null) {
                str4 = cVar.b();
                str3 = cVar.d();
                str2 = cVar.c();
            } else {
                str2 = null;
                str3 = null;
            }
        }
        if (str4 == null && str3 == null && str2 == null) {
            return;
        }
        WeexPlatformCommonBridge.registerUINode(str, str4, str3, str2);
    }
}
