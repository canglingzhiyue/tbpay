package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class OverseaShop$updateExpandedStatus$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverseaShop$updateExpandedStatus$1(e eVar) {
        super(0);
        this.this$0 = eVar;
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
        EmbedShopLoftComponent embedShopLoftComponent = e.$ipChange;
        if (embedShopLoftComponent != null) {
            embedShopLoftComponent.k();
        }
        e eVar2 = this.this$0;
        ViewGroup viewGroup = e.$ipChange;
        if (viewGroup == null) {
            q.b("bigCardContainer");
            throw null;
        }
        o.b(viewGroup);
        e eVar3 = this.this$0;
        View view = e.$ipChange;
        if (view == null) {
            q.b("bigCardTopBlackShadowBg");
            throw null;
        }
        o.b(view);
        e eVar4 = this.this$0;
        TUrlImageView tUrlImageView = e.$ipChange;
        if (tUrlImageView != null) {
            o.b(tUrlImageView);
        } else {
            q.b("loftAtmosphereBgPic");
            throw null;
        }
    }
}
