package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class Shop2023CategoryNativeComponent$initView$1$3 extends Lambda implements ruk<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023CategoryNativeComponent$initView$1$3(ViewGroup viewGroup, e eVar) {
        super(0);
        this.$container = viewGroup;
        this.this$0 = eVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final RecyclerView mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("d8b25ae5", new Object[]{this});
        }
        Context context = this.$container.getContext();
        final e eVar = this.this$0;
        return new RecyclerView(context) { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023CategoryNativeComponent$initView$1$3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean detectSwipeOrientation;
            private float startY;
            private boolean swipeUp;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            public final boolean getSwipeUp() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("36c6c4a", new Object[]{this})).booleanValue() : this.swipeUp;
            }

            public final void setSwipeUp(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a06aca5a", new Object[]{this, new Boolean(z)});
                } else {
                    this.swipeUp = z;
                }
            }

            public final boolean getDetectSwipeOrientation() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9a98a6fa", new Object[]{this})).booleanValue() : this.detectSwipeOrientation;
            }

            public final void setDetectSwipeOrientation(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c094f612", new Object[]{this, new Boolean(z)});
                } else {
                    this.detectSwipeOrientation = z;
                }
            }

            public final float getStartY() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("90071124", new Object[]{this})).floatValue() : this.startY;
            }

            public final void setStartY(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
                } else {
                    this.startY = f;
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                com.alibaba.triver.triver_shop.newShop.data.d g;
                d.C0135d G;
                rul<Boolean, t> i;
                com.alibaba.triver.triver_shop.newShop.data.d g2;
                d.C0135d G2;
                rul<Boolean, t> i2;
                d.C0135d G3;
                rul<Boolean, t> i3;
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                if (motionEvent == null) {
                    return false;
                }
                if (o.a(motionEvent)) {
                    this.swipeUp = false;
                    this.detectSwipeOrientation = false;
                    this.startY = motionEvent.getRawY();
                    com.alibaba.triver.triver_shop.newShop.data.d g3 = e.this.c().g();
                    if (g3 != null && (G3 = g3.G()) != null && (i3 = G3.i()) != null) {
                        i3.mo2421invoke(false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if ((o.b(motionEvent) || o.c(motionEvent)) && (g = e.this.c().g()) != null && (G = g.G()) != null && (i = G.i()) != null) {
                    i.mo2421invoke(true);
                }
                if (o.d(motionEvent)) {
                    if (!this.detectSwipeOrientation) {
                        if (motionEvent.getRawY() < this.startY) {
                            z = true;
                        }
                        this.swipeUp = z;
                        this.detectSwipeOrientation = true;
                    }
                    if (this.swipeUp && !canScrollVertically(1) && (g2 = e.this.c().g()) != null && (G2 = g2.G()) != null && (i2 = G2.i()) != null) {
                        i2.mo2421invoke(true);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
    }
}
