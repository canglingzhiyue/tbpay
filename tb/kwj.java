package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.h;

/* loaded from: classes4.dex */
public class kwj extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;
    public boolean c;
    private Context d;
    private kwk f;
    private osd g;
    private RecyclerView h;
    private boolean i;
    private boolean j;
    private boolean k;
    private osc l;
    private int m;
    private View.OnLayoutChangeListener n;
    private RecyclerView.OnScrollListener o;

    static {
        kge.a(425434896);
    }

    public static /* synthetic */ Object ipc$super(kwj kwjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public static /* synthetic */ Context a(kwj kwjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("88d54692", new Object[]{kwjVar}) : kwjVar.d;
    }

    public static /* synthetic */ boolean a(kwj kwjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b49d07e", new Object[]{kwjVar, new Boolean(z)})).booleanValue();
        }
        kwjVar.i = z;
        return z;
    }

    public static /* synthetic */ osd b(kwj kwjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osd) ipChange.ipc$dispatch("cdb8270b", new Object[]{kwjVar}) : kwjVar.g;
    }

    public static /* synthetic */ void c(kwj kwjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceefa29c", new Object[]{kwjVar});
        } else {
            kwjVar.g();
        }
    }

    public kwj(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.i = false;
        this.j = true;
        this.b = false;
        this.c = false;
        this.k = false;
        this.o = new RecyclerView.OnScrollListener() { // from class: tb.kwj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                kwj.this.h();
            }
        };
        this.n = new View.OnLayoutChangeListener() { // from class: tb.kwj.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                int i9 = i3 - i;
                int i10 = i7 - i5;
                if (i9 == 0 || i9 == i10 || !e.a(kwj.a(kwj.this))) {
                    return;
                }
                kwj.b(kwj.this).b(i9);
            }
        };
        this.d = context;
        a(eyyVar);
    }

    public void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
            return;
        }
        JSONObject d = eyyVar.d();
        if (d == null) {
            return;
        }
        this.f = kwk.a(d);
        kwk kwkVar = this.f;
        if (kwkVar == null) {
            return;
        }
        ksk b = ksk.b(kwkVar.c);
        if (b == null) {
            b = ksk.REC_DETAIL;
            i.a("TTDetailRecommendComponent", "containerType is null, use default. channel : " + this.f.c);
        }
        a(this.d, b);
    }

    private void a(Context context, ksk kskVar) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c72bed", new Object[]{this, context, kskVar});
        } else if (this.g != null) {
        } else {
            try {
                this.g = osd.a(kskVar);
            } catch (Throwable unused) {
            }
            if (this.g != null) {
                if (this.l == null) {
                    this.l = d();
                }
                this.g.a(this.l);
                if (this.h == null) {
                    this.h = this.g.a(context);
                    this.h.setOverScrollMode(2);
                    this.h.setVerticalScrollBarEnabled(false);
                    this.h.setFocusable(false);
                    this.h.setDescendantFocusability(393216);
                }
                if (this.j && (adapter = this.h.getAdapter()) != null && (adapter instanceof h)) {
                    ((h) this.h.getAdapter()).b(0);
                }
            }
            g();
            if (e.a(this.d) && (recyclerView = this.h) != null) {
                recyclerView.addOnLayoutChangeListener(this.n);
            }
            RecyclerView recyclerView2 = this.h;
            if (recyclerView2 == null) {
                return;
            }
            recyclerView2.addOnScrollListener(this.o);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c || this.i || this.f == null) {
        } else {
            c();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x
    public TTDetailScrollerLayout.LayoutParams e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailScrollerLayout.LayoutParams) ipChange.ipc$dispatch("c38f45ed", new Object[]{this}) : new TTDetailScrollerLayout.LayoutParams(-1, -1);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.h;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        kwk kwkVar = this.f;
        if (kwkVar == null || StringUtils.isEmpty(kwkVar.d)) {
            return;
        }
        this.g.a(new ksn(this.f.f30351a, this.f.b), this.f.g);
        this.i = true;
        this.c = true;
    }

    private osc d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osc) ipChange.ipc$dispatch("261dc61c", new Object[]{this}) : new osc() { // from class: tb.kwj.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osc
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                kwj.c(kwj.this);
                kwj.this.b = true;
            }

            @Override // tb.osc
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                i.a("TTDetailRecommendComponent", "IRecommendCallback onError");
                kwj.a(kwj.this, false);
            }
        };
    }

    private void g() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.g == null || (recyclerView = this.h) == null) {
        } else {
            recyclerView.setVisibility(0);
            this.h.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView == null || recyclerView.getAdapter() == null || this.h.getAdapter().getItemCount() <= 0) {
            return;
        }
        if (i == Integer.MAX_VALUE) {
            RecyclerView recyclerView2 = this.h;
            recyclerView2.scrollToPosition(recyclerView2.getAdapter().getItemCount() - 1);
            return;
        }
        this.h.scrollToPosition(i);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            if (!(this.h instanceof ChildRecyclerView)) {
                return;
            }
            ((ChildRecyclerView) this.h).onScrolledByNestedParent(null);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        this.m = 0;
        this.k = false;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        this.k = true;
        if (!this.c) {
            a();
        }
        this.m = 1;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        osd osdVar = this.g;
        if (osdVar == null) {
            return;
        }
        osdVar.e();
        this.l = null;
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.removeOnLayoutChangeListener(this.n);
        }
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.removeOnScrollListener(this.o);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : this.h;
    }
}
