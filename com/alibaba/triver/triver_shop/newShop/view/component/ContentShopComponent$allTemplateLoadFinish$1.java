package com.alibaba.triver.triver_shop.newShop.view.component;

import android.support.v4.view.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ContentShopComponent$allTemplateLoadFinish$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$allTemplateLoadFinish$1(b bVar) {
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
        if (this.this$0.i() == 0) {
            b bVar = this.this$0;
            bVar.onPageSelected(bVar.i());
        } else {
            b bVar2 = this.this$0;
            ViewPager viewPager = b.$ipChange;
            if (viewPager == null) {
                q.b("contentViewPager");
                throw null;
            }
            viewPager.setCurrentItem(this.this$0.i(), false);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new AnonymousClass1(this.this$0), 350L);
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.ContentShopComponent$allTemplateLoadFinish$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar) {
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
            } else {
                this.this$0.y();
            }
        }
    }
}
