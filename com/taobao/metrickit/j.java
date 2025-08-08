package com.taobao.metrickit;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile n<String, String, Void> f18091a;
    private static final Object b = new Object();
    private static String c;

    public static void a(n<String, String, Void> nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9e6125", new Object[]{nVar});
            return;
        }
        synchronized (b) {
            f18091a = nVar;
            if (!StringUtils.isEmpty(c)) {
                f18091a.a("utABTest", c);
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (f18091a == null) {
            synchronized (b) {
                if (f18091a != null) {
                    f18091a.a("utABTest", str);
                } else {
                    c = str;
                }
            }
        } else {
            f18091a.a("utABTest", str);
        }
    }
}
