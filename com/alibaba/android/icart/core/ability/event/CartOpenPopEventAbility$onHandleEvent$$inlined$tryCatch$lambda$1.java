package com.alibaba.android.icart.core.ability.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.aat;
import tb.adz;
import tb.bbz;
import tb.jcz;
import tb.jqg;
import tb.pwr;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Lcom/alibaba/android/icart/core/widget/pop/CartPopContext;", "invoke", "com/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility$onHandleEvent$1$2"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1 extends Lambda implements rul<pwr, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $hideCheckAll;
    public final /* synthetic */ bbz $presenter;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1(bbz bbzVar, boolean z, a aVar) {
        super(1);
        this.$presenter = bbzVar;
        this.$hideCheckAll = z;
        this.this$0 = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(pwr pwrVar) {
        invoke2(pwrVar);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(pwr it) {
        jcz T;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54674d44", new Object[]{this, it});
            return;
        }
        q.d(it, "it");
        a aVar = this.this$0;
        jqg.b(a.$ipChange, "onShow");
        adz S = this.$presenter.S();
        if ((S instanceof aat) && (T = ((aat) S).T()) != null) {
            T.a(false);
        }
        if (!this.$hideCheckAll) {
            return;
        }
        a.a(this.this$0, this.$presenter);
    }
}
