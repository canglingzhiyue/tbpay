package com.taobao.android.ucp.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqf;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f15713a;
    private static volatile Long b;

    static {
        kge.a(-1341218111);
        b = null;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        if (StringUtils.isEmpty(f15713a)) {
            f15713a = b();
        }
        if (StringUtils.isEmpty(f15713a)) {
            return 0L;
        }
        if (b == null) {
            b = Long.valueOf(a("UCP_" + f15713a));
        }
        return b.longValue();
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        long j = 0;
        if (StringUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return aqf.b(com.taobao.android.behavix.d.b()).get("UTDID");
        } catch (Throwable unused) {
            return "";
        }
    }
}
