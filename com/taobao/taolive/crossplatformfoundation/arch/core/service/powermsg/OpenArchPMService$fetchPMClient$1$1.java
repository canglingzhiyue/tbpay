package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.t;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.rul;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class OpenArchPMService$fetchPMClient$1$1 extends FunctionReferenceImpl implements rul<t, kotlin.t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public OpenArchPMService$fetchPMClient$1$1(Object obj) {
        super(1, obj, c.class, "onTextMessageArrived", "onTextMessageArrived(Lcom/taobao/dxng/kmp_api_exporter/PowerMsgTextMessage;)V", 0);
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ kotlin.t mo2421invoke(t tVar) {
        invoke2(tVar);
        return kotlin.t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8966c3", new Object[]{this, tVar});
        } else {
            ((c) this.receiver).a(tVar);
        }
    }
}
