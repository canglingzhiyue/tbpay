package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;

/* loaded from: classes5.dex */
public class ck implements cm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.cm
    public void a(Runnable runnable, long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ae8435", new Object[]{this, runnable, jArr});
        } else {
            ADaemon.postMainLooper(runnable, jArr);
        }
    }
}
