package com.alibaba.android.aura.util;

import android.os.Build;
import android.os.Debug;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import tb.arc;
import tb.kge;

/* loaded from: classes2.dex */
public class AURATraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_COMMON_INT = 1;
    public static final int TYPE_PARSE_INT = 3;
    public static final int TYPE_THREAD_INT = 2;

    /* renamed from: a  reason: collision with root package name */
    public static long f2216a;
    private static boolean b;
    private static boolean c;
    private static final List<Integer> d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AURATraceSupportType {
    }

    static {
        kge.a(659520706);
        b = false;
        c = false;
        d = new ArrayList<Integer>() { // from class: com.alibaba.android.aura.util.AURATraceUtil.1
            {
                add(1);
                add(2);
                add(3);
            }
        };
        f2216a = 0L;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : UUID.randomUUID().toString();
    }

    public static void a(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc39da4", new Object[]{new Integer(i), strArr});
        } else if (!c(i) || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.beginSection(a(strArr));
        }
    }

    public static void b(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3eaa5", new Object[]{new Integer(i), strArr});
        } else if (!c(i) || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.beginSection(a(strArr));
            Trace.endSection();
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else if (!c(i) || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.endSection();
        }
    }

    private static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void c(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882437a6", new Object[]{new Integer(i), strArr});
        } else if (!c || Build.VERSION.SDK_INT < 18) {
        } else {
            String a2 = a(strArr);
            Debug.startMethodTracing("/data/local/tmp/" + a2);
        }
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
        } else if (!c || Build.VERSION.SDK_INT < 18) {
        } else {
            Debug.stopMethodTracing();
        }
    }

    private static boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{new Integer(i)})).booleanValue() : b && d.contains(Integer.valueOf(i));
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Throwable unused) {
            arc.a().a("printStackTrace转换错误");
            return "";
        }
    }
}
