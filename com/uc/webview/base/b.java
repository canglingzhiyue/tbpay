package com.uc.webview.base;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f23773a;
    private static volatile Class b;
    private static volatile Object c;
    private static volatile Method d;

    /* loaded from: classes9.dex */
    public static class a {
        Throwable c;

        /* renamed from: a  reason: collision with root package name */
        public boolean f23775a = true;
        boolean b = false;
        ArrayList<String> d = new ArrayList<>(9);
        ArrayList<String> e = new ArrayList<>(5);

        public a(String str, Throwable th) {
            a("k_ct", "exception");
            a("k_ac", str);
            this.c = th;
        }

        public final a a(String str, String str2) {
            ArrayList<String> arrayList = this.d;
            arrayList.add(str + ResponseProtocolType.COMMENT + str2);
            return this;
        }

        public final a b(String str, String str2) {
            ArrayList<String> arrayList = this.e;
            arrayList.add(str + ":\n" + str2);
            return this;
        }
    }

    private static Object a(String str, Class[] clsArr, Object[] objArr) throws Exception {
        e();
        Method a2 = g.a(b, str, clsArr);
        if (a2 != null) {
            return a2.invoke(c, objArr);
        }
        return null;
    }

    static /* synthetic */ Object a(Method method, Object[] objArr) throws Exception {
        if (method != null) {
            return method.invoke(c, objArr);
        }
        return null;
    }

    public static String a(String str) {
        String str2 = null;
        try {
            String str3 = (String) a("getLastExitExtraInfo", new Class[]{String.class}, new Object[]{str});
            try {
                Log.d("CrashSdkHelper", "getLastExitExtraInfo result:".concat(String.valueOf(str3)));
                return str3;
            } catch (Throwable th) {
                str2 = str3;
                th = th;
                Log.w("CrashSdkHelper", "getLastExitExtraInfo failed", th);
                return str2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a() {
        try {
            e();
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "init failed", th);
        }
    }

    public static void a(a aVar) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<String> it = aVar.d.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append("\n");
            }
            stringBuffer.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nException message:\nBack traces starts.\n");
            stringBuffer.append(Log.a(aVar.c));
            stringBuffer.append("Back traces ends.\n");
            Iterator<String> it2 = aVar.e.iterator();
            while (it2.hasNext()) {
                stringBuffer.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                stringBuffer.append(it2.next());
                stringBuffer.append("\n");
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("mAddLogcat", aVar.f23775a);
            bundle.putBoolean("mUploadNow", aVar.b);
            bundle.putBoolean("mAddThreadsDump", true);
            bundle.putBoolean("mAddBuildId", true);
            a("generateCustomLog", new Class[]{StringBuffer.class, String.class, Bundle.class}, new Object[]{stringBuffer, "exception", bundle});
            Log.d("CrashSdkHelper", "generateCustomLog size:" + stringBuffer.length());
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "generateCustomLog failed", th);
        }
    }

    public static void a(final String str, final String str2) {
        com.uc.webview.base.task.d.b("addHeaderInfo", new Runnable() { // from class: com.uc.webview.base.b.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.e();
                    b.a(b.d, new Object[]{str, str2});
                    Log.d("CrashSdkHelper", "addHeaderInfo: " + str + "=" + str2);
                } catch (Throwable th) {
                    Log.w("CrashSdkHelper", "addHeaderInfo failed", th);
                }
            }
        });
    }

    public static void a(String str, Callable<String> callable) {
        try {
            a("registerInfoCallback", new Class[]{String.class, Integer.TYPE, Callable.class}, new Object[]{str, 1048593, callable});
            Log.d("CrashSdkHelper", "registerInfoCallback category:" + str + ", logType:1048593");
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "registerInfoCallback failed", th);
        }
    }

    public static int b() {
        int i = 0;
        try {
            i = ((Integer) a("getLastExitTypeEx", null, null)).intValue();
            Log.d("CrashSdkHelper", "getLastExitTypeEx result:".concat(String.valueOf(i)));
            return i;
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "getLastExitTypeEx failed", th);
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() throws Exception {
        if (f23773a) {
            return;
        }
        synchronized (b.class) {
            if (f23773a) {
                return;
            }
            f23773a = true;
            try {
                Class<?> cls = Class.forName("com.uc.crashsdk.export.CrashApi");
                b = cls;
                c = g.a(cls, "getInstance", (Class[]) null, (Object[]) null);
            } catch (Throwable unused) {
            }
            if (c == null) {
                try {
                    Class<?> cls2 = Class.forName("com.uc2.crashsdk.export.CrashApi");
                    b = cls2;
                    c = g.a(cls2, "getInstance", (Class[]) null, (Object[]) null);
                } catch (Throwable unused2) {
                }
            }
            if (c == null) {
                b = null;
            }
            d = g.a(b, "addHeaderInfo", String.class, String.class);
        }
    }
}
