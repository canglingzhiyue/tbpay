package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.bf;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.b;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class leh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HAS_ENQUEUE_KEY = "enqueued";

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30521a;
    private final DinamicXEngine b;
    private final IMainLifecycleService c;
    private final ICacheService d;
    private final IPullSecondFloorService e;
    private final b f;
    private final Set<Integer> g = Collections.synchronizedSet(new HashSet());

    static {
        kge.a(60798766);
    }

    public static /* synthetic */ void a(leh lehVar, DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c468946", new Object[]{lehVar, dXRootView, jSONObject});
        } else {
            lehVar.b(dXRootView, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(leh lehVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f29fde6d", new Object[]{lehVar})).booleanValue() : lehVar.b();
    }

    public leh(ljs ljsVar, DinamicXEngine dinamicXEngine, b bVar) {
        this.f30521a = ljsVar;
        this.b = dinamicXEngine;
        this.f = bVar;
        this.c = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        this.d = (ICacheService) ljsVar.a(ICacheService.class);
        this.e = (IPullSecondFloorService) ljsVar.a(IPullSecondFloorService.class);
    }

    public View a(Context context, ViewGroup viewGroup, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b931ba4a", new Object[]{this, context, viewGroup, dXTemplateItem});
        }
        DXTemplateItem a2 = this.b.a(dXTemplateItem);
        DXResult<DXRootView> dXResult = new DXResult<>();
        if (a2 != null) {
            ldf.d("DinamicX3Render", "preCreateView name: " + a2.f11925a + "version: " + a2.b);
            dXResult = this.b.a(context, a2);
            ldf.d("DinamicX3Render", "dxResult name:" + a2.f11925a + " , hitStatus: " + dXResult.d());
        }
        if (dXResult.f11780a != null) {
            a(dXResult.f11780a);
        }
        if (viewGroup == null) {
            ldf.d("DinamicX3Render", "createDinamicView parent is null");
        }
        return dXResult.f11780a;
    }

    public void a(View view, BaseSectionModel<?> baseSectionModel, ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3e85cf", new Object[]{this, view, baseSectionModel, baVar});
        } else if (!(view instanceof DXRootView)) {
        } else {
            a((DXRootView) view, (JSONObject) baseSectionModel, baVar);
        }
    }

    private void a(final DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else {
            this.b.a(dXRootView, new DXRootView.a() { // from class: tb.leh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void b(DXRootView dXRootView2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a57523d9", new Object[]{this, dXRootView2, new Integer(i)});
                    } else if (i == 0) {
                        if (leh.a(leh.this)) {
                            return;
                        }
                        leh lehVar = leh.this;
                        DXRootView dXRootView3 = dXRootView;
                        lehVar.a(dXRootView3, dXRootView3.getData());
                    } else {
                        leh lehVar2 = leh.this;
                        DXRootView dXRootView4 = dXRootView;
                        leh.a(lehVar2, dXRootView4, dXRootView4.getData());
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void a(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                    } else if (i == 0) {
                        if (leh.a(leh.this)) {
                            return;
                        }
                        leh lehVar = leh.this;
                        DXRootView dXRootView2 = dXRootView;
                        lehVar.a(dXRootView2, dXRootView2.getData());
                    } else {
                        leh lehVar2 = leh.this;
                        DXRootView dXRootView3 = dXRootView;
                        leh.a(lehVar2, dXRootView3, dXRootView3.getData());
                    }
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void a(DXRootView dXRootView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acc619e9", new Object[]{this, dXRootView2});
                        return;
                    }
                    leh lehVar = leh.this;
                    DXRootView dXRootView3 = dXRootView;
                    leh.a(lehVar, dXRootView3, dXRootView3.getData());
                }

                @Override // com.taobao.android.dinamicx.DXRootView.a
                public void b(DXRootView dXRootView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView2});
                        return;
                    }
                    leh lehVar = leh.this;
                    DXRootView dXRootView3 = dXRootView;
                    lehVar.a(dXRootView3, dXRootView3.getData());
                }
            });
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{this, dXRootView, jSONObject});
        } else if (e() || dXRootView == null || jSONObject == null || !StringUtils.isEmpty(jSONObject.getString("enqueued"))) {
        } else {
            if (!f()) {
                jSONObject.put("enqueued", "y");
            }
            if (!c()) {
                ldf.a("DinamicX3Render", "viewAppear: 不通知 appear");
                return;
            }
            if (f()) {
                jSONObject.put("enqueued", "y");
            }
            this.b.b(dXRootView);
            b(dXRootView);
        }
    }

    private void b(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ba13c6", new Object[]{this, dXRootView, jSONObject});
        } else if (dXRootView == null || jSONObject == null || StringUtils.isEmpty(jSONObject.getString("enqueued"))) {
        } else {
            ldf.a("DinamicX3Render", "viewDisappear:", this.f30521a.a().a(), ", section:", lix.a(jSONObject));
            c(dXRootView);
            this.b.a(dXRootView);
            jSONObject.remove("enqueued");
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService == null) {
            ldf.d("DinamicX3Render", "isCurrentTab sceneService == null");
            return true;
        }
        return iMainLifecycleService.isSelect();
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        IPullSecondFloorService iPullSecondFloorService = this.e;
        return iPullSecondFloorService != null && iPullSecondFloorService.isOnPullSecondFloor();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a();
    }

    private void b(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView});
            return;
        }
        lgf d = d();
        if (d == null || !d.a(d.a())) {
            return;
        }
        d.a(dXRootView, true);
    }

    private void c(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2079eeb", new Object[]{this, dXRootView});
            return;
        }
        lgf d = d();
        if (d == null) {
            return;
        }
        d.a(dXRootView, false);
    }

    private lgf d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgf) ipChange.ipc$dispatch("261c3c50", new Object[]{this});
        }
        ICacheService iCacheService = this.d;
        if (iCacheService == null) {
            ldf.d("DinamicX3Render", "getRecyclerViewScrollEventPost mCacheService is null");
            return null;
        }
        return (lgf) iCacheService.getCacheObject(lgf.KEY_INFO_FLOW_SCROLL_EVENT_POST, lgf.class);
    }

    private void a(DXRootView dXRootView, JSONObject jSONObject, ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14127044", new Object[]{this, dXRootView, jSONObject, baVar});
            return;
        }
        DXRenderOptions.a g = new DXRenderOptions.a().a(gbg.a()).b(gbg.b()).a(baVar).g(true);
        DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
        if (dxTemplateItem != null) {
            ldf.d("DinamicX3Render", "rendTemplate name：" + dxTemplateItem.f11925a + " version: " + dxTemplateItem.b);
        }
        bf bfVar = new bf();
        bf.b bVar = new bf.b();
        if (lea.a(jSONObject) >= 0) {
            if (qnl.c()) {
                bVar.b(true);
                bVar.a(false);
            } else if (qnl.d()) {
                bVar.a(false);
                bVar.c(false);
            }
        }
        bfVar.a(bVar);
        g.a(bfVar);
        DXResult<DXRootView> a2 = this.b.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, g.a());
        if (dxTemplateItem != null) {
            ldf.d("DinamicX3Render", "rendTemplate name：" + dxTemplateItem.f11925a + " version: " + dxTemplateItem.b + " , hitStatus: " + a2.d());
        }
        if (!a2.b()) {
            return;
        }
        ljc.a(new ljb(this.f30521a.a().a(), "dx3Render", 3002, "dx3 renderTemplate error", a2.a().toString()));
        ldf.d("DinamicX3Render", a2.a().toString());
    }

    public void a(Context context, DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, boolean z, int i, InfoFlowDxUserContext infoFlowDxUserContext) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e75a8d", new Object[]{this, context, dXTemplateItem, baseSectionModel, new Boolean(z), new Integer(i), infoFlowDxUserContext});
        } else if (!xnh.a()) {
            a(context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext);
        } else {
            int a2 = lea.a((JSONObject) baseSectionModel);
            int a3 = this.f.a(baseSectionModel.mo1099getTemplate());
            ldf.d("DinamicX3Render", "preRender...viewType:" + a3 + " , name:" + baseSectionModel.getSectionBizCode() + " , pageNum:" + i + " , isCache:" + z + " , position:" + a2);
            if (i == 0) {
                if (z) {
                    boolean z3 = a2 >= 0;
                    if (a2 >= 8) {
                        z2 = false;
                    }
                    if (z3 & z2) {
                        b(context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext);
                    }
                } else {
                    boolean z4 = a2 >= 0;
                    if (a2 >= 8) {
                        z2 = false;
                    }
                    if ((z4 & z2) && !this.g.contains(Integer.valueOf(a3))) {
                        b(context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext);
                    } else {
                        b(context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext);
                    }
                }
            } else if (i > 0 && !this.g.contains(Integer.valueOf(a3))) {
                b(context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext);
            }
            this.g.add(Integer.valueOf(a3));
        }
    }

    private void a(Context context, DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, InfoFlowDxUserContext infoFlowDxUserContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78339a5c", new Object[]{this, context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext});
            return;
        }
        DXRenderOptions a2 = new DXRenderOptions.a().a((ba) infoFlowDxUserContext).a();
        if (!ldj.a("enableFetchTemplateBeforePreRender", true)) {
            this.b.a(context, dXTemplateItem, baseSectionModel, -1, a2);
            return;
        }
        DXTemplateItem a3 = this.b.a(dXTemplateItem);
        if (a3 == null) {
            ldf.d("DinamicX3Render", "availableTemplate == null");
            return;
        }
        ldf.d("DinamicX3Render", "preRender，当前的模版名称是:" + a3.f11925a + "版本号是:" + a3.b);
        this.b.a(context, a3, baseSectionModel, -1, a2);
    }

    private void b(Context context, DXTemplateItem dXTemplateItem, BaseSectionModel<?> baseSectionModel, InfoFlowDxUserContext infoFlowDxUserContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95cf1d", new Object[]{this, context, dXTemplateItem, baseSectionModel, infoFlowDxUserContext});
            return;
        }
        DXRenderOptions a2 = new DXRenderOptions.a().a((ba) infoFlowDxUserContext).a();
        if (!ldj.a("enableFetchTemplateBeforePreRender", true)) {
            this.b.b(context, dXTemplateItem, baseSectionModel, -1, a2);
            return;
        }
        DXTemplateItem a3 = this.b.a(dXTemplateItem);
        if (a3 == null) {
            ldf.d("DinamicX3Render", "availableTemplate == null");
            return;
        }
        ldf.d("DinamicX3Render", "preRenderX，当前的模版名称是:" + a3.f11925a + "版本号是:" + a3.b);
        this.b.b(context, a3, baseSectionModel, -1, a2);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : !ldj.a("enableFixInfoFlowUnselectStartSlider", true) && !a();
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : ldj.a("enableChangeViewAppearFilterFlag", true);
    }
}
