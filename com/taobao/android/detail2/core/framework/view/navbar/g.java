package com.taobao.android.detail2.core.framework.view.navbar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class g extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.detail2.core.framework.b f11641a;
    public fmd b;
    public l c;

    static {
        kge.a(-815797764);
    }

    public abstract void a(l lVar);

    public g(View view, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        super(view);
        this.b = fmdVar;
        this.f11641a = bVar;
    }

    public void c(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a12100", new Object[]{this, lVar});
        } else if (lVar == null) {
        } else {
            this.c = lVar;
            a(lVar);
        }
    }

    public static View b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("739ef400", new Object[]{context, viewGroup}) : LayoutInflater.from(context).inflate(R.layout.detail_nav_item_layout_new, viewGroup, false);
    }

    public void d(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf909f", new Object[]{this, lVar});
        } else if (lVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MspWebActivity.BTN_TYPE, (Object) lVar.a());
            jSONObject.put("bizType", (Object) lVar.h());
            com.taobao.android.detail2.core.framework.data.model.d g = lVar.g();
            if (g != null) {
                jSONObject.put("nid", (Object) g.k);
            }
            this.b.a("onUserNavBarClick", jSONObject);
        }
    }
}
