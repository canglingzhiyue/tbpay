package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class FlagShipContentComponentV2$openTab3$2 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RemoteLoadingView $remoteLoadingView;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$openTab3$2(d dVar, RemoteLoadingView remoteLoadingView) {
        super(0);
        this.this$0 = dVar;
        this.$remoteLoadingView = remoteLoadingView;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV2$openTab3$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements ruk<t> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RemoteLoadingView $remoteLoadingView;
        public final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, RemoteLoadingView remoteLoadingView) {
            super(0);
            this.this$0 = dVar;
            this.$remoteLoadingView = remoteLoadingView;
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
            MarginSupportFrameLayout n2 = d.n(this.this$0);
            if (n2 != null) {
                o.a(n2, h.b(this.this$0.a()));
            } else {
                q.b("tab3Container");
                throw null;
            }
        }
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ceg.Companion.b("tab3 show error , widget sdk remote failed");
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new AnonymousClass1(this.this$0, this.$remoteLoadingView));
    }
}
