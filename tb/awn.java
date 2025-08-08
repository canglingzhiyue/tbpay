package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import anet.channel.strategy.dispatch.DispatchCore;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.arc;
import tb.awm;

/* loaded from: classes2.dex */
public abstract class awn extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String d = awn.class.getSimpleName();
    private bd e;
    private asz f;
    private aqs g;
    private int h;
    private int i;

    static {
        kge.a(-1482549877);
    }

    public static /* synthetic */ Object ipc$super(awn awnVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    public abstract void a(bd bdVar, awm awmVar);

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        a(aURAGlobalData);
        this.g = aqsVar;
    }

    private void a(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed894fe", new Object[]{this, aURAGlobalData});
            return;
        }
        this.e = (bd) aURAGlobalData.get("auraRenderDxEngine", bd.class);
        if (this.e != null) {
            return;
        }
        this.e = new bd(new DXEngineConfig(this.c.d()));
        this.e.a(38447420286L, new axe());
        this.e.a(7023701163946200378L, new axd());
        aURAGlobalData.update("auraRenderDxEngine", this.e);
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        Context context = viewGroup.getContext();
        if (this.e == null) {
            a(DispatchCore.CHECK_SIGN_FAIL, "engineRouter为空", aURARenderComponentContainer);
            return a(context);
        }
        a(viewGroup);
        DXTemplateItem a2 = asx.a(aURARenderComponentContainer);
        if (a2 == null) {
            a("-1001", "组件信息无法转换为DXTemplateItem", aURARenderComponentContainer);
            return a(context);
        }
        DXTemplateItem a3 = this.e.a(a2);
        if (a3 == null) {
            arc.a().b("createViewError#dxTemplateItem is null", arc.a.a().b(this.d).a("templateName", a2.f11925a == null ? "" : a2.f11925a).b());
        } else {
            a2 = a3;
        }
        DXResult<DXRootView> a4 = this.e.a(context, a2);
        if (a4 == null || a4.b() || a4.f11780a == null) {
            a("-1001", "创建组件失败", aURARenderComponentContainer);
            return a(context);
        }
        return a4.f11780a;
    }

    private void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.i = gbg.b();
        this.h = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (this.e == null) {
            a(DispatchCore.RESOLVE_ANSWER_FAIL, "engineRouter为空", (AURARenderComponentContainer) null);
        } else {
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData == null) {
                a("-1002", "渲染失败，组件数据为空", (AURARenderComponentContainer) null);
                return;
            }
            DXRootView a2 = a(view);
            if (a2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fields", JSONObject.toJSON(aURARenderComponentData.fields));
                jSONObject.put("events", JSONObject.toJSON(aURARenderComponentData.events));
                jSONObject.put("status", (Object) aURARenderComponentData.status);
                a(this.e, new awm.a().a(i).a(aURARenderComponent).a(a2).a(jSONObject).c(this.i).b(this.h).a());
                return;
            }
            a("-1002", "找不到DXRootView", aURARenderComponentData.container);
        }
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        if (this.f == null) {
            this.f = new asz();
        }
        return this.f.a(context);
    }

    private DXRootView a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fd04df2d", new Object[]{this, view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            DXRootView a2 = a(viewGroup.getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final void a(String str, String str2, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e814f730", new Object[]{this, str, str2, aURARenderComponentContainer});
        } else if (this.g == null) {
        } else {
            b bVar = new b(1, "AURARenderServiceDomain", str, str2);
            if (aURARenderComponentContainer != null) {
                bVar.a("containerName", aURARenderComponentContainer.name).a("containerVersion", aURARenderComponentContainer.version).a("containerUrl", aURARenderComponentContainer.url);
            }
            this.g.a(bVar);
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.f2133a;
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = null;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && aURARenderComponentData.container != null) {
            AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
            StringBuilder sb = new StringBuilder();
            sb.append(aURARenderComponentContainer.containerType);
            sb.append("_");
            sb.append(aURARenderComponentContainer.name);
            sb.append("_");
            sb.append(aURARenderComponentContainer.version);
            sb.append(aURARenderComponentContainer.identifySuffix == null ? "" : aURARenderComponentContainer.identifySuffix);
            str = sb.toString();
        }
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        ard a2 = arc.a();
        String str2 = this.d;
        a2.c(str2, "getItemViewType", "failed to get itemViewType from component, use system time instead, component=" + aURARenderComponent);
        return valueOf;
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.g = null;
        bd bdVar = this.e;
        if (bdVar != null && bdVar.d() != null) {
            this.e.d().o();
        }
        this.e = null;
    }
}
