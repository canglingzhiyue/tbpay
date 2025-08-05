package com.taobao.search.jarvis.rcmd;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.nph;

/* loaded from: classes7.dex */
public final class g extends nph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1160644310);
    }

    @Override // tb.nph
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
