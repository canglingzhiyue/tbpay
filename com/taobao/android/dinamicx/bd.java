package com.taobao.android.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fnl;
import tb.fut;
import tb.fve;
import tb.kge;

/* loaded from: classes5.dex */
public class bd extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DinamicXEngine c;
    public DTemplateManager d;

    static {
        kge.a(-1157101785);
    }

    private boolean d(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd489958", new Object[]{this, dXTemplateItem})).booleanValue() : dXTemplateItem != null;
    }

    public static /* synthetic */ Object ipc$super(bd bdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DinamicXEngine d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("fa9f483c", new Object[]{this}) : this.c;
    }

    public static void a(Context context, v vVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe80f2d6", new Object[]{context, vVar, new Boolean(z)});
            return;
        }
        try {
            DinamicXEngine.a(context, vVar);
            com.taobao.android.dinamic.e.a(context, z);
        } catch (Throwable unused) {
        }
    }

    public static Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[0]) : DinamicXEngine.i();
    }

    public bd(DXEngineConfig dXEngineConfig) {
        super(dXEngineConfig);
        this.c = new DinamicXEngine(dXEngineConfig);
        this.b = this.c.b;
        this.d = DTemplateManager.a(this.f11887a);
    }

    public void a(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                DXTemplateItem dXTemplateItem = list.get(i);
                if (!b(dXTemplateItem)) {
                    if (!TextUtils.isEmpty(dXTemplateItem.c) && dXTemplateItem.c.endsWith(".xml")) {
                        arrayList2.add(c(dXTemplateItem));
                    }
                } else {
                    arrayList.add(dXTemplateItem);
                }
            }
            if (this.d != null && arrayList2.size() > 0) {
                this.d.a(arrayList2, new com.taobao.android.dinamic.tempate.a() { // from class: com.taobao.android.dinamicx.bd.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamic.tempate.a
                    public void a(com.taobao.android.dinamic.tempate.b bVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fab23079", new Object[]{this, bVar});
                        } else if (bVar == null) {
                        } else {
                            bd.this.c.g.a(bd.this.b(bVar.b), bd.this.b(bVar.c));
                        }
                    }
                });
            }
            if (this.c == null || arrayList.size() <= 0) {
                return;
            }
            this.c.a(arrayList);
        } catch (Throwable th) {
            a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_DOWNLOAD, (DXTemplateItem) null, 20008, com.taobao.android.dinamicx.exception.a.a(th), (Map<String, String>) null);
        }
    }

    public DXResult<DXRootView> a(Context context, ViewGroup viewGroup, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("3a4988d9", new Object[]{this, context, viewGroup, dXTemplateItem});
        }
        try {
            if (!d(dXTemplateItem)) {
                return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_CREATE_VIEW, dXTemplateItem, 20012, "template is null ", (Map<String, String>) null));
            }
            if (b(dXTemplateItem)) {
                return this.c.b(context, dXTemplateItem);
            }
            com.taobao.android.dinamic.view.b a2 = com.taobao.android.dinamic.d.a(this.f11887a).a(context, (ViewGroup) null, c(dXTemplateItem));
            DXRootView dXRootView = new DXRootView(context);
            DXResult<DXRootView> dXResult = new DXResult<>(dXRootView);
            if (a2 == null) {
                dXResult.a(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_CREATE_VIEW, dXTemplateItem, 20013, "2.0 createView 失败 viewResult == null", (Map<String, String>) null));
                dXResult.a((DXResult<DXRootView>) null);
                return dXResult;
            }
            if (!a2.c()) {
                dXResult.a(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_CREATE_VIEW, dXTemplateItem, 20013, "2.0 createView 失败", a2.b().c()));
                if (a2.e() == null) {
                    dXResult.a((DXResult<DXRootView>) null);
                    return dXResult;
                }
            }
            ViewGroup.LayoutParams layoutParams = a2.e().getLayoutParams();
            if (layoutParams != null) {
                dXRootView.setLayoutParams(layoutParams);
            } else {
                dXRootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            dXRootView.setV2(true);
            dXRootView.dxTemplateItem = dXTemplateItem;
            dXRootView.addView(a2.e());
            a2.a(dXRootView);
            return dXResult;
        } catch (Throwable th) {
            if (DinamicXEngine.j()) {
                th.printStackTrace();
            }
            return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_CREATE_VIEW, dXTemplateItem, 20005, com.taobao.android.dinamicx.exception.a.a(th), (Map<String, String>) null));
        }
    }

    public DXResult<DXRootView> a(Context context, JSONObject jSONObject, DXRootView dXRootView, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("89443634", new Object[]{this, context, jSONObject, dXRootView, new Integer(i), new Integer(i2), obj});
        }
        try {
            DXTemplateItem dXTemplateItem = dXRootView.dxTemplateItem;
            if (!d(dXTemplateItem)) {
                return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, dXTemplateItem, 20006, "template is null ", (Map<String, String>) null));
            }
            if (b(dXTemplateItem)) {
                return this.c.a(context, jSONObject, dXRootView, i, i2, obj);
            }
            com.taobao.android.dinamic.view.b a2 = com.taobao.android.dinamic.d.a(this.f11887a).a(dXRootView, jSONObject, obj);
            if (a2 == null) {
                return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, dXTemplateItem, 20006, "2.0 render 失败", (Map<String, String>) null));
            }
            if (!a2.d()) {
                return new DXResult<>((DXRootView) a2.e(), a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, dXTemplateItem, 20006, "2.0 render 失败", a2.b().c()));
            }
            return new DXResult<>((DXRootView) a2.e());
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, (DXTemplateItem) null, s.DXERROR_ROUTER_RENDER_VIEW_EXCEPTION_CATCH, com.taobao.android.dinamicx.exception.a.a(th), (Map<String, String>) null));
        }
    }

    public DXResult<DXRootView> a(Context context, JSONObject jSONObject, DXRootView dXRootView, int i, DXRenderOptions dXRenderOptions) {
        DXTemplateItem dXTemplateItem;
        DXTemplateItem dXTemplateItem2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("3f49593", new Object[]{this, context, jSONObject, dXRootView, new Integer(i), dXRenderOptions});
        }
        ba baVar = null;
        try {
            dXTemplateItem2 = dXRootView.dxTemplateItem;
        } catch (Throwable th) {
            th = th;
            dXTemplateItem = null;
        }
        try {
            if (!d(dXTemplateItem2)) {
                return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, dXTemplateItem2, 20006, "template is null ", (Map<String, String>) null));
            }
            if (b(dXTemplateItem2)) {
                return this.c.a(context, dXRootView, dXTemplateItem2, jSONObject, i, dXRenderOptions);
            }
            com.taobao.android.dinamic.d a2 = com.taobao.android.dinamic.d.a(this.f11887a);
            if (dXRenderOptions != null) {
                baVar = dXRenderOptions.c();
            }
            com.taobao.android.dinamic.view.b a3 = a2.a(dXRootView, jSONObject, baVar);
            if (a3 == null) {
                return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, dXTemplateItem2, 20006, "2.0 render 失败", (Map<String, String>) null));
            }
            if (!a3.d()) {
                return new DXResult<>((DXRootView) a3.e(), a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, dXTemplateItem2, 20006, "2.0 render 失败", a3.b().c()));
            }
            return new DXResult<>((DXRootView) a3.e());
        } catch (Throwable th2) {
            th = th2;
            dXTemplateItem = dXTemplateItem2;
            if (DinamicXEngine.j()) {
                th.printStackTrace();
            }
            return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_RENDER, dXTemplateItem, s.DXERROR_ROUTER_RENDER_VIEW_EXCEPTION_CATCH, com.taobao.android.dinamicx.exception.a.a(th), (Map<String, String>) null));
        }
    }

    public DXTemplateItem a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("762f314e", new Object[]{this, dXTemplateItem});
        }
        try {
            if (!d(dXTemplateItem)) {
                return null;
            }
            if (b(dXTemplateItem) && this.c != null) {
                DXTemplateItem a2 = this.c.a(dXTemplateItem);
                if (a2 != null) {
                    a2.b(30000);
                }
                return a2;
            }
            DXTemplateItem a3 = a(this.d.d(c(dXTemplateItem)));
            if (a3 != null) {
                a3.b(20000);
            }
            return a3;
        } catch (Throwable th) {
            if (DinamicXEngine.j()) {
                th.printStackTrace();
            }
            a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_FETCH, dXTemplateItem, 20007, com.taobao.android.dinamicx.exception.a.a(th), (Map<String, String>) null);
            return null;
        }
    }

    public boolean a(long j, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("926eae2b", new Object[]{this, new Long(j), futVar})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return false;
        }
        return dinamicXEngine.a(j, futVar);
    }

    public boolean a(long j, bn bnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa971a50", new Object[]{this, new Long(j), bnVar})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return false;
        }
        return dinamicXEngine.a(j, bnVar);
    }

    public boolean a(long j, com.taobao.android.dinamicx.widget.ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a2b987", new Object[]{this, new Long(j), akVar})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return false;
        }
        return dinamicXEngine.a(j, akVar);
    }

    public void a(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e950fd23", new Object[]{this, fveVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.a(fveVar);
    }

    public void b(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d403a4", new Object[]{this, fveVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.c;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.d(fveVar);
    }

    public boolean b(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15c5a1d6", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null) {
            return false;
        }
        if (dXTemplateItem.d() == 30000) {
            return true;
        }
        if (dXTemplateItem.d() == 20000) {
            return false;
        }
        if (!TextUtils.isEmpty(dXTemplateItem.c) && (dXTemplateItem.c.endsWith(".zip") || dXTemplateItem.c.endsWith("._dxv4") || dXTemplateItem.c.contains("._dxv4") || dXTemplateItem.c.contains(".zip"))) {
            return true;
        }
        return TextUtils.isEmpty(dXTemplateItem.c) && dXTemplateItem.b >= 0;
    }

    public DinamicTemplate c(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("442017ad", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        try {
            DinamicTemplate dinamicTemplate = new DinamicTemplate();
            dinamicTemplate.name = dXTemplateItem.f11925a;
            if (dXTemplateItem.b >= 0) {
                dinamicTemplate.version = dXTemplateItem.b + "";
            }
            dinamicTemplate.templateUrl = dXTemplateItem.c;
            return dinamicTemplate;
        } catch (Throwable th) {
            if (DinamicXEngine.j()) {
                th.printStackTrace();
            }
            a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_TRANSFORM_TEMPLATE, (DXTemplateItem) null, 20010, "transformTemplateToV3 error:" + com.taobao.android.dinamicx.exception.a.a(th), (Map<String, String>) null);
            return null;
        }
    }

    public List<DXTemplateItem> b(List<DinamicTemplate> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{this, list});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (list != null && list.size() > 0) {
                for (DinamicTemplate dinamicTemplate : list) {
                    DXTemplateItem a2 = a(dinamicTemplate);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (DinamicXEngine.j()) {
                th.printStackTrace();
            }
            a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_TRANSFORM_TEMPLATE, (DXTemplateItem) null, 20011, "transformTemplateToV3 error:" + com.taobao.android.dinamicx.exception.a.a(th), (Map<String, String>) null);
            return null;
        }
    }

    public DXTemplateItem a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("2dc74c8d", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        try {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f11925a = dinamicTemplate.name;
            if (!TextUtils.isEmpty(dinamicTemplate.version)) {
                dXTemplateItem.b = Long.parseLong(dinamicTemplate.version);
            } else {
                dXTemplateItem.b = -1L;
            }
            dXTemplateItem.c = dinamicTemplate.templateUrl;
            return dXTemplateItem;
        } catch (Throwable th) {
            if (DinamicXEngine.j()) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private s a(String str, DXTemplateItem dXTemplateItem, int i, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("68eb72e4", new Object[]{this, str, dXTemplateItem, new Integer(i), str2, map});
        }
        s sVar = new s(this.f11887a);
        sVar.b = dXTemplateItem;
        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ROUTER, str, i);
        aVar.e = str2;
        aVar.f = map;
        sVar.c.add(aVar);
        com.taobao.android.dinamicx.monitor.b.a(sVar);
        return sVar;
    }

    public void a(String str, com.taobao.android.dinamic.dinamic.h hVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a51e58c", new Object[]{this, str, hVar});
        } else {
            com.taobao.android.dinamic.c.a().a(str, hVar);
        }
    }

    public void a(String str, com.taobao.android.dinamic.dinamic.a aVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4eb6f3", new Object[]{this, str, aVar});
        } else {
            com.taobao.android.dinamic.c.a().a(str, aVar);
        }
    }

    public void a(String str, fnl fnlVar) throws DinamicException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cde57e", new Object[]{this, str, fnlVar});
        } else {
            com.taobao.android.dinamic.c.a().a(str, fnlVar);
        }
    }

    public void a(Context context, JSONObject jSONObject, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8130c639", new Object[]{this, context, jSONObject, dXTemplateItem});
        } else if (!d(dXTemplateItem)) {
            a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_CREATE_VIEW, dXTemplateItem, 20012, "prefetchTemplate template is null ", (Map<String, String>) null);
        } else if (!b(dXTemplateItem)) {
        } else {
            this.c.a(context, jSONObject, dXTemplateItem, -1);
        }
    }

    public DXResult<DXRootView> a(Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("1bd33d78", new Object[]{this, context, dXTemplateItem});
        }
        if (!d(dXTemplateItem)) {
            return new DXResult<>(a(DXMonitorConstant.DX_MONITOR_SERVICE_ID_ROUTER_CREATE_VIEW, dXTemplateItem, 20012, "preCreateView template is null ", (Map<String, String>) null));
        }
        if (b(dXTemplateItem)) {
            return this.c.a(context, dXTemplateItem);
        }
        return this.c.b(context, dXTemplateItem);
    }

    public void a(Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b9f084", new Object[]{this, context, dXTemplateItem, jSONObject, new Integer(i), dXRenderOptions});
        } else if (!b(dXTemplateItem)) {
        } else {
            this.c.a(context, dXTemplateItem, jSONObject, i, dXRenderOptions);
        }
    }
}
