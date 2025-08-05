package com.taobao.android.preview;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bp;
import tb.kge;

/* loaded from: classes.dex */
public class a implements bp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile bp f14702a;
    private static volatile bp b;
    private static boolean c;

    static {
        kge.a(-702804927);
        kge.a(-1348577919);
        f14702a = null;
        b = null;
        c = false;
    }

    public static bp a() {
        if (!c && DinamicXEngine.j() && b == null) {
            synchronized (a.class) {
                if (b == null) {
                    try {
                        b = (bp) Class.forName("com.taobao.android.dinamicx.devtools.modules.DXDevToolsExprRecorder").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        c = true;
                        throw th;
                    }
                    c = true;
                }
            }
        }
        return b == null ? b() : b;
    }

    public static bp b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bp) ipChange.ipc$dispatch("de76453b", new Object[0]);
        }
        if (f14702a == null) {
            synchronized (a.class) {
                if (f14702a == null) {
                    f14702a = new a();
                }
            }
        }
        return f14702a;
    }
}
