package com.alibaba.triver.triver_shop.newShop.view.component;

import android.animation.Animator;
import com.alibaba.triver.triver_shop.newShop.ext.n;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.view.MarginSupportFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionLinearLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class FlagShipContentComponentV2$openTab3$4 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $directlyJump;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$openTab3$4(d dVar, boolean z) {
        super(0);
        this.this$0 = dVar;
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
        o.a(n, this.this$0.d().getHeight());
        MarginSupportFrameLayout n2 = d.n(this.this$0);
        if (n2 == null) {
            q.b("tab3Container");
            throw null;
        } else {
            n.a(n2, -this.this$0.d().getHeight(), this.$directlyJump ? 0L : 700L, (Animator.AnimatorListener) new d.a() { // from class: com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV2$openTab3$4.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    super(d.this);
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.alibaba.triver.triver_shop.newShop.view.component.d.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    com.alibaba.triver.triver_shop.newShop.view.o p;
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animation});
                        return;
                    }
                    q.d(animation, "animation");
                    super.onAnimationEnd(animation);
                    PerceptionLinearLayout q = d.q(d.this);
                    if (q == null) {
                        q.b("shopHeaderContainer");
                        throw null;
                    }
                    o.c(q);
                    com.alibaba.triver.triver_shop.newShop.view.o p2 = d.p(d.this);
                    if (p2 != null && !p2.h()) {
                        z = true;
                    }
                    if (!z || (p = d.p(d.this)) == null) {
                        return;
                    }
                    p.c();
                }
            }).start();
        }
    }
}
