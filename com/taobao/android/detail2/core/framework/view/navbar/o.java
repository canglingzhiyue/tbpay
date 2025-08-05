package com.taobao.android.detail2.core.framework.view.navbar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.List;
import tb.fjl;
import tb.fjt;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class o implements m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f11648a;
    private TextView b;
    private com.taobao.android.detail2.core.framework.b c;
    private fmd d;
    private c e;
    private int f = 0;
    private long g = -1;
    private Handler h;

    static {
        kge.a(481536598);
        kge.a(-516657323);
    }

    public static /* synthetic */ int a(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4f259ed2", new Object[]{oVar})).intValue() : oVar.f;
    }

    public static /* synthetic */ c b(o oVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("765fd441", new Object[]{oVar}) : oVar.e;
    }

    public o(com.taobao.android.detail2.core.framework.b bVar, fmd fmdVar) {
        this.c = bVar;
        this.d = fmdVar;
        View c = this.d.c();
        this.b = (TextView) c.findViewById(R.id.nav_back);
        this.f11648a = (RecyclerView) c.findViewById(R.id.right_navibar_content_recyclerview);
        this.f11648a.setLayoutManager(new LinearLayoutManager(this.c.g(), 0, false));
        this.f11648a.setVisibility(0);
    }

    private void a(RecyclerView recyclerView, List<l> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796d0687", new Object[]{this, recyclerView, list});
            return;
        }
        try {
            int f = this.c.h().b().f();
            if (f < 0) {
                return;
            }
            if (list == null) {
                z = false;
            }
            if (list != null) {
                Iterator<l> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("more".equals(it.next().a())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Context context = recyclerView.getContext();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && context != null) {
                if (z) {
                    i = fjl.a(context, f);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.rightMargin != i) {
                    marginLayoutParams.rightMargin = i;
                }
                fjt.a(fjt.TAG_RIGHT_NAV_RECYCLER_LAYER, "curvedScreenAdapter success.newDetailNavMarginRight = " + f);
                return;
            }
            fjt.a(fjt.TAG_RIGHT_NAV_RECYCLER_LAYER, "curvedScreenAdapter error.无 MarginLayoutParams 或 context. context = " + context);
        } catch (Throwable th) {
            fjt.a(fjt.TAG_RIGHT_NAV_RECYCLER_LAYER, "curvedScreenAdapter error. 未知异常.", th);
        }
    }

    private Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[]{this});
        }
        Handler handler = this.h;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.h = handler2;
        return handler2;
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.m
    public void a(final com.taobao.android.detail2.core.framework.data.model.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a363f7be", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.b.setTextColor(dVar.P);
            a(this.f11648a, dVar.R);
            this.f++;
            if (this.g < 0) {
                this.g = System.currentTimeMillis();
            }
            if (this.e == null) {
                this.e = new c(this.c, this.d, dVar.R);
                com.taobao.android.detail2.core.framework.b bVar = this.c;
                if (bVar != null && bVar.k() != null && this.c.k().a()) {
                    DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
                    long as = this.c.h().b().as();
                    defaultItemAnimator.setAddDuration(as);
                    defaultItemAnimator.setChangeDuration(as);
                    defaultItemAnimator.setRemoveDuration(as);
                    defaultItemAnimator.setChangeDuration(as);
                    this.f11648a.setItemAnimator(defaultItemAnimator);
                }
                this.f11648a.setAdapter(this.e);
                return;
            }
            final int i = this.f;
            int aG = this.c.h().b().aG();
            if (this.f <= 3 && aG > 0 && System.currentTimeMillis() - this.g < aG && this.c.k() != null && this.c.k().a()) {
                b().postDelayed(new Runnable() { // from class: com.taobao.android.detail2.core.framework.view.navbar.o.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        boolean z = false;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (i != o.a(o.this)) {
                        } else {
                            try {
                                c b = o.b(o.this);
                                List<l> list = dVar.R;
                                if (o.a(o.this) == 2) {
                                    z = true;
                                }
                                b.a(list, z);
                            } catch (Exception unused) {
                                fjt.a("new_detail异常", "NavBar 本次刷新失败，未知异常。可能是页面关闭了。");
                            }
                        }
                    }
                }, this.f == 2 ? 2000L : 300L);
            } else {
                this.e.a(dVar.R);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.m
    public void a() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.f11648a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        for (int i = 0; i < layoutManager.getChildCount(); i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                RecyclerView.ViewHolder childViewHolder = this.f11648a.getChildViewHolder(childAt);
                if (childViewHolder instanceof h) {
                    ((h) childViewHolder).a();
                    return;
                }
            }
        }
    }
}
