package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class j extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public double g;
    public double h;
    public double i;
    public double j;
    private View k;

    static {
        kge.a(760360650);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("354c0080", new Object[]{this, jVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, jVar})).booleanValue() : c2(jVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, jVar}) : a2(jVar);
    }

    public j(Context context) {
        super(context);
        this.k = new View(this.f10821a);
        this.k.setContentDescription("热区");
    }

    public void a(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else if (this.k == null || viewGroup == null || ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) this.f).b != 1) {
        } else {
            double d = i;
            int i3 = (int) (((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) this.f).c * d);
            double d2 = i2;
            int i4 = (int) (((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) this.f).d * d2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (d * (((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) this.f).e - ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) this.f).c)), (int) (d2 * (((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) this.f).f - ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j) this.f).d)));
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i3;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            viewGroup.addView(this.k, layoutParams);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("75fb38bc", new Object[]{this, jVar}) : this.k;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19dd5bb", new Object[]{this, jVar});
            return;
        }
        this.g = jVar.c;
        this.h = jVar.d;
        this.i = jVar.e;
        this.j = jVar.f;
        if (jVar.b != 1) {
            return;
        }
        this.k.setBackgroundResource(R.color.tt_detail_transparent);
    }
}
