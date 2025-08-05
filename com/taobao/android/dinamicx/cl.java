package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class cl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static cm f11838a;

    static {
        kge.a(-1365167275);
    }

    public static void a(Runnable runnable, long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ae8435", new Object[]{runnable, jArr});
            return;
        }
        cm cmVar = f11838a;
        if (cmVar != null) {
            cmVar.a(runnable, jArr);
        } else {
            runnable.run();
        }
    }
}
