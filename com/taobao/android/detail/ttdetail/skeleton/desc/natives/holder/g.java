package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.android.detail.ttdetail.widget.desc.image.d;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class g extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout g;
    private TextView h;
    private View i;
    private TIconFontTextView j;
    private TextView k;
    private DetailImageView l;
    private RelativeLayout m;
    private RelativeLayout.LayoutParams n;

    static {
        kge.a(-11934341);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("354aa363", new Object[]{this, gVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ DetailImageView a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("846ca83d", new Object[]{gVar}) : gVar.l;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, gVar})).booleanValue() : c2(gVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, gVar}) : a2(gVar);
    }

    public g(Context context) {
        super(context);
        this.n = new RelativeLayout.LayoutParams(-1, -2);
        this.g = new RelativeLayout(this.f10821a);
        this.g.setLayoutParams(this.n);
    }

    private void d(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g gVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f8ce20", new Object[]{this, gVar});
            return;
        }
        String str = gVar.f10872a;
        if (!StringUtils.isEmpty(str)) {
            this.h.setTextColor(com.taobao.android.detail.ttdetail.utils.w.a(str));
        }
        if (!StringUtils.isEmpty(gVar.d)) {
            this.g.setBackgroundColor(com.taobao.android.detail.ttdetail.utils.w.a(gVar.d));
        }
        String str2 = gVar.h;
        if (str2 != null) {
            try {
                i = Integer.valueOf(str2).intValue() - 2;
            } catch (Exception unused) {
                i = 8;
            }
            ((AbsListView.LayoutParams) this.g.getLayoutParams()).height = -2;
            this.g.setPadding(0, 0, 0, com.taobao.android.detail.ttdetail.utils.f.a(i));
        }
        String str3 = gVar.b;
        if (!StringUtils.isEmpty(str3)) {
            this.i.setBackgroundColor(com.taobao.android.detail.ttdetail.utils.w.a(str3));
        }
        if (!StringUtils.isEmpty(gVar.f)) {
            this.j.setVisibility(0);
            this.j.setText("큚");
            this.k.setText(gVar.f);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) gVar.g);
            ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g) this.f).u.add(new com.taobao.android.detail.ttdetail.bizmessage.h("open_url", jSONObject, new RuntimeAbilityParam("appendURLParamsOnly", true)));
            f(this.f);
        } else {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        }
        this.h.setText(gVar.c);
        String str4 = gVar.e;
        if (StringUtils.isEmpty(str4)) {
            this.l.setVisibility(8);
            return;
        }
        this.l.setVisibility(0);
        a(this.l, str4, new com.taobao.android.detail.ttdetail.widget.desc.image.g(this.l.getLayoutParams().width, this.l.getLayoutParams().height), new com.taobao.android.detail.ttdetail.widget.desc.image.c() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.desc.image.c
            public void a(com.taobao.android.detail.ttdetail.widget.desc.image.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1bbc9aef", new Object[]{this, bVar});
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.desc.image.c
            public void b(com.taobao.android.detail.ttdetail.widget.desc.image.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d6323b70", new Object[]{this, bVar});
                } else {
                    g.a(g.this).setVisibility(8);
                }
            }
        }, null);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e26a08df", new Object[]{this, gVar}) : this.g;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c789e", new Object[]{this, gVar});
        } else if (gVar.v) {
            b(this.f10821a);
            e(gVar);
        } else {
            a(this.f10821a);
            String str = gVar.f10872a;
            if (!StringUtils.isEmpty(str)) {
                this.h.setTextColor(com.taobao.android.detail.ttdetail.utils.w.a(str));
            }
            String str2 = gVar.b;
            if (!StringUtils.isEmpty(str2)) {
                this.i.setBackgroundColor(com.taobao.android.detail.ttdetail.utils.w.a(str2));
            }
            String str3 = gVar.c;
            if (!StringUtils.isEmpty(str3)) {
                this.h.setText(str3);
            }
            d(gVar);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.g.removeAllViews();
        this.m = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_division_title, (ViewGroup) null);
        this.h = (TextView) this.m.findViewById(R.id.container_title);
        this.l = (DetailImageView) this.m.findViewById(R.id.iv_logo);
        this.i = this.m.findViewById(R.id.container_line);
        this.k = (TextView) this.m.findViewById(R.id.container_sub_title);
        this.j = (TIconFontTextView) this.m.findViewById(R.id.more_sub_title);
        this.g.addView(this.m, this.n);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.g.removeAllViews();
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.f10821a);
        if (a2 != null) {
            this.m = (RelativeLayout) a2.a(this.f10821a, R.layout.tt_detail_divider_with_text_and_icon, null, true);
        } else {
            this.m = (RelativeLayout) LayoutInflater.from(this.f10821a).inflate(R.layout.tt_detail_divider_with_text_and_icon, (ViewGroup) null);
        }
        this.g.addView(this.m, this.n);
    }

    private void e(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca6f8e1", new Object[]{this, gVar});
            return;
        }
        DetailImageView detailImageView = (DetailImageView) this.m.findViewById(R.id.divider_logo);
        if (!StringUtils.isEmpty(gVar.e)) {
            a(detailImageView, gVar.e, null, null, new d.a().a(true).a());
            detailImageView.setVisibility(0);
        } else {
            detailImageView.setVisibility(8);
        }
        String str = gVar.c == null ? "" : gVar.c;
        TextView textView = (TextView) this.m.findViewById(R.id.divider_text);
        textView.setText(str);
        if (!StringUtils.isEmpty(gVar.f10872a)) {
            textView.setTextColor(com.taobao.android.detail.ttdetail.utils.w.a(gVar.f10872a));
        }
        if (StringUtils.isEmpty(gVar.d)) {
            return;
        }
        this.m.setBackgroundColor(com.taobao.android.detail.ttdetail.utils.w.a(gVar.d));
    }
}
