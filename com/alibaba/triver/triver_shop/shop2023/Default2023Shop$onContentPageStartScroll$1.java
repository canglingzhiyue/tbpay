package com.alibaba.triver.triver_shop.shop2023;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.ext.n;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Default2023Shop$onContentPageStartScroll$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$onContentPageStartScroll$1(a aVar) {
        super(0);
        this.this$0 = aVar;
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
        a aVar = this.this$0;
        ViewGroup viewGroup = a.$ipChange;
        if (viewGroup == null) {
            q.b("bottomBarContainer");
            throw null;
        }
        ViewGroup viewGroup2 = viewGroup;
        a aVar2 = this.this$0;
        ViewGroup viewGroup3 = a.$ipChange;
        if (viewGroup3 == null) {
            q.b("bottomBarContainer");
            throw null;
        }
        final a aVar3 = this.this$0;
        n.b(viewGroup2, viewGroup3.getHeight(), 0L, new AnimatorListenerAdapter() { // from class: com.alibaba.triver.triver_shop.shop2023.Default2023Shop$onContentPageStartScroll$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                a.b(a.this, false);
                a.c(a.this, true);
                a aVar4 = a.this;
                ruk rukVar = a.$ipChange;
                a.a(a.this, (ruk) null);
                if (rukVar == null) {
                    return;
                }
                rukVar.mo2427invoke();
            }
        }, 2, null).start();
    }
}
