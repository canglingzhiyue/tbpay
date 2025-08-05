package com.taobao.android.meta.srp;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import tb.irq;
import tb.iuk;
import tb.iuo;
import tb.ruk;

/* loaded from: classes6.dex */
public final class SrpWidget$searchBarWidget$2 extends Lambda implements ruk<iuk<?, ?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SrpWidget$searchBarWidget$2(c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final iuk<?, ?> mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("3b373bc8", new Object[]{this});
        }
        irq creatorParam = this.this$0.I();
        q.a((Object) creatorParam, "creatorParam");
        creatorParam.g = new iuo();
        c cVar = this.this$0;
        return c.$ipChange.ad().a(creatorParam);
    }
}
