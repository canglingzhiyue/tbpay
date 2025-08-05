package com.taobao.android.meta.structure.page;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes6.dex */
public final class MetaPagePresenter$adapter$2 extends Lambda implements ruk<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaPagePresenter$adapter$2(d dVar) {
        super(0);
        this.this$0 = dVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final c mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("786446d0", new Object[]{this}) : new c(this.this$0);
    }
}
