package com.taobao.taolive.sdk.adapter.network;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pav;

/* loaded from: classes8.dex */
public class g implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f21788a;
    private e b;

    static {
        kge.a(327512036);
        kge.a(581458272);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52aeff5e", new Object[]{this, cVar});
        } else {
            this.f21788a = cVar;
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52afe81c", new Object[]{this, eVar});
        } else {
            this.b = eVar;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.c
    public NetResponse a(NetRequest netRequest) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("920d5d14", new Object[]{this, netRequest});
        }
        NetResponse netResponse = null;
        c cVar = this.f21788a;
        if (cVar != null) {
            netResponse = cVar.a(netRequest);
        }
        if (pav.INSTANCE.a() && (eVar = this.b) != null) {
            eVar.a(netRequest, netResponse);
        }
        return netResponse;
    }
}
