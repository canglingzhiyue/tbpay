package com.alibaba.android.ultron.vfw.instance;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.spindle.stage.StageType;
import com.alibaba.android.ultron.engine.a;
import com.alibaba.android.ultron.event.base.CustomLoadRenderParser;
import com.alibaba.android.ultron.vfw.dataloader.f;
import com.alibaba.android.ultron.vfw.dataloader.h;
import com.alibaba.android.ultron.vfw.dataloader.j;
import com.alibaba.android.ultron.vfw.dataloader.o;
import com.alibaba.android.ultron.vfw.perf.asynccomponent.PreloadAsyncComponent;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.android.ultron.vfw.viewholder.i;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;
import tb.bmd;
import tb.bnn;
import tb.bnv;
import tb.bny;
import tb.boa;
import tb.bob;
import tb.boe;
import tb.bop;
import tb.boq;
import tb.bou;
import tb.bov;
import tb.bow;
import tb.box;
import tb.boz;
import tb.bph;
import tb.bpl;
import tb.brx;
import tb.fnl;
import tb.fut;
import tb.jnv;
import tb.jny;
import tb.jnz;
import tb.joc;
import tb.jpl;
import tb.jpo;
import tb.kge;

/* loaded from: classes2.dex */
public class d implements com.alibaba.android.ultron.vfw.instance.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 127;
    public static final int BODY = 2;
    public static final int FOOTER = 4;
    public static final int HEADER = 1;
    @Deprecated
    public static final int TYPE_DIALOG_MARK = 1002;
    public static final int TYPE_NONE_MARK = 0;
    public static final int TYPE_WATER_MARK = 1001;
    public bop c;
    public boq d;
    public com.alibaba.android.ultron.vfw.dataloader.d e;
    public f f;
    public com.alibaba.android.ultron.vfw.dataloader.c g;
    public InterfaceC0100d h;
    private UltronInstanceConfig i;
    private bny j;
    private com.alibaba.android.ultron.engine.a k;
    private Context l;
    private com.taobao.android.ultron.datamodel.imp.b m;
    private ParseResponseHelper n;
    private com.alibaba.android.ultron.event.base.f o;
    private Dialog s;
    private Map<String, String> v;
    private bmd w;
    private com.alibaba.android.ultron.vfw.perf.asynccomponent.b z;
    private Map<String, com.alibaba.android.ultron.event.base.b> p = new HashMap();
    private Map<String, CustomLoadRenderParser> q = new HashMap();
    private final Map<String, Object> t = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.dataloader.a f2707a = new com.alibaba.android.ultron.vfw.dataloader.a(this);
    private boolean u = false;
    public bov b = new bov();
    private Map<String, Object> y = new HashMap();

    /* loaded from: classes2.dex */
    public interface b extends InterfaceC0100d {
        void a(String str, a.d dVar);

        void a(String str, com.alibaba.android.ultron.vfw.dataloader.d dVar);
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar);
    }

    /* renamed from: com.alibaba.android.ultron.vfw.instance.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0100d {
        void a(com.alibaba.android.ultron.vfw.dataloader.d dVar);

        void a(UltronError ultronError);
    }

    static {
        kge.a(1364100897);
        kge.a(112816634);
    }

    public static /* synthetic */ ParseResponseHelper a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParseResponseHelper) ipChange.ipc$dispatch("4559fcf7", new Object[]{dVar}) : dVar.n;
    }

    public static /* synthetic */ void a(d dVar, String str, com.alibaba.android.ultron.vfw.dataloader.d dVar2, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("582f2435", new Object[]{dVar, str, dVar2, fVar});
        } else {
            dVar.b(str, dVar2, fVar);
        }
    }

    public static /* synthetic */ com.taobao.android.ultron.datamodel.imp.b b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.ultron.datamodel.imp.b) ipChange.ipc$dispatch("a3b53f6", new Object[]{dVar}) : dVar.m;
    }

    public static /* synthetic */ boolean c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1601d44f", new Object[]{dVar})).booleanValue() : dVar.u;
    }

    public static d a(UltronInstanceConfig ultronInstanceConfig, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e8151a39", new Object[]{ultronInstanceConfig, context});
        }
        if (ultronInstanceConfig == null || context == null) {
            throw new IllegalArgumentException("UltronInstance params can not be null");
        }
        d dVar = new d();
        dVar.i = ultronInstanceConfig;
        dVar.l = context;
        dVar.z();
        return dVar;
    }

    private d() {
        com.alibaba.android.ultron.vfw.option.a.a();
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        this.j = new bny(this.l, this.i.b(), null, this.i.t(), this.i.a());
        this.i.b();
        this.j.a(this.i.m(), this.i.n());
        this.o = new com.alibaba.android.ultron.event.base.f(this);
        this.m = new com.taobao.android.ultron.datamodel.imp.b(this.i.c(), this.l);
        this.m.t().a(this.i.v());
        this.n = new ParseResponseHelper(this.m);
        this.j.c(this.i.g());
        this.j.b(this.i.e());
        this.j.a(this.o);
        this.j.c(this.i.h());
        this.j.e(this.i.i());
        this.j.d(this.i.o());
        this.j.e(this.i.r());
        A();
        D();
        E();
        C();
        F();
        B();
        if (!this.i.u()) {
            return;
        }
        this.z = new com.alibaba.android.ultron.vfw.perf.asynccomponent.b(this.i.b() + "-UltronAsyncRenderContextExecute");
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null) {
            UnifyLog.d(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor runnable is NULL");
        } else if (this.z == null) {
            UnifyLog.d(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor mUltronSerialExecutor is NULL");
            UnifyLog.a(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor sync run the runnbale");
            runnable.run();
        } else {
            UnifyLog.b(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor");
            this.z.a(runnable);
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else if (!StringUtils.isEmpty(this.i.l())) {
        } else {
            String traceId = UemAnalysis.getTraceId();
            UltronInstanceConfig ultronInstanceConfig = this.i;
            if (StringUtils.isEmpty(traceId)) {
                traceId = "";
            }
            ultronInstanceConfig.b(traceId);
        }
    }

    public void a(com.alibaba.android.ultron.event.base.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d84c45", new Object[]{this, cVar});
        } else {
            this.o.a(cVar);
        }
    }

    public void b(com.alibaba.android.ultron.event.base.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4fd9e4", new Object[]{this, cVar});
        } else {
            this.o.b(cVar);
        }
    }

    public void a(com.alibaba.android.ultron.vfw.instance.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26c1c2e", new Object[]{this, cVar});
        } else {
            this.j.a(cVar);
        }
    }

    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
        } else if (onScrollListener == null) {
        } else {
            this.j.a(onScrollListener);
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        UltronInstanceConfig ultronInstanceConfig = this.i;
        boolean z = ultronInstanceConfig != null && ultronInstanceConfig.j();
        UnifyLog.a(PreloadAsyncComponent.TAG, "shouldPreloadAsyncComponent is:" + z);
        if (!z) {
            return;
        }
        this.j.a(new com.alibaba.android.ultron.vfw.perf.asynccomponent.a(new Coordinator.TaggedRunnable("loadAsyncComponentRunnbale") { // from class: com.alibaba.android.ultron.vfw.instance.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                UnifyLog.b(PreloadAsyncComponent.TAG, "loadAsyncComponentRunnbale triger mItemCreateStrategy.lazyLoadAllOnce");
                d.this.b.a(d.this);
            }
        }, this.i.s()));
        UnifyLog.b(PreloadAsyncComponent.TAG, "init ScrollListener for PreloadComponent");
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            bow.a(this.i.k(), this.j, d(), this);
        }
    }

    private void D() {
        Map<String, Class<? extends com.alibaba.android.ultron.event.base.d>> a2 = com.alibaba.android.ultron.event.base.a.a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        try {
            for (Map.Entry<String, Class<? extends com.alibaba.android.ultron.event.base.d>> entry : a2.entrySet()) {
                this.o.a(entry.getKey(), entry.getValue().newInstance());
            }
        } catch (Throwable th) {
            bga.a.a(g(), "UltronInstance.initSubsriber", th);
        }
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else {
            a(9422011105736515L, new boa());
        }
    }

    public void a(String str, com.alibaba.android.ultron.event.base.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e1ac1a", new Object[]{this, str, dVar});
            return;
        }
        com.alibaba.android.ultron.event.base.f fVar = this.o;
        if (fVar == null) {
            return;
        }
        fVar.b(str, dVar);
    }

    public void a(boz bozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22481eb", new Object[]{this, bozVar});
        } else {
            this.j.a(bozVar);
        }
    }

    private void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
            return;
        }
        this.j.a(bnvVar);
        c(bnvVar.c());
    }

    public bnv k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnv) ipChange.ipc$dispatch("5bf3526a", new Object[]{this}) : this.j.d();
    }

    public bob l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bob) ipChange.ipc$dispatch("63a4f91e", new Object[]{this}) : this.j.e();
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else {
            a(BundleLineComponent.COMPONENT_TAG, com.alibaba.android.ultron.vfw.viewholder.c.CREATOR);
        }
    }

    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8385a", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.j.a(linearLayout, recyclerView, linearLayout2);
        bny bnyVar = this.j;
        bnyVar.a(new bnn(bnyVar));
        this.u = true;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        bny bnyVar = this.j;
        if (bnyVar == null || viewGroup == null) {
            return;
        }
        bnyVar.a(viewGroup);
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
            return;
        }
        bny bnyVar = this.j;
        if (bnyVar == null || viewGroup == null) {
            return;
        }
        bnyVar.b(viewGroup);
    }

    public void a(int i, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68e23e3", new Object[]{this, new Integer(i), brxVar});
        } else {
            this.j.a(i, brxVar);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j.a(i);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.j.b(i);
        }
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
        } else {
            this.j.a(str, eVar);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.f2707a.a();
        this.j.j();
        com.alibaba.android.ultron.engine.a aVar = this.k;
        if (aVar != null) {
            aVar.e();
        }
        Context context = this.l;
        if (context == null) {
            return;
        }
        jpo.b(context).a(this.l);
    }

    public void a(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1a8084", new Object[]{this, iDMComponent, jSONObject});
        } else {
            this.k.a(iDMComponent, jSONObject);
        }
    }

    public void a(long j, bn bnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa971a4c", new Object[]{this, new Long(j), bnVar});
        } else {
            this.j.e().a().a(j, bnVar);
        }
    }

    public void a(long j, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926eae27", new Object[]{this, new Long(j), futVar});
        } else {
            this.j.e().a().a(j, futVar);
        }
    }

    public void a(long j, ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a2b983", new Object[]{this, new Long(j), akVar});
        } else {
            this.j.e().a().a(j, akVar);
        }
    }

    public void a(String str, fnl fnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cde57e", new Object[]{this, str, fnlVar});
            return;
        }
        try {
            this.j.e().a().a(str, fnlVar);
        } catch (DinamicException e) {
            UnifyLog.a(g(), "UltronInstance", "v2RegisterDinamicXParser error: ", e.getMessage());
            bga.a.a(g(), "UltronInstance.v2RegisterDinamicXParser", e);
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.j.c(i);
        }
    }

    public void a(boe boeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21af620", new Object[]{this, boeVar});
        } else {
            this.j.a(boeVar);
        }
    }

    public void a(com.alibaba.android.ultron.vfw.weex2.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b497d115", new Object[]{this, bVar});
        } else {
            this.j.a(bVar);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = this.m;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        com.taobao.android.ultron.datamodel.imp.b bVar = this.m;
        if (bVar == null) {
            return;
        }
        bVar.k();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.m = new com.taobao.android.ultron.datamodel.imp.b(this.i.c(), this.l);
        com.taobao.android.ultron.datamodel.imp.c t = this.m.t();
        if (t != null) {
            t.a(this.i.v());
        }
        this.n = new ParseResponseHelper(this.m);
        d().a((List<IDMComponent>) null, (Object) null);
    }

    public void a(jnz jnzVar, Object obj, final joc jocVar, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ab08e6", new Object[]{this, jnzVar, obj, jocVar, cVar});
        } else if (jnzVar == null) {
            throw new IllegalArgumentException("requester can not be null");
        } else {
            final com.alibaba.android.ultron.vfw.instance.a f = this.i.f();
            if (f != null) {
                f.a("Page_Ultron", com.taobao.analysis.v3.a.PRE_PROCESS, StageType.STAGE_START);
            }
            jnzVar.a(obj, new jnv() { // from class: com.alibaba.android.ultron.vfw.instance.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj2, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj2, new Boolean(z), map});
                        return;
                    }
                    joc jocVar2 = jocVar;
                    if (jocVar2 != null) {
                        jocVar2.a(i, mtopResponse, obj2, z, (Map<String, ? extends Object>) map);
                    }
                    com.alibaba.android.ultron.vfw.instance.a aVar = f;
                    if (aVar == null) {
                        return;
                    }
                    aVar.a("Page_Ultron", com.taobao.analysis.v3.a.PRE_PROCESS, StageType.STAGE_END);
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj2, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj2, jnyVar, map});
                        return;
                    }
                    com.alibaba.android.ultron.vfw.instance.a aVar = f;
                    if (aVar != null) {
                        aVar.a("Page_Ultron", com.taobao.analysis.v3.a.PRE_PROCESS, StageType.STAGE_END);
                        f.a("Page_Ultron", "dataParse", StageType.STAGE_START);
                    }
                    d.a(d.this).a(mtopResponse);
                    com.alibaba.android.ultron.vfw.instance.a aVar2 = f;
                    if (aVar2 != null) {
                        aVar2.a("Page_Ultron", "dataParse", StageType.STAGE_END);
                    }
                    d.this.d().a(d.b(d.this).b(), (Object) null);
                    d.this.a(cVar);
                    d.this.a(127);
                    joc jocVar2 = jocVar;
                    if (jocVar2 == null) {
                        return;
                    }
                    jocVar2.a(i, mtopResponse, obj2, jnyVar, (Map<String, ? extends Object>) map);
                }
            });
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        ParseResponseHelper parseResponseHelper = this.n;
        if (parseResponseHelper == null) {
            return;
        }
        parseResponseHelper.a(jSONObject);
    }

    public void a(JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b4070e", new Object[]{this, jSONObject, cVar});
            return;
        }
        UnifyLog.c(PreloadAsyncComponent.TAG, " renderData ");
        if (jSONObject == null) {
            return;
        }
        this.n.a(jSONObject);
        box.a(this.m, k(), cVar, this);
    }

    public void a(JSONObject jSONObject, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d88acf84", new Object[]{this, jSONObject, str, cVar});
            return;
        }
        this.m.h(str);
        a(jSONObject, cVar);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b860822e", new Object[]{this, cVar});
            return;
        }
        bnv bnvVar = new bnv();
        if (cVar == null) {
            cVar = new bou(this.m);
        }
        cVar.a(this.m.b(), bnvVar, this.m);
        bnvVar.h(this.m.d());
        bnvVar.a(this.m);
        this.b.a(bnvVar.c(), this);
        a(bnvVar);
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.l;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.l = context;
        this.j.a(context);
        this.o.a(context);
        this.m.a(context);
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public jny b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jny) ipChange.ipc$dispatch("16b82568", new Object[]{this}) : this.m;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.j.b(127);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public com.alibaba.android.ultron.event.base.f d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.event.base.f) ipChange.ipc$dispatch("423d3e65", new Object[]{this}) : this.o;
    }

    public com.alibaba.android.ultron.event.base.b b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.event.base.b) ipChange.ipc$dispatch("62fb4871", new Object[]{this, str}) : this.p.get(str);
    }

    public CustomLoadRenderParser c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomLoadRenderParser) ipChange.ipc$dispatch("eb6d5fb6", new Object[]{this, str}) : this.q.get(str);
    }

    public void a(String str, com.alibaba.android.ultron.event.base.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e0c35c", new Object[]{this, str, bVar});
        } else {
            this.p.put(str, bVar);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        boq boqVar = this.d;
        if (boqVar != null && boqVar.a(this.j, list)) {
            return;
        }
        this.j.a(list);
    }

    public void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        boq boqVar = this.d;
        if (boqVar != null && boqVar.b(this.j, list)) {
            return;
        }
        this.j.b(list);
    }

    public void a(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ac5f9b", new Object[]{this, list, iDMComponent});
            return;
        }
        boq boqVar = this.d;
        if (boqVar != null && boqVar.a(this.j, list, iDMComponent)) {
            return;
        }
        this.j.a(list, iDMComponent);
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.j.a(iDMComponent);
        }
    }

    public void a(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d857f0a2", new Object[]{this, str, iVar});
        } else {
            this.j.a(str, iVar.a(this.j));
        }
    }

    public com.alibaba.android.ultron.engine.a p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.engine.a) ipChange.ipc$dispatch("20b292ba", new Object[]{this}) : this.k;
    }

    public void a(com.alibaba.android.ultron.vfw.dataloader.d dVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0878446", new Object[]{this, dVar, fVar});
        } else {
            a((String) null, dVar, fVar);
        }
    }

    public void a(String str, com.alibaba.android.ultron.vfw.dataloader.d dVar, f fVar) {
        UltronInstanceConfig ultronInstanceConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc308b90", new Object[]{this, str, dVar, fVar});
        } else if (str != null && (ultronInstanceConfig = this.i) != null && ultronInstanceConfig.u()) {
            c(str, dVar, fVar);
        } else {
            b(str, dVar, fVar);
            UnifyLog.b(PreloadAsyncComponent.TAG, " renderWithContext end");
        }
    }

    private void b(final String str, com.alibaba.android.ultron.vfw.dataloader.d dVar, final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa99d91", new Object[]{this, str, dVar, fVar});
            return;
        }
        UnifyLog.c(PreloadAsyncComponent.TAG, "realRenderWithContext");
        com.alibaba.android.ultron.vfw.instance.a f = this.i.f();
        if (f != null) {
            f.a("Page_Ultron", com.taobao.analysis.v3.a.PRE_PROCESS, StageType.STAGE_START);
        }
        boolean g = this.g.g();
        this.e = dVar;
        if ("initial".equals(dVar.a())) {
            this.b.a();
        }
        f fVar2 = new f() { // from class: com.alibaba.android.ultron.vfw.instance.d.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str2, Object... objArr) {
                if (str2.hashCode() == -1095944170) {
                    return super.a((j) objArr[0]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(final h hVar) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5eca7a1", new Object[]{this, hVar});
                    return;
                }
                f fVar3 = fVar;
                if (fVar3 != null) {
                    z = fVar3.b(hVar);
                }
                if (hVar != null && d.c(d.this) && z) {
                    com.alibaba.android.ultron.engine.utils.h.a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.instance.d.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            d.this.a(hVar.a().c, hVar.b().b(), hVar.b().c());
                            InterfaceC0100d v = d.this.v();
                            if (v == null) {
                                return;
                            }
                            v.a(hVar.b());
                            if (!(v instanceof b)) {
                                return;
                            }
                            ((b) v).a(str, hVar.b());
                        }
                    });
                }
                f fVar4 = fVar;
                if (fVar4 == null) {
                    return;
                }
                fVar4.a(hVar);
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(h hVar, UltronError ultronError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b531dfc4", new Object[]{this, hVar, ultronError});
                    return;
                }
                f fVar3 = fVar;
                if (fVar3 == null) {
                    return;
                }
                fVar3.a(hVar, ultronError);
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.i
            public j a(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (j) ipChange2.ipc$dispatch("bead3816", new Object[]{this, jVar});
                }
                f fVar3 = fVar;
                if (fVar3 instanceof b) {
                    ((b) fVar3).a(str, jVar != null ? jVar.b() : null);
                }
                f fVar4 = fVar;
                if (fVar4 != null) {
                    return fVar4.a(jVar);
                }
                return super.a(jVar);
            }
        };
        if (g) {
            this.f2707a.b(dVar, fVar2);
        } else {
            this.f2707a.a(dVar, fVar2);
        }
    }

    public void a(String str, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0a16b0", new Object[]{this, str, oVar});
        } else {
            this.f2707a.a(str, oVar);
        }
    }

    private void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                JSONObject a2 = bph.a(iDMComponent);
                if (a2 != null) {
                    for (String str : a2.keySet()) {
                        IDMComponent b2 = b().b(str);
                        if (b2 != null && b2.getMessageChannel() != null && iDMComponent.getMessageChannel() != null) {
                            b2.getMessageChannel().a(iDMComponent.getMessageChannel());
                        }
                    }
                }
            }
        }
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            this.s = new Dialog(a(), R.style.Dialog_Status_Container);
            this.s.setContentView(View.inflate(a(), R.layout.ultron_loading, null));
            if (!StringUtils.isEmpty(str)) {
                ((TextView) this.s.findViewById(R.id.text)).setText(str);
            }
            Window window = this.s.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = -1;
            attributes.height = -1;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            int b2 = bpl.b(a());
            int c2 = bpl.c(a());
            int i = b2 - c2;
            if (b2 > 0 && c2 > 0 && i > 0) {
                this.s.getWindow().setLayout(-1, i);
            }
            this.s.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alibaba.android.ultron.vfw.instance.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            });
            this.s.show();
        } catch (Throwable th) {
            UnifyLog.a(g(), "UltronInstance", "showLoading exception ", th.toString());
            bga.a.a(g(), "UltronInstance.showLoading", th);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            if (this.s == null || !this.s.isShowing()) {
                return;
            }
            this.s.dismiss();
        } catch (Throwable th) {
            UnifyLog.a(g(), "UltronInstance", "hideLoading exception ", th.toString());
            bga.a.a(g(), "UltronInstance.hideLoading", th);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.t;
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        bny bnyVar = this.j;
        return bnyVar != null ? bnyVar.r() : "default";
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public jpl h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpl) ipChange.ipc$dispatch("44e20b91", new Object[]{this}) : this.j.t();
    }

    public bny q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("8a1d3301", new Object[]{this}) : this.j;
    }

    public ParseResponseHelper r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ParseResponseHelper) ipChange.ipc$dispatch("d47e9e63", new Object[]{this}) : this.n;
    }

    public com.alibaba.android.ultron.vfw.dataloader.d s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.dataloader.d) ipChange.ipc$dispatch("a7a5bdf7", new Object[]{this}) : this.e;
    }

    public f t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("a72f5836", new Object[]{this}) : this.f;
    }

    public com.alibaba.android.ultron.vfw.dataloader.c u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.dataloader.c) ipChange.ipc$dispatch("a6b8f1da", new Object[]{this}) : this.g;
    }

    public void a(com.alibaba.android.ultron.vfw.dataloader.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ea61c6", new Object[]{this, cVar});
        } else if (this.g != null) {
        } else {
            this.g = cVar;
            try {
                G();
            } catch (Throwable th) {
                UnifyLog.a(g(), "UltronInstance", "initEngine exception: ", th.getMessage());
            }
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else if (this.k != null) {
        } else {
            this.k = new com.alibaba.android.ultron.engine.a(this.l, this.i.d(), this, this.g, g(), new a.b() { // from class: com.alibaba.android.ultron.vfw.instance.d.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.engine.a.b
                public void a(UltronError ultronError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f64095d", new Object[]{this, ultronError});
                    } else if (d.this.h == null) {
                    } else {
                        d.this.h.a(ultronError);
                    }
                }
            });
        }
    }

    public void a(String str, String str2, com.alibaba.android.ultron.engine.logic.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24753347", new Object[]{this, str, str2, bVar});
            return;
        }
        com.alibaba.android.ultron.engine.a aVar = this.k;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2, bVar);
    }

    public void a(InterfaceC0100d interfaceC0100d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b860f68d", new Object[]{this, interfaceC0100d});
        } else {
            this.h = interfaceC0100d;
        }
    }

    public InterfaceC0100d v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0100d) ipChange.ipc$dispatch("e115a662", new Object[]{this}) : this.h;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.v = map;
        }
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : this.v;
    }

    public bop w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bop) ipChange.ipc$dispatch("b84715e5", new Object[]{this}) : this.c;
    }

    public void a(boq boqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2206a94", new Object[]{this, boqVar});
        } else {
            this.d = boqVar;
        }
    }

    public com.taobao.android.ultron.datamodel.imp.b x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.ultron.datamodel.imp.b) ipChange.ipc$dispatch("ad3bc2c9", new Object[]{this}) : this.m;
    }

    public void a(com.taobao.android.ultron.datamodel.imp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a0b2", new Object[]{this, bVar});
        } else {
            this.m = bVar;
        }
    }

    public void a(bmd bmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1fe52bf", new Object[]{this, bmdVar});
        } else {
            this.w = bmdVar;
        }
    }

    @Override // com.alibaba.android.ultron.vfw.instance.b
    public bmd j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmd) ipChange.ipc$dispatch("5441a71c", new Object[]{this}) : this.w;
    }

    public void b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73527f0b", new Object[]{this, iDMComponent});
        } else {
            this.b.a(iDMComponent, this);
        }
    }

    public UltronInstanceConfig y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronInstanceConfig) ipChange.ipc$dispatch("e618b222", new Object[]{this}) : this.i;
    }

    private void c(String str, com.alibaba.android.ultron.vfw.dataloader.d dVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6322af92", new Object[]{this, str, dVar, fVar});
            return;
        }
        UnifyLog.b(PreloadAsyncComponent.TAG, "dispatchToAsyncSerialExecutor asyncRenderWithContext runnable");
        a(new a(str, dVar, fVar));
    }

    /* loaded from: classes2.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private com.alibaba.android.ultron.vfw.dataloader.d c;
        private f d;

        static {
            kge.a(-245834313);
        }

        public a(String str, com.alibaba.android.ultron.vfw.dataloader.d dVar, f fVar) {
            super("asyncRenderWithContext");
            this.b = str;
            this.c = dVar;
            this.d = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, this.b, this.c, this.d);
            }
        }
    }
}
