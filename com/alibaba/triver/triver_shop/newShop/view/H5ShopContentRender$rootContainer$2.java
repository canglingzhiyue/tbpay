package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ruk;

/* loaded from: classes3.dex */
public final class H5ShopContentRender$rootContainer$2 extends Lambda implements ruk<AnonymousClass1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5ShopContentRender$rootContainer$2(g gVar) {
        super(0);
        this.this$0 = gVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.alibaba.triver.triver_shop.newShop.view.H5ShopContentRender$rootContainer$2$1] */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final AnonymousClass1 mo2427invoke() {
        d.C0135d G;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (AnonymousClass1) ipChange.ipc$dispatch("2ca33537", new Object[]{this});
        }
        g gVar = this.this$0;
        Context context = g.$ipChange;
        final g gVar2 = this.this$0;
        ?? r1 = new FrameLayout(context) { // from class: com.alibaba.triver.triver_shop.newShop.view.H5ShopContentRender$rootContainer$2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                if (com.alibaba.triver.triver_shop.newShop.ext.o.a(motionEvent)) {
                    g gVar3 = g.this;
                    g.$ipChange.a();
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        g gVar3 = this.this$0;
        if (g.c(gVar3).o()) {
            com.alibaba.triver.triver_shop.newShop.data.d g = g.c(gVar3).g();
            if (g != null && g.ap()) {
                r1.setBackgroundColor(-16777216);
                return r1;
            }
        }
        com.alibaba.triver.triver_shop.newShop.data.d g2 = g.c(gVar3).g();
        if (g2 != null && (G = g2.G()) != null && G.a()) {
            z = true;
        }
        if (z) {
            r1.setBackgroundColor(-1);
        }
        return r1;
    }
}
