package com.taobao.taolive.adapterimpl.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public class MtopNetworkAdapter$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;
    public final /* synthetic */ d val$listener;

    public MtopNetworkAdapter$1(a aVar, d dVar) {
        this.this$0 = aVar;
        this.val$listener = dVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        d dVar = this.val$listener;
        if (dVar == null) {
            return;
        }
        a aVar = this.this$0;
        dVar.onSystemError(i, a.$ipChange, null);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.val$listener == null) {
        } else {
            a aVar = this.this$0;
            NetResponse netResponse = a.$ipChange;
            d dVar = this.val$listener;
            a aVar2 = this.this$0;
            dVar.onSuccess(i, netResponse, a.$ipChange, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        d dVar = this.val$listener;
        if (dVar == null) {
            return;
        }
        a aVar = this.this$0;
        dVar.onError(i, a.$ipChange, obj);
    }
}
