package com.taobao.android.icart.recommend.impl;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.b;
import com.taobao.android.icart.recommend.c;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.monitor.procedure.v;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.tao.recommend4.recyclerview.h;
import java.util.HashMap;
import java.util.Map;
import tb.bbz;
import tb.bdx;
import tb.bem;
import tb.gbg;
import tb.ieu;
import tb.jnq;
import tb.jpo;
import tb.jqg;
import tb.kge;
import tb.ksk;
import tb.mya;
import tb.osb;
import tb.osc;
import tb.osp;

/* loaded from: classes5.dex */
public final class CartMainRecommend extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bbz f12847a;
    private final Context b;
    private final CartRecyclerView c;
    private RecyclerView d;
    private osp e;
    private osc g;
    private osc h;
    private final String k;
    private boolean f = false;
    private RecmdType i = RecmdType.NORMAL;
    private RequestState j = RequestState.IDLE;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum RecmdType {
        CUSTOM,
        NORMAL
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum RequestState {
        IDLE,
        REQUESTING,
        INVALID
    }

    static {
        kge.a(-1476056320);
    }

    public static /* synthetic */ Object ipc$super(CartMainRecommend cartMainRecommend, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474194533) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != -125736071) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((osc) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ RequestState a(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestState) ipChange.ipc$dispatch("24d8e986", new Object[]{cartMainRecommend}) : cartMainRecommend.j;
    }

    public static /* synthetic */ RequestState a(CartMainRecommend cartMainRecommend, RequestState requestState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestState) ipChange.ipc$dispatch("7735defd", new Object[]{cartMainRecommend, requestState});
        }
        cartMainRecommend.j = requestState;
        return requestState;
    }

    public static /* synthetic */ void b(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b022df8", new Object[]{cartMainRecommend});
        } else {
            cartMainRecommend.l();
        }
    }

    public static /* synthetic */ RecmdType c(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecmdType) ipChange.ipc$dispatch("2c9455eb", new Object[]{cartMainRecommend}) : cartMainRecommend.k();
    }

    public static /* synthetic */ osc d(CartMainRecommend cartMainRecommend) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osc) ipChange.ipc$dispatch("2fa898f1", new Object[]{cartMainRecommend}) : cartMainRecommend.h;
    }

    public CartMainRecommend(CartRecyclerView cartRecyclerView, bbz bbzVar) {
        this.c = cartRecyclerView;
        this.b = bbzVar.m();
        this.f12847a = bbzVar;
        this.k = bbzVar.v().a();
        jpo.b(bbzVar.m()).b(ieu.sKeyFeedFlowType, "main");
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(osc oscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8816b79", new Object[]{this, oscVar});
            return;
        }
        super.a(oscVar);
        this.h = oscVar;
    }

    @Override // com.taobao.android.icart.recommend.b
    public void e() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.e == null || this.c == null || (recyclerView = this.d) == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = gbg.c(this.b);
                this.d.setLayoutParams(layoutParams);
            } else {
                this.d.setLayoutParams(new RecyclerView.LayoutParams(-1, gbg.c(this.b)));
            }
            RecyclerView recyclerView2 = this.d;
            if (recyclerView2 instanceof ChildRecyclerView) {
                this.c.setNestedScrollChild((mya) recyclerView2);
                ((ChildRecyclerView) this.d).setNestedScrollParent(this.c);
            }
            if (!this.c.hasEndView(this.d)) {
                this.c.addEndView(this.d);
            }
            this.c.resetScroll();
            this.d.getAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.e == null) {
        } else {
            jqg.b("MainRecommend", "requestData mRequestState=" + this.j);
            if (this.j != RequestState.IDLE) {
                this.j = RequestState.INVALID;
                return;
            }
            this.j = RequestState.REQUESTING;
            this.g = new osb() { // from class: com.taobao.android.icart.recommend.impl.CartMainRecommend.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.osc
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    RequestState a2 = CartMainRecommend.a(CartMainRecommend.this);
                    CartMainRecommend.a(CartMainRecommend.this, RequestState.IDLE);
                    if (a2 == RequestState.INVALID) {
                        CartMainRecommend.b(CartMainRecommend.this);
                        CartMainRecommend.this.a(str);
                    } else if (this.b && CartMainRecommend.c(CartMainRecommend.this) == RecmdType.CUSTOM) {
                        CartMainRecommend.b(CartMainRecommend.this);
                    } else {
                        CartMainRecommend.this.f();
                        jqg.b("RecommendHelper", "requestData success needRecommend=" + CartMainRecommend.this.h() + ",currentHasMore=" + CartMainRecommend.this.f12847a.n().p());
                        if (!CartMainRecommend.this.h()) {
                            bdx.a("MainRecommend", "cartFilter", "requestRecommendInFiltering", "筛选下请求猜你喜欢", "");
                        } else if (CartMainRecommend.this.f12847a.n().p()) {
                        } else {
                            CartMainRecommend.this.e();
                            if (CartMainRecommend.d(CartMainRecommend.this) == null) {
                                return;
                            }
                            CartMainRecommend.d(CartMainRecommend.this).a();
                        }
                    }
                }

                @Override // tb.osc
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    CartMainRecommend.a(CartMainRecommend.this, RequestState.IDLE);
                    if (CartMainRecommend.d(CartMainRecommend.this) != null) {
                        CartMainRecommend.d(CartMainRecommend.this).b();
                    }
                    UnifyLog.d("RecommendHelper", "requestData onError");
                }
            };
            JSONObject b = this.i == RecmdType.CUSTOM ? c.b(this.f12847a) : null;
            if (b != null) {
                b.put("forbiddenCache", (Object) true);
            }
            if (b != null) {
                b.putAll(AddCartUtil.a(this.f12847a.m(), "detail", AddCartUtil.FEED_FLOW_MODULE, (String) null));
            }
            this.e.a(this.g);
            this.e.c(b);
            this.f = true;
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        jqg.b("MainRecommend", "initRecommendContainer");
        try {
            m();
            if (this.c.hasEndView(this.d)) {
                this.c.removeEndView(this.d);
            }
            this.e = osp.a(j(), this.k);
        } catch (Throwable unused) {
        }
        osp ospVar = this.e;
        if (ospVar == null) {
            return;
        }
        this.d = ospVar.a(this.f12847a.m());
        this.d.setLayoutParams(new RecyclerView.LayoutParams(-1, gbg.c(this.b)));
        this.d.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        this.c.addEndView(this.d);
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.d;
        return recyclerView != null && this.c.hasEndView(recyclerView);
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", (Object) Integer.valueOf(i));
        hashMap.put(ksk.REC_CART.f30287a, jSONObject.toJSONString());
        osp.a(hashMap);
    }

    private ksk j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksk) ipChange.ipc$dispatch("5445d5d2", new Object[]{this});
        }
        if (this.f12847a.v().j()) {
            return ksk.REC_MC_CART;
        }
        JSONObject b = c.b(this.f12847a);
        if (b != null) {
            String string = b.getString("containerId");
            if (!StringUtils.isEmpty(string)) {
                return new ksk(string, "cart_" + string, "Page_ShoppingCart");
            }
        }
        return ksk.REC_CART;
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(jnq<RecyclerView> jnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb9180b", new Object[]{this, jnqVar});
        } else {
            jnqVar.a(this.d);
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.j = RequestState.IDLE;
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        osp ospVar = this.e;
        if (ospVar == null || !this.f) {
            return;
        }
        ospVar.b((Map<String, Object>) null);
    }

    @Override // com.taobao.android.icart.recommend.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            m();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : c.a(this.f12847a);
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        JSONObject i = bem.i(this.f12847a.n());
        if (i != null) {
            return i.getBooleanValue("needRefreshForUpdate");
        }
        return false;
    }

    private RecmdType k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecmdType) ipChange.ipc$dispatch("5449de06", new Object[]{this});
        }
        if (c.b(this.f12847a) != null) {
            return RecmdType.CUSTOM;
        }
        return RecmdType.NORMAL;
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        RecmdType k = k();
        if (this.i == k) {
            return false;
        }
        this.i = k;
        l();
        return true;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        osp ospVar = this.e;
        if (ospVar == null) {
            return;
        }
        ospVar.bd_();
        RecyclerView.Adapter adapter = this.e.i().getAdapter();
        if (!(adapter instanceof h)) {
            return;
        }
        ((h) adapter).b(0);
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        osp ospVar = this.e;
        if (ospVar == null) {
            return;
        }
        ospVar.m();
        this.e.a((osc) null);
    }
}
