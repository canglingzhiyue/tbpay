package com.taobao.android.meta.structure.list;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.htt;
import tb.ruk;

/* loaded from: classes6.dex */
public final class MetaListWidget$stateWidget$2 extends Lambda implements ruk<htt> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaListWidget$stateWidget$2(h hVar) {
        super(0);
        this.this$0 = hVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final htt mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htt) ipChange.ipc$dispatch("3b36c4bf", new Object[]{this});
        }
        h hVar = this.this$0;
        return h.$ipChange;
    }
}
