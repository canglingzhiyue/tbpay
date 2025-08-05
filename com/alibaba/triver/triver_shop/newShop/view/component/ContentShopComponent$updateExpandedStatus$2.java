package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ContentShopComponent$updateExpandedStatus$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$updateExpandedStatus$2(b bVar) {
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
            return;
        }
        b bVar = this.this$0;
        EmbedShopLoftComponent embedShopLoftComponent = b.$ipChange;
        if (embedShopLoftComponent != null) {
            embedShopLoftComponent.j();
        }
        b bVar2 = this.this$0;
        MiniVideoLoftView miniVideoLoftView = b.$ipChange;
        if (miniVideoLoftView != null) {
            miniVideoLoftView.pause();
        }
        b bVar3 = this.this$0;
        TUrlImageView tUrlImageView = b.$ipChange;
        if (tUrlImageView != null) {
            o.e(tUrlImageView);
        } else {
            q.b("loftAtmosphereBgPic");
            throw null;
        }
    }
}
