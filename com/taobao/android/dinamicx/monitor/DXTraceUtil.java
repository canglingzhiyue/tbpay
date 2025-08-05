package com.taobao.android.dinamicx.monitor;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class DXTraceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_COMMON_INT = 1;
    public static final String TYPE_COMMON_STRING = "common";
    public static final int TYPE_EVENT_CHAIN_INT = 2;
    public static final String TYPE_EVENT_CHAIN_STRING = "eventChain";
    public static final int TYPE_EXPRESSION_INT = 3;
    public static final String TYPE_EXPRESSION_STRING = "expression";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11892a;
    private static final List<Integer> b;
    private static boolean c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXTraceSupportType {
    }

    static {
        kge.a(577329355);
        f11892a = false;
        c = false;
        b = new ArrayList<Integer>() { // from class: com.taobao.android.dinamicx.monitor.DXTraceUtil.1
            {
                add(1);
                add(2);
                add(3);
            }
        };
    }

    public static void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{strArr});
        } else {
            a(1, strArr);
        }
    }

    public static void a(int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc39da4", new Object[]{new Integer(i), strArr});
        } else if (!b(i) || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.beginSection(b(strArr));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(1);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else if (!b(i) || Build.VERSION.SDK_INT < 18) {
        } else {
            Trace.endSection();
        }
    }

    private static String b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31bc34ca", new Object[]{strArr});
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

    private static boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue() : f11892a && b.contains(Integer.valueOf(i));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f11892a;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f11892a = z;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c;
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }
}
