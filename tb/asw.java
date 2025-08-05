package tb;

import android.view.View;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.nodemodel.branch.c;
import com.alibaba.android.aura.q;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class asw extends arj<AURARenderIO, AURARenderOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RENDER_SERVICE_CODE = "aura.service.render";

    /* renamed from: a  reason: collision with root package name */
    private asv f25579a;
    private boolean b = baz.a("enableHighPerformanceStagePerf", true);

    static {
        kge.a(-499963512);
    }

    public static /* synthetic */ Object ipc$super(asw aswVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 339629984) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((AURAInputData) objArr[0], (aqq) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ f a(asw aswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("f1472617", new Object[]{aswVar}) : aswVar.getExtensionManager();
    }

    public static /* synthetic */ asv b(asw aswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (asv) ipChange.ipc$dispatch("ed6a094e", new Object[]{aswVar}) : aswVar.f25579a;
    }

    public static /* synthetic */ q c(asw aswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("9f83092a", new Object[]{aswVar}) : aswVar.getUserContext();
    }

    public static /* synthetic */ q d(asw aswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("f6a0fa09", new Object[]{aswVar}) : aswVar.getUserContext();
    }

    public static /* synthetic */ q e(asw aswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("4dbeeae8", new Object[]{aswVar}) : aswVar.getUserContext();
    }

    public static /* synthetic */ q f(asw aswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("a4dcdbc7", new Object[]{aswVar}) : aswVar.getUserContext();
    }

    public static /* synthetic */ q g(asw aswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("fbfacca6", new Object[]{aswVar}) : aswVar.getUserContext();
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onCreate(q qVar, f fVar) {
        atv atrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        if (qVar.b().a(new c("aura.branch.render.layoutDataProcessor.v2", false, "default"))) {
            atrVar = new ats();
        } else {
            atrVar = new atr();
        }
        this.f25579a = new asv(atrVar);
        this.f25579a.a(getExtensionManager());
    }

    @Override // tb.arj
    public void a(AURAInputData<AURARenderIO> aURAInputData, aqq<AURARenderOutput> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143e57a0", new Object[]{this, aURAInputData, aqqVar});
            return;
        }
        super.a(aURAInputData, aqqVar);
        if (!this.b) {
            a(UltronTradeHybridStage.ON_RENDER_START);
        }
        a(aURAInputData);
        AURARenderComponent renderTree = aURAInputData.getData().getRenderTree();
        if (renderTree == null) {
            aqqVar.a(new b(0, "AURARenderServiceDomain", "-1000_EMPTY_RENDER_TREE", "渲染树参数为null"));
            return;
        }
        a(renderTree);
        this.f25579a.a(aqqVar);
        this.f25579a.a(renderTree, aURAInputData.getFlowData(), aURAInputData.getGlobalData());
        a();
        View a2 = this.f25579a.a(getUserContext().e());
        b(a2);
        this.f25579a.b();
        if (((Boolean) getUserContext().a("enableIdleRender", Boolean.class, false)).booleanValue()) {
            bbh.b(new Runnable() { // from class: tb.asw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    bbe.a("开始渲染freeNode");
                    asw.b(asw.this).b(asw.a(asw.this));
                }
            });
        } else {
            this.f25579a.b(getExtensionManager());
        }
        AURARenderOutput aURARenderOutput = new AURARenderOutput();
        aURARenderOutput.setView(a2);
        com.alibaba.android.aura.datamodel.c<AURARenderOutput> a3 = com.alibaba.android.aura.datamodel.c.a(aURARenderOutput, aURAInputData);
        aURAInputData.getGlobalData().update("render_view", a2);
        a(a2);
        aqqVar.a(a3);
        if (!this.b) {
            a(UltronTradeHybridStage.ON_RENDER_END);
        } else {
            b();
        }
    }

    private void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            a(new aqt<atf>() { // from class: tb.asw.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public /* bridge */ /* synthetic */ void a(atf atfVar) {
                }
            });
        }
    }

    private void b(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            a(new aqt<atf>() { // from class: tb.asw.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(atf atfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ad0765", new Object[]{this, atfVar});
                    } else {
                        atfVar.onContentViewCreated(view);
                    }
                }
            });
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(new aqt<atf>() { // from class: tb.asw.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(atf atfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ad0765", new Object[]{this, atfVar});
                    } else if (!(atfVar instanceof ath)) {
                    } else {
                        ((ath) atfVar).a(asw.b(asw.this).a());
                    }
                }
            });
        }
    }

    private void a(final AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        } else {
            a(new aqt<atf>() { // from class: tb.asw.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(atf atfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ad0765", new Object[]{this, atfVar});
                    } else if (!(atfVar instanceof ath)) {
                    } else {
                        ((ath) atfVar).a(aURARenderComponent);
                    }
                }
            });
        }
    }

    private void a(final AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        } else {
            a(new aqt<atf>() { // from class: tb.asw.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqt
                public void a(atf atfVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ad0765", new Object[]{this, atfVar});
                    } else if (!(atfVar instanceof ath)) {
                    } else {
                        ((ath) atfVar).a(aURAInputData);
                    }
                }
            });
        }
    }

    private void a(aqt<atf> aqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0891e14", new Object[]{this, aqtVar});
            return;
        }
        for (atf atfVar : getExtensionManager().b(atf.class)) {
            aqtVar.a(atfVar);
        }
    }

    @Override // com.alibaba.android.aura.n, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        asv asvVar = this.f25579a;
        if (asvVar != null) {
            asvVar.c();
        }
        a(UltronTradeHybridStage.ON_CONTAINER_DESTROY);
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            bbh.b(new Runnable() { // from class: tb.asw.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("context", (Object) asw.c(asw.this).e());
                    a.a().a(str, asw.d(asw.this).d(), jSONObject);
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            bbh.b(new Runnable() { // from class: tb.asw.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("context", (Object) asw.e(asw.this).e());
                    a.a().a(UltronTradeHybridStage.ON_RENDER_START, asw.f(asw.this).d(), jSONObject);
                    a.a().a(UltronTradeHybridStage.ON_RENDER_END, asw.g(asw.this).d(), jSONObject);
                }
            });
        }
    }
}
