package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.pmd;
import tb.pnj;

/* loaded from: classes8.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<com.taobao.alilive.aliliveframework.frame.a> f21773a;

    static {
        kge.a(-760474959);
    }

    public static com.taobao.alilive.aliliveframework.frame.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("3d35f71d", new Object[0]);
        }
        WeakReference<com.taobao.alilive.aliliveframework.frame.a> weakReference = f21773a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (a() == null) {
            return null;
        }
        return a().G();
    }

    public static com.taobao.alilive.aliliveframework.frame.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("3cbf911e", new Object[0]);
        }
        WeakReference<com.taobao.alilive.aliliveframework.frame.a> weakReference = f21773a;
        if (weakReference != null && weakReference.get() != null) {
            return f21773a.get();
        }
        return null;
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{aVar});
        } else if (aVar == null) {
            an.a("FrameConStringUtils", "setCurFrameContext null");
        } else {
            f21773a = new WeakReference<>(aVar);
            if (aVar.z() != null) {
                aVar.z().a(aVar.j());
            }
            an.a("FrameConStringUtils", "setCurFrameContext liveContextKey = " + aVar.j());
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null) {
            pnj m = pmd.a().m();
            m.a("FrameConStringUtils", "setCurFrameContext clear liveContextKey = " + ((Object) null));
        } else {
            WeakReference<com.taobao.alilive.aliliveframework.frame.a> weakReference = f21773a;
            if (weakReference == null) {
                pmd.a().m().a("FrameConStringUtils", "setCurFrameContext clear mCurFrameContextWeakReference == null");
            } else if (weakReference.get() == null) {
                an.a("FrameConStringUtils", "setCurFrameContext clear mCurFrameContextWeakReference.get() == null");
                f21773a = null;
            } else if (!str.equals(f21773a.get().j())) {
                an.a("FrameConStringUtils", "setCurFrameContext clear equals liveContextKey = " + str);
            } else {
                an.a("FrameConStringUtils", "setCurFrameContext clear success liveContextKey = " + str);
                f21773a = null;
            }
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        WeakReference<com.taobao.alilive.aliliveframework.frame.a> weakReference = f21773a;
        if (weakReference != null && weakReference.get() != null && f21773a.get().d != null) {
            return f21773a.get().d.equals(str);
        }
        return false;
    }

    public static com.taobao.taolive.sdk.core.g b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.taolive.sdk.core.g) ipChange.ipc$dispatch("5637062d", new Object[]{aVar});
        }
        if (aVar != null) {
            return aVar.z();
        }
        return null;
    }
}
