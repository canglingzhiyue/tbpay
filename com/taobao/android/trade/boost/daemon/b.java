package com.taobao.android.trade.boost.daemon;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NetDaemon";

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f15590a;

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4d4086d8", new Object[0]);
        }
        if (f15590a == null) {
            synchronized (b.class) {
                f15590a = new b();
            }
        }
        return f15590a;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String str2 = "[allowExecute] who: " + str;
        return true;
    }
}
