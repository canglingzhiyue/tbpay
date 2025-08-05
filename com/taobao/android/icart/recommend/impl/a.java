package com.taobao.android.icart.recommend.impl;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.b;
import com.taobao.android.icart.recommend.c;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.monitor.procedure.v;
import com.taobao.search.infoflow.SearchChildRecyclerView;
import com.taobao.search.infoflow.a;
import java.util.Map;
import tb.bbz;
import tb.bed;
import tb.bem;
import tb.gbg;
import tb.ieu;
import tb.jnq;
import tb.jpo;
import tb.jqg;
import tb.kge;

/* loaded from: classes5.dex */
public final class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CartRecyclerView f12849a;
    private final bbz b;
    private com.taobao.search.infoflow.a c;
    private View d;
    private SearchChildRecyclerView e;
    private jnq<RecyclerView> f;
    private long g;
    private final int h;

    static {
        kge.a(-733922127);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.icart.recommend.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ CartRecyclerView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartRecyclerView) ipChange.ipc$dispatch("5d3bae34", new Object[]{aVar}) : aVar.f12849a;
    }

    public static /* synthetic */ SearchChildRecyclerView a(a aVar, SearchChildRecyclerView searchChildRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchChildRecyclerView) ipChange.ipc$dispatch("751705b", new Object[]{aVar, searchChildRecyclerView});
        }
        aVar.e = searchChildRecyclerView;
        return searchChildRecyclerView;
    }

    public static /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3741c8", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.b(i);
        }
    }

    public static /* synthetic */ jnq b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnq) ipChange.ipc$dispatch("af6e6cbf", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ View c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1d9f9c5b", new Object[]{aVar}) : aVar.d;
    }

    public a(CartRecyclerView cartRecyclerView, bbz bbzVar) {
        jqg.b("CartSearchRecommend", "create");
        this.f12849a = cartRecyclerView;
        this.b = bbzVar;
        this.h = gbg.c(this.b.m());
        jpo.b(bbzVar.m()).b(ieu.sKeyFeedFlowType, "search");
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        jqg.b("CartSearchRecommend", "initRecommendContainer");
        if (this.c != null) {
            return;
        }
        this.c = com.taobao.search.infoflow.b.a("iCart", this.b.m());
        JSONObject j = j();
        jqg.b("CartSearchRecommend", "params", j);
        this.g = System.currentTimeMillis();
        this.d = this.c.a(j, new a.InterfaceC0760a() { // from class: com.taobao.android.icart.recommend.impl.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.search.infoflow.a.InterfaceC0760a
            public void a(SearchChildRecyclerView searchChildRecyclerView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9dd555e", new Object[]{this, searchChildRecyclerView});
                    return;
                }
                jqg.b("CartSearchRecommend", "onRecyclerViewPrepared");
                a.a(a.this, searchChildRecyclerView);
                a.a(a.this).setNestedScrollChild(searchChildRecyclerView);
                searchChildRecyclerView.setNestedScrollParent(a.a(a.this));
                searchChildRecyclerView.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
                if (a.b(a.this) == null) {
                    return;
                }
                a.b(a.this).a(searchChildRecyclerView);
            }

            @Override // com.taobao.search.infoflow.a.InterfaceC0760a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (a.c(a.this) == null) {
                    jqg.a("CartSearchRecommend", "初始化失败");
                } else {
                    a.a(a.this).post(new Runnable() { // from class: com.taobao.android.icart.recommend.impl.a.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (a.a(a.this).isEndViewExists(a.c(a.this))) {
                            } else {
                                a.a(a.this, a.a(a.this).getRecyclerViewPaddingBottom());
                                a.a(a.this).addEndView(a.c(a.this));
                            }
                        }
                    });
                    jqg.b("CartSearchRecommend", "初始化成功");
                }
            }

            @Override // com.taobao.search.infoflow.a.InterfaceC0760a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    jqg.a("CartSearchRecommend", "初始化失败：", str);
                }
            }
        });
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams.height == this.h && i == ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) {
            jqg.b("CartSearchRecommend", "前后高度一致，不用重新刷新");
            return;
        }
        RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, this.h);
        layoutParams2.bottomMargin = i;
        this.d.setLayoutParams(layoutParams2);
    }

    private JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Exception e) {
            bed.a("CartSearchRecommend#GeneratorParamsError", e.getMessage());
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject b = c.b(this.b);
        if (b != null) {
            jSONObject.putAll(b);
        }
        Activity m = this.b.m();
        Map<String, String> a2 = AddCartUtil.a(m, "addBagExParamForSKU", "sku", AddCartUtil.SEARCH_FLOW_MODULE, (String) null);
        Map<String, String> a3 = AddCartUtil.a(m, "addBagExParamForDetail", "detail", AddCartUtil.SEARCH_FLOW_MODULE, (String) null);
        jSONObject.putAll(a2);
        jSONObject.putAll(a3);
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(jnq<RecyclerView> jnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb9180b", new Object[]{this, jnqVar});
            return;
        }
        jqg.b("CartSearchRecommend", "getRecommendContainer");
        this.f = jnqVar;
        jnqVar.a(this.e);
    }

    @Override // com.taobao.android.icart.recommend.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.search.infoflow.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // com.taobao.android.icart.recommend.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (this.c == null) {
                return;
            }
            if (System.currentTimeMillis() - this.g < 100) {
                return;
            }
            JSONObject j = j();
            jqg.b("CartSearchRecommend", "requestData#params", j);
            this.c.a(j, true);
        } finally {
            this.g = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        JSONObject i = bem.i(this.b.n());
        if (i != null) {
            return i.getBooleanValue("needRefreshForUpdate");
        }
        return false;
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (QueryParamsManager.CartFeedFlowType.search.equals(this.b.v().w())) {
            return c.a(this.b);
        }
        return false;
    }

    @Override // com.taobao.android.icart.recommend.b
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        View view = this.d;
        return view != null && this.f12849a.hasEndView(view);
    }
}
