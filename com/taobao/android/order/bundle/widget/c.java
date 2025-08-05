package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.TBOrderDetailActivity;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements com.taobao.android.order.core.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TBOrderDetailActivity f14595a;

    static {
        kge.a(-1728406084);
        kge.a(1245873222);
    }

    @Override // com.taobao.android.order.core.d
    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.android.order.core.d
    public ViewGroup a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, view});
        }
        return null;
    }

    @Override // com.taobao.android.order.core.d
    public void a(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1260263", new Object[]{this, view, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.order.core.d
    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.order.core.d
    public RecyclerView b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("45b7b65b", new Object[]{this, view});
        }
        return null;
    }

    @Override // com.taobao.android.order.core.d
    public void b(View view, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6677124", new Object[]{this, view, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.order.core.d
    public LinearLayout c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("45a1267f", new Object[]{this, view});
        }
        return null;
    }

    @Override // com.taobao.android.order.core.d
    public LinearLayout d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("7379c0de", new Object[]{this, view});
        }
        return null;
    }

    @Override // com.taobao.android.order.core.d
    public ViewGroup e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cc91986f", new Object[]{this, view});
        }
        return null;
    }

    public c(TBOrderDetailActivity tBOrderDetailActivity) {
        this.f14595a = tBOrderDetailActivity;
    }

    @Override // com.taobao.android.order.core.d
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        TBOrderDetailActivity tBOrderDetailActivity = this.f14595a;
        if (tBOrderDetailActivity == null) {
            return;
        }
        tBOrderDetailActivity.a(jSONObject);
    }
}
