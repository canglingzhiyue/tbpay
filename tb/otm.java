package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.c;
import com.taobao.tao.recommend4.recyclerview.h;
import com.taobao.tao.recommend4.recyclerview.m;
import io.unicorn.plugin.platform.WeexNestedFrameLayout;
import io.unicorn.plugin.platform.d;
import io.unicorn.plugin.platform.k;
import java.util.Map;
import tb.mto;
import tb.otk;

/* loaded from: classes8.dex */
public class otm extends otk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f32403a;
    private WeexNestedFrameLayout b;
    private osd c;
    private RecyclerView d;
    private long e;
    private boolean f;
    private final d g;
    private k h;

    static {
        kge.a(1339610877);
    }

    public static /* synthetic */ Object ipc$super(otm otmVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ k a(otm otmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("b4f6bea", new Object[]{otmVar}) : otmVar.h;
    }

    public static /* synthetic */ osd b(otm otmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osd) ipChange.ipc$dispatch("2f5d6935", new Object[]{otmVar}) : otmVar.c;
    }

    public otm(Context context, otk.a aVar) {
        super(context, aVar);
        this.f32403a = context;
        this.g = g();
    }

    public d f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b58a5cf4", new Object[]{this}) : this.g;
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994ebe2c", new Object[]{this, kVar});
            return;
        }
        this.h = kVar;
        this.b = (WeexNestedFrameLayout) this.h.a((View) null);
    }

    @Override // tb.otk
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    @Override // tb.otk
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ldf.d("NestedContainerCreator", "setBizParams:" + str);
        otn otnVar = new otn(str);
        if (!a(otnVar.a(), this.c)) {
            return;
        }
        a(this.b, otnVar);
        a(this.c, otnVar);
    }

    @Override // tb.otk
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        ldf.d("NestedContainerCreator", "setPageRenderStartTime:" + j);
        this.e = j;
        this.f = a(this.c, j);
    }

    @Override // tb.otk
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ldf.d("NestedContainerCreator", Constant.KEY_PAGEBACK);
        osd osdVar = this.c;
        if (osdVar == null) {
            return;
        }
        osdVar.a((Map<String, Object>) null);
    }

    @Override // tb.otk
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ldf.d("NestedContainerCreator", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX);
        osd osdVar = this.c;
        if (osdVar == null) {
            return;
        }
        osdVar.e();
    }

    @Override // tb.otk
    public void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
            return;
        }
        ldf.d("NestedContainerCreator", "nestedScroll velocity: " + d);
        RecyclerView recyclerView = this.d;
        if (recyclerView != null && d > mto.a.GEO_NOT_SUPPORT) {
            this.d.fling(0, (int) (d * recyclerView.getContext().getApplicationContext().getResources().getDisplayMetrics().density));
        }
        osd osdVar = this.c;
        if (osdVar == null) {
            return;
        }
        osdVar.m();
    }

    @Override // tb.otk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.d;
        if (!(recyclerView instanceof HomeChildRecyclerView)) {
            return;
        }
        ((HomeChildRecyclerView) recyclerView).onScrolledByNestedParent(null);
    }

    private d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("f2aa2113", new Object[]{this}) : new d() { // from class: tb.otm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // io.unicorn.plugin.platform.d
            public void a(double d) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
                } else {
                    otm.this.a(d);
                }
            }

            @Override // io.unicorn.plugin.platform.d
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else {
                    otm.this.b(z);
                }
            }
        };
    }

    private boolean a(ksk kskVar, osd osdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50c94269", new Object[]{this, kskVar, osdVar})).booleanValue();
        }
        if (kskVar == null) {
            ldf.d("NestedContainerCreator", "gatewayContainerType is null");
            return false;
        } else if (osdVar == null || kskVar != ksk.REC_FAVORITE) {
            return true;
        } else {
            ldf.d("NestedContainerCreator", "收藏夹已经初始化并请求过则不在主动触发请求，避免频繁请求第一页");
            return false;
        }
    }

    private void a(WeexNestedFrameLayout weexNestedFrameLayout, otn otnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89584fdf", new Object[]{this, weexNestedFrameLayout, otnVar});
            return;
        }
        if (this.c == null) {
            this.c = osd.a(otnVar.a());
            this.c.a(h());
            this.c.a(b());
        }
        if (this.d == null) {
            this.d = this.c.a(this.f32403a);
            this.d.setBackgroundColor(0);
            this.d.addOnScrollListener(j());
            a(this.d);
            weexNestedFrameLayout.addView(this.d);
            this.c.a(i());
        }
        if (otnVar.e()) {
            b(this.d);
        }
        if (this.f) {
            return;
        }
        a(this.c, this.e);
    }

    private osc h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osc) ipChange.ipc$dispatch("44e45b98", new Object[]{this}) : new osc() { // from class: tb.otm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osc
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    c();
                }
            }

            @Override // tb.osc
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    ksp.c("NestedContainerCreator", "IRecommendCallback onError");
                }
            }

            private void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rendertime", (Object) String.valueOf(System.currentTimeMillis()));
                jSONObject.put("optimizeType", (Object) opr.b());
                otm.this.a("infoflowrendered", jSONObject);
            }
        };
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            recyclerView.setLayoutParams(layoutParams);
            return;
        }
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
    }

    @Override // tb.otk
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.c.a(z);
        }
    }

    private m.a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m.a) ipChange.ipc$dispatch("e24e115f", new Object[]{this}) : new m.a() { // from class: tb.otm.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.recyclerview.m.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (otm.a(otm.this) == null) {
                } else {
                    if (otm.b(otm.this) != null) {
                        otm.b(otm.this).l();
                    }
                    ldf.d("NestedContainerCreator", "triggerWeexScroll, flingVelocity : " + i);
                    otm.a(otm.this).a(false, i);
                }
            }
        };
    }

    private RecyclerView.OnScrollListener j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("9b93c19f", new Object[]{this}) : new RecyclerView.OnScrollListener() { // from class: tb.otm.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof c)) {
                    return;
                }
                c cVar = (c) layoutManager;
                if (i != 1 || !cVar.a() || otm.a(otm.this) == null) {
                    return;
                }
                otm.a(otm.this).a(false);
            }
        };
    }

    private void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
        } else if (!(recyclerView.getAdapter() instanceof h)) {
        } else {
            ((h) recyclerView.getAdapter()).b(0);
        }
    }

    private void a(osd osdVar, otn otnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a277867f", new Object[]{this, osdVar, otnVar});
            return;
        }
        Map<?, ?> d = otnVar.d();
        JSONObject jSONObject = null;
        if (d != null) {
            try {
                jSONObject = JSON.parseObject(JSON.toJSONString(d));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        osdVar.a(new ksn(otnVar.b(), otnVar.c()), jSONObject);
    }

    private boolean a(osd osdVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ba91f0", new Object[]{this, osdVar, new Long(j)})).booleanValue();
        }
        if (osdVar == null) {
            ksp.c("NestedContainerCreator", "recommendContainer == null");
            return false;
        }
        otc a2 = osdVar.a();
        if (a2 == null) {
            ksp.c("NestedContainerCreator", "recommendLifeCycleReport == null");
            return false;
        }
        a2.a(j);
        return true;
    }
}
