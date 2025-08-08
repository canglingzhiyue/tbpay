package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.desc.e;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.dzc;
import tb.epj;
import tb.epl;
import tb.epm;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class i extends b<com.taobao.android.detail.core.model.viewmodel.desc.e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private DetailImageView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private LinearLayout p;
    private String q;
    private String r;
    private String s;
    private DetailImageView t;
    private final int u;
    private final int v;
    private final int w;

    static {
        kge.a(-1583941659);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.ItemInfoViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.e) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, eVar})).booleanValue() : c2(eVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, eVar}) : a2(eVar);
    }

    public i(Activity activity) {
        super(activity);
        this.u = epo.b(9);
        this.v = epo.b(12);
        this.w = (int) Math.ceil(((epo.b - (this.v << 1)) - this.u) / 2);
        this.k = (RelativeLayout) View.inflate(activity, R.layout.x_detail_desc_iteminfo, null);
        this.l = (DetailImageView) this.k.findViewById(R.id.normalPic);
        this.n = (TextView) this.k.findViewById(R.id.tvPrice);
        this.m = (TextView) this.k.findViewById(R.id.tvItemTitle);
        this.o = (TextView) this.k.findViewById(R.id.tvSaleCount);
        this.p = (LinearLayout) this.k.findViewById(R.id.tagContainer);
        this.t = (DetailImageView) this.k.findViewById(R.id.video_state);
    }

    private void d(com.taobao.android.detail.core.model.viewmodel.desc.e eVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06d3179", new Object[]{this, eVar});
            return;
        }
        int i2 = epo.b;
        DetailImageView detailImageView = this.l;
        if (!StringUtils.isEmpty(eVar.h)) {
            try {
                float parseFloat = Float.parseFloat(eVar.h);
                i = ((int) (i2 * parseFloat)) - ((int) (((1.0f / parseFloat) - 1.0f) * dzc.ITEM_PADDING_RIGHT));
            } catch (Exception unused) {
            }
        }
        if (i <= 0) {
            i = this.w;
        }
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = detailImageView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(i, i);
        }
        layoutParams2.width = i;
        layoutParams2.height = i;
        detailImageView.setLayoutParams(layoutParams2);
        int ceil = (int) Math.ceil((i * 40) / 369);
        ViewGroup.LayoutParams layoutParams3 = this.t.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, ceil);
        }
        layoutParams3.width = -2;
        layoutParams3.height = ceil;
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams.topMargin = i - ((int) Math.ceil((ceil * 3) / 4));
            marginLayoutParams.leftMargin = epo.b(12);
        }
        this.t.setLayoutParams(layoutParams3);
        a(this.t, eVar);
        ViewGroup.LayoutParams layoutParams4 = this.m.getLayoutParams();
        if (layoutParams4 == null) {
            layoutParams4 = new ViewGroup.LayoutParams(i, -2);
        }
        layoutParams4.width = i;
        this.m.setLayoutParams(layoutParams4);
        this.k.setLayoutParams(layoutParams);
    }

    private void a(DetailImageView detailImageView, com.taobao.android.detail.core.model.viewmodel.desc.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd016b7b", new Object[]{this, detailImageView, eVar});
            return;
        }
        String str = eVar.j;
        if (StringUtils.isEmpty(str)) {
            detailImageView.setVisibility(8);
            return;
        }
        epj.b().a(str, detailImageView, new epl.a().c(true).a());
        detailImageView.setVisibility(0);
    }

    public void a(ArrayList<e.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        this.p.removeAllViews();
        if (arrayList != null && arrayList.size() > 0) {
            View a2 = a(arrayList.get(0));
            if (a2 != null) {
                this.p.addView(a2);
            }
        } else if (!StringUtils.isEmpty(this.q)) {
            String[] split = this.q.split(",");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            for (String str : split) {
                e.a a3 = a(str);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
            View a4 = a(arrayList.get(0));
            if (a4 != null) {
                this.p.addView(a4);
            }
        }
        if (this.p.getChildCount() > 0) {
            this.m.setMaxLines(1);
            this.p.setVisibility(0);
            return;
        }
        this.m.setLines(2);
        this.m.setMaxLines(2);
        this.p.setVisibility(8);
    }

    private e.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e.a) ipChange.ipc$dispatch("b4bc1109", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return new e.a(str, 0, 0);
        }
        return null;
    }

    public View a(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("10ad7701", new Object[]{this, aVar});
        }
        if (aVar == null || StringUtils.isEmpty(aVar.f9748a)) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, epo.b(12));
        layoutParams.rightMargin = (int) (epo.f27511a * 3.0f);
        DetailImageView detailImageView = new DetailImageView(this.g);
        detailImageView.setLayoutParams(layoutParams);
        epj.b().a(aVar.f9748a, detailImageView, new epl.a().c(true).a());
        return detailImageView;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6ee5c89e", new Object[]{this, eVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94659abb", new Object[]{this, eVar});
            return;
        }
        String str = eVar.f9747a;
        String str2 = eVar.b;
        String str3 = eVar.c;
        String str4 = eVar.d;
        this.s = eVar.e;
        this.r = eVar.f;
        this.q = eVar.l;
        if (!StringUtils.isEmpty(this.s) || !StringUtils.isEmpty(this.r)) {
            this.k.setClickable(true);
        } else {
            this.k.setClickable(false);
        }
        this.l.setVisibility(0);
        DetailImageView detailImageView = this.l;
        epl a2 = new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(this.l.getScaleType()).a(this.l.getScaleType()).a();
        DetailImageView detailImageView2 = this.l;
        int i = this.w;
        a(detailImageView2, str, new epm(i, i), null, a2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, epo.b(10), 0, 0);
        layoutParams.addRule(3, detailImageView.getId());
        this.m.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(7, detailImageView.getId());
        layoutParams2.addRule(5, detailImageView.getId());
        layoutParams2.addRule(3, this.m.getId());
        this.p.setLayoutParams(layoutParams2);
        if (!StringUtils.isEmpty(str2)) {
            String str5 = "¥ " + str2;
            int indexOf = str5.indexOf(".");
            if (indexOf > 0) {
                String substring = str5.substring(indexOf + 1);
                try {
                    if (!StringUtils.isEmpty(substring) && Integer.parseInt(substring) <= 0) {
                        str5 = str5.substring(0, indexOf);
                        indexOf = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            SpannableString spannableString = new SpannableString(str5);
            spannableString.setSpan(new AbsoluteSizeSpan(epo.i), 0, 2, 33);
            if (indexOf > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(epo.l), 2, indexOf, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(epo.i), indexOf, str5.length(), 33);
            } else {
                spannableString.setSpan(new AbsoluteSizeSpan(epo.l), 2, str5.length(), 33);
            }
            this.n.setText(spannableString);
        }
        if (!StringUtils.isEmpty(str3)) {
            this.m.setText(str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            this.o.setText(str4);
        }
        a(eVar.k);
        d(eVar);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a69661e", new Object[]{this, eVar})).booleanValue() : eVar.f9747a == null || eVar.b == null || eVar.c == null;
    }
}
