package com.taobao.tao.messagekit.base;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f20752a;

    /* loaded from: classes8.dex */
    public interface a {
        long a();

        String a(String str, String str2, String str3);
    }

    static {
        kge.a(646644301);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(a(str, "" + i));
        } catch (Exception unused) {
            return i;
        }
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        a aVar = f20752a;
        return aVar == null ? System.currentTimeMillis() : aVar.a();
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(a(str, "" + j));
        } catch (Exception unused) {
            return j;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        a aVar = f20752a;
        return aVar == null ? str2 : aVar.a("message_box_switch", str, str2);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72459115", new Object[]{aVar});
        } else {
            f20752a = aVar;
        }
    }
}
