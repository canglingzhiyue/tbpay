package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.o;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.t;
import tb.rul;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class OpenArchPMService$fetchPMClient$1$2 extends FunctionReferenceImpl implements rul<o, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OpenArchPMService$fetchPMClient$1$2(Object obj) {
        super(1, obj, c.class, "onCountMessageArrived", "onCountMessageArrived(Lcom/taobao/dxng/kmp_api_exporter/PowerMsgCountMessage;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(o oVar) {
        invoke2(oVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8720e8", new Object[]{this, oVar});
        } else {
            ((c) this.receiver).a(oVar);
        }
    }
}
