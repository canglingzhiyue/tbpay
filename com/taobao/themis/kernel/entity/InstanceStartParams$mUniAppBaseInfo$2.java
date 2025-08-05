package com.taobao.themis.kernel.entity;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.i;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes9.dex */
public final class InstanceStartParams$mUniAppBaseInfo$2 extends Lambda implements ruk<i.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ InstanceStartParams this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceStartParams$mUniAppBaseInfo$2(InstanceStartParams instanceStartParams) {
        super(0);
        this.this$0 = instanceStartParams;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final i.a mo2427invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i.a) ipChange.ipc$dispatch("e870145a", new Object[]{this}) : i.INSTANCE.a(InstanceStartParams.access$getMUrl$p(this.this$0));
    }
}
