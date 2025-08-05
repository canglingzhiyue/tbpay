package com.alibaba.triver.triver_shop.newShop.view;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class BaseShopContentRender$tryToRecycle$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseShopContentRender$tryToRecycle$1(b bVar) {
        super(0);
        this.this$0 = bVar;
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
        } else if (this.this$0.h()) {
        } else {
            this.this$0.g();
            ceg.a aVar = ceg.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("recycle ");
            b bVar = this.this$0;
            sb.append(b.$ipChange.a());
            sb.append(',');
            b bVar2 = this.this$0;
            sb.append(b.$ipChange.b());
            sb.append(' ');
            b bVar3 = this.this$0;
            sb.append((Object) b.$ipChange.f());
            aVar.b(sb.toString());
        }
    }
}
