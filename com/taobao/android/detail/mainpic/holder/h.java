package com.taobao.android.detail.mainpic.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.taobao.R;
import com.taobao.weex.utils.WXViewUtils;
import java.util.ArrayList;
import java.util.List;
import tb.bny;
import tb.etx;
import tb.euq;
import tb.eus;
import tb.euu;
import tb.jpv;

/* loaded from: classes4.dex */
public class h extends com.alibaba.android.ultron.vfw.viewholder.b implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String f = "mainpicFrame";
    public LinearLayout g;
    public RelativeLayout h;
    public RelativeLayout i;
    public List<com.alibaba.android.ultron.vfw.viewholder.h> j;
    public List<com.alibaba.android.ultron.vfw.viewholder.h> k;
    public com.alibaba.android.ultron.vfw.viewholder.j l;
    public bny m;
    public etx n;
    public com.taobao.android.detail.mainpic.g o;

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode != 93762283) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.d();
            return null;
        }
    }

    public h(bny bnyVar, etx etxVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = bnyVar;
        this.n = etxVar;
        this.o = gVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_pic_single_frame_layout, viewGroup, false);
        this.i = (RelativeLayout) inflate.findViewById(R.id.frame_root_layout);
        this.g = (LinearLayout) inflate.findViewById(R.id.frame_content_layout);
        this.h = (RelativeLayout) inflate.findViewById(R.id.frame_float_layout);
        this.l = this.m.v();
        return inflate;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (iDMComponent != null) {
            if (this.c != null) {
                List<IDMComponent> a2 = jpv.a(iDMComponent);
                List<IDMComponent> a3 = jpv.a(this.c);
                if (a2 == null || a3 == null) {
                    return;
                }
                JSONObject fields = iDMComponent.getFields();
                if (fields != null ? "true".equals(fields.getString("isForceRenderOnce")) : false) {
                    fields.remove("isForceRenderOnce");
                } else {
                    for (int i = 0; i < a2.size() && (z = jpv.a(a2.get(i), a3.get(i))); i++) {
                    }
                    if (z) {
                        return;
                    }
                }
            }
            this.g.removeAllViews();
            this.h.removeAllViews();
            this.j.clear();
            this.c = iDMComponent;
            List<IDMComponent> children = iDMComponent.getChildren();
            if (children == null || children.size() <= 0) {
                return;
            }
            Object obj = iDMComponent.getExtMap().get("ultronDMComponentIndex");
            int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : -1;
            for (final IDMComponent iDMComponent2 : children) {
                if (iDMComponent2 != null) {
                    iDMComponent2.getExtMap().put("ultronDMComponentIndex", Integer.valueOf(intValue));
                    String position = iDMComponent2.getPosition();
                    final com.alibaba.android.ultron.vfw.viewholder.h a4 = this.l.a(this.g, this.l.a(iDMComponent2));
                    View view = a4.itemView;
                    if (view != null) {
                        if (PopStrategy.IDENTIFIER_FLOAT.equals(position)) {
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            com.taobao.android.detail.mainpic.g gVar = this.o;
                            if (gVar != null && gVar.u()) {
                                layoutParams.addRule(13);
                            }
                            this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail.mainpic.holder.h.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public void onGlobalLayout() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                                        return;
                                    }
                                    h.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                    if (iDMComponent2.getFields() != null) {
                                        iDMComponent2.getFields().put("MAINPIC_WIDTH", (Object) "375");
                                        iDMComponent2.getFields().put("MAINPIC_HEIGHT", (Object) String.valueOf((int) ((h.this.h.getHeight() / Float.valueOf(h.this.h.getWidth()).floatValue()) * 375.0f)));
                                    }
                                    h.this.l.a(a4, iDMComponent2);
                                }
                            });
                            this.h.addView(view, layoutParams);
                            this.k.add(a4);
                        } else {
                            float a5 = euu.a(euq.a(iDMComponent2), this.o);
                            int screenWidth = (int) ((a5 / WXViewUtils.getScreenWidth(this.o.e())) * 375.0f);
                            if (this.o.k().j()) {
                                screenWidth = (int) ((a5 / euu.b(this.o.e())) * 375.0f);
                            }
                            JSONObject fields2 = iDMComponent2.getFields();
                            if (fields2 != null) {
                                fields2.put("MAINPIC_WIDTH", (Object) "375");
                                fields2.put("MAINPIC_HEIGHT", (Object) String.valueOf(screenWidth));
                            }
                            this.g.addView(view, new ViewGroup.LayoutParams(-1, -2));
                            if (this.o.u()) {
                                ViewGroup.LayoutParams layoutParams2 = this.g.getLayoutParams();
                                layoutParams2.width = -1;
                                layoutParams2.height = -1;
                                this.g.setLayoutParams(layoutParams2);
                            }
                            this.j.add(a4);
                            this.l.a(a4, iDMComponent2);
                        }
                    }
                }
            }
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
        List<com.alibaba.android.ultron.vfw.viewholder.h> list = this.j;
        if (list == null) {
            return;
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : list) {
            com.alibaba.android.ultron.vfw.viewholder.b b = hVar.b();
            if (b != null) {
                b.b();
            }
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar2 : this.k) {
            com.alibaba.android.ultron.vfw.viewholder.b b2 = hVar2.b();
            if (b2 != null) {
                b2.b();
            }
        }
        List<IDMComponent> children = this.c.getChildren();
        if (children == null || children.size() <= 0) {
            return;
        }
        for (IDMComponent iDMComponent : children) {
            eus.a(iDMComponent, this.o.n());
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : this.j) {
            com.alibaba.android.ultron.vfw.viewholder.b b = hVar.b();
            if (b != null) {
                b.c();
            }
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar2 : this.k) {
            com.alibaba.android.ultron.vfw.viewholder.b b2 = hVar2.b();
            if (b2 != null) {
                b2.c();
            }
        }
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void H_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802d2a1e", new Object[]{this});
            return;
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : this.j) {
            com.alibaba.android.ultron.vfw.viewholder.b b = hVar.b();
            if (b instanceof b) {
                ((b) b).H_();
            }
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar2 : this.k) {
            com.alibaba.android.ultron.vfw.viewholder.b b2 = hVar2.b();
            if (b2 instanceof b) {
                ((b) b2).H_();
            }
        }
    }

    @Override // com.taobao.android.detail.mainpic.holder.b
    public void I_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e202bd", new Object[]{this});
            return;
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : this.j) {
            com.alibaba.android.ultron.vfw.viewholder.b b = hVar.b();
            if (b instanceof b) {
                ((b) b).I_();
            }
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar2 : this.k) {
            com.alibaba.android.ultron.vfw.viewholder.b b2 = hVar2.b();
            if (b2 instanceof b) {
                ((b) b2).I_();
            }
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : this.j) {
            hVar.b().d();
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar2 : this.k) {
            hVar2.b().d();
        }
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e b(final etx etxVar, final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("290efa1b", new Object[]{etxVar, gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new h(bnyVar, etx.this, gVar);
            }
        };
    }

    public List<com.alibaba.android.ultron.vfw.viewholder.h> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.j;
    }
}
