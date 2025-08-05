package com.alibaba.android.ultron.trade.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradePriceViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeRichTextViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor;
import com.alibaba.android.ultron.trade.event.k;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bih;
import tb.bme;
import tb.bmf;
import tb.bmj;
import tb.bmk;
import tb.bml;
import tb.bmp;
import tb.bmq;
import tb.bmr;
import tb.bms;
import tb.bmt;
import tb.bmx;
import tb.bmy;
import tb.bmz;
import tb.bna;
import tb.bnm;
import tb.bpb;
import tb.bzp;
import tb.fxa;
import tb.jnp;
import tb.jnv;
import tb.jny;
import tb.jod;
import tb.jof;
import tb.jog;
import tb.jpo;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DINAMIC_CONTEXT_KEY_PRESENTER = "dianmicContextKeyPresenter";

    /* renamed from: a  reason: collision with root package name */
    private String f2676a;
    private final String b;
    private jof d;
    private jog e;
    public Activity g;
    public com.alibaba.android.ultron.trade.presenter.a h;
    public BaseViewManager i;
    public bnm j;
    public bna k;

    static {
        kge.a(-1433326005);
        kge.a(1136485707);
        kge.a(1258018159);
    }

    public bpb.a L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bpb.a) ipChange.ipc$dispatch("d29fc2e2", new Object[]{this});
        }
        return null;
    }

    public k.a a(com.taobao.android.ultron.common.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k.a) ipChange.ipc$dispatch("a5040180", new Object[]{this, bVar});
        }
        return null;
    }

    public void a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a050eeb6", new Object[]{this, iDMComponent, str});
        }
    }

    public bnm q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnm) ipChange.ipc$dispatch("8a1d318d", new Object[]{this});
        }
        return null;
    }

    public b(Activity activity) {
        this(activity, null);
    }

    private b(Activity activity, Fragment fragment) {
        this.f2676a = "default";
        this.g = activity;
        this.b = s() + "_" + System.currentTimeMillis();
    }

    public void a(com.alibaba.android.ultron.trade.presenter.a aVar, BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551cd9e6", new Object[]{this, aVar, baseViewManager});
            return;
        }
        this.h = aVar;
        this.i = baseViewManager;
        this.j = q();
        if (this.j == null) {
            this.j = new bnm(this.g);
        }
        this.k = new bna(this);
        this.i.a(this.k);
        C();
        f();
        g();
        B();
        D();
    }

    public jog A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jog) ipChange.ipc$dispatch("18d1d5bc", new Object[]{this}) : this.e;
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        a(bme.BRIDGE_TAG, new bme(this));
        a(bmf.BRIDGE_TAG, new bmf(this));
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.i.a(TradePriceViewConstructor.VIEW_TAG, new TradePriceViewConstructor());
        this.i.a(TradeRichTextViewConstructor.VIEW_TAG, new TradeRichTextViewConstructor());
        this.i.a(TradeTextInputConstructor.VIEW_TAG, new TradeTextInputConstructor());
        this.i.a(bmp.DX_WIDGET_ID, new bmp.a());
        this.i.a(bmq.DX_WIDGET_ID, new bmq.a());
        this.i.a(bzp.DX_WIDGET_ID, new bzp.a());
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.i.a("gradient", new bmj());
        this.i.a("theme", new bml());
        this.i.a("platform", new bmk());
        this.i.a(fxa.a(bms.PARSER_TAG), new bms());
        this.i.a(fxa.a(bmr.PARSER_TAG), new bmr());
        this.i.a(fxa.a("theme"), new bmt());
    }

    public void g() {
        Map<String, Class<? extends bmy>> a2 = bmx.a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        try {
            for (Map.Entry<String, Class<? extends bmy>> entry : a2.entrySet()) {
                this.k.a(entry.getKey(), entry.getValue().newInstance());
            }
        } catch (Throwable unused) {
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            jnp.a().a(new bih());
        }
    }

    public boolean E() {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue();
        }
        jny w = this.h.w();
        return (w == null || (b = w.b()) == null || b.size() <= 0) ? false : true;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public Activity m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("3792a4b4", new Object[]{this}) : this.g;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public bna F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bna) ipChange.ipc$dispatch("3f466924", new Object[]{this}) : this.k;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public bnm G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnm) ipChange.ipc$dispatch("46f80ff7", new Object[]{this}) : this.j;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public com.alibaba.android.ultron.trade.presenter.a w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.trade.presenter.a) ipChange.ipc$dispatch("7b0d3f2", new Object[]{this}) : this.h;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.h.b(iDMComponent);
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public BaseViewManager y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseViewManager) ipChange.ipc$dispatch("30227b3a", new Object[]{this}) : this.i;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.c
    public jny H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jny) ipChange.ipc$dispatch("4ead59c2", new Object[]{this}) : this.h.w();
    }

    public bmz I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmz) ipChange.ipc$dispatch("565b5887", new Object[]{this}) : this.k.a();
    }

    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8385a", new Object[]{this, linearLayout, recyclerView, linearLayout2});
        } else {
            this.i.a(linearLayout, recyclerView, linearLayout2);
        }
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
        } else {
            this.i.a(str, eVar);
        }
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.k.a(i, i2, intent);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else {
            UnifyLog.b(this.f2676a);
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        BaseViewManager baseViewManager = this.i;
        if (baseViewManager == null) {
            return;
        }
        baseViewManager.l();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        bna bnaVar = this.k;
        if (bnaVar != null) {
            bnaVar.d();
        }
        BaseViewManager baseViewManager = this.i;
        if (baseViewManager != null) {
            baseViewManager.k();
        }
        Activity activity = this.g;
        if (activity == null) {
            return;
        }
        jpo.b(activity).a(this.g);
    }

    public void a(String str, com.alibaba.android.ultron.vfw.web.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b81c1d", new Object[]{this, str, aVar});
        } else {
            this.i.a(str, aVar);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.i.e(i);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f2676a = str;
        BaseViewManager baseViewManager = this.i;
        if (baseViewManager == null) {
            return;
        }
        baseViewManager.a(this.f2676a);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (A() != null) {
        } else {
            this.e = new C0096b(this.g, str);
        }
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        jof jofVar = this.d;
        if (jofVar == null) {
            return;
        }
        jofVar.a();
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        jog A = A();
        if (A == null) {
            A = this.e;
        }
        if (A == null) {
            return;
        }
        A.a();
    }

    public jny O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jny) ipChange.ipc$dispatch("8488df5b", new Object[]{this});
        }
        com.alibaba.android.ultron.trade.presenter.a aVar = this.h;
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public void a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbcbb03", new Object[]{this, jnyVar});
        } else {
            this.i.a(this.h.x());
        }
    }

    /* loaded from: classes2.dex */
    public class a extends jnv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public jnv f2677a;

        static {
            kge.a(-244218914);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 40303496) {
                super.a((JSONObject) objArr[0]);
                return null;
            } else if (hashCode != 525103232) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.a(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]));
            }
        }

        public a(jnv jnvVar) {
            this.f2677a = jnvVar;
        }

        @Override // tb.joc
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
            } else {
                this.f2677a.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
            }
        }

        @Override // tb.joc
        public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
            } else {
                this.f2677a.a(i, mtopResponse, obj, jnyVar, (Map<String, ? extends Object>) map);
            }
        }

        @Override // tb.jnv
        public boolean a(String str, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{this, str, list})).booleanValue() : this.f2677a.a(str, list);
        }

        @Override // tb.jnv
        public void a(List<JSONObject> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (list == null) {
            } else {
                b.this.h.a(list);
                jny O = b.this.O();
                if (O != null) {
                    String h = O.h();
                    jqg.b(h, "异步数据刷新，个数=" + list.size());
                }
                b.this.a(O);
            }
        }

        @Override // tb.jnv
        public boolean a(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1f4c7080", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue();
            }
            jnv jnvVar = this.f2677a;
            if (jnvVar != null) {
                return jnvVar.a(i, mtopResponse, obj);
            }
            return super.a(i, mtopResponse, obj);
        }

        @Override // tb.jnv
        public void b(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac39879b", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            jnv jnvVar = this.f2677a;
            if (jnvVar == null) {
                return;
            }
            jnvVar.b(i, mtopResponse, obj);
        }

        @Override // tb.jnv
        public void a(int i, MtopResponse mtopResponse, Object obj, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b3ee389", new Object[]{this, new Integer(i), mtopResponse, obj, map});
                return;
            }
            jnv jnvVar = this.f2677a;
            if (jnvVar == null) {
                return;
            }
            jnvVar.a(i, mtopResponse, obj, map);
        }

        @Override // tb.jnv
        public void a(jny jnyVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caa2cc62", new Object[]{this, jnyVar, streamRemoteMainResponse, list});
                return;
            }
            jnv jnvVar = this.f2677a;
            if (jnvVar == null) {
                return;
            }
            jnvVar.a(jnyVar, streamRemoteMainResponse, list);
        }

        @Override // tb.jnv
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            super.a(jSONObject);
            jnv jnvVar = this.f2677a;
            if (jnvVar == null) {
                return;
            }
            jnvVar.a(jSONObject);
        }
    }

    /* renamed from: com.alibaba.android.ultron.trade.presenter.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0096b extends jog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1991620301);
        }

        public static /* synthetic */ Object ipc$super(C0096b c0096b, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -217248045) {
                super.a((jod) objArr[0], objArr[1], (jnv) objArr[2]);
                return null;
            } else if (hashCode != 1983731511) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((jod) objArr[0], (jnv) objArr[1]);
                return null;
            }
        }

        public C0096b(Context context, String str) {
            super(context, str);
        }

        @Override // tb.jog
        public void a(jod jodVar, jnv jnvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("763d5737", new Object[]{this, jodVar, jnvVar});
            } else {
                super.a(jodVar, new a(jnvVar));
            }
        }

        @Override // tb.jog
        public void a(jod jodVar, Object obj, jnv jnvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f30d0ed3", new Object[]{this, jodVar, obj, jnvVar});
            } else {
                super.a(jodVar, obj, new a(jnvVar));
            }
        }
    }
}
