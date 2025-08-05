package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.r;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class OpenArchPMService$fetchPMClient$1$4 extends FunctionReferenceImpl implements rul<r, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OpenArchPMService$fetchPMClient$1$4(Object obj) {
        super(1, obj, c.class, "onMessageArrived", "onMessageArrived(Lcom/taobao/dxng/kmp_api_exporter/PowerMsgPowerMessage;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(r rVar) {
        invoke2(rVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c887e05", new Object[]{this, rVar});
        } else {
            ((c) this.receiver).a(rVar);
        }
    }
}
