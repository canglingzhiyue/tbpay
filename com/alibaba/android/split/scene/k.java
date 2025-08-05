package com.alibaba.android.split.scene;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class k implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(891164290);
        kge.a(-946340039);
    }

    @Override // com.alibaba.android.split.scene.g
    public h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("f26f6f6a", new Object[]{this}) : new d();
    }
}
