package com.taobao.android.abilityidl;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2092744861);
        kge.a(1190275412);
    }

    @Override // com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
