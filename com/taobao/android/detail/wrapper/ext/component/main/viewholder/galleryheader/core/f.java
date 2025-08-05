package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class f extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f11222a;
    public View b;

    static {
        kge.a(930183827);
    }

    public f(View view) {
        super(view);
        this.b = view;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.SubItemViewHolder");
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public final void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247eb781", new Object[]{this, gVar});
        } else {
            this.f11222a = gVar;
        }
    }

    public final g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("d739d9e6", new Object[]{this}) : this.f11222a;
    }
}
