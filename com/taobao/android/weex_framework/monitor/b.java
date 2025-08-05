package com.taobao.android.weex_framework.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f16065a;

    static {
        kge.a(-130774939);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b387e708", new Object[0]);
        }
        if (f16065a == null) {
            synchronized (b.class) {
                if (f16065a == null) {
                    f16065a = new b();
                }
            }
        }
        return f16065a;
    }
}
