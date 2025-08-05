package com.taobao.taolive.sdk.business;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements com.taobao.taolive.sdk.adapter.network.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.sdk.adapter.network.d f21789a;
    private Context b;

    static {
        kge.a(1573785401);
        kge.a(-797454141);
    }

    public a(com.taobao.taolive.sdk.adapter.network.d dVar, Context context) {
        this.f21789a = dVar;
        this.b = context;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        com.taobao.taolive.sdk.utils.a.a(netResponse.getHeaderFields(), this.b);
        com.taobao.taolive.sdk.adapter.network.d dVar = this.f21789a;
        if (dVar == null) {
            return;
        }
        dVar.onSuccess(i, netResponse, netBaseOutDo, obj);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        com.taobao.taolive.sdk.adapter.network.d dVar = this.f21789a;
        if (dVar == null) {
            return;
        }
        dVar.onError(i, netResponse, obj);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        com.taobao.taolive.sdk.adapter.network.d dVar = this.f21789a;
        if (dVar == null) {
            return;
        }
        dVar.onSystemError(i, netResponse, obj);
    }
}
