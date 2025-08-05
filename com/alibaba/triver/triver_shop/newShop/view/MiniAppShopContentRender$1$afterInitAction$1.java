package com.alibaba.triver.triver_shop.newShop.view;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.ariver.integration.RVMain;
import com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class MiniAppShopContentRender$1$afterInitAction$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ String $miniAppUrl;
    public final /* synthetic */ MiniAppShopContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender$1$afterInitAction$1(MiniAppShopContentRender miniAppShopContentRender, String str, Bundle bundle) {
        super(0);
        this.this$0 = miniAppShopContentRender;
        this.$miniAppUrl = str;
        this.$bundle = bundle;
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
        int au;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (MiniAppShopContentRender.b(this.this$0).o()) {
            com.alibaba.triver.triver_shop.newShop.data.d g = MiniAppShopContentRender.b(this.this$0).g();
            if (g != null) {
                au = g.at();
            }
            au = 0;
        } else {
            com.alibaba.triver.triver_shop.newShop.data.d g2 = MiniAppShopContentRender.b(this.this$0).g();
            if (g2 != null) {
                au = g2.au();
            }
            au = 0;
        }
        if (au == 0) {
            ceg.Companion.b("mini app content render : maxHeight 0");
            MiniAppShopContentRender miniAppShopContentRender = this.this$0;
            MiniAppShopContentRender miniAppShopContentRender2 = this.this$0;
            com.alibaba.triver.triver_shop.newShop.ext.o.a(MiniAppShopContentRender.$ipChange, MiniAppShopContentRender.$ipChange);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, au);
            MiniAppShopContentRender miniAppShopContentRender3 = this.this$0;
            FrameLayout.LayoutParams layoutParams2 = layoutParams;
            MiniAppShopContentRender.$ipChange.setLayoutParams(layoutParams2);
            MiniAppShopContentRender miniAppShopContentRender4 = this.this$0;
            FrameLayout frameLayout = MiniAppShopContentRender.$ipChange;
            MiniAppShopContentRender miniAppShopContentRender5 = this.this$0;
            frameLayout.addView(MiniAppShopContentRender.$ipChange, layoutParams2);
            ceg.Companion.b(kotlin.jvm.internal.q.a("mini app content render : maxHeight ", (Object) Integer.valueOf(au)));
        }
        MiniAppShopContentRender miniAppShopContentRender6 = this.this$0;
        Context context = MiniAppShopContentRender.$ipChange;
        Uri parse = Uri.parse(this.$miniAppUrl);
        Bundle bundle = this.$bundle;
        final MiniAppShopContentRender miniAppShopContentRender7 = this.this$0;
        com.alibaba.triver.e.a(context, parse, bundle, 0, new RVMain.a() { // from class: com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public final void a(Fragment fragment) {
                Lifecycle lifecycle;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2f0514a", new Object[]{this, fragment});
                    return;
                }
                MiniAppShopContentRender.a(MiniAppShopContentRender.this, fragment);
                if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
                    lifecycle.addObserver(new MiniAppShopContentRender.FragmentLifeCycleObserver(MiniAppShopContentRender.this));
                }
                MiniAppShopContentRender.j(MiniAppShopContentRender.this);
                MiniAppShopContentRender.d(MiniAppShopContentRender.this);
            }
        });
        com.alibaba.triver.triver_shop.newShop.data.d g3 = MiniAppShopContentRender.b(this.this$0).g();
        if (g3 != null && g3.an()) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g4 = MiniAppShopContentRender.b(this.this$0).g();
        if (g4 != null && g4.ac()) {
            com.alibaba.triver.triver_shop.newShop.data.d g5 = MiniAppShopContentRender.b(this.this$0).g();
            if (g5 != null && !g5.ao()) {
                z = true;
            }
            if (z) {
                return;
            }
        }
        MiniAppShopContentRender miniAppShopContentRender8 = this.this$0;
        FrameLayout frameLayout2 = MiniAppShopContentRender.$ipChange;
        final MiniAppShopContentRender miniAppShopContentRender9 = this.this$0;
        frameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender$1$afterInitAction$1.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange2 = $ipChange;
                int i9 = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                this.b++;
                MiniAppShopContentRender miniAppShopContentRender10 = MiniAppShopContentRender.this;
                int i10 = MiniAppShopContentRender.$ipChange.getLayoutParams().height;
                if (this.b >= 3 && i10 != -1) {
                    ceg.Companion.b(kotlin.jvm.internal.q.a("mini app content render : last height : ", (Object) Integer.valueOf(i10)));
                    MiniAppShopContentRender miniAppShopContentRender11 = MiniAppShopContentRender.this;
                    MiniAppShopContentRender.$ipChange.removeOnLayoutChangeListener(this);
                    return;
                }
                com.alibaba.triver.triver_shop.newShop.data.d g6 = MiniAppShopContentRender.b(MiniAppShopContentRender.this).g();
                if (g6 != null) {
                    i9 = g6.at();
                }
                if (i9 <= 0 || i10 == i9) {
                    return;
                }
                ceg.Companion.b(kotlin.jvm.internal.q.a("mini app content render : get new max content height : ", (Object) Integer.valueOf(i9)));
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, i9);
                MiniAppShopContentRender miniAppShopContentRender12 = MiniAppShopContentRender.this;
                MiniAppShopContentRender.$ipChange.setLayoutParams(layoutParams3);
            }
        });
    }
}
