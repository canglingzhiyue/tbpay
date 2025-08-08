package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13917a;
    private List<StickerGroup> b;
    private e c;
    private boolean d;

    static {
        kge.a(-1380673789);
    }

    public d(Context context, e eVar, boolean z) {
        this.f13917a = context;
        this.c = eVar;
        this.d = z;
    }

    public void a(List<StickerGroup> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 0) {
            View inflate = LayoutInflater.from(this.f13917a).inflate(R.layout.taolive_sticker_title_flexalocal, viewGroup, false);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) inflate.getLayoutParams();
            if (this.d) {
                layoutParams.leftMargin = com.taobao.taolive.room.utils.d.a(this.f13917a, 24.0f);
            } else {
                layoutParams.leftMargin = com.taobao.taolive.room.utils.d.a(this.f13917a, 12.75f);
            }
            layoutParams.topMargin = com.taobao.taolive.room.utils.d.a(this.f13917a, 16.0f);
            inflate.setLayoutParams(layoutParams);
            return new f(inflate);
        } else if (i == 1) {
            GridView gridView = (GridView) LayoutInflater.from(this.f13917a).inflate(R.layout.taolive_official_sticker_flexalocal, viewGroup, false);
            gridView.setNumColumns(this.d ? 10 : 7);
            if (this.d) {
                gridView.setPadding(-com.taobao.taolive.room.utils.d.a(this.f13917a, 5.0f), 0, 0, 0);
            }
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) gridView.getLayoutParams();
            layoutParams2.topMargin = com.taobao.taolive.room.utils.d.a(this.f13917a, 4.0f);
            gridView.setLayoutParams(layoutParams2);
            return new c(gridView, this.c);
        } else if (i != 2) {
            if (i == 4) {
                return new f(LayoutInflater.from(this.f13917a).inflate(R.layout.taolive_sticker_title_empty_flexalocal, viewGroup, false));
            }
            return null;
        } else {
            TaoLiveFlowLayout taoLiveFlowLayout = (TaoLiveFlowLayout) LayoutInflater.from(this.f13917a).inflate(R.layout.taolive_anchor_custom_sticker_flexalocal, viewGroup, false);
            RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) taoLiveFlowLayout.getLayoutParams();
            layoutParams3.topMargin = com.taobao.taolive.room.utils.d.a(this.f13917a, 16.0f);
            taoLiveFlowLayout.setLayoutParams(layoutParams3);
            return new a(taoLiveFlowLayout, this.c, this.d);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (viewHolder instanceof f) {
            ((f) viewHolder).f13918a.setText(this.b.get(i / 2).title);
        } else if (viewHolder instanceof c) {
            ((c) viewHolder).a(this.b.get(i / 2), this.d);
        } else if (!(viewHolder instanceof a)) {
        } else {
            ((a) viewHolder).a(this.b.get(i / 2));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<StickerGroup> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size() << 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i % 2 == 0) {
            return this.b.size() > 1 ? 0 : 4;
        }
        StickerGroup stickerGroup = this.b.get(i / 2);
        if ("official_sticker".equals(stickerGroup.type) || "recently".equals(stickerGroup.type)) {
            return 1;
        }
        if ("anchor_custom_sticker".equals(stickerGroup.type) || "official_strip_sticker".equals(stickerGroup.type)) {
            return 2;
        }
        if (StringUtils.isEmpty(stickerGroup.stickerType)) {
            return 3;
        }
        if ("icon".equals(stickerGroup.stickerType)) {
            return 1;
        }
        return "strip".equals(stickerGroup.stickerType) ? 2 : 3;
    }
}
