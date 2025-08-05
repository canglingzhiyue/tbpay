package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.dzc;
import tb.epl;
import tb.epm;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class h extends b<com.taobao.android.detail.core.model.viewmodel.desc.d> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private DetailImageView l;
    private TextView m;
    private TextView n;
    private int o;
    private String p;
    private String q;
    private String r;
    private final int s;

    static {
        kge.a(-154282513);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.ItemInfo2ViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.d) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, dVar})).booleanValue() : c2(dVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, dVar}) : a2(dVar);
    }

    public h(Activity activity) {
        super(activity);
        this.s = (int) Math.ceil((epo.b - (epo.f27511a * 3.0f)) / 2.0f);
        this.k = (RelativeLayout) View.inflate(activity, R.layout.x_detail_desc_iteminfo2, null);
        this.l = (DetailImageView) this.k.findViewById(R.id.itemPic);
        this.n = (TextView) this.k.findViewById(R.id.tvPrice);
        this.m = (TextView) this.k.findViewById(R.id.tvItemTitle);
    }

    private void d(com.taobao.android.detail.core.model.viewmodel.desc.d dVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06cbd1a", new Object[]{this, dVar});
            return;
        }
        int i2 = epo.b;
        if (!TextUtils.isEmpty(dVar.h)) {
            try {
                float parseFloat = 1.0f / Float.parseFloat(dVar.h);
                i = (i2 - ((int) ((parseFloat - 1.0f) * dzc.ITEM_PADDING_RIGHT))) / Math.round(parseFloat);
            } catch (Exception unused) {
            }
        }
        if (i <= 0) {
            i = this.s;
        }
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = this.l.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(i, i);
        }
        this.o = i;
        layoutParams2.width = i;
        layoutParams2.height = i;
        if (!com.taobao.android.detail.core.detail.kit.utils.c.b()) {
            this.l.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.m.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(i, -2);
        }
        layoutParams3.width = i;
        this.m.setLayoutParams(layoutParams3);
        this.k.setLayoutParams(layoutParams);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e8600dff", new Object[]{this, dVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9465265c", new Object[]{this, dVar});
            return;
        }
        String str = dVar.f9746a;
        String str2 = dVar.b;
        String str3 = dVar.c;
        this.q = dVar.e;
        this.p = dVar.f;
        this.r = dVar.g;
        if (!TextUtils.isEmpty(this.q) || !TextUtils.isEmpty(this.p)) {
            this.k.setClickable(true);
        } else {
            this.k.setClickable(false);
        }
        epl a2 = new epl.a().b(R.drawable.detail_img_load_fail).a(R.drawable.detail_img_load_fail).c(this.l.getScaleType()).a();
        DetailImageView detailImageView = this.l;
        int i = this.s;
        a(detailImageView, str, new epm(i, i), null, a2);
        if (!TextUtils.isEmpty(str2)) {
            String str4 = "¥ " + str2;
            int indexOf = str4.indexOf(".");
            if (indexOf > 0) {
                String substring = str4.substring(indexOf + 1);
                try {
                    if (!TextUtils.isEmpty(substring) && Integer.parseInt(substring) <= 0) {
                        str4 = str4.substring(0, indexOf);
                        indexOf = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            SpannableString spannableString = new SpannableString(str4);
            spannableString.setSpan(new AbsoluteSizeSpan(epo.i), 0, 2, 33);
            if (indexOf > 0) {
                spannableString.setSpan(new AbsoluteSizeSpan(epo.l), 2, indexOf, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(epo.i), indexOf, str4.length(), 33);
            } else {
                spannableString.setSpan(new AbsoluteSizeSpan(epo.l), 2, str4.length(), 33);
            }
            this.n.setText(spannableString);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.m.setText(str3);
        }
        this.k.setDescendantFocusability(393216);
        d(dVar);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a68f1bf", new Object[]{this, dVar})).booleanValue() : dVar.f9746a == null || dVar.b == null || dVar.c == null;
    }
}
