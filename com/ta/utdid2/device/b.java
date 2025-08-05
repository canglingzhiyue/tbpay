package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.upload.UtdidKeyFile;
import com.ta.audid.utils.FileUtils;
import com.ta.audid.utils.UtdidLogger;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1365579968);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String d = d();
        if (UTUtdid.isValidUtdid(d)) {
            return d;
        }
        b();
        return d();
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        String ecdidUtdidPath = UtdidKeyFile.getEcdidUtdidPath();
        UtdidLogger.sd("", "readEcdidUtdidFile path", ecdidUtdidPath);
        String readFile = FileUtils.readFile(ecdidUtdidPath);
        UtdidLogger.d("", "readEcdidUtdidFile", readFile);
        return readFile;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String ecdidUtdidPath = UtdidKeyFile.getEcdidUtdidPath();
        UtdidLogger.d("", "writeEcdidUtdidFile", str);
        UtdidLogger.sd("", "writeEcdidUtdidFile path", ecdidUtdidPath);
        FileUtils.saveFile(ecdidUtdidPath, str);
        c();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        a(0);
        a(1);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        a(0);
        a(2);
    }

    private static String a(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Throwable th) {
            UtdidLogger.se("", th, new Object[0]);
        }
        if (i == 0) {
            str = (String) a(0, 2, 72634, Variables.getInstance().getContext());
        } else if (i != 1) {
            if (i == 2) {
                str = (String) a(0, 2, 4636617, (Object) null);
            }
            str = "";
            UtdidLogger.d("", "sendMessage", Integer.valueOf(i), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return str;
        } else {
            str = (String) a(0, 2, 61501799, (Object) 130502);
        }
        UtdidLogger.d("", "sendMessage", Integer.valueOf(i), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return str;
    }

    private static Object a(int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("568b3fbb", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), obj}) : a("com.alibaba.one.android.sdk.OneMain", "play", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj}, Integer.TYPE, Integer.TYPE, Integer.TYPE, Object.class);
    }

    private static Object a(String str, String str2, Object[] objArr, Class... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("148d4a95", new Object[]{str, str2, objArr, clsArr});
        }
        try {
            Class<?> cls = Class.forName(str);
            if (cls == null) {
                return null;
            }
            return a(cls, str2, objArr, clsArr);
        } catch (ClassNotFoundException e) {
            UtdidLogger.se("", e, new Object[0]);
            return null;
        }
    }

    private static Object a(Class cls, String str, Object[] objArr, Class... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
