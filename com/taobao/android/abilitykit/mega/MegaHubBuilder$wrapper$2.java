package com.taobao.android.abilitykit.mega;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes.dex */
public final class MegaHubBuilder$wrapper$2 extends Lambda implements ruk<c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaHubBuilder$wrapper$2(b bVar) {
        super(0);
        this.this$0 = bVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final c mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b1161d90", new Object[]{this});
        }
        b bVar = this.this$0;
        String str = b.$ipChange;
        b bVar2 = this.this$0;
        String str2 = b.$ipChange;
        b bVar3 = this.this$0;
        return new c(null, str, str2, b.$ipChange);
    }
}
