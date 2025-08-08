package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.ApiRequestListener;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.CouponBussiness;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.Unit;
import com.taobao.android.detail.ttdetail.utils.ao;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.sys;

/* loaded from: classes5.dex */
public class c extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout g;
    private TextView h;
    private TextView i;
    private TextView j;
    private String k;
    private String l;
    private final String m;
    private final String n;
    private final String o;
    private Unit p;
    private CouponBussiness q;

    static {
        kge.a(-393031272);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0591c61", new Object[]{cVar, str});
        } else {
            cVar.a(str);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, cVar})).booleanValue() : c2(cVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, cVar}) : a2(cVar);
    }

    public c(Context context) {
        super(context);
        this.m = "已领取";
        this.n = "领取成功，尽情购物吧！";
        this.o = "领取失败！";
        this.g = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_coupon, (ViewGroup) null);
        this.j = (TextView) this.g.findViewById(R.id.tvTitle);
        this.h = (TextView) this.g.findViewById(R.id.tvPeriod);
        this.i = (TextView) this.g.findViewById(R.id.tvPrice);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.p == null) {
            a("领取失败！");
        } else {
            if (this.q == null) {
                this.q = new CouponBussiness(this.f10821a);
            }
            this.q.a(this.p, (Map<String, String>) null, new ApiRequestListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.CouponViewHolder$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.ApiRequestListener
                public void onError(MtopResponse mtopResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                    } else if (mtopResponse != null && mtopResponse.isSessionInvalid()) {
                        ao.a(true);
                    } else if (mtopResponse != null && !StringUtils.isEmpty(mtopResponse.getRetMsg())) {
                        c.a(c.this, mtopResponse.getRetMsg());
                    } else {
                        c.a(c.this, "领取失败！");
                    }
                }

                @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.ApiRequestListener
                public void onSuccess(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    } else {
                        c.a(c.this, "领取成功，尽情购物吧！");
                    }
                }
            });
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Toast.makeText(this.f10821a, str, 0).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!ao.c()) {
            ao.a(true);
        } else {
            c();
            if (((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c) this.f).u == null || ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c) this.f).u.isEmpty()) {
                return;
            }
            sys.a(this.f10821a, ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c) this.f).u);
        }
    }

    /* renamed from: a */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c8531e63", new Object[]{this, cVar}) : this.g;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19aa722", new Object[]{this, cVar});
            return;
        }
        String str = cVar.f10869a;
        String str2 = cVar.b;
        this.l = cVar.c;
        this.k = cVar.d;
        if (!StringUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString("¥" + str);
            spannableString.setSpan(new AbsoluteSizeSpan((int) (this.f10821a.getResources().getDisplayMetrics().density * 18.0f)), 0, 1, 33);
            spannableString.setSpan(new AbsoluteSizeSpan((int) (this.f10821a.getResources().getDisplayMetrics().density * 34.0f)), 1, str.length() + 1, 33);
            spannableString.setSpan(new StyleSpan(1), 1, str.length() + 1, 33);
            this.i.setText(spannableString);
        }
        if (!StringUtils.isEmpty(str2)) {
            this.h.setText(str2);
        }
        if (!StringUtils.isEmpty(this.k) || !StringUtils.isEmpty(this.l)) {
            this.j.setTextSize(1, 10.0f);
            this.j.setText(this.l);
        }
        this.p = cVar.e;
        this.g.setOnClickListener(this);
    }

    /* renamed from: c */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3548d1e7", new Object[]{this, cVar})).booleanValue() : cVar.f10869a == null && this.l == null && cVar.b == null;
    }
}
