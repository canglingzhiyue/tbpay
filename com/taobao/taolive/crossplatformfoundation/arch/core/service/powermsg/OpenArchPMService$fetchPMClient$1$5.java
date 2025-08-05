package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.s;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class OpenArchPMService$fetchPMClient$1$5 extends FunctionReferenceImpl implements rul<s, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OpenArchPMService$fetchPMClient$1$5(Object obj) {
        super(1, obj, c.class, "onSubscribed", "onSubscribed(Lcom/taobao/dxng/kmp_api_exporter/PowerMsgSubscribeResult;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(s sVar) {
        invoke2(sVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c88f264", new Object[]{this, sVar});
        } else {
            c.a((c) this.receiver, sVar);
        }
    }
}
