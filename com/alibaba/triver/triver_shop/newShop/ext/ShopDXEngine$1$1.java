package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;
import tb.ruw;

/* loaded from: classes3.dex */
public final class ShopDXEngine$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DXTemplateItem $finishedTemplateItem;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDXEngine$1$1(e eVar, DXTemplateItem dXTemplateItem) {
        super(0);
        this.this$0 = eVar;
        this.$finishedTemplateItem = dXTemplateItem;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        e eVar = this.this$0;
        ruw ruwVar = (ruw) e.$ipChange.get(Integer.valueOf(((com.alibaba.triver.triver_shop.newShop.data.b) this.$finishedTemplateItem).a()));
        if (ruwVar == null) {
            return;
        }
        DXTemplateItem finishedTemplateItem = this.$finishedTemplateItem;
        q.b(finishedTemplateItem, "finishedTemplateItem");
        ruwVar.mo2423invoke(finishedTemplateItem, true);
    }
}
