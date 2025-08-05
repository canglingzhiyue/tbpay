package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private GridView f13916a;
    private StickerGroup b;
    private e c;
    private StickerGridAdapter d;

    static {
        kge.a(225581235);
    }

    public c(View view, e eVar) {
        super(view);
        this.f13916a = (GridView) view;
        this.c = eVar;
    }

    public void a(StickerGroup stickerGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c0e07", new Object[]{this, stickerGroup, new Boolean(z)});
        } else if (stickerGroup == this.b) {
        } else {
            this.b = stickerGroup;
            StickerGridAdapter stickerGridAdapter = this.d;
            if (stickerGridAdapter == null) {
                this.d = new StickerGridAdapter(this.itemView.getContext(), this.c);
                this.d.setStickerGroup(stickerGroup);
                this.f13916a.setAdapter((ListAdapter) this.d);
                return;
            }
            stickerGridAdapter.setStickerGroup(stickerGroup);
            this.d.notifyDataSetChanged();
        }
    }
}
