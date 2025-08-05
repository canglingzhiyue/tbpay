package com.taobao.android.meta.logic;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.iru;
import tb.ruk;

/* loaded from: classes6.dex */
public final class BaseMetaPageController$model$2 extends Lambda implements ruk<iru<D>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMetaPageController$model$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final iru<D> mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("3b3731bb", new Object[]{this});
        }
        a aVar = this.this$0;
        return aVar.e(aVar.b());
    }
}
