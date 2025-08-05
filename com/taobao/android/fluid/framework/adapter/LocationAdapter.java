package com.taobao.android.fluid.framework.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class LocationAdapter implements ILocationAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1377686351);
        kge.a(1303269946);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : ILocationAdapter.ADAPTER_NAME;
    }
}
