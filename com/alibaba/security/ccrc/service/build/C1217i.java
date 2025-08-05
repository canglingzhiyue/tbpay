package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.BaseRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* renamed from: com.alibaba.security.ccrc.service.build.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1217i implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseRequest f3310a;
    public final /* synthetic */ InterfaceC1226l b;
    public final /* synthetic */ InterfaceC1229m c;
    public final /* synthetic */ C1220j d;

    public C1217i(C1220j c1220j, BaseRequest baseRequest, InterfaceC1226l interfaceC1226l, InterfaceC1229m interfaceC1229m) {
        this.d = c1220j;
        this.f3310a = baseRequest;
        this.b = interfaceC1226l;
        this.c = interfaceC1229m;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            C1220j.a(this.d, this.f3310a, mtopResponse, this.b, this.c);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            C1220j.a(this.d, this.f3310a, mtopResponse, this.b, this.c);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            C1220j.a(this.d, this.f3310a, mtopResponse, this.b, this.c);
        }
    }
}
