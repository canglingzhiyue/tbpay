package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/taobao/tao/flexbox/layoutmanager/container/dx/DxContainer$createView$1$2$1"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DxContainer$createView$1$$special$$inlined$forEach$lambda$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DXTemplateItem $hasRenderDXTemplateItem;
    public final /* synthetic */ DxContainer$createView$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$createView$1$$special$$inlined$forEach$lambda$1(DXTemplateItem dXTemplateItem, DxContainer$createView$1 dxContainer$createView$1) {
        super(0);
        this.$hasRenderDXTemplateItem = dXTemplateItem;
        this.this$0 = dxContainer$createView$1;
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
        a aVar = this.this$0.f20232a;
        int i = this.this$0.f;
        int i2 = this.this$0.g;
        String str = this.this$0.b;
        long j = this.$hasRenderDXTemplateItem.b;
        String str2 = this.$hasRenderDXTemplateItem.c;
        q.b(str2, "hasRenderDXTemplateItem.templateUrl");
        aVar.a(i, i2, str, j, str2, this.this$0.h, this.this$0.j, this.this$0.k);
    }
}
