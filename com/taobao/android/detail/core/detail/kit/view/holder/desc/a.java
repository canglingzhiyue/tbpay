package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.apicommon.ApiRequestListener;
import com.taobao.android.detail.core.request.desc.CouponBussiness;
import com.taobao.detail.domain.base.Unit;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ead;
import tb.epo;
import tb.eps;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends b<com.taobao.android.detail.core.model.viewmodel.desc.a> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private TextView l;
    private TextView m;
    private TextView n;
    private String o;
    private String p;
    private final String q;
    private final String r;
    private final String s;
    private Unit t;
    private CouponBussiness u;

    static {
        kge.a(538078250);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.CouponViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((com.taobao.android.detail.core.model.viewmodel.desc.a) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, aVar})).booleanValue() : c2(aVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, aVar}) : a2(aVar);
    }

    public a(Activity activity) {
        super(activity);
        this.q = "已领取";
        this.r = "领取成功，尽情购物吧！";
        this.s = "领取失败！";
        this.k = (RelativeLayout) View.inflate(activity, R.layout.x_detail_desc_coupon, null);
        this.n = (TextView) this.k.findViewById(R.id.tvTitle);
        this.l = (TextView) this.k.findViewById(R.id.tvPeriod);
        this.m = (TextView) this.k.findViewById(R.id.tvPrice);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.t == null) {
            epo.a("领取失败！");
        } else {
            if (this.u == null) {
                this.u = new CouponBussiness(this.g);
            }
            this.u.a(this.t, (Map<String, String>) null, new ApiRequestListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.CouponViewHolder$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.request.apicommon.ApiRequestListener
                public void onError(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                    } else if (mtopResponse != null && mtopResponse.isSessionInvalid()) {
                        epo.g().a(true);
                    } else if (mtopResponse != null && !TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                        epo.a(mtopResponse.getRetMsg());
                    } else {
                        epo.a("领取失败！");
                    }
                }

                @Override // com.taobao.android.detail.core.request.apicommon.ApiRequestListener
                public void onSuccess(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    } else {
                        epo.a("领取成功，尽情购物吧！");
                    }
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        eps.a(this.g, "Coupons", new Pair[0]);
        if (!epo.g().b()) {
            epo.g().a(true);
            return;
        }
        c();
        if (((com.taobao.android.detail.core.model.viewmodel.desc.a) this.c).events == null || ((com.taobao.android.detail.core.model.viewmodel.desc.a) this.c).events.isEmpty()) {
            return;
        }
        ead.a(this.g, ((com.taobao.android.detail.core.model.viewmodel.desc.a) this.c).events);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("54cede22", new Object[]{this, aVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(com.taobao.android.detail.core.model.viewmodel.desc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9463c93f", new Object[]{this, aVar});
            return;
        }
        String str = aVar.f9743a;
        String str2 = aVar.b;
        this.p = aVar.c;
        this.o = aVar.d;
        if (!TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString("¥" + str);
            spannableString.setSpan(new AbsoluteSizeSpan(epo.l), 0, 1, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(epo.b(34)), 1, str.length() + 1, 33);
            spannableString.setSpan(new StyleSpan(1), 1, str.length() + 1, 33);
            this.m.setText(spannableString);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.l.setText(str2);
        }
        if (!TextUtils.isEmpty(this.o) || !TextUtils.isEmpty(this.p)) {
            this.n.setTextSize(1, 10.0f);
            this.n.setText(this.p);
        }
        this.t = aVar.e;
        this.k.setOnClickListener(this);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.core.model.viewmodel.desc.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a6794a2", new Object[]{this, aVar})).booleanValue() : aVar.f9743a == null && this.p == null && aVar.b == null;
    }
}
