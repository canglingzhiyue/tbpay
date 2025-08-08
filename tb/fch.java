package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.desc.DESCErrorView;
import com.taobao.android.detail.core.detail.widget.container.a;
import com.taobao.android.detail.core.event.basic.b;
import com.taobao.android.detail.core.utils.e;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fch extends a implements DESCErrorView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27792a;
    public boolean b;
    private final String c;
    private final String d;
    private Context e;
    private ksn f;
    private egx g;
    private boolean h;
    private FrameLayout i;
    private osd j;
    private RecyclerView k;
    private boolean l;
    private boolean m;
    private JSONObject n;
    private osc o;

    static {
        kge.a(1271469939);
        kge.a(-1052435729);
    }

    public static /* synthetic */ Object ipc$super(fch fchVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -414738562:
                super.a((epe) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 91915241:
                super.b();
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 96532850:
                return new Boolean(super.g());
            case 1545161960:
                super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(fch fchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8469bad", new Object[]{fchVar});
        } else {
            fchVar.n();
        }
    }

    public fch(Activity activity) {
        super(activity);
        this.c = "1.0";
        this.d = "detail";
        this.h = false;
        this.l = true;
        this.f27792a = false;
        this.b = false;
        this.m = false;
        this.o = new osc() { // from class: tb.fch.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osc
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                fch.a(fch.this);
                fch.this.f27792a = true;
            }

            @Override // tb.osc
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    i.a("TBDetailGuessYouLikeController", "IRecommendCallback onError");
                }
            }
        };
        this.e = activity;
        this.i = new FrameLayout(this.e);
        this.i.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        emu.a("com.taobao.android.detail.wrapper.ext.custom.detailcontroller.TBDetailGuessYouLikeController");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
            return;
        }
        super.a(epeVar);
        if (!(epeVar instanceof egx)) {
            return;
        }
        this.g = (egx) epeVar;
        a(this.g);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public View k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.desc.DESCErrorView.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            i.a("TBDetailGuessYouLikeController", "onErrorViewBtnClick");
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (e.j() && this.b) {
            z = true;
        }
        if (z || this.h || this.g == null) {
            return;
        }
        l();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void b() {
        egx egxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.m = true;
        if (!this.b) {
            a();
        }
        if (!this.f27792a || (egxVar = this.g) == null || egxVar.events == null) {
            return;
        }
        for (Event event : this.g.events) {
            if (event instanceof enp) {
                f.a(this.e, event);
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a(boolean z, boolean z2) {
        egx egxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        this.m = false;
        if (!this.f27792a || (egxVar = this.g) == null || egxVar.events == null) {
            return;
        }
        for (Event event : this.g.events) {
            if (event instanceof enp) {
                b bVar = new b(null);
                bVar.f9696a = ((enp) event).f27473a;
                f.a(this.e, bVar);
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            super.c();
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        osd osdVar = this.j;
        if (osdVar != null) {
            osdVar.e();
        }
        super.d();
    }

    private void a(Context context, ksk kskVar) {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c72bed", new Object[]{this, context, kskVar});
        } else if (this.j != null) {
        } else {
            try {
                this.j = osd.a(kskVar);
                if (s.b()) {
                    this.j.b(iuy.c);
                }
            } catch (Throwable unused) {
            }
            osd osdVar = this.j;
            if (osdVar != null) {
                osdVar.a(this.o);
                if (this.k == null) {
                    this.k = this.j.a(context);
                    this.k.setOverScrollMode(2);
                    this.k.setVerticalScrollBarEnabled(false);
                    this.k.setFocusable(false);
                    this.k.setDescendantFocusability(393216);
                }
                if (this.l && (adapter = this.k.getAdapter()) != null && (adapter instanceof h)) {
                    ((h) this.k.getAdapter()).b(0);
                }
            }
            n();
        }
    }

    public void e() {
        osd osdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.m || !this.f27792a || (osdVar = this.j) == null) {
        } else {
            osdVar.a((Map<String, Object>) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(tb.egx r8) {
        /*
            r7 = this;
            java.lang.String r0 = "bizParams"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.fch.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L17
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r7
            r2 = 1
            r0[r2] = r8
            java.lang.String r8 = "e6d16702"
            r1.ipc$dispatch(r8, r0)
            return
        L17:
            if (r8 != 0) goto L1a
            return
        L1a:
            com.taobao.android.ultron.common.model.IDMComponent r1 = r8.dmComponent
            r2 = 0
            java.lang.String r3 = "TBDetailGuessYouLikeController"
            if (r1 == 0) goto L6c
            com.taobao.android.ultron.common.model.IDMComponent r8 = r8.dmComponent
            com.alibaba.fastjson.JSONObject r8 = r8.getFields()
            if (r8 == 0) goto L6c
            java.lang.String r1 = "payload"
            com.alibaba.fastjson.JSONObject r8 = r8.getJSONObject(r1)
            if (r8 == 0) goto L67
            java.lang.String r1 = "api"
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r4 = "version"
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "channel"
            java.lang.String r5 = r8.getString(r5)
            com.alibaba.fastjson.JSONObject r6 = r8.getJSONObject(r0)     // Catch: java.lang.Throwable -> L4b
            r7.n = r6     // Catch: java.lang.Throwable -> L4b
            goto L65
        L4b:
            r7.n = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "parseRequestParams bizParams parse error bizParams ： "
            r2.append(r6)
            java.lang.String r8 = r8.getString(r0)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.taobao.android.detail.core.utils.i.a(r3, r8)
        L65:
            r2 = r4
            goto L6e
        L67:
            java.lang.String r8 = "parseRequestParams payload is null "
            com.taobao.android.detail.core.utils.i.a(r3, r8)
        L6c:
            r1 = r2
            r5 = r1
        L6e:
            boolean r8 = android.text.StringUtils.isEmpty(r1)
            java.lang.String r0 = ", channel : "
            java.lang.String r4 = ", version : "
            if (r8 != 0) goto L84
            boolean r8 = android.text.StringUtils.isEmpty(r2)
            if (r8 != 0) goto L84
            boolean r8 = android.text.StringUtils.isEmpty(r5)
            if (r8 == 0) goto Laa
        L84:
            java.lang.String r1 = "mtop.taobao.wireless.home.awesome.itemdetail.recommend"
            java.lang.String r2 = "1.0"
            java.lang.String r5 = "detail"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = "parseRequestParams error , api : "
            r8.append(r6)
            r8.append(r1)
            r8.append(r4)
            r8.append(r2)
            r8.append(r0)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.taobao.android.detail.core.utils.i.a(r3, r8)
        Laa:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = "api : "
            r8.append(r6)
            r8.append(r1)
            r8.append(r4)
            r8.append(r2)
            r8.append(r0)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.taobao.android.detail.core.utils.i.a(r3, r8)
            tb.ksn r8 = new tb.ksn
            r8.<init>(r1, r2)
            r7.f = r8
            tb.ksk r8 = tb.ksk.b(r5)
            if (r8 != 0) goto Led
            tb.ksk r8 = tb.ksk.REC_DETAIL
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "containerType is null, use default. channel : "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.taobao.android.detail.core.utils.i.a(r3, r0)
        Led:
            android.content.Context r0 = r7.e
            r7.a(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fch.a(tb.egx):void");
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        egx egxVar = this.g;
        if (egxVar == null || StringUtils.isEmpty(egxVar.f27301a)) {
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("itemId", this.g.f27301a);
        hashMap.put("sellerId", this.g.b);
        hashMap.put("from", StringUtils.isEmpty(this.g.d) ? kwk.REC_CUBE : this.g.d);
        JSONObject jSONObject = this.n;
        if (jSONObject != null) {
            hashMap.putAll(jSONObject);
        }
        a(hashMap);
        this.h = true;
        this.b = true;
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.j == null) {
        } else {
            JSONObject jSONObject = null;
            if (map != null) {
                try {
                    jSONObject = JSONObject.parseObject(JSON.toJSONString(map));
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.j.a(this.f, jSONObject);
        }
    }

    private void n() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.j == null || (frameLayout = this.i) == null || this.k == null) {
        } else {
            if (frameLayout.getChildCount() == 0) {
                ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -1;
                    this.k.setLayoutParams(layoutParams);
                } else {
                    this.k.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                }
                if (this.k.getParent() != null) {
                    ((ViewGroup) this.k.getParent()).removeView(this.k);
                }
                this.i.removeAllViews();
                this.i.addView(this.k);
            }
            this.k.setVisibility(0);
            this.k.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean g() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        boolean g = super.g();
        return (!this.f27792a || (recyclerView = this.k) == null) ? g : !recyclerView.canScrollVertically(-1);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.k.getMeasuredHeight();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.k;
        if (recyclerView == null || recyclerView.getAdapter() == null || this.k.getAdapter().getItemCount() <= 0) {
            return;
        }
        if (z) {
            if (i == Integer.MAX_VALUE) {
                RecyclerView recyclerView2 = this.k;
                recyclerView2.smoothScrollToPosition(recyclerView2.getAdapter().getItemCount() - 1);
                return;
            }
            this.k.smoothScrollToPosition(i);
        } else if (i == Integer.MAX_VALUE) {
            RecyclerView recyclerView3 = this.k;
            recyclerView3.scrollToPosition(recyclerView3.getAdapter().getItemCount() - 1);
        } else {
            this.k.scrollToPosition(i);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, int i2) {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.f27792a || (recyclerView = this.k) == null || recyclerView.getScrollState() == 2) {
        } else {
            this.k.scrollBy(i, i2);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.k == null || !g()) {
        } else {
            RecyclerView recyclerView = this.k;
            if (!(recyclerView instanceof ChildRecyclerView)) {
                return;
            }
            ((ChildRecyclerView) recyclerView).onScrolledByNestedParent(null);
        }
    }
}
