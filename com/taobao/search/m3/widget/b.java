package com.taobao.search.m3.widget;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.animation.ScaleAnimation;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.android.task.Coordinator;
import com.taobao.search.common.util.u;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.e;
import com.taobao.search.m3.h;
import com.taobao.search.m3.icons.g;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.refactor.j;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.hwe;
import tb.iny;
import tb.ioc;
import tb.iru;
import tb.irw;
import tb.isr;
import tb.itd;
import tb.ium;
import tb.kge;
import tb.noa;
import tb.nog;
import tb.nou;
import tb.ntn;
import tb.nwh;
import tb.nwj;
import tb.pop;

/* loaded from: classes7.dex */
public class b extends itd<M3CellBean, iru<com.taobao.search.sf.datasource.c>> implements com.taobao.search.m3.feedback.b, h, g, com.taobao.search.m3.interactive.d, com.taobao.search.m3.more.b, com.taobao.search.m3.shoinfo.a, com.taobao.search.m3.singlerow.a, com.taobao.search.m3.video.a, IRealTimeTagContainer, irw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private itd<?, ?> f19147a;
    private M3CellBean e;
    private C0769b f;
    private boolean g;
    private final Observer h;
    private long i;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.taobao.search.m3.interactive.b b;
        public final /* synthetic */ com.taobao.search.m3.widget.a c;
        public final /* synthetic */ M3CellBean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public a(com.taobao.search.m3.widget.a aVar, M3CellBean m3CellBean, com.taobao.search.m3.interactive.b bVar, int i, String str) {
            this.c = aVar;
            this.d = m3CellBean;
            this.b = bVar;
            this.e = i;
            this.f = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "spm", this.c.d());
            jSONObject2.put((JSONObject) "itemId", this.d.itemId);
            iru<com.taobao.search.sf.datasource.c> model = b.this.j();
            q.a((Object) model, "model");
            com.taobao.search.sf.datasource.c d = model.d();
            q.a((Object) d, "model.scopeDatasource");
            jSONObject2.put((JSONObject) "q", d.getKeyword());
            jSONObject2.put((JSONObject) aw.PARAM_SEARCH_KEYWORD_RN, this.d.rn);
            String a2 = b.a(b.this, this.b);
            if (this.b.c()) {
                jSONObject2.put((JSONObject) "from", "hanging_query");
                jSONObject2.put((JSONObject) "tags", a2);
                jSONObject2.put((JSONObject) "subtype", "text");
            } else {
                jSONObject2.put((JSONObject) "ic_exp", a2);
                jSONObject2.put((JSONObject) "index", String.valueOf(this.e));
            }
            HashMap hashMap = new HashMap();
            hashMap.put("utLogMap", r.c(jSONObject.toJSONString()));
            com.taobao.search.mmd.util.e.b(this.f, "Search-TagExposure", hashMap);
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements isr.c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.isr.c.a
        public void a(Object obj) {
            com.taobao.search.m3.feedback.a feedback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            M3CellBean a2 = b.a(b.this);
            if (a2 == null || (feedback = a2.getFeedback()) == null || feedback.b()) {
                return;
            }
            View view = b.this.itemView;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            }
            ((com.taobao.search.m3.widget.c) view).hideFeedback();
        }
    }

    /* loaded from: classes7.dex */
    public static final class d implements Observer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            JSONObject jSONObject;
            com.taobao.search.m3.feedback.a feedback;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                return;
            }
            M3CellBean a2 = b.a(b.this);
            if (a2 == null) {
                return;
            }
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("data")) == null || (feedback = a2.getFeedback()) == null || (string = jSONObject.getString(a2.itemId)) == null) {
                return;
            }
            JSONArray jSONArray = feedback.a().getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS);
            if (jSONArray != null) {
                int size = jSONArray.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("param");
                    if (q.a((Object) (jSONObject4 != null ? jSONObject4.getString("feedbackType") : null), (Object) string)) {
                        b.this.a(jSONObject4, jSONObject3.getJSONObject("coverInfo"), false);
                        break;
                    }
                    i++;
                }
            }
            ntn ntnVar = ntn.INSTANCE;
            String str = a2.itemId;
            q.a((Object) str, "bean.itemId");
            ntnVar.a("PltNegFeedbackOption", str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.b(b.this);
            }
        }
    }

    static {
        kge.a(-447077997);
        kge.a(670228462);
        kge.a(-3581845);
        kge.a(1332369051);
        kge.a(-1225658221);
        kge.a(1374971555);
        kge.a(-80254685);
        kge.a(-140706700);
        kge.a(1609693765);
        kge.a(-633337495);
        kge.a(-352696133);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 61439048:
                super.A();
                return null;
            case 106691577:
                super.r();
                return null;
            case 107615098:
                super.s();
                return null;
            case 108538619:
                super.t();
                return null;
            case 113156224:
                super.y();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "m3";
    }

    public void a(int i, M3CellBean bean, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce0d763", new Object[]{this, new Integer(i), bean, tbSearchStyle});
        } else {
            q.c(bean, "bean");
        }
    }

    public boolean c(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1e057ce", new Object[]{this, bean})).booleanValue();
        }
        q.c(bean, "bean");
        return false;
    }

    public String d(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ba33f57", new Object[]{this, bean});
        }
        q.c(bean, "bean");
        return null;
    }

    @Override // tb.irw
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean g(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("472aca4a", new Object[]{this, bean})).booleanValue();
        }
        q.c(bean, "bean");
        return false;
    }

    public static final /* synthetic */ M3CellBean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M3CellBean) ipChange.ipc$dispatch("863174d1", new Object[]{bVar}) : bVar.e;
    }

    public static final /* synthetic */ String a(b bVar, com.taobao.search.m3.interactive.b bVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("356ef344", new Object[]{bVar, bVar2}) : bVar.b(bVar2);
    }

    public static final /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd82e20c", new Object[]{bVar});
        } else {
            bVar.L();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View itemView, Activity activity, ium parent, ListStyle style, int i, iru<com.taobao.search.sf.datasource.c> iruVar) {
        super(itemView, activity, parent, style, i, iruVar);
        q.c(itemView, "itemView");
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
        this.h = new d();
        this.f = new C0769b(itemView);
        itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.taobao.search.m3.widget.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                b.this.E();
                return true;
            }
        });
        itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.m3.widget.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    b.this.db_();
                }
            }
        });
    }

    /* renamed from: com.taobao.search.m3.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0769b implements com.taobao.search.m3.more.pk.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public C0769b(View view) {
            this.b = view;
        }

        @Override // com.taobao.search.m3.more.pk.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            M3CellBean a2 = b.a(b.this);
            if (a2 == null) {
                return;
            }
            View view = this.b;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            }
            com.taobao.search.m3.widget.c cVar = (com.taobao.search.m3.widget.c) view;
            boolean a3 = b.this.a(a2);
            b bVar = b.this;
            cVar.addMoreButton(true, a3, a2, bVar, bVar.e(a2));
        }

        @Override // com.taobao.search.m3.more.pk.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            M3CellBean a2 = b.a(b.this);
            if (a2 == null) {
                return;
            }
            View view = this.b;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            }
            com.taobao.search.m3.widget.c cVar = (com.taobao.search.m3.widget.c) view;
            boolean a3 = b.this.a(a2);
            b bVar = b.this;
            cVar.addMoreButton(false, a3, a2, bVar, bVar.e(a2));
        }
    }

    @Override // tb.itd
    public void a(int i, M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5ae9b9", new Object[]{this, new Integer(i), bean});
            return;
        }
        q.c(bean, "bean");
        if (i == 0) {
            K();
            this.itemView.post(new e());
        }
        Activity activity = getActivity();
        if (!(activity instanceof com.taobao.search.m3.more.pk.b)) {
            activity = null;
        }
        com.taobao.search.m3.more.pk.b bVar = (com.taobao.search.m3.more.pk.b) activity;
        if (bVar != null) {
            bVar.a(this.f);
        }
        if (!q.a(this.e, bean)) {
            TbSearchStyle f = f(bean);
            F();
            this.e = bean;
            com.taobao.search.m3.shoinfo.b shopInfo = bean.getShopInfo();
            if (shopInfo != null && shopInfo.d() && f != null && f.isTb2024) {
                com.taobao.search.m3.shoinfo.b shopInfo2 = bean.getShopInfo();
                if (shopInfo2 == null) {
                    q.a();
                }
                shopInfo2.a(false);
            }
            a(i, bean, f);
        }
        c(i, bean);
        e.a aVar = com.taobao.search.m3.e.Companion;
        Activity activity2 = getActivity();
        q.a((Object) activity2, "activity");
        String str = bean.itemId;
        q.a((Object) str, "bean.itemId");
        aVar.a(activity2, str, this);
    }

    private final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = d2.getFirstRequestPerf();
        if (firstRequestPerf == null || firstRequestPerf.r || firstRequestPerf.t != 0) {
            return;
        }
        firstRequestPerf.t = System.currentTimeMillis();
    }

    private final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        com.taobao.android.searchbaseframe.track.d firstRequestPerf = d2.getFirstRequestPerf();
        if (firstRequestPerf == null || firstRequestPerf.r || firstRequestPerf.s == 0 || firstRequestPerf.u != 0) {
            return;
        }
        firstRequestPerf.u = System.currentTimeMillis();
        firstRequestPerf.r = true;
        hwe.a(firstRequestPerf);
    }

    private final TbSearchStyle f(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbSearchStyle) ipChange.ipc$dispatch("6de39c79", new Object[]{this, m3CellBean});
        }
        Activity activity = getActivity();
        if (!(activity instanceof pop)) {
            activity = null;
        }
        pop popVar = (pop) activity;
        if (popVar != null && popVar.dR_()) {
            return com.taobao.search.searchdoor.sf.config.a.INSTANCE.b();
        }
        return null;
    }

    private final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        e.a aVar = com.taobao.search.m3.e.Companion;
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        String str = m3CellBean.itemId;
        q.a((Object) str, "it.itemId");
        aVar.a(activity, str);
    }

    public final boolean a(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff3b1e90", new Object[]{this, bean})).booleanValue();
        }
        q.c(bean, "bean");
        if (bean.getJiaGouSupport() != null) {
            Boolean jiaGouSupport = bean.getJiaGouSupport();
            if (jiaGouSupport == null) {
                q.a();
            }
            return jiaGouSupport.booleanValue();
        }
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        return d2.J();
    }

    public void db_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567a4fa8", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        if (!m3CellBean.isClicked()) {
            m3CellBean.setClicked(true);
            View view = this.itemView;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            }
            ((com.taobao.search.m3.widget.c) view).updateTitle(m3CellBean, f(m3CellBean));
        }
        G();
        com.taobao.search.m3.widget.a aVar = new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean));
        View view2 = this.itemView;
        if (view2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        }
        aVar.a((com.taobao.search.m3.widget.c) view2);
    }

    private final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        M3CellBean l = l();
        if (l == null || l.getDiscountInfo() == null) {
            return;
        }
        com.taobao.search.m3.discount.a discountInfo = l.getDiscountInfo();
        if (discountInfo == null) {
            q.a();
        }
        if (discountInfo.f() == null) {
            return;
        }
        e.a aVar = com.taobao.search.m3.e.Companion;
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        aVar.a(activity, this);
    }

    public String b(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fa94d5", new Object[]{this, bean});
        }
        q.c(bean, "bean");
        return bean.getPicPath();
    }

    public final void a(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82965c8", new Object[]{this, bean, new Boolean(z)});
            return;
        }
        q.c(bean, "bean");
        View view = this.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        }
        ((com.taobao.search.m3.widget.c) view).addMoreButton(dc_(), a(bean), bean, this, z);
    }

    public final boolean dc_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("582f284b", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (!(activity instanceof com.taobao.search.m3.more.pk.b)) {
            activity = null;
        }
        com.taobao.search.m3.more.pk.b bVar = (com.taobao.search.m3.more.pk.b) activity;
        return bVar != null && bVar.l();
    }

    public final void c(int i, M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5cd83b", new Object[]{this, new Integer(i), bean});
            return;
        }
        q.c(bean, "bean");
        a(this, false, 1, null);
        clearTag();
        DynamicCardBean dynamicCardBean = bean.getDynamicCardBean();
        if (dynamicCardBean == null) {
            return;
        }
        itd<?, ?> a2 = com.taobao.search.sf.realtimetag.c.a(this, getActivity(), dynamicCardBean, i, bean.getOriginData());
        if (dynamicCardBean.firstRender) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
            scaleAnimation.setDuration(300L);
            a2.itemView.startAnimation(scaleAnimation);
            dynamicCardBean.firstRender = false;
        }
        View view = this.itemView;
        if (!(view instanceof com.taobao.search.m3.widget.c)) {
            view = null;
        }
        com.taobao.search.m3.widget.c cVar = (com.taobao.search.m3.widget.c) view;
        if (cVar != null) {
            View view2 = a2.itemView;
            q.a((Object) view2, "dynamicCard.itemView");
            cVar.addDynamicCard(view2, false);
        }
        this.f19147a = a2;
    }

    public static /* synthetic */ void a(b bVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18736df8", new Object[]{bVar, new Boolean(z), new Integer(i), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recycleDynamicHolder");
        } else {
            if ((i & 1) != 0) {
                z = true;
            }
            bVar.b(z);
        }
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            itd<?, ?> itdVar = this.f19147a;
            if (itdVar != null) {
                itdVar.destroyAndRemoveFromParent();
            }
        } else {
            itd<?, ?> itdVar2 = this.f19147a;
            if (itdVar2 != null) {
                itdVar2.x();
            }
        }
        this.f19147a = null;
    }

    @Override // tb.itd
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        super.r();
        com.taobao.search.m3.more.pk.b bVar = null;
        this.e = null;
        a(this, false, 1, null);
        F();
        Activity activity = getActivity();
        if (activity instanceof com.taobao.search.m3.more.pk.b) {
            bVar = activity;
        }
        com.taobao.search.m3.more.pk.b bVar2 = bVar;
        if (bVar2 == null) {
            return;
        }
        bVar2.b(this.f);
    }

    @Override // tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean)).b();
        this.i = System.currentTimeMillis();
        AuctionBaseBean auctionBean = m3CellBean.getAuctionBean();
        int m = m();
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        com.taobao.search.jarvis.c.a(auctionBean, m, model.d(), this.itemView);
        if ((getParent() instanceof com.taobao.android.searchbaseframe.datasource.b) && l() != null) {
            ium parent = getParent();
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.datasource.CellExposeListener");
            }
            iru<com.taobao.search.sf.datasource.c> model2 = j();
            q.a((Object) model2, "model");
            com.taobao.search.sf.datasource.c d2 = model2.d();
            q.a((Object) d2, "model.scopeDatasource");
            iru<com.taobao.search.sf.datasource.c> model3 = j();
            q.a((Object) model3, "model");
            ((com.taobao.android.searchbaseframe.datasource.b) parent).a(m(), l(), (BaseSearchResult) d2.getTotalSearchResult(), model3.d());
        }
        com.taobao.android.meta.data.a aVar = m3CellBean.combo;
        if (!(aVar instanceof com.taobao.search.refactor.e)) {
            aVar = null;
        }
        com.taobao.search.refactor.e eVar = (com.taobao.search.refactor.e) aVar;
        if (eVar == null) {
            return;
        }
        eVar.a(m3CellBean.itemId, m());
    }

    @Override // tb.itd
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        com.taobao.search.jarvis.c.a(m3CellBean.getAuctionBean(), this.itemView);
        if (!(getParent() instanceof com.taobao.android.searchbaseframe.datasource.b) || l() == null) {
            return;
        }
        ium parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.datasource.CellExposeListener");
        }
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        iru<com.taobao.search.sf.datasource.c> model2 = j();
        q.a((Object) model2, "model");
        ((com.taobao.android.searchbaseframe.datasource.b) parent).a(m(), l(), System.currentTimeMillis() - this.i, (BaseSearchResult) d2.getTotalSearchResult(), model2.d());
    }

    @Override // tb.itd
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        super.A();
        I();
    }

    private final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (!this.g) {
        } else {
            ntn.INSTANCE.b("PltNegFeedbackOption", this.h);
            this.g = false;
        }
    }

    @Override // tb.itd
    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        super.y();
        c();
        b(false);
        Activity activity = getActivity();
        if (!(activity instanceof com.taobao.search.m3.more.pk.b)) {
            activity = null;
        }
        com.taobao.search.m3.more.pk.b bVar = (com.taobao.search.m3.more.pk.b) activity;
        if (bVar != null) {
            bVar.b(this.f);
        }
        I();
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    @Override // com.taobao.search.m3.interactive.d
    public void a(com.taobao.search.m3.interactive.c tag, com.taobao.search.m3.interactive.b interactiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b0c525", new Object[]{this, tag, interactiveInfo});
            return;
        }
        q.c(tag, "tag");
        q.c(interactiveInfo, "interactiveInfo");
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "q", tag.d());
        jSONObject2.put((JSONObject) "showKeyword", tag.d());
        JSONObject k = tag.k();
        if (k == null) {
            k = null;
        } else if (tag.i() != null) {
            k.put((JSONObject) tag.i(), tag.j());
        }
        jSONObject2.put((JSONObject) "params", (String) k);
        com.taobao.search.m3.widget.a aVar = new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean));
        Map<String, String> e2 = aVar.e();
        Map<String, String> f = aVar.f();
        if (!StringUtils.isEmpty(tag.j())) {
            if (interactiveInfo.c()) {
                try {
                    String j = tag.j();
                    if (j == null) {
                        q.a();
                    }
                    for (String str : n.b((CharSequence) j, new String[]{";"}, false, 0, 6, (Object) null)) {
                        List b = n.b((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
                        f.put(b.get(0), b.get(1));
                    }
                } catch (Exception unused) {
                }
            } else {
                f.put(b(interactiveInfo), tag.j());
            }
        }
        e2.put("utLogMap", r.c(JSON.toJSONString(f)));
        l lVar = l.getInstance();
        q.a((Object) lVar, "UTPageHitHelper.getInstance()");
        String currentPageName = lVar.getCurrentPageName();
        StringBuilder sb = new StringBuilder();
        l lVar2 = l.getInstance();
        q.a((Object) lVar2, "UTPageHitHelper.getInstance()");
        sb.append(lVar2.getCurrentPageName());
        sb.append("_jhtag");
        com.taobao.search.mmd.util.e.a(currentPageName, sb.toString(), 2101, e2);
        if (interactiveInfo.c()) {
            Nav.from(getActivity()).toUri("https://s.m.taobao.com/h5?q=" + tag.d() + "&from=hanging_query");
            return;
        }
        postEvent(isr.c.a("tagSearch", jSONObject, null, null));
    }

    private final String b(com.taobao.search.m3.interactive.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("473e0688", new Object[]{this, bVar});
        }
        List<com.taobao.search.m3.interactive.c> a2 = bVar.a();
        StringBuilder sb = new StringBuilder();
        for (com.taobao.search.m3.interactive.c cVar : a2) {
            if (!StringUtils.isEmpty(cVar.j())) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(cVar.j());
            }
        }
        String sb2 = sb.toString();
        q.a((Object) sb2, "builder.toString()");
        q.a((Object) sb2, "interactiveInfo.tagList.…lder.toString()\n        }");
        return sb2;
    }

    @Override // com.taobao.search.m3.interactive.d
    public void a(com.taobao.search.m3.interactive.b tag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d31617", new Object[]{this, tag});
            return;
        }
        q.c(tag, "tag");
        l lVar = l.getInstance();
        q.a((Object) lVar, "UTPageHitHelper.getInstance()");
        String currentPageName = lVar.getCurrentPageName();
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        Coordinator.execute(new a(new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean)), m3CellBean, tag, m(), currentPageName));
    }

    @Override // com.taobao.search.m3.shoinfo.a
    public void a(com.taobao.search.m3.shoinfo.b info) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f003c651", new Object[]{this, info});
            return;
        }
        q.c(info, "info");
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        if (StringUtils.isEmpty(info.a())) {
            a2 = "https://shop.m.taobao.com/shop/shop_index.htm";
        } else {
            a2 = info.a();
            if (a2 == null) {
                q.a();
            }
        }
        if (n.a((CharSequence) a2, "m.duanqu.com", 0, false, 6, (Object) null) >= 0) {
            Nav.from(getActivity()).toUri(a2);
            return;
        }
        com.taobao.search.m3.widget.a aVar = new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean));
        Uri.Builder appendQueryParameter = Uri.parse(a2).buildUpon().appendQueryParameter("from", "search").appendQueryParameter("list_type", "search");
        StringBuilder sb = new StringBuilder();
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        com.taobao.search.sf.datasource.c d2 = model.d();
        q.a((Object) d2, "model.scopeDatasource");
        sb.append(d2.getKeyword());
        sb.append('_');
        sb.append(m3CellBean.abtest);
        sb.append('_');
        sb.append(m3CellBean.rn);
        Uri.Builder uri = appendQueryParameter.appendQueryParameter("list_param", sb.toString()).appendQueryParameter("spm", aVar.d());
        String str = m3CellBean.getAuctionBean().userId;
        if (str != null) {
            uri.appendQueryParameter("userId", str);
        }
        aVar.c();
        if (m3CellBean.isP4p || m3CellBean.getX_qzt_ad() > 0) {
            q.a((Object) uri, "uri");
            aVar.a(m3CellBean, uri);
        }
        Nav.from(getActivity()).toUri(uri.build());
    }

    @Override // com.taobao.search.m3.singlerow.a
    public void a(com.taobao.search.m3.singlerow.c info) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d51fc6", new Object[]{this, info});
            return;
        }
        q.c(info, "info");
        Nav.from(getActivity()).toUri(info.a());
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public ListStyle getContainerListStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("1c77b9ec", new Object[]{this});
        }
        ListStyle listStyle = u();
        q.a((Object) listStyle, "listStyle");
        return listStyle;
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
            return;
        }
        View view = this.itemView;
        if (!(view instanceof com.taobao.search.m3.widget.c)) {
            view = null;
        }
        com.taobao.search.m3.widget.c cVar = (com.taobao.search.m3.widget.c) view;
        if (cVar == null) {
            return;
        }
        cVar.removeDynamicCard();
    }

    public boolean b(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b12a5d0d", new Object[]{this, bean, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        View view = this.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        }
        com.taobao.search.m3.widget.c cVar = (com.taobao.search.m3.widget.c) view;
        return cVar.updateInteractiveTag(bean, this, z) || cVar.updateComment(bean, z) || cVar.updateComposite(bean, z) || cVar.updateSingleRow(bean, this, z) || cVar.updateProperty(bean, z) || cVar.updateSummaryTips(bean, z);
    }

    @Override // com.taobao.search.m3.feedback.b
    public void a(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7727ef6c", new Object[]{this, jSONObject, jSONObject2, new Boolean(z)});
            return;
        }
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        com.taobao.search.m3.feedback.a feedback = m3CellBean.getFeedback();
        if (feedback == null) {
            q.a();
        }
        feedback.a(true);
        com.taobao.search.m3.feedback.a feedback2 = m3CellBean.getFeedback();
        if (feedback2 == null) {
            q.a();
        }
        feedback2.a(jSONObject2);
        if (u.p()) {
            com.taobao.android.meta.data.a aVar = m3CellBean.combo;
            if (aVar != null) {
                aVar.c(m3CellBean);
            }
            com.taobao.search.refactor.g dd_ = dd_();
            iru<com.taobao.search.sf.datasource.c> model = j();
            q.a((Object) model, "model");
            com.taobao.search.sf.datasource.c d2 = model.d();
            if (d2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
            }
            com.taobao.android.meta.structure.childpage.g d3 = dd_.d((com.taobao.search.refactor.g) ((j) d2));
            if (d3 != null) {
                d3.b(false);
            }
        } else {
            View view = this.itemView;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.BaseAuctionView");
            }
            ((BaseAuctionView) view).updateFeedback(m3CellBean, this, f(m3CellBean), g(m3CellBean));
        }
        this.itemView.performHapticFeedback(0);
        iru<com.taobao.search.sf.datasource.c> model2 = j();
        q.a((Object) model2, "model");
        nou nouVar = new nou(model2.b(), l(), dd_());
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        iru<com.taobao.search.sf.datasource.c> model3 = j();
        q.a((Object) model3, "model");
        com.taobao.search.sf.datasource.c d4 = model3.d();
        q.a((Object) d4, "model.scopeDatasource");
        jSONObject4.put((JSONObject) "query", d4.getKeyword());
        iru<com.taobao.search.sf.datasource.c> model4 = j();
        q.a((Object) model4, "model");
        com.taobao.search.sf.datasource.c d5 = model4.d();
        q.a((Object) d5, "model.scopeDatasource");
        CommonSearchResult it = (CommonSearchResult) d5.getTotalSearchResult();
        if (it != null) {
            q.a((Object) it, "it");
            jSONObject4.put((JSONObject) "firstRn", it.getMainInfo().rn);
        }
        jSONObject4.put((JSONObject) "index", (String) Integer.valueOf(m()));
        jSONObject4.put((JSONObject) "source", "find_similar_layer");
        jSONObject4.put((JSONObject) "title", m3CellBean.getTitle());
        jSONObject4.put((JSONObject) "tItemType", "");
        jSONObject4.put((JSONObject) "feedbackTime", (String) Long.valueOf(System.currentTimeMillis()));
        jSONObject4.put((JSONObject) "itemId", m3CellBean.itemId);
        jSONObject4.put((JSONObject) com.taobao.android.purchase.core.address.c.K_DELIVERY_ID, "");
        try {
            jSONObject3.put((JSONObject) "sellerId", Uri.parse(m3CellBean.getPltSimilarUrl()).getQueryParameter("seller_id"));
        } catch (Exception unused) {
        }
        com.taobao.search.m3.feedback.a feedback3 = m3CellBean.getFeedback();
        if (feedback3 == null) {
            q.a();
        }
        JSONObject jSONObject5 = feedback3.a().getJSONObject("commonParams");
        if (jSONObject5 != null) {
            jSONObject3.putAll(jSONObject5);
        }
        jSONObject4.put((JSONObject) aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(m()));
        jSONObject4.put((JSONObject) "page", String.valueOf(m3CellBean.pageNo));
        jSONObject4.put((JSONObject) aw.PARAM_SEARCH_KEYWORD_RN, m3CellBean.rn);
        if (jSONObject != null) {
            jSONObject3.putAll(jSONObject);
        }
        jSONObject4.put((JSONObject) nog.PRD_IS_P4P, String.valueOf(m3CellBean.isP4p));
        if (jSONObject2 != null) {
            jSONObject4.put((JSONObject) "coverInfo", (String) jSONObject2);
        }
        Activity activity = getActivity();
        nwh b = nouVar.b();
        iru<com.taobao.search.sf.datasource.c> model5 = j();
        q.a((Object) model5, "model");
        nwj.a(activity, b, jSONObject3, model5.f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        if (!z) {
            return;
        }
        new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean)).a(jSONObject != null ? jSONObject.getString("feedbackType") : null, jSONObject2);
    }

    public final com.taobao.search.refactor.g dd_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.refactor.g) ipChange.ipc$dispatch("805f16d1", new Object[]{this});
        }
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        Object b = model.e().b("controller");
        if (b == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSController");
        }
        return (com.taobao.search.refactor.g) b;
    }

    @Override // com.taobao.search.m3.feedback.b
    public void d_(String from) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdee8cc", new Object[]{this, from});
            return;
        }
        q.c(from, "from");
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null || StringUtils.isEmpty(m3CellBean.getPltSimilarUrl())) {
            return;
        }
        com.taobao.search.m3.widget.a aVar = new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean));
        int hashCode = from.hashCode();
        String str = "ItemLongPress";
        if (hashCode != -178026168) {
            if (hashCode == 116216604) {
                from.equals("zszxs");
            } else if (hashCode == 480522904 && from.equals("zszxs_more")) {
                str = "ItemMoreClick";
            }
        } else if (from.equals("zszxs_feedback")) {
            str = "FindSimilar";
        }
        aVar.a(str);
        iru<com.taobao.search.sf.datasource.c> model = j();
        q.a((Object) model, "model");
        String paramValueIncludingGlobal = model.d().getParamValueIncludingGlobal("channelSrp");
        String str2 = StringUtils.isEmpty(paramValueIncludingGlobal) ? from : from + '-' + paramValueIncludingGlobal;
        try {
            HashMap hashMap = new HashMap();
            Uri uri = Uri.parse(m3CellBean.getPltSimilarUrl());
            q.a((Object) uri, "uri");
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3 != null) {
                    hashMap.put(str3, uri.getQueryParameter(str3));
                }
            }
            hashMap.put("pssource", str2);
            hashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, from);
            Uri.Builder clearQuery = Uri.parse(m3CellBean.getPltSimilarUrl()).buildUpon().clearQuery();
            iru<com.taobao.search.sf.datasource.c> model2 = j();
            q.a((Object) model2, "model");
            com.taobao.search.sf.datasource.c d2 = model2.d();
            q.a((Object) d2, "model.scopeDatasource");
            CommonSearchResult result = (CommonSearchResult) d2.getTotalSearchResult();
            if (result != null) {
                q.a((Object) result, "result");
                Map<String, String> map = result.getMainInfo().pageTraceArgs;
                if (map != null) {
                    HashMap hashMap2 = hashMap;
                    String str4 = map.get("spm-cnt");
                    if (str4 == null) {
                        str4 = "";
                    }
                    hashMap2.put("spm", str4);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            Nav.from(getActivity()).toUri(clearQuery.build());
        } catch (Exception unused) {
        }
    }

    private final void dj_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642114a0", new Object[]{this});
            return;
        }
        this.itemView.performHapticFeedback(0);
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        int feedbackType = m3CellBean.getFeedbackType();
        if (feedbackType == 1 || feedbackType == 3) {
            H();
            View view = this.itemView;
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
            }
            ((com.taobao.search.m3.widget.c) view).updateFeedback(m3CellBean, this, f(m3CellBean), g(m3CellBean));
            J();
            return;
        }
        d_("zszxs_more");
    }

    private final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else {
            ioc.a(new c());
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean)).g();
        int feedbackType = m3CellBean.getFeedbackType();
        if (feedbackType == 3 || feedbackType == 4) {
            d_("zszxs");
            return;
        }
        H();
        View view = this.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        }
        ((com.taobao.search.m3.widget.c) view).updateFeedback(m3CellBean, this, f(m3CellBean), g(m3CellBean));
        J();
    }

    public final boolean e(M3CellBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8485910c", new Object[]{this, bean})).booleanValue();
        }
        q.c(bean, "bean");
        TbSearchStyle f = f(bean);
        return f != null && f.isTb2024;
    }

    private final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean)).k();
    }

    @Override // com.taobao.search.m3.more.b
    public void a(int i) {
        com.taobao.search.m3.more.pk.a pkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            M3CellBean m3CellBean = this.e;
            if (m3CellBean == null || (pkInfo = m3CellBean.getPkInfo()) == null) {
                return;
            }
            pkInfo.a(!pkInfo.c());
            View view = this.itemView;
            if (view != null) {
                ((com.taobao.search.m3.widget.c) view).addMoreButton(true, a(m3CellBean), m3CellBean, this, e(m3CellBean));
                Activity activity = getActivity();
                if (!(activity instanceof com.taobao.search.m3.more.pk.b)) {
                    activity = null;
                }
                com.taobao.search.m3.more.pk.b bVar = (com.taobao.search.m3.more.pk.b) activity;
                if (bVar == null) {
                    return;
                }
                bVar.a(m3CellBean, pkInfo.c());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            dj_();
        } else {
            M3CellBean m3CellBean2 = this.e;
            if (m3CellBean2 == null) {
                return;
            }
            com.taobao.search.m3.widget.a aVar = new com.taobao.search.m3.widget.a(m3CellBean2, this, m(), c(m3CellBean2), d(m3CellBean2), b(m3CellBean2));
            Map<String, String> a2 = aVar.a(true);
            a2.put("spm-cnt", aVar.d());
            l lVar = l.getInstance();
            q.a((Object) lVar, "UTPageHitHelper.getInstance()");
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(lVar.getCurrentPageName(), 2101, "/wxcart.list.add_to_cart", "", "", a2);
            UTAnalytics uTAnalytics = UTAnalytics.getInstance();
            q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
            uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
            new com.taobao.search.m3.widget.a(m3CellBean2, this, m(), c(m3CellBean2), d(m3CellBean2), b(m3CellBean2)).h();
        }
    }

    @Override // com.taobao.search.m3.h
    public void a(JSONObject extDetailParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, extDetailParams});
            return;
        }
        q.c(extDetailParams, "extDetailParams");
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        m3CellBean.setExtDetailParams(extDetailParams);
    }

    @Override // tb.irw
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View view = this.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        }
        ((com.taobao.search.m3.widget.c) view).play();
    }

    @Override // tb.irw
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.itemView;
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView");
        }
        ((com.taobao.search.m3.widget.c) view).stop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (tb.nnd.a(r1.d()) == false) goto L18;
     */
    @Override // tb.irw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.m3.widget.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            java.lang.String r2 = "596b2ef"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            com.taobao.search.m3.M3CellBean r0 = r5.e
            if (r0 != 0) goto L1e
            return r3
        L1e:
            android.view.View r1 = r5.itemView
            if (r1 == 0) goto L4e
            com.taobao.search.m3.widget.c r1 = (com.taobao.search.m3.widget.c) r1
            boolean r1 = r1.canPlay()
            if (r1 == 0) goto L46
            boolean r1 = r0.getVideoAutoPlay()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r5.j()
            tb.iru r1 = (tb.iru) r1
            java.lang.String r4 = "model"
            kotlin.jvm.internal.q.a(r1, r4)
            com.taobao.android.searchbaseframe.datasource.impl.a r1 = r1.d()
            boolean r1 = tb.nnd.a(r1)
            if (r1 != 0) goto L4c
        L46:
            boolean r0 = r0.getVideoForcePlay()
            if (r0 == 0) goto L4d
        L4c:
            return r2
        L4d:
            return r3
        L4e:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.taobao.search.m3.widget.IAuctionView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.widget.b.d():boolean");
    }

    @Override // com.taobao.search.m3.video.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            ium parent = getParent();
            if (!(parent instanceof iny)) {
                parent = null;
            }
            iny inyVar = (iny) parent;
            if (inyVar == null) {
                return;
            }
            inyVar.b((irw) this, m());
        }
    }

    @Override // com.taobao.search.m3.h
    public void a(String str, String code) {
        com.taobao.search.m3.discount.a discountInfo;
        Set<String> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, code});
            return;
        }
        q.c(code, "code");
        M3CellBean l = l();
        if (l == null || (discountInfo = l.getDiscountInfo()) == null || (f = discountInfo.f()) == null) {
            return;
        }
        List<String> b = n.b((CharSequence) code, new String[]{","}, false, 0, 6, (Object) null);
        if (b.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(f);
        for (String str2 : b) {
            hashSet.remove(str2);
        }
        if (hashSet.isEmpty()) {
            if (!StringUtils.isEmpty(discountInfo.g())) {
                str = discountInfo.g();
            }
            discountInfo.a(str);
        } else if (hashSet.size() < f.size()) {
            discountInfo.a(discountInfo.h());
        } else {
            discountInfo.a(discountInfo.d());
        }
        discountInfo.a(true);
        a(m(), l, f(l));
    }

    @Override // com.taobao.search.m3.icons.g
    public void a(List<com.taobao.search.m3.icons.c> displayed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, displayed});
            return;
        }
        q.c(displayed, "displayed");
        M3CellBean m3CellBean = this.e;
        if (m3CellBean == null) {
            return;
        }
        new com.taobao.search.m3.widget.a(m3CellBean, this, m(), c(m3CellBean), d(m3CellBean), b(m3CellBean)).a(displayed);
    }
}
