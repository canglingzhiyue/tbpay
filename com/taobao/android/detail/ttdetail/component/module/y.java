package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes4.dex */
public class y extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2108761728);
    }

    public y(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        if (view != null && view.getId() == R.id.ll_industry_divider) {
            return view;
        }
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.mContext);
        if (a2 != null) {
            return a2.a(this.mContext, R.layout.tt_detail_industry_divider, null, true);
        }
        return LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_industry_divider, (ViewGroup) null);
    }
}
