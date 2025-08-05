package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ List<String> $dataList;
    public final /* synthetic */ boolean $hasBigCard;
    public final /* synthetic */ j $onItemClickListener;
    public final /* synthetic */ PerceptionSizeFrameLayout $perceptionLayout;
    public final /* synthetic */ Ref.IntRef $recycleViewOuterHeight;
    public final /* synthetic */ Ref.IntRef $recycleViewOuterWidth;
    public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d $shopData;
    public final /* synthetic */ Ref.IntRef $twoTextWidth;
    public final /* synthetic */ l this$0;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PerceptionSizeFrameLayout f3900a;
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Ref.IntRef d;

        public a(PerceptionSizeFrameLayout perceptionSizeFrameLayout, RecyclerView recyclerView, int i, Ref.IntRef intRef) {
            this.f3900a = perceptionSizeFrameLayout;
            this.b = recyclerView;
            this.c = i;
            this.d = intRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f3900a.addView(this.b, this.c, this.d.element);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, l lVar, Context context, List<String> list, j jVar, boolean z, com.alibaba.triver.triver_shop.newShop.data.d dVar, PerceptionSizeFrameLayout perceptionSizeFrameLayout) {
        super(0);
        this.$recycleViewOuterHeight = intRef;
        this.$recycleViewOuterWidth = intRef2;
        this.$twoTextWidth = intRef3;
        this.this$0 = lVar;
        this.$context = context;
        this.$dataList = list;
        this.$onItemClickListener = jVar;
        this.$hasBigCard = z;
        this.$shopData = dVar;
        this.$perceptionLayout = perceptionSizeFrameLayout;
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
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.$recycleViewOuterHeight.element == 0 || this.$recycleViewOuterWidth.element == 0 || this.$twoTextWidth.element == 0) {
        } else {
            int a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 54);
            int i = this.$twoTextWidth.element + a2;
            int i2 = this.$recycleViewOuterWidth.element / i;
            if (i2 >= 5) {
                i2 = 5;
            } else if (this.$recycleViewOuterWidth.element - (i2 * i) >= this.$twoTextWidth.element + (a2 / 2)) {
                i2++;
            }
            int i3 = i2 * i;
            l lVar = this.this$0;
            Context context = this.$context;
            List<String> list = this.$dataList;
            int i4 = this.$recycleViewOuterWidth.element;
            int i5 = this.$recycleViewOuterHeight.element;
            j jVar = this.$onItemClickListener;
            RecyclerView recyclerView = l.$ipChange;
            l lVar2 = this.this$0;
            boolean z2 = this.$hasBigCard;
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.$shopData;
            PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.$perceptionLayout;
            Ref.IntRef intRef = this.$recycleViewOuterHeight;
            l.a(lVar2, recyclerView);
            l.$ipChange.a(z2);
            if (dVar.aH() || dVar.aI()) {
                z = true;
            }
            l.a(lVar2, true, null, Boolean.valueOf(z), Boolean.valueOf(dVar.aJ()), null, Boolean.valueOf(dVar.aq()), 18, null);
            RecyclerView b = l.b(lVar2);
            if (b != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.g(b);
            }
            perceptionSizeFrameLayout.post(new a(perceptionSizeFrameLayout, recyclerView, i3, intRef));
        }
    }
}
