package tb;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.widget.c;
import com.taobao.android.detail.core.detail.content.f;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.standard.widget.a;
import com.taobao.android.detail.core.standard.widget.lightoff.c;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.core.standard.widget.lightoff.model.a;
import com.taobao.android.detail.ttdetail.TTDetailBaseActivity;
import com.taobao.android.detail.ttdetail.utils.bc;
import com.taobao.android.detail.ttdetail.utils.bd;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.sku.pad.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ezh;

/* loaded from: classes4.dex */
public class emp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f27433a;
    private ba b;
    private com.taobao.android.detail.core.standard.widget.a c;
    private FrameLayout e;
    private ezh f;
    private Map<String, DXRootView> d = new HashMap();
    private boolean g = emu.c();

    static {
        kge.a(731246821);
    }

    public static /* synthetic */ Map a(emp empVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("43a94745", new Object[]{empVar}) : empVar.d;
    }

    public static /* synthetic */ a b(emp empVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5175c1ff", new Object[]{empVar}) : empVar.f27433a;
    }

    public static /* synthetic */ ezh c(emp empVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ezh) ipChange.ipc$dispatch("4eaf2041", new Object[]{empVar}) : empVar.f;
    }

    public static /* synthetic */ com.taobao.android.detail.core.standard.widget.a d(emp empVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.widget.a) ipChange.ipc$dispatch("b5c935af", new Object[]{empVar}) : empVar.c;
    }

    public emp(a aVar, c cVar) {
        this.b = cVar;
        this.f27433a = aVar;
    }

    public void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
        } else if (this.f27433a.i == null || this.f27433a.i.size() == 0) {
        } else {
            if (this.g) {
                b(frameLayout);
            } else {
                c(frameLayout);
            }
        }
    }

    private void b(final FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713b9fec", new Object[]{this, frameLayout});
            return;
        }
        if (this.f27433a.f9909a instanceof TTDetailBaseActivity) {
            this.f = ((TTDetailBaseActivity) this.f27433a.f9909a).g().f();
            this.f.a(emo.DX_EVENT_XLIGHTOFFPAGETAP, new emo());
        } else if (this.f27433a.f9909a != null) {
            this.f = new ezh.a(this.f27433a.f9909a, ezh.DINAMIC_BIZ_NAME).a(15).a("detail").a();
            this.f.a(emo.DX_EVENT_XLIGHTOFFPAGETAP, new emo());
            bd.a(this.f);
            bc.a(this.f);
        }
        this.e = frameLayout;
        for (final LightOffFloatModel lightOffFloatModel : this.f27433a.i) {
            if ("dinamicx".equals(lightOffFloatModel.containerType) && this.f != null) {
                b(lightOffFloatModel);
                final ezi eziVar = new ezi(lightOffFloatModel.name, f.a(lightOffFloatModel.version), lightOffFloatModel.url);
                this.f.a(eziVar, new ezh.b() { // from class: tb.emp.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ezh.b
                    public void a(ViewGroup viewGroup) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                        } else if (!(viewGroup instanceof DXRootView)) {
                        } else {
                            DXRootView dXRootView = (DXRootView) viewGroup;
                            emp.a(emp.this).put(eziVar.a(), dXRootView);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            if (b.INSTANCE.a(emp.b(emp.this).f9909a)) {
                                layoutParams.gravity = 85;
                            }
                            frameLayout.addView(dXRootView, layoutParams);
                            emp.this.a(lightOffFloatModel);
                            emp.c(emp.this).a(dXRootView);
                            i.a(com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff), "addFloatViews success");
                        }
                    }

                    @Override // tb.ezh.b
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        String a2 = com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff);
                        i.a(a2, "addFloatViews failure: " + str);
                    }
                });
            }
        }
    }

    private void c(final FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef135bed", new Object[]{this, frameLayout});
            return;
        }
        if (this.c == null) {
            this.c = new com.taobao.android.detail.core.standard.widget.a(this.f27433a.f9909a);
            this.c.a(emo.DX_EVENT_XLIGHTOFFPAGETAP, new emo());
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            this.c.a(com.taobao.android.detail.core.aura.widget.c.DX_WIDGET_ID, new c.b());
            this.c.a(dxf.DX_EVENT_DETAILSKUSCROLLED, new dxf(concurrentHashMap));
            this.c.a(dxe.DX_PARSER_DETAILSKUGETSCROLLED, new dxe(concurrentHashMap));
        }
        this.e = frameLayout;
        for (final LightOffFloatModel lightOffFloatModel : this.f27433a.i) {
            if ("dinamicx".equals(lightOffFloatModel.containerType)) {
                final DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.c = lightOffFloatModel.url;
                dXTemplateItem.f11925a = lightOffFloatModel.name;
                dXTemplateItem.b = f.a(lightOffFloatModel.version);
                b(lightOffFloatModel);
                this.c.a(dXTemplateItem, new JSONObject(lightOffFloatModel.data), true, 0, new a.InterfaceC0381a() { // from class: tb.emp.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                    public void a(DXTemplateItem dXTemplateItem2, DXResult<DXRootView> dXResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem2, dXResult});
                        } else if (dXResult.b()) {
                            String a2 = com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff);
                            com.taobao.android.detail.core.utils.i.a(a2, "renderDX onRenderSuccess hasErrror:" + dXResult.a().toString());
                        } else {
                            emp.a(emp.this).put(dXTemplateItem.f11925a, dXResult.f11780a);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                            if (b.INSTANCE.a(emp.b(emp.this).f9909a)) {
                                layoutParams.gravity = 85;
                            }
                            frameLayout.addView(dXResult.f11780a, layoutParams);
                            com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff), "renderDX onRenderSuccess");
                            if (dXResult.f11780a.getData() != null && !dXResult.f11780a.getData().equals(lightOffFloatModel.data)) {
                                emp.this.a(lightOffFloatModel);
                            }
                            emp.d(emp.this).a().b(dXResult.f11780a);
                        }
                    }

                    @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                    public void a(DXTemplateItem dXTemplateItem2, s sVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem2, sVar});
                            return;
                        }
                        String a2 = com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff);
                        com.taobao.android.detail.core.utils.i.a(a2, "onRenderFailure:" + sVar.toString());
                    }
                }, this.b);
            }
        }
    }

    private void b(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8e61f4", new Object[]{this, lightOffFloatModel});
        } else if (lightOffFloatModel.data.getJSONObject("fields") == null) {
        } else {
            int c = gbg.c(this.f27433a.f9909a, this.e.getHeight());
            lightOffFloatModel.data.getJSONObject("fields").put("dxHeight", (Object) Integer.valueOf(gbg.c(this.f27433a.f9909a, this.e.getHeight())));
            lightOffFloatModel.data.getJSONObject("fields").put("statusHeight", (Object) Integer.valueOf(gbg.c(this.f27433a.f9909a, ecr.a())));
            String a2 = com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff);
            com.taobao.android.detail.core.utils.i.d(a2, "renderDX dxHeight:" + c);
        }
    }

    public void a(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710750b3", new Object[]{this, lightOffFloatModel});
        } else if (this.g) {
            c(lightOffFloatModel);
        } else {
            d(lightOffFloatModel);
        }
    }

    private void c(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e157335", new Object[]{this, lightOffFloatModel});
        } else if (!"dinamicx".equals(lightOffFloatModel.containerType) || this.f == null) {
        } else {
            DXRootView dXRootView = this.d.get(lightOffFloatModel.name);
            if (dXRootView == null) {
                i.a(com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff), "updateFloatView no rootView");
                return;
            }
            b(lightOffFloatModel);
            this.f.a(dXRootView, gbg.a(), gbg.b(), new JSONObject(lightOffFloatModel.data), new ezh.d() { // from class: tb.emp.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.d
                public void a(ViewGroup viewGroup) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                    } else {
                        i.a(com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff), "updateFloatView success");
                    }
                }

                @Override // tb.ezh.d
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    String a2 = com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff);
                    i.a(a2, "updateFloatView failure: " + str);
                }
            }, true, this.b);
        }
    }

    private void d(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9c8476", new Object[]{this, lightOffFloatModel});
        } else if (!"dinamicx".equals(lightOffFloatModel.containerType)) {
        } else {
            DXRootView dXRootView = this.d.get(lightOffFloatModel.name);
            if (dXRootView == null) {
                com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff), "updateFloatView no rootView");
                return;
            }
            b(lightOffFloatModel);
            this.c.a(dXRootView, new JSONObject(lightOffFloatModel.data), new a.InterfaceC0381a() { // from class: tb.emp.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                    } else if (!dXResult.b()) {
                        com.taobao.android.detail.core.utils.i.d(com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff), "updateDXView onRenderSuccess");
                    } else {
                        String a2 = com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff);
                        com.taobao.android.detail.core.utils.i.a(a2, "updateDXView onRenderSuccess hasErrror:" + dXResult.a().toString());
                    }
                }

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, s sVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem, sVar});
                        return;
                    }
                    String a2 = com.taobao.android.detail.core.performance.i.a("DxFloatController", BTags.XLightOff);
                    com.taobao.android.detail.core.utils.i.a(a2, "onRenderFailure:" + sVar.toString());
                }
            }, this.b);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (Map.Entry<String, DXRootView> entry : this.d.entrySet()) {
            entry.getValue().setVisibility(i);
        }
    }
}
