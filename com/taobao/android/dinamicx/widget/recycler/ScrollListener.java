package com.taobao.android.dinamicx.widget.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRecyclerEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import java.util.HashMap;
import tb.fqi;
import tb.fuw;
import tb.fxr;
import tb.gbg;
import tb.kge;

/* loaded from: classes5.dex */
public class ScrollListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;
    public int d;
    public int g;
    public boolean h;
    private int k;
    private DXRecyclerLayout l;
    private RecyclerView.OnScrollListener m;
    private a n;
    public long o;
    public double p;

    /* renamed from: a  reason: collision with root package name */
    public int f12118a = 0;
    public int b = -1;
    public int e = 0;
    public int f = 0;
    public AnchorState i = AnchorState.NONE;
    public DXRecyclerEvent j = new DXRecyclerEvent(5288751146867425108L);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum AnchorState {
        NONE,
        REACH,
        LEAVE
    }

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12119a;
        public boolean b;
        public int c;
        public int d;

        static {
            kge.a(-319409081);
        }

        public a(JSONObject jSONObject) {
            this.c = Integer.MAX_VALUE;
            this.d = -1;
            boolean z = false;
            this.f12119a = fxr.a("enableScrollEventCallback", jSONObject, (Boolean) false).booleanValue();
            this.b = fxr.a("enableAnchorCallback", jSONObject, (Boolean) false).booleanValue();
            if (jSONObject.containsKey("translateYLimited")) {
                this.c = jSONObject.getIntValue("translateYLimited");
            }
            if (jSONObject.containsKey("anchorOffsetY")) {
                this.d = jSONObject.getIntValue("anchorOffsetY");
            }
            this.b &= this.d > 0 ? true : z;
        }
    }

    static {
        kge.a(969659481);
    }

    public static /* synthetic */ Object ipc$super(ScrollListener scrollListener, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ScrollListener(int i, DXRecyclerLayout dXRecyclerLayout) {
        this.k = i;
        this.l = dXRecyclerLayout;
    }

    public void a(JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a99ecf9", new Object[]{this, jSONObject, dXRuntimeContext});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
        } else {
            this.n = new a(jSONObject);
            HashMap hashMap = new HashMap();
            this.n.c = gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), this.n.c);
            hashMap.put("translateYLimited", com.taobao.android.dinamicx.expression.expr_v2.f.a(this.n.c));
            this.n.d = gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), this.n.d);
            hashMap.put("anchorOffsetY", com.taobao.android.dinamicx.expression.expr_v2.f.a(this.n.d));
            this.j.setDataToArgs(hashMap);
        }
    }

    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
        } else {
            this.m = onScrollListener;
        }
    }

    private void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.j.setDeltaX(i);
        this.j.setDeltaY(i2);
        this.j.setOffsetX(this.d);
        this.j.setOffsetY(this.c);
        this.j.setSpeedRatio(this.p);
        DXRecyclerLayout dXRecyclerLayout = this.l;
        if (dXRecyclerLayout == null) {
            return;
        }
        this.j.setUserId(dXRecyclerLayout.getUserId());
        this.j.setSelfWidget(this.l);
        this.j.setDataToArgs();
        this.l.postEvent(this.j);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int s;
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.b = i2;
        this.d += i;
        this.c += i2;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.o;
        if (j < 60000) {
            if ((i2 != 0) & (j > 0)) {
                this.p = Math.round((float) ((Math.abs(i2) * 1000) / j));
            }
        }
        this.o = currentTimeMillis;
        if (d()) {
            b(i, i2);
        } else {
            a(i, i2);
        }
        RecyclerView.OnScrollListener onScrollListener = this.m;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(recyclerView, i, i2);
        }
        if (i2 < 0 && (s = this.l.s()) >= 0 && (e = e()) >= 0 && e <= s) {
            fuw.a("ScrollListener", "滚动到顶部");
            this.l.k();
        }
        if (!DinamicXEngine.j()) {
            return;
        }
        fuw.a("ScrollListener", "dx: " + i + " dy " + i2 + " offsetY " + this.c);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.n != null;
    }

    private void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.n.f12119a) {
        } else {
            this.j.getArgs().remove("anchorState");
            if (i2 > 0) {
                if (this.g < 0) {
                    this.g = 0;
                }
                if (this.g < this.n.c) {
                    this.h = false;
                    a(i, i2);
                } else {
                    if (this.c - i2 < this.n.d || !this.h) {
                        z2 = true;
                    }
                    boolean z3 = this.n.b & z2;
                    this.h = true;
                    if (z3 && this.c >= this.n.d) {
                        if (this.i != AnchorState.REACH) {
                            this.i = AnchorState.REACH;
                            this.j.getArgs().put("anchorState", com.taobao.android.dinamicx.expression.expr_v2.f.a(this.i.toString().toLowerCase()));
                        }
                        a(i, i2);
                    }
                }
            } else {
                if (this.g > 0) {
                    this.g = 0;
                }
                if (this.c >= 0) {
                    if (Math.abs(this.g) < Math.min(this.n.c, this.c - i2)) {
                        z2 = true;
                    }
                    if (!this.n.b || this.c - i2 <= this.n.d || this.c >= this.n.d || this.i != AnchorState.REACH) {
                        z = z2;
                    } else {
                        this.i = AnchorState.LEAVE;
                        this.j.getArgs().put("anchorState", com.taobao.android.dinamicx.expression.expr_v2.f.a(this.i.toString().toLowerCase()));
                    }
                    if (z) {
                        a(i, i2);
                    }
                }
            }
            this.g += i2;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        DXRecyclerLayout dXRecyclerLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        if (this.k == 0 && this.f12118a == 2 && i == 0) {
            recyclerView.scrollBy(0, this.b > 0 ? 1 : -1);
        }
        if (i == 0) {
            this.o = 0L;
            DXRecyclerLayout dXRecyclerLayout2 = this.l;
            if (dXRecyclerLayout2 != null) {
                dXRecyclerLayout2.postEvent(new DXEvent(2691126191158604142L));
                this.l.a(recyclerView);
                DXRootView s = this.l.getDXRuntimeContext().s();
                DXRuntimeContext dXRuntimeContext = this.l.getDXRuntimeContext();
                if (dXRuntimeContext != null && fqi.g(dXRuntimeContext.A()) && s != null && s.getDxNestedScrollerView(this.l.getDXRuntimeContext()) != null) {
                    s.getDxNestedScrollerView(this.l.getDXRuntimeContext()).dispatchChildScrollStateChange(i);
                }
            }
        }
        if (i == 1 && (dXRecyclerLayout = this.l) != null) {
            dXRecyclerLayout.postEvent(new DXEvent(9144262755562405950L));
        }
        this.f12118a = i;
        RecyclerView.OnScrollListener onScrollListener = this.m;
        if (onScrollListener == null) {
            return;
        }
        onScrollListener.onScrollStateChanged(recyclerView, i);
    }

    public void a(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b28c884", new Object[]{this, dXRecyclerLayout});
        } else {
            this.l = dXRecyclerLayout;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f12118a = 0;
        this.b = -1;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.g = 0;
        this.h = false;
        a aVar = this.n;
        if (aVar != null && aVar.b && this.i == AnchorState.REACH) {
            this.j.getArgs().put("anchorState", com.taobao.android.dinamicx.expression.expr_v2.f.a(AnchorState.LEAVE.toString().toLowerCase()));
            a(0, 0);
        }
        this.i = AnchorState.NONE;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public double f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1db", new Object[]{this})).doubleValue() : this.p;
    }

    private int e() {
        RecyclerView l;
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        DXRecyclerLayout dXRecyclerLayout = this.l;
        if (dXRecyclerLayout != null && (l = dXRecyclerLayout.l()) != null && (childAt = l.getChildAt(0)) != null) {
            return l.getChildAdapterPosition(childAt);
        }
        return -2;
    }
}
