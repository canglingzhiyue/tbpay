package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;

/* loaded from: classes7.dex */
public class lor extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long LOADH5 = 9640909935573475L;

    /* renamed from: a  reason: collision with root package name */
    private los f30777a;

    static {
        kge.a(1317801948);
    }

    public static /* synthetic */ Object ipc$super(lor lorVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return a("runtimeContext为空");
        }
        ljs a2 = lfq.a(h);
        if (a2 == null) {
            return a("infoFlowContext为空");
        }
        if (dlhVar == null) {
            return a("abilityData为空");
        }
        llj a3 = a(dlhVar, h);
        if (a3 == null) {
            return a("multiclassTabModel is null");
        }
        IMulticlassTabService iMulticlassTabService = (IMulticlassTabService) a2.a(IMulticlassTabService.class);
        if (iMulticlassTabService == null) {
            return a("tabH5ContainerService is null");
        }
        iMulticlassTabService.loadTabContent("h5", a3);
        a(h).a(a2);
        return new dla();
    }

    private los a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (los) ipChange.ipc$dispatch("6fc3b13d", new Object[]{this, dXRuntimeContext});
        }
        if (this.f30777a == null) {
            this.f30777a = new los(dXRuntimeContext);
        }
        return this.f30777a;
    }

    private llj a(dlh dlhVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (llj) ipChange.ipc$dispatch("89bc2d53", new Object[]{this, dlhVar, dXRuntimeContext});
        }
        JSONObject b = b(dlhVar, dXRuntimeContext);
        if (b == null) {
            return null;
        }
        return new loi(b.getString("url"), new loj("TBH5TabChange", a(b)), new lok(a(dXRuntimeContext, dlhVar), b.getString("tabLoading")));
    }

    private int a(DXRuntimeContext dXRuntimeContext, dlh dlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c28265c", new Object[]{this, dXRuntimeContext, dlhVar})).intValue();
        }
        Context m = dXRuntimeContext.m();
        String c = dlhVar.c("marginTop");
        if (StringUtils.isEmpty(c)) {
            c = "0";
        }
        return gbg.a(m, c, -1);
    }

    private JSONObject b(dlh dlhVar, DXRuntimeContext dXRuntimeContext) {
        BaseSectionModel<?> b;
        BaseSectionModel createBaseSectionModel;
        BaseItemModel mo1097getItem;
        BaseSubItemModel mo1094getBaseItemModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("12753b4a", new Object[]{this, dlhVar, dXRuntimeContext});
        }
        Object f = dlhVar.f("h5Data");
        if ((f instanceof JSONObject) && (b = lfq.b(dXRuntimeContext)) != null && (createBaseSectionModel = b.createBaseSectionModel((JSONObject) f)) != null && (mo1097getItem = createBaseSectionModel.mo1097getItem()) != null && (mo1094getBaseItemModel = mo1097getItem.mo1094getBaseItemModel(0)) != null) {
            return mo1094getBaseItemModel.getSmartContent();
        }
        return null;
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tabName", (Object) jSONObject.getString("tabName"));
        jSONObject2.put("url", (Object) jSONObject.getString("url"));
        jSONObject2.put("channelId", (Object) jSONObject.getString("channelId"));
        return jSONObject2;
    }

    private dkw a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("7c6e6344", new Object[]{this, str}) : new dkw(new dkv(30000, str), true);
    }

    /* loaded from: classes.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2088979123);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public lor a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (lor) ipChange.ipc$dispatch("16bdb653", new Object[]{this, obj}) : new lor();
        }
    }
}
