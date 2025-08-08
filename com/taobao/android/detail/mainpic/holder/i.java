package com.taobao.android.detail.mainpic.holder;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bny;
import tb.etx;
import tb.euq;
import tb.euu;

/* loaded from: classes4.dex */
public class i extends j implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AliUrlImageView j;
    private etx k;
    private com.taobao.android.detail.mainpic.g l;
    private RelativeLayout m;

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void H_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802d2a1e", new Object[]{this});
        }
    }

    public static /* synthetic */ AliUrlImageView a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("d8255721", new Object[]{iVar}) : iVar.j;
    }

    public static /* synthetic */ com.taobao.android.detail.mainpic.g b(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.mainpic.g) ipChange.ipc$dispatch("89e2635c", new Object[]{iVar}) : iVar.l;
    }

    public static /* synthetic */ IDMComponent c(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("715e378e", new Object[]{iVar}) : iVar.c;
    }

    public static /* synthetic */ etx d(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (etx) ipChange.ipc$dispatch("6809d912", new Object[]{iVar}) : iVar.k;
    }

    public i(bny bnyVar, etx etxVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar, etxVar, gVar);
        this.k = etxVar;
        this.l = gVar;
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e a(final etx etxVar, final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("594ec67c", new Object[]{etxVar, gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new i(bnyVar, etx.this, gVar);
            }
        };
    }

    @Override // com.taobao.android.detail.mainpic.holder.j, com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.m = new RelativeLayout(viewGroup.getContext());
        return this.m;
    }

    @Override // com.taobao.android.detail.mainpic.holder.j, com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        com.taobao.android.detail.mainpic.h k = this.l.k();
        if (k != null) {
            k.g();
        }
        this.c = iDMComponent;
        c(iDMComponent);
    }

    @Override // com.taobao.android.detail.mainpic.holder.j
    public AliUrlImageView e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("1faf1abd", new Object[]{this}) : this.j;
    }

    private boolean c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f962e", new Object[]{this, iDMComponent})).booleanValue();
        }
        AliUrlImageView aliUrlImageView = this.j;
        if (aliUrlImageView != null && aliUrlImageView.getParent() != null && this.j.getParent().equals(this.m)) {
            return false;
        }
        String string = iDMComponent.getFields().getString("url");
        a a2 = a.a(this.l.e());
        if (a2 == null) {
            this.j = new AliUrlImageView(this.l.e());
        } else {
            this.j = a2.a(this.l.e(), string);
        }
        AliUrlImageView aliUrlImageView2 = this.j;
        aliUrlImageView2.setStrategyConfig(aliUrlImageView2.newImageStrategyConfigBuilder("detail", 15).a());
        this.j.succListener(new com.taobao.android.i<com.taobao.android.l>() { // from class: com.taobao.android.detail.mainpic.holder.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.i
            public boolean a(com.taobao.android.l lVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
                }
                i iVar = i.this;
                iVar.a(i.a(iVar), lVar.a());
                i.b(i.this).k().g().a();
                return false;
            }
        });
        this.j.failListener(new com.taobao.android.i<com.taobao.android.g>() { // from class: com.taobao.android.detail.mainpic.holder.i.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.i
            public boolean a(com.taobao.android.g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f5565567", new Object[]{this, gVar})).booleanValue();
                }
                i.b(i.this).k().g().a();
                return false;
            }
        });
        if (!com.taobao.android.detail.mainpic.a11y.a.a(this.l.e())) {
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.holder.i.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        i.d(i.this).a(i.c(i.this), i.a(i.this));
                    }
                }
            });
        }
        this.c = iDMComponent;
        int a3 = euu.a(euq.a(iDMComponent), this.l);
        this.j.setLayoutParams(new LinearLayout.LayoutParams(-1, a3));
        JSONObject fields = this.c.getFields();
        if (fields != null && StringUtils.equals(fields.getString("imageType"), "apng")) {
            this.j.setSkipAutoSize(true);
        }
        if (com.taobao.android.weex_framework.util.a.ATOM_EXT_fill.equals(iDMComponent.getFields().getString("contentMode"))) {
            this.j.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.j.setImageUrl(string);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a3);
        layoutParams.addRule(13);
        a(this.m, this.j, layoutParams);
        return true;
    }

    private void a(ViewGroup viewGroup, View view, RelativeLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c048ab27", new Object[]{this, viewGroup, view, layoutParams});
            return;
        }
        try {
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            if (viewGroup2 != null) {
                Animation animation = viewGroup2.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                viewGroup2.setLayoutTransition(null);
                viewGroup2.removeView(view);
            }
            viewGroup.addView(view, layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void I_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e202bd", new Object[]{this});
        } else if (this.c == null) {
        } else {
            c(this.c);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (this.c == null) {
            return;
        }
        c(this.c);
    }
}
