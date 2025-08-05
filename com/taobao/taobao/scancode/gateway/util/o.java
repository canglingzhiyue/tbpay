package com.taobao.taobao.scancode.gateway.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f21283a;
    private static boolean b;

    static {
        kge.a(-1641291044);
        f21283a = "TB-Scan";
        b = false;
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
        } else if (objArr == null) {
        } else {
            try {
                if (objArr.length != 0 && b) {
                    String.format(str, objArr);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
            return;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0 && b) {
                    str = String.format(str, objArr);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        Log.e(f21283a, str);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5dd4ba", new Object[]{th, str, objArr});
            return;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0 && b) {
                    str = String.format(str, objArr);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        b("%s exceptionWith{\n%s}", str, Log.getStackTraceString(th));
    }
}
