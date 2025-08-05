package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.q;
import tb.cgl;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TaoLiveFlowLayout f13912a;
    private StickerGroup b;
    private e c;
    private boolean d;

    static {
        kge.a(593757176);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ e a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b72202a6", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void a(a aVar, Drawable drawable, AliUrlImageView aliUrlImageView, int i, StickerConfig stickerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e5be4c", new Object[]{aVar, drawable, aliUrlImageView, new Integer(i), stickerConfig});
        } else {
            aVar.a(drawable, aliUrlImageView, i, stickerConfig);
        }
    }

    public static /* synthetic */ void b(a aVar, Drawable drawable, AliUrlImageView aliUrlImageView, int i, StickerConfig stickerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc4880d", new Object[]{aVar, drawable, aliUrlImageView, new Integer(i), stickerConfig});
        } else {
            aVar.b(drawable, aliUrlImageView, i, stickerConfig);
        }
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b55135cc", new Object[]{aVar})).booleanValue() : aVar.d;
    }

    public a(View view, e eVar, boolean z) {
        super(view);
        this.f13912a = (TaoLiveFlowLayout) view;
        this.c = eVar;
        this.d = z;
    }

    public void a(final StickerGroup stickerGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d2f26d", new Object[]{this, stickerGroup});
        } else if (stickerGroup != this.b && stickerGroup.stickers != null) {
            this.b = stickerGroup;
            this.f13912a.removeAllViews();
            for (final StickerConfig stickerConfig : stickerGroup.stickers) {
                final AliUrlImageView aliUrlImageView = (AliUrlImageView) LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.taolive_custom_sticker_item_flexalocal, (ViewGroup) this.f13912a, false);
                aliUrlImageView.setImageUrl(cgl.b().a(stickerConfig.thumbnail));
                aliUrlImageView.setTag(stickerConfig.id);
                aliUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (a.a(a.this) == null) {
                        } else {
                            a.a(a.this).onAnchorCustomStickerSelected(stickerConfig, aliUrlImageView.getDrawable(), stickerGroup.type, false);
                        }
                    }
                });
                this.f13912a.addView(aliUrlImageView);
                final int indexOf = stickerGroup.stickers.indexOf(stickerConfig);
                aliUrlImageView.setImageLoadListener(new com.alilive.adapter.uikit.c() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alilive.adapter.uikit.c
                    public void a(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else if (a.b(a.this)) {
                            a.a(a.this, drawable, aliUrlImageView, indexOf, stickerConfig);
                        } else {
                            a.b(a.this, drawable, aliUrlImageView, indexOf, stickerConfig);
                        }
                    }

                    @Override // com.alilive.adapter.uikit.c
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        int a2 = com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 40.5f);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aliUrlImageView.getLayoutParams();
                        int i = indexOf;
                        if (i % 3 == 0) {
                            marginLayoutParams.leftMargin = com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 12.0f);
                            marginLayoutParams.rightMargin = a2;
                        } else if (i % 3 == 1) {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = a2;
                        } else {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 12.0f);
                        }
                        aliUrlImageView.setLayoutParams(marginLayoutParams);
                        q.a("AnchorCustomStickerVH", "onFailed margin:" + a2);
                    }
                });
            }
        }
    }

    private void a(Drawable drawable, AliUrlImageView aliUrlImageView, int i, StickerConfig stickerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc45b56d", new Object[]{this, drawable, aliUrlImageView, new Integer(i), stickerConfig});
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int measuredWidth = aliUrlImageView.getMeasuredWidth();
        if (measuredWidth > 0) {
            int e = (int) (((com.taobao.taolive.room.utils.d.e() - com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 69.0f)) - (measuredWidth * 6)) / 5.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aliUrlImageView.getLayoutParams();
            int i2 = i % 6;
            if (i2 == 0) {
                marginLayoutParams.leftMargin = com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 24.0f);
                marginLayoutParams.rightMargin = e;
            } else if (i2 <= 4) {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = e;
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 0.0f);
            }
            aliUrlImageView.setLayoutParams(marginLayoutParams);
            q.a("AnchorCustomStickerVH", "margin:" + e);
        }
        q.a("AnchorCustomStickerVH", "width:" + measuredWidth + " intrinsicWidth:" + intrinsicWidth + " intrinsicHeight:" + intrinsicHeight + " coning：" + stickerConfig.matchKey);
    }

    private void b(Drawable drawable, AliUrlImageView aliUrlImageView, int i, StickerConfig stickerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0e188c", new Object[]{this, drawable, aliUrlImageView, new Integer(i), stickerConfig});
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int measuredWidth = aliUrlImageView.getMeasuredWidth();
        if (measuredWidth > 0) {
            int e = (int) (((com.taobao.taolive.room.utils.d.e() - com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 24.0f)) - (measuredWidth * 3)) / 2.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aliUrlImageView.getLayoutParams();
            int i2 = i % 3;
            if (i2 == 0) {
                marginLayoutParams.leftMargin = com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 12.0f);
                marginLayoutParams.rightMargin = e;
            } else if (i2 == 1) {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = e;
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = com.taobao.taolive.room.utils.d.a(aliUrlImageView.getContext(), 12.0f);
            }
            aliUrlImageView.setLayoutParams(marginLayoutParams);
            q.a("AnchorCustomStickerVH", "margin:" + e);
        }
        q.a("AnchorCustomStickerVH", "width:" + measuredWidth + " intrinsicWidth:" + intrinsicWidth + " intrinsicHeight:" + intrinsicHeight + " coning：" + stickerConfig.matchKey);
    }
}
