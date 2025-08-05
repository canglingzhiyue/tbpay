package com.taobao.android.dinamicx.eventchain;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dkx;
import tb.kge;

/* loaded from: classes5.dex */
public class p extends dkx<ExecuteResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2073043885);
    }

    public p(ExecuteResult executeResult) {
        super(executeResult);
    }

    @Override // tb.dkx
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : c() != null && c().d() > 99;
    }
}
