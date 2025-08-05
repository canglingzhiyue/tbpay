package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.v;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class OpenArchPMService$fetchPMClient$1$6 extends FunctionReferenceImpl implements rul<v, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OpenArchPMService$fetchPMClient$1$6(Object obj) {
        super(1, obj, c.class, "onUnSubscribed", "onUnSubscribed(Lcom/taobao/dxng/kmp_api_exporter/PowerMsgUnSubscribeResult;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(v vVar) {
        invoke2(vVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8a4f81", new Object[]{this, vVar});
        } else {
            c.a((c) this.receiver, vVar);
        }
    }
}
