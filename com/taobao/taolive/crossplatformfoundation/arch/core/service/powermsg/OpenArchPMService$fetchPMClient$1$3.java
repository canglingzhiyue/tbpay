package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.q;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class OpenArchPMService$fetchPMClient$1$3 extends FunctionReferenceImpl implements rul<q, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OpenArchPMService$fetchPMClient$1$3(Object obj) {
        super(1, obj, c.class, "onJoinMessageArrived", "onJoinMessageArrived(Lcom/taobao/dxng/kmp_api_exporter/PowerMsgJoinMessage;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(q qVar) {
        invoke2(qVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8809a6", new Object[]{this, qVar});
        } else {
            ((c) this.receiver).a(qVar);
        }
    }
}
