package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.gso;

/* loaded from: classes5.dex */
public class cc implements cd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.cd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            gso.a();
        }
    }
}
