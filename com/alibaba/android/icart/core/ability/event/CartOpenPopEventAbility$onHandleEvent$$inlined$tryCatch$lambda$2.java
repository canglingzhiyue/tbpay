package com.alibaba.android.icart.core.ability.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.aat;
import tb.adz;
import tb.bbz;
import tb.bcb;
import tb.bei;
import tb.bem;
import tb.bez;
import tb.jcz;
import tb.jqg;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "", "", "invoke", "com/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility$onHandleEvent$1$3"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2 extends Lambda implements rul<Map<String, ? extends Object>, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $hideCheckAll;
    public final /* synthetic */ bbz $presenter;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2(bbz bbzVar, boolean z, a aVar) {
        super(1);
        this.$presenter = bbzVar;
        this.$hideCheckAll = z;
        this.this$0 = aVar;
    }

    @Override // tb.rul
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2421invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map) {
        jcz T;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
            return;
        }
        a aVar = this.this$0;
        jqg.b(a.$ipChange, "onHide");
        adz S = this.$presenter.S();
        if ((S instanceof aat) && (T = ((aat) S).T()) != null) {
            T.a(false);
        }
        a aVar2 = this.this$0;
        bcb dataManager = a.$ipChange;
        if (dataManager != null) {
            q.b(dataManager, "dataManager");
            String b = dataManager.b();
            boolean z2 = !(b == null || b.length() == 0) && dataManager.d();
            dataManager.b("");
            if (bem.c(dataManager)) {
                bei.b(dataManager);
            }
            if (z2) {
                bez x = this.$presenter.x();
                if (x != null) {
                    x.n();
                }
                z = true;
            }
        }
        if (!this.$hideCheckAll || z) {
            return;
        }
        a.a(this.this$0, this.$presenter);
    }
}
