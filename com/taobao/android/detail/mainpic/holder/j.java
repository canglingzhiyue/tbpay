package com.taobao.android.detail.mainpic.holder;

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUrlImageView;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bny;
import tb.etx;
import tb.euq;
import tb.euu;

/* loaded from: classes4.dex */
public class j extends com.alibaba.android.ultron.vfw.viewholder.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String e = "mainpicImg";
    public static String f = "apng";
    public AliUrlImageView g;
    public etx h;
    public com.taobao.android.detail.mainpic.g i;

    public static /* synthetic */ IDMComponent a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("c07df36b", new Object[]{jVar}) : jVar.c;
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e b(final etx etxVar, final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("290efa1b", new Object[]{etxVar, gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new j(bnyVar, etx.this, gVar);
            }
        };
    }

    public j(bny bnyVar, etx etxVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.h = etxVar;
        this.i = gVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.g = new AliUrlImageView(viewGroup.getContext());
        AliUrlImageView aliUrlImageView = this.g;
        aliUrlImageView.setStrategyConfig(aliUrlImageView.newImageStrategyConfigBuilder("detail", 15).a());
        this.g.succListener(new com.taobao.android.i<com.taobao.android.l>() { // from class: com.taobao.android.detail.mainpic.holder.j.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.i
            public boolean a(com.taobao.android.l lVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f5589b42", new Object[]{this, lVar})).booleanValue();
                }
                j jVar = j.this;
                jVar.a(jVar.g, lVar.a());
                j.this.i.k().g().a();
                return false;
            }
        });
        this.g.failListener(new com.taobao.android.i<com.taobao.android.g>() { // from class: com.taobao.android.detail.mainpic.holder.j.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.i
            public boolean a(com.taobao.android.g gVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f5565567", new Object[]{this, gVar})).booleanValue();
                }
                j.this.i.k().g().a();
                return false;
            }
        });
        if (!com.taobao.android.detail.mainpic.a11y.a.a(viewGroup.getContext())) {
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.mainpic.holder.j.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        j.this.h.a(j.a(j.this), j.this.g);
                    }
                }
            });
        }
        return this.g;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        this.i.k().g();
        this.c = iDMComponent;
        this.g.setLayoutParams(new LinearLayout.LayoutParams(-1, this.i.u() ? -1 : euu.a(euq.a(iDMComponent), this.i)));
        JSONObject fields = this.c.getFields();
        if (fields != null && TextUtils.equals(fields.getString("imageType"), "apng")) {
            this.g.setSkipAutoSize(true);
        }
        this.g.setImageUrl(iDMComponent.getFields().getString("url"));
        if (this.i.k().j()) {
            this.g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (!com.taobao.android.weex_framework.util.a.ATOM_EXT_fill.equals(iDMComponent.getFields().getString("contentMode"))) {
        } else {
            this.g.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public AliUrlImageView e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("1faf1abd", new Object[]{this}) : this.g;
    }

    public void a(ImageView imageView, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41dede97", new Object[]{this, imageView, bitmapDrawable});
        } else if (this.c == null || !"auto_crop".equals(this.c.getFields().getString("contentMode"))) {
        } else {
            if (((int) (bitmapDrawable.getIntrinsicHeight() * (((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / bitmapDrawable.getIntrinsicWidth()))) > imageView.getHeight()) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        }
    }
}
