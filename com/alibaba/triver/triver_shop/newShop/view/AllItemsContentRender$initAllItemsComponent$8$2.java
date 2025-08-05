package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class AllItemsContentRender$initAllItemsComponent$8$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.BooleanRef $canUpdateCrossShopStyle;
    public final /* synthetic */ boolean $crossShop;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllItemsContentRender$initAllItemsComponent$8$2(a aVar, boolean z, Ref.BooleanRef booleanRef) {
        super(0);
        this.this$0 = aVar;
        this.$crossShop = z;
        this.$canUpdateCrossShopStyle = booleanRef;
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
        d.C0135d G;
        rul<Boolean, Boolean> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.this$0.s().g();
        if (g != null && (G = g.G()) != null && (h = G.h()) != null) {
            h.mo2421invoke(Boolean.valueOf(this.$crossShop));
        }
        Ref.BooleanRef booleanRef = this.$canUpdateCrossShopStyle;
        booleanRef.element = false;
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new AnonymousClass1(booleanRef), 500L);
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.AllItemsContentRender$initAllItemsComponent$8$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.BooleanRef $canUpdateCrossShopStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef) {
            super(0);
            this.$canUpdateCrossShopStyle = booleanRef;
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
            } else {
                this.$canUpdateCrossShopStyle.element = true;
            }
        }
    }
}
