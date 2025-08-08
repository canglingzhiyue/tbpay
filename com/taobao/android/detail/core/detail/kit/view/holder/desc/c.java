package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.epg;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends b<epg> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout k;
    private View l;
    private View m;
    private TextView n;

    static {
        kge.a(806818903);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(epg epgVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(epg epgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5cb86c1", new Object[]{this, epgVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.DividerViewHolder";
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(epg epgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, epgVar})).booleanValue() : b2(epgVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(epg epgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, epgVar}) : a2(epgVar);
    }

    public c(Activity activity) {
        super(activity);
        this.k = (LinearLayout) View.inflate(activity, R.layout.x_detail_desc_divider, null);
        this.k.setBackgroundColor(this.i.getColor(R.color.detail_e));
        this.l = this.k.findViewById(R.id.detail_main_divider_line_top);
        this.m = this.k.findViewById(R.id.detail_main_divider_blank);
        this.n = (TextView) this.k.findViewById(R.id.detail_main_divider_text);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(epg epgVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b296017e", new Object[]{this, epgVar});
        }
        this.k.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(epgVar.f27505a));
        int i2 = epgVar.c;
        if (i2 == 100) {
            this.l.setVisibility(epgVar.b == 0 ? 8 : 0);
            View view = this.m;
            if (epgVar.b == 0) {
                i = 8;
            }
            view.setVisibility(i);
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) (epgVar.b * epo.f27511a);
            }
            this.m.setLayoutParams(layoutParams);
            this.n.setVisibility(8);
        } else if (i2 == 101) {
            this.n.setVisibility(0);
            this.m.setVisibility(8);
            if (!StringUtils.isEmpty(epgVar.d)) {
                this.n.setText(epgVar.d);
            }
        }
        return this.k;
    }
}
