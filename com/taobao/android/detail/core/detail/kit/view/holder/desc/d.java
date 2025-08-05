package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.enu;
import tb.epf;
import tb.eph;
import tb.epj;
import tb.epl;
import tb.epm;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends b<eph> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private TextView l;
    private View m;
    private TIconFontTextView n;
    private TextView o;
    private DetailImageView p;
    private RelativeLayout q;
    private RelativeLayout.LayoutParams r;

    static {
        kge.a(-564878679);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(eph ephVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c44f01a1", new Object[]{this, ephVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.DivisionTitleViewHolder";
    }

    public static /* synthetic */ DetailImageView a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("2e8a3111", new Object[]{dVar}) : dVar.p;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((eph) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(eph ephVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, ephVar})).booleanValue() : c2(ephVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(eph ephVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, ephVar}) : a2(ephVar);
    }

    public d(Activity activity) {
        super(activity);
        this.r = new RelativeLayout.LayoutParams(-1, -2);
        this.k = new RelativeLayout(this.g);
        this.k.setLayoutParams(this.r);
    }

    private void d(eph ephVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d2081e", new Object[]{this, ephVar});
            return;
        }
        String str = ephVar.f27506a;
        if (!TextUtils.isEmpty(str)) {
            this.l.setTextColor(com.taobao.android.detail.core.utils.c.a(str));
        }
        if (!TextUtils.isEmpty(ephVar.d)) {
            this.k.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(ephVar.d));
        }
        String str2 = ephVar.h;
        if (str2 != null) {
            try {
                i = Integer.valueOf(str2).intValue() - 2;
            } catch (Exception unused) {
                i = 8;
            }
            ((AbsListView.LayoutParams) this.k.getLayoutParams()).height = -2;
            this.k.setPadding(0, 0, 0, epo.b(i));
        }
        String str3 = ephVar.b;
        if (!TextUtils.isEmpty(str3)) {
            this.m.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(str3));
        }
        if (!TextUtils.isEmpty(ephVar.f)) {
            this.n.setVisibility(0);
            this.n.setText("큚");
            this.o.setText(ephVar.f);
            ((eph) this.c).events.add(new enu(ephVar.g));
            f((epf) this.c);
        } else {
            this.n.setVisibility(8);
            this.o.setVisibility(8);
        }
        this.l.setText(ephVar.c);
        String str4 = ephVar.e;
        if (TextUtils.isEmpty(str4)) {
            this.p.setVisibility(8);
            return;
        }
        this.p.setVisibility(0);
        a(this.p, str4, new epm(this.p.getLayoutParams().width, this.p.getLayoutParams().height), new com.taobao.android.detail.datasdk.protocol.image.b() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onSuccess(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a8e27a", new Object[]{this, aVar});
                }
            }

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onFailure(com.taobao.android.detail.datasdk.protocol.image.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("15b99301", new Object[]{this, aVar});
                } else {
                    d.a(d.this).setVisibility(8);
                }
            }
        }, null);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(eph ephVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("391bbc1d", new Object[]{this, ephVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(eph ephVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cbfb1c", new Object[]{this, ephVar});
        } else if (ephVar.i) {
            b(this.g);
            e(ephVar);
        } else {
            a(this.g);
            String str = ephVar.f27506a;
            if (!TextUtils.isEmpty(str)) {
                this.l.setTextColor(com.taobao.android.detail.core.utils.c.a(str));
            }
            String str2 = ephVar.b;
            if (!TextUtils.isEmpty(str2)) {
                this.m.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(str2));
            }
            String str3 = ephVar.c;
            if (!TextUtils.isEmpty(str3)) {
                this.l.setText(str3);
            }
            d(ephVar);
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.k.removeAllViews();
        this.q = (RelativeLayout) View.inflate(context, R.layout.x_detail_desc_division_title, null);
        this.l = (TextView) this.q.findViewById(R.id.container_title);
        this.p = (DetailImageView) this.q.findViewById(R.id.iv_logo);
        this.m = this.q.findViewById(R.id.container_line);
        this.o = (TextView) this.q.findViewById(R.id.container_sub_title);
        this.n = (TIconFontTextView) this.q.findViewById(R.id.more_sub_title);
        this.k.addView(this.q, this.r);
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.k.removeAllViews();
        this.q = (RelativeLayout) View.inflate(this.g, R.layout.x_detail_divider_with_text_and_icon, null);
        this.k.addView(this.q, this.r);
    }

    private void e(eph ephVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1550e9f", new Object[]{this, ephVar});
            return;
        }
        DetailImageView detailImageView = (DetailImageView) this.q.findViewById(R.id.divider_logo);
        if (!TextUtils.isEmpty(ephVar.e)) {
            epj.b().a(ephVar.e, detailImageView, new epl.a().a(true).a());
            detailImageView.setVisibility(0);
        } else {
            detailImageView.setVisibility(8);
        }
        String str = ephVar.c == null ? "" : ephVar.c;
        TextView textView = (TextView) this.q.findViewById(R.id.divider_text);
        textView.setText(str);
        if (!TextUtils.isEmpty(ephVar.f27506a)) {
            textView.setTextColor(com.taobao.android.detail.core.utils.c.a(ephVar.f27506a));
        }
        if (TextUtils.isEmpty(ephVar.d)) {
            return;
        }
        this.q.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(ephVar.d));
    }
}
