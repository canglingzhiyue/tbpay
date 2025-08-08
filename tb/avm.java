package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.a;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.uc.webview.export.media.MessageID;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import tb.arc;

@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.dxDownload")
/* loaded from: classes2.dex */
public final class avm extends arn implements fve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25632a = "AURAAspectLifeCycleDxDownloadExtension";
    private bd b;
    private atk c;
    private CopyOnWriteArrayList<AURARenderComponent> d;
    private ExecutorService e;

    static {
        kge.a(-1861764123);
        kge.a(-1579893205);
    }

    public static /* synthetic */ Object ipc$super(avm avmVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1219783041:
                super.onCreate((q) objArr[0], (f) objArr[1]);
                return null;
            case -362309544:
                super.beforeServiceExecute((AURAInputData) objArr[0], (a) objArr[1]);
                return null;
            case 563256106:
                super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
                return null;
            case 1123044641:
                super.beforeFlowExecute((AURAInputData) objArr[0], (a) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(avm avmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cc6500", new Object[]{avmVar});
        } else {
            avmVar.e();
        }
    }

    public static /* synthetic */ void a(avm avmVar, bd bdVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50a52b", new Object[]{avmVar, bdVar, list});
        } else {
            avmVar.a(bdVar, list);
        }
    }

    public static /* synthetic */ CopyOnWriteArrayList b(avm avmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("5d601d6e", new Object[]{avmVar}) : avmVar.d;
    }

    public static /* synthetic */ bd c(avm avmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("356d28e", new Object[]{avmVar}) : avmVar.b;
    }

    @Override // tb.arn, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.e = bbh.a(1, 1, 3L, TimeUnit.SECONDS, "AURADxDownloadExtension");
    }

    @Override // tb.arn, tb.arp
    public void beforeFlowExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f04d21", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeFlowExecute(aURAInputData, aVar);
        bd bdVar = (bd) c().get("auraRenderDxEngine", bd.class);
        if (bdVar == null) {
            a(a(), b());
        }
        arc.a().a(bdVar == null ? "没命中engineRouter缓存" : "命中engineRouter缓存", arc.a.a().a("AURA/performance").b());
    }

    private void a(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fb3225", new Object[]{this, qVar, fVar});
            return;
        }
        List<avp> b = fVar.b(avp.class);
        bd bdVar = (bd) qVar.a("DXEngineRouter", bd.class);
        if (bdVar != null) {
            this.b = bdVar;
        } else {
            DXEngineConfig dXEngineConfig = null;
            Iterator it = b.iterator();
            while (it.hasNext() && (dXEngineConfig = ((avp) it.next()).a()) == null) {
            }
            if (dXEngineConfig == null) {
                String d = qVar.d();
                dXEngineConfig = new DXEngineConfig.a(d).b(2).a(d).a();
            }
            this.b = new bd(dXEngineConfig);
        }
        for (avp avpVar : b) {
            avpVar.a(this.b);
        }
        this.b.a(38447420286L, new axe());
        this.b.a(7023701163946200378L, new axd());
        this.b.a(-489609274268614298L, new com.alibaba.android.aura.taobao.adapter.extension.performance.a());
        this.b.a(this);
        c().update("auraRenderDxEngine", this.b);
    }

    @Override // tb.arn, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }

    @Override // tb.arn, tb.arp
    public void beforeServiceExecute(AURAInputData aURAInputData, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea679858", new Object[]{this, aURAInputData, aVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, aVar);
        if (!asw.RENDER_SERVICE_CODE.equals(aVar.c())) {
            return;
        }
        final Serializable data = aURAInputData.getData();
        if (!(data instanceof AURARenderIO)) {
            return;
        }
        ExecutorService executorService = this.e;
        if (executorService == null) {
            arc.a().b("beforeServiceExecute#mThreadExecutor is null", arc.a.a().b("AURAAspectLifeCycleDxDownloadExtension").b());
        } else {
            executorService.execute(new Runnable() { // from class: tb.avm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    avm.a(avm.this);
                    asu.a(((AURARenderIO) data).getRenderTree(), avm.b(avm.this), new aqx<AURARenderComponent, Boolean>() { // from class: tb.avm.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.aqx
                        public Boolean a(AURARenderComponent aURARenderComponent) {
                            AURARenderComponentContainer aURARenderComponentContainer;
                            IpChange ipChange3 = $ipChange;
                            boolean z = true;
                            if (ipChange3 instanceof IpChange) {
                                return (Boolean) ipChange3.ipc$dispatch("82240690", new Object[]{this, aURARenderComponent});
                            }
                            if (aURARenderComponent == null) {
                                return false;
                            }
                            try {
                                AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
                                if (aURARenderComponentData == null || (aURARenderComponentContainer = aURARenderComponentData.container) == null) {
                                    return false;
                                }
                                if (!aURARenderComponent.isRenderAbleLeaf() || !a.b.f2133a.equals(aURARenderComponentContainer.containerType)) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            } catch (Throwable th) {
                                hyw.a("DO_FLAT_EXCEPTION", th.getMessage());
                                return false;
                            }
                        }
                    });
                    avm avmVar = avm.this;
                    avm.a(avmVar, avm.c(avmVar), avm.b(avm.this));
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        CopyOnWriteArrayList<AURARenderComponent> copyOnWriteArrayList = this.d;
        if (copyOnWriteArrayList == null) {
            this.d = new CopyOnWriteArrayList<>();
        } else {
            copyOnWriteArrayList.clear();
        }
    }

    private void a(bd bdVar, List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170d3c93", new Object[]{this, bdVar, list});
        } else if (bau.a(list)) {
        } else {
            List<DXTemplateItem> a2 = asx.a(list);
            if (bau.a(a2) || bdVar == null) {
                return;
            }
            try {
                Iterator it = b().b(ars.class).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Exception unused) {
            }
            bdVar.a(a2);
        }
    }

    @Override // tb.fve
    public void onNotificationListener(fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
        } else if (fvbVar == null) {
        } else {
            a(fvbVar);
            List<DXTemplateItem> list = fvbVar.f28139a;
            if (list == null || list.isEmpty()) {
                return;
            }
            a(list);
            f();
        }
    }

    private void a(fvb fvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94fa006", new Object[]{this, fvbVar});
            return;
        }
        try {
            List<DXTemplateItem> list = fvbVar.b;
            if (list != null && !list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (DXTemplateItem dXTemplateItem : list) {
                    sb.append("name=");
                    sb.append(dXTemplateItem.f());
                    sb.append("version=");
                    sb.append(dXTemplateItem.g());
                    sb.append("\n");
                }
                arc.a().a("DX下载失败", arc.a.a().b("AURAAspectLifeCycleDxDownloadExtension").a(bao.CACHE_KEY_TEMPLATE_INFO, sb.toString()).b());
            }
        } catch (Exception unused) {
        }
    }

    private void a(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (DXTemplateItem dXTemplateItem : list) {
                a(dXTemplateItem);
            }
        }
    }

    private void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
        } else if (bau.a(this.d)) {
        } else {
            Iterator<AURARenderComponent> it = this.d.iterator();
            while (it.hasNext()) {
                AURARenderComponentData aURARenderComponentData = it.next().data;
                if (aURARenderComponentData != null && aURARenderComponentData.container != null) {
                    AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
                    String str = aURARenderComponentContainer.name;
                    if (!StringUtils.isEmpty(str) && a.b.f2133a.equals(aURARenderComponentContainer.containerType) && str.equals(dXTemplateItem.f11925a)) {
                        aURARenderComponentContainer.version = String.valueOf(dXTemplateItem.b);
                        aURARenderComponentContainer.url = dXTemplateItem.c;
                        aURARenderComponentContainer.identifySuffix = String.valueOf(System.currentTimeMillis());
                        aURARenderComponentContainer.isPreset = false;
                    }
                }
            }
        }
    }

    private void f() {
        RecyclerView recyclerView;
        final RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        arc.a().a("DX下载完成后刷新界面#第一行", arc.a.a().b("AURAAspectLifeCycleDxDownloadExtension").b());
        AURAGlobalData c = c();
        if (c == null || (recyclerView = (RecyclerView) c.get("render_view", RecyclerView.class)) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        if (this.c == null) {
            this.c = new atk();
        }
        this.c.a(new Runnable() { // from class: tb.avm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                arc.a().a("DX下载完成后刷新界面#真实开始刷新", arc.a.a().b("AURAAspectLifeCycleDxDownloadExtension").b());
                RecyclerView.Adapter adapter2 = adapter;
                if (adapter2 instanceof atq) {
                    ((atq) adapter2).a(true);
                } else {
                    adapter2.notifyDataSetChanged();
                }
            }
        });
    }

    @Override // tb.arn, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ExecutorService executorService = this.e;
        if (executorService != null && !executorService.isShutdown()) {
            try {
                this.e.shutdownNow();
            } catch (Exception e) {
                ard a2 = arc.a();
                a2.c("AURAAspectLifeCycleDxDownloadExtension", MessageID.onDestroy, "停止线程池报错：" + e.getMessage());
            }
        }
        bd bdVar = this.b;
        if (bdVar != null) {
            bdVar.b(this);
            DinamicXEngine d = this.b.d();
            if (d != null) {
                d.o();
            }
        }
        CopyOnWriteArrayList<AURARenderComponent> copyOnWriteArrayList = this.d;
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.clear();
    }
}
