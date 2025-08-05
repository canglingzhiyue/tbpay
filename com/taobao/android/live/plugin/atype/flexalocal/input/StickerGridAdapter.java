package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.taobao.R;
import tb.cgl;
import tb.kge;

/* loaded from: classes6.dex */
public class StickerGridAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private StickerGroup mGroup;
    private e mListener;

    static {
        kge.a(342068957);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return 0L;
    }

    public static /* synthetic */ e access$000(StickerGridAdapter stickerGridAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("c334c526", new Object[]{stickerGridAdapter}) : stickerGridAdapter.mListener;
    }

    public static /* synthetic */ StickerGroup access$100(StickerGridAdapter stickerGridAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StickerGroup) ipChange.ipc$dispatch("b0c6b1f1", new Object[]{stickerGridAdapter}) : stickerGridAdapter.mGroup;
    }

    public StickerGridAdapter(Context context, e eVar) {
        this.mContext = context;
        this.mListener = eVar;
    }

    public void setStickerGroup(StickerGroup stickerGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42bf0fd0", new Object[]{this, stickerGroup});
        } else {
            this.mGroup = stickerGroup;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        StickerGroup stickerGroup = this.mGroup;
        if (stickerGroup != null && stickerGroup.stickers != null) {
            return this.mGroup.stickers.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.mGroup.stickers.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_sticker_grid_item_flexalocal, viewGroup, false);
        }
        final StickerConfig stickerConfig = (StickerConfig) getItem(i);
        final AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.iv_sticker);
        com.alilive.adapter.uikit.d b = cgl.b();
        if (b != null) {
            aliUrlImageView.setImageUrl(b.a(stickerConfig.thumbnail));
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.StickerGridAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (StickerGridAdapter.access$000(StickerGridAdapter.this) == null) {
                } else {
                    StickerGridAdapter.access$000(StickerGridAdapter.this).onOfficialStickerSelected(stickerConfig, aliUrlImageView.getDrawable(), StickerGridAdapter.access$100(StickerGridAdapter.this), false);
                }
            }
        });
        return view;
    }
}
