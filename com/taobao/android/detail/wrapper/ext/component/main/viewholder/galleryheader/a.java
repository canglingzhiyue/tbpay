package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class a extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f11163a;
    public View b;

    static {
        kge.a(529497189);
    }

    public a(View view) {
        super(view);
        this.b = view;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.SubItemViewHolder");
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public final void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b006f16", new Object[]{this, bVar});
        } else {
            this.f11163a = bVar;
        }
    }

    public final b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("50deb617", new Object[]{this}) : this.f11163a;
    }
}
