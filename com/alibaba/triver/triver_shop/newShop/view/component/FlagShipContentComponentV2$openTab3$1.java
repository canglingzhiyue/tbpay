package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class FlagShipContentComponentV2$openTab3$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $directlyJump;
    public final /* synthetic */ RemoteLoadingView $remoteLoadingView;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$openTab3$1(d dVar, RemoteLoadingView remoteLoadingView, boolean z) {
        super(0);
        this.this$0 = dVar;
        this.$remoteLoadingView = remoteLoadingView;
        this.$directlyJump = z;
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV2$openTab3$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean $directlyJump;
        public final /* synthetic */ RemoteLoadingView $remoteLoadingView;
        public final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, RemoteLoadingView remoteLoadingView, boolean z) {
            super(0);
            this.this$0 = dVar;
            this.$remoteLoadingView = remoteLoadingView;
            this.$directlyJump = z;
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
            MarginSupportFrameLayout n = d.n(this.this$0);
            if (n == null) {
                q.b("tab3Container");
                throw null;
            }
            n.removeView(this.$remoteLoadingView);
            d dVar = this.this$0;
            if (!d.$ipChange) {
                return;
            }
            d dVar2 = this.this$0;
            d.a(dVar2, new o(dVar2.a(), this.this$0.b()));
            o p = d.p(this.this$0);
            if (p != null) {
                p.b(this.$directlyJump);
            }
            MarginSupportFrameLayout n2 = d.n(this.this$0);
            if (n2 == null) {
                q.b("tab3Container");
                throw null;
            }
            o p2 = d.p(this.this$0);
            q.a(p2);
            com.alibaba.triver.triver_shop.newShop.ext.o.a(n2, p2.b());
            o p3 = d.p(this.this$0);
            if (p3 == null) {
                return;
            }
            p3.c();
        }
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
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass1(this.this$0, this.$remoteLoadingView, this.$directlyJump));
        }
    }
}
