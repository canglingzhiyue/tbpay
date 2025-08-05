package com.taobao.android.meta.logic;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.irt;
import tb.ruk;

/* loaded from: classes6.dex */
public final class BaseMetaPageController$pageModel$2 extends Lambda implements ruk<irt<D>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMetaPageController$pageModel$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final irt<D> mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irt) ipChange.ipc$dispatch("3b37319c", new Object[]{this});
        }
        a aVar = this.this$0;
        return aVar.a((a) aVar.b(), this.this$0.f());
    }
}
