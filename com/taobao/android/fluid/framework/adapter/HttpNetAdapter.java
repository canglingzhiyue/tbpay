package com.taobao.android.fluid.framework.adapter;

import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IHttpNetAdapter;
import tb.kge;
import tb.obu;

/* loaded from: classes5.dex */
public class HttpNetAdapter implements IHttpNetAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1259510813);
        kge.a(766634298);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : IHttpNetAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IHttpNetAdapter
    public <T> void send(IHttpNetAdapter.c cVar, IHttpNetAdapter.a<T> aVar, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95dfe0", new Object[]{this, cVar, aVar, cls});
            return;
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(obu.e());
        RequestImpl requestImpl = new RequestImpl(cVar.f12451a);
        if (cVar.b > 0) {
            requestImpl.setConnectTimeout(cVar.b);
            requestImpl.setReadTimeout(cVar.b);
        }
        degradableNetwork.asyncSend(requestImpl, null, null, new IHttpNetAdapter.b(aVar, cls));
    }
}
