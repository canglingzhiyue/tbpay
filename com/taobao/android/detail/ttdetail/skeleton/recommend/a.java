package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.x;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.request.params.RecommendRequestParams;
import com.taobao.android.detail.ttdetail.skeleton.recommend.e;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.ag;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.eyy;
import tb.kge;
import tb.oiz;
import tb.tae;

/* loaded from: classes5.dex */
public class a extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context b;
    private FrameLayout c;
    private RecyclerView d;
    private e f;
    private volatile boolean g;
    private boolean h;
    private ImageView i;
    private View j;
    private TTDetailErrorView k;
    private boolean l;
    private JSONObject m;
    private int n;

    static {
        kge.a(-1784827344);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ View a(a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fac80d7a", new Object[]{aVar, view});
        }
        aVar.j = view;
        return view;
    }

    public static /* synthetic */ e a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("187f8e48", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ TTDetailErrorView a(a aVar, TTDetailErrorView tTDetailErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailErrorView) ipChange.ipc$dispatch("80e56a1c", new Object[]{aVar, tTDetailErrorView});
        }
        aVar.k = tTDetailErrorView;
        return tTDetailErrorView;
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f192ad6", new Object[]{aVar, jSONObject});
        } else {
            aVar.b(jSONObject);
        }
    }

    public static /* synthetic */ void a(a aVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cf889f", new Object[]{aVar, mtopResponse});
        } else {
            aVar.a(mtopResponse);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da74babe", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.g = z;
        return z;
    }

    public static /* synthetic */ JSONObject b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4c235a19", new Object[]{aVar}) : aVar.m;
    }

    public static /* synthetic */ void b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce043efb", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    public static /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6115429c", new Object[]{aVar})).booleanValue() : aVar.l;
    }

    public static /* synthetic */ ImageView d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("3e33e939", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ View e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("94983098", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ FrameLayout f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("805d3644", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ int g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b20f0107", new Object[]{aVar})).intValue() : aVar.n;
    }

    public static /* synthetic */ TTDetailErrorView h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TTDetailErrorView) ipChange.ipc$dispatch("4d25a19c", new Object[]{aVar}) : aVar.k;
    }

    public static /* synthetic */ void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8be052", new Object[]{aVar});
        } else {
            aVar.d();
        }
    }

    public static /* synthetic */ int j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eca4fe4", new Object[]{aVar})).intValue();
        }
        int i = aVar.n;
        aVar.n = i + 1;
        return i;
    }

    public a(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.m = new JSONObject();
        this.b = context;
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
        a(d);
        c();
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("payload");
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("tppParams")) != null) {
            this.m.putAll(jSONObject2);
        }
        this.m.put("itemId", this.mDetailContext.e().a("requestItemId"));
        this.m.put("sellerId", (Object) com.taobao.android.detail.ttdetail.utils.d.a((Seller) this.mDetailContext.a().a(Seller.class), ""));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = (FrameLayout) LayoutInflater.from(this.b).inflate(R.layout.tt_detail_recommend_container, (ViewGroup) null);
        this.d = (RecyclerView) this.c.findViewById(R.id.rv_recommend_container);
        this.f = new e(this.b, this.mDetailContext);
        this.d.setAdapter(this.f);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.b, 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue() : a.a(a.this).getItemViewType(i) != 2 ? 2 : 1;
            }
        });
        this.d.setLayoutManager(gridLayoutManager);
        this.d.addItemDecoration(new e.a(com.taobao.android.detail.ttdetail.utils.f.a(8.0f)));
        this.d.setOverScrollMode(2);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setFocusable(false);
        this.d.setDescendantFocusability(393216);
        this.f.a(new b() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.android.detail.ttdetail.skeleton.recommend.b
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                } else {
                    a.a(a.this, jSONObject);
                }
            }
        });
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.h) {
        } else {
            d();
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
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.d;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        i.a("NewTTDetailRecommendComponent", "recommend start request");
        if (this.m.isEmpty()) {
            return;
        }
        if (this.i == null) {
            this.i = (ImageView) this.c.findViewById(R.id.iv_recommend_skeleton);
            this.i.setImageDrawable(new com.taobao.android.detail.ttdetail.widget.f());
        }
        b((JSONObject) null);
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        final IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.NewTTDetailRecommendComponent$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                i.a("NewTTDetailRecommendComponent", "RecommendCallback onSuccess");
                a.a(a.this, mtopResponse);
                a.a(a.this, true);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                i.a("NewTTDetailRecommendComponent", "RecommendCallback onError");
                a.b(a.this, false);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                i.a("NewTTDetailRecommendComponent", "RecommendCallback onSystemError");
                a.b(a.this, false);
            }
        };
        if (jSONObject != null) {
            this.l = true;
            this.m.putAll(jSONObject);
        }
        this.h = true;
        tae.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                new oiz(new RecommendRequestParams(a.b(a.this))).a(tae.b()).a(iRemoteBaseListener).k();
                i.a("NewTTDetailRecommendComponent", "isPagingRequest=" + a.c(a.this));
            }
        });
    }

    private void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
            i.a("NewTTDetailRecommendComponent", "mtopResponse is null");
            a(false);
        } else if (ag.a(mtopResponse)) {
            i.a("NewTTDetailRecommendComponent", "防刷限流回调失败处理");
            a(false);
        } else {
            JSONObject parseObject = JSONObject.parseObject(new String(mtopResponse.getBytedata()));
            if (parseObject == null || parseObject.isEmpty()) {
                i.a("NewTTDetailRecommendComponent", "mtopData is null");
                a(false);
                return;
            }
            JSONObject jSONObject = parseObject.getJSONObject("data");
            if (jSONObject == null || jSONObject.isEmpty()) {
                i.a("NewTTDetailRecommendComponent", "rawData is null");
                a(false);
                return;
            }
            final f fVar = new f(this.b, this.mDetailContext, jSONObject);
            final List<com.taobao.android.detail.ttdetail.component.module.e> a2 = fVar.a();
            if (a2.isEmpty()) {
                i.a("NewTTDetailRecommendComponent", "recommendComponents is null");
                a(true);
                return;
            }
            this.mDetailContext.b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a.d(a.this).setVisibility(8);
                    if (a.e(a.this) != null) {
                        a.e(a.this).setVisibility(8);
                    }
                    int itemCount = a.a(a.this).getItemCount();
                    a.a(a.this).a(fVar);
                    a.a(a.this).a(false);
                    if (!a.c(a.this)) {
                        a.a(a.this).a(a2);
                        a.a(a.this).notifyDataSetChanged();
                        return;
                    }
                    a.a(a.this).a();
                    int i = itemCount - 1;
                    a.a(a.this).notifyItemRemoved(i);
                    a.a(a.this).a(a2);
                    a.a(a.this).notifyItemRangeInserted(i, fVar.a().size() + 1);
                }
            });
        }
    }

    private void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mDetailContext.b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.c(a.this)) {
                    a.a(a.this).a(true);
                    a.a(a.this).notifyItemChanged(a.a(a.this).getItemCount() - 1);
                } else {
                    ViewStub viewStub = (ViewStub) a.f(a.this).findViewById(R.id.vs_recommend_error_view_container);
                    if (viewStub != null) {
                        a.a(a.this, viewStub.inflate());
                    } else {
                        a aVar = a.this;
                        a.a(aVar, a.f(aVar).findViewById(R.id.recommend_error_view_container));
                    }
                    a aVar2 = a.this;
                    a.a(aVar2, (TTDetailErrorView) a.e(aVar2).findViewById(R.id.recommend_error_view));
                    a.h(a.this).setOnReloadButtonClickListener(new TTDetailErrorView.a() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.a.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass5.this = this;
                        }

                        @Override // com.taobao.android.detail.ttdetail.widget.desc.TTDetailErrorView.a
                        public void a(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("9501e36a", new Object[]{this, view});
                            } else if (a.g(a.this) >= 4) {
                                a.h(a.this).loadEmpty();
                            } else {
                                a.i(a.this);
                                a.d(a.this).setVisibility(0);
                                a.e(a.this).setVisibility(8);
                                a.j(a.this);
                            }
                        }
                    });
                    if (z) {
                        a.h(a.this).loadEmpty();
                    }
                    a.d(a.this).setVisibility(8);
                    a.e(a.this).setVisibility(0);
                }
            }
        });
        ae.a(z ? -300020 : -300019, z ? "推荐请求数据为空" : "推荐请求回调失败");
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.x, com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f.getItemCount() <= 0) {
        } else {
            if (i == Integer.MAX_VALUE) {
                this.d.scrollToPosition(this.f.getItemCount() - 1);
            } else {
                this.d.scrollToPosition(i);
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
        } else {
            this.f10569a = false;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        this.f10569a = true;
        if (this.h) {
            return;
        }
        a();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        e eVar = this.f;
        if (eVar == null) {
            return;
        }
        com.taobao.android.detail.ttdetail.utils.a.a(-1, eVar.b());
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : this.c;
    }
}
