package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import tb.eyx;
import tb.eze;
import tb.kge;
import tb.onp;
import tb.pie;
import tb.pif;
import tb.qms;
import tb.qpk;

/* loaded from: classes4.dex */
public class w extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private onp b;

    static {
        kge.a(1641672090);
    }

    public static /* synthetic */ Object ipc$super(w wVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : "header";
    }

    public w(Context context, eyx eyxVar, pif pifVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, pifVar, dataEntryArr);
        this.b = new onp(context, eyxVar);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public <C extends d> C findComponent(String str) {
        qpk h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("2d63d1e0", new Object[]{this, str});
        }
        C c = (C) this.b.a(str);
        if (c == null && TextUtils.equals("bottomBar", str)) {
            c = (C) this.b.e();
        }
        pif pifVar = (pif) this.mDetailContext.a().a(pie.PARSER_ID);
        if (pifVar != null && (h = pifVar.h()) != null) {
            qms<eze> qmsVar = null;
            if (c == null && TextUtils.equals("headerPic", str)) {
                qmsVar = h.e();
            } else if (c == null && TextUtils.equals("navBar", str)) {
                qmsVar = h.d();
            }
            if (qmsVar != null) {
                return (C) qmsVar.a(this.mDetailContext.d());
            }
        }
        return c;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public <C extends d> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("2c508b56", new Object[]{this, str}) : (C) this.b.b(str);
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue() : this.b.c(str);
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            this.b.a(str, i);
        }
    }

    public void a(onp.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5a29e8", new Object[]{this, cVar});
        } else {
            this.b.a(cVar);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : this.b.c();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.b.f();
        super.onDestroy();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public TTDetailScrollerLayout.LayoutParams e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("c38f45ed", new Object[]{this}) : new TTDetailScrollerLayout.LayoutParams(-1, -1);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b.d();
    }

    public d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("c7b5e7b9", new Object[]{this}) : this.b.h();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView d = this.b.d();
        if (d == null || d.getAdapter() == null || d.getAdapter().getItemCount() <= 0) {
            return;
        }
        if (i == Integer.MAX_VALUE) {
            d.scrollToPosition(d.getAdapter().getItemCount() - 1);
        } else {
            d.scrollToPosition(i);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public boolean a(final TTDetailScrollerLayout tTDetailScrollerLayout, final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5915e16c", new Object[]{this, tTDetailScrollerLayout, str, new Integer(i)})).booleanValue();
        }
        if (tTDetailScrollerLayout.findLastVisibleView() != getComponentView(null)) {
            tTDetailScrollerLayout.scrollSelf(-tTDetailScrollerLayout.getOwnScrollY());
        }
        a(str, i);
        tTDetailScrollerLayout.post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.component.module.w.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int a2 = w.this.a(str) - i;
                if (a2 <= 0) {
                    return;
                }
                tTDetailScrollerLayout.scrollSelf(a2);
            }
        });
        return true;
    }
}
