package com.taobao.android.order.bundle.widget.recycle;

import android.support.v7.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.o;
import com.taobao.android.dinamicx.DXRootView;
import tb.hyo;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends RecyclerView.OnScrollListener implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f14609a;
    private com.taobao.android.order.core.g e;
    private RecyclerView f;
    private int g;
    private boolean d = true;
    private String[] h = {"orderdetail_marquee_scroller", "orderdetail_scroller"};
    private JSONObject b = new JSONObject();
    private JSONObject c = new JSONObject();

    static {
        kge.a(-1071412657);
        kge.a(-179908657);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 806944192) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode != 2142696127) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public g(com.taobao.android.order.core.g gVar, RecyclerView recyclerView) {
        this.b.put("type", (Object) "BNDX");
        this.b.put("params", (Object) this.c);
        this.e = gVar;
        this.f = recyclerView;
        this.g = hyo.a(recyclerView.getContext(), 1.0f);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.d) {
            this.d = false;
            return;
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset > 1000) {
            return;
        }
        a(o.SCROLLING, computeVerticalScrollOffset);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            a("scroll_beigin", this.f.computeVerticalScrollOffset());
        } else if (i != 0) {
        } else {
            a("scroll_end", this.f.computeVerticalScrollOffset());
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.c.put("offsetY", (Object) Integer.valueOf(i + this.f14609a + this.g));
        this.c.put("action", (Object) str);
        if (this.e == null) {
            return;
        }
        for (String str2 : this.h) {
            this.c.put("sourceId", (Object) str2);
            this.e.a((DXRootView) null, this.b);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f14609a = i;
        a(o.SCROLLING, this.f.computeVerticalScrollOffset());
    }

    @Override // com.taobao.android.order.bundle.widget.recycle.b
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            com.taobao.android.order.core.g gVar = this.e;
            if (gVar == null) {
                return;
            }
            gVar.a((DXRootView) null, jSONObject);
        } else {
            a(o.SCROLLING, this.f.computeVerticalScrollOffset());
        }
    }
}
