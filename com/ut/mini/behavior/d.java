package com.ut.mini.behavior;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1935077848);
    }

    public void onTrigger(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41af8aa", new Object[]{this, str});
        }
    }
}
