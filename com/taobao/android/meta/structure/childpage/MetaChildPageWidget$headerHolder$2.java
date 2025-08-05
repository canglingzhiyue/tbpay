package com.taobao.android.meta.structure.childpage;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.htm;
import tb.ruk;

/* loaded from: classes6.dex */
public final class MetaChildPageWidget$headerHolder$2 extends Lambda implements ruk<htm> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaChildPageWidget$headerHolder$2(g gVar) {
        super(0);
        this.this$0 = gVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final htm mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htm) ipChange.ipc$dispatch("3b36c3e6", new Object[]{this});
        }
        g gVar = this.this$0;
        return new htm(g.$ipChange.X(), this.this$0);
    }
}
