package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.mmad.render.dx.event.b;
import com.taobao.mmad.render.dx.widget.a;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class tjk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private xnp f34152a;
    private DXTemplateItem b;
    private tiq e;
    private DinamicXEngine f;
    private DXRootView g;

    static {
        kge.a(-2006516912);
    }

    public tjk(tiq tiqVar) {
        this.e = tiqVar;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f != null) {
        } else {
            this.f = new DinamicXEngine(new DXEngineConfig.a("MMAdBiz").a());
            this.f34152a = new xnp(this.e);
            d();
        }
    }

    public void a(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e950fd23", new Object[]{this, fveVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine == null || fveVar == null) {
            return;
        }
        dinamicXEngine.a(fveVar);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f.a(a.DXMMSWIPEINTERACTIONVIEW_MMSWIPEINTERACTIONVIEW, new a.C0722a());
        this.f.a(szy.DX_PARSER_MMGETLOCALURL, new szy());
        this.f.a(tcs.DX_PARSER_MM_ORANGE, new tcs());
        this.f.a(tda.DX_PARSER_SPLITJSONARRAY, new tda());
        this.f.a(18615516725124L, new com.taobao.mmad.render.dx.event.a(this.e));
        this.f.a(b.COMMITINTERACTEND, new b.a());
    }

    public DXTemplateItem a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("762f314e", new Object[]{this, dXTemplateItem});
        }
        DXTemplateItem a2 = this.f.a(dXTemplateItem);
        if (a2 == null) {
            stv.a("DXRenderService", "render DXTemplateItem after fetch is null");
            tjo.a(tjo.ARG1_DX_DOWNLOAD_ERROR, this.e.d().b(), null);
            return null;
        } else if (a2.b == dXTemplateItem.b) {
            return a2;
        } else {
            stv.a("DXRenderService", "render after fetch version not match, fetchTemplate=" + a2 + ", dxTemplateItem=" + dXTemplateItem);
            tjo.a(tjo.ARG1_DX_TEMPLATE_VERSION_ERROR, this.e.d().b(), null);
            return null;
        }
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        DXTemplateItem b = b(this.e.d().d().getJSONObject("template"));
        stv.a("DXRenderService", "render: DXTemplateItem=" + b);
        DXTemplateItem a2 = a(b);
        if (a2 == null) {
            stv.a("DXRenderService", "render: after fetch dxTemplateItem is null");
            return null;
        }
        this.b = a2;
        DXResult<DXRootView> b2 = this.f.b(Global.getApplication(), a2);
        DXResult<DXRootView> a3 = this.f.a(b2.f11780a.getContext(), b2.f11780a, a2, this.e.d().f(), 0, b());
        this.g = a3.f11780a;
        stv.a("DXRenderService", "render: result view DxError =" + a3.a());
        if (this.g == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("template", b.f11925a);
            tjo.a(tjo.ARG1_DX_RENDER_VIEW_NULL, this.e.d().b(), hashMap);
        }
        this.f.b(this.g);
        return this.g;
    }

    public static DXTemplateItem b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("63ac96f8", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            stv.a("DXRenderService", "convertTemplate error, template is null");
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.b = jSONObject.getLongValue("version");
        dXTemplateItem.f11925a = jSONObject.getString("name");
        dXTemplateItem.c = jSONObject.getString("url");
        if (dXTemplateItem.b <= 0 || StringUtils.isEmpty(dXTemplateItem.f11925a) || StringUtils.isEmpty(dXTemplateItem.c)) {
            stv.a("DXRenderService", "convertTemplate error, template=" + jSONObject);
            return null;
        }
        stv.a("DXRenderService", "convertTemplate success, dxTemplateItem=" + dXTemplateItem);
        return dXTemplateItem;
    }

    private DXRenderOptions b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRenderOptions) ipChange.ipc$dispatch("df6adf9", new Object[]{this}) : new DXRenderOptions.a().a((ba) this.f34152a).a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.f == null || this.g == null) {
            stv.a("DXRenderService", "refreshAfterInteract null, dinamicXEngine=" + this.f + ", renderView=" + this.g);
        } else {
            JSONObject jSONObject = new JSONObject(this.e.d().f());
            jSONObject.put("disableAnimation", (Object) Boolean.valueOf(z));
            this.f.a(this.g.getContext(), this.g, this.b, jSONObject, 0, b());
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.f == null || this.g == null) {
            stv.a("DXRenderService", "refreshAfterInteract null, dinamicXEngine=" + this.f + ", renderView=" + this.g);
        } else {
            JSONObject jSONObject = new JSONObject(this.e.d().f());
            jSONObject.put("disableInteract", (Object) Boolean.valueOf(z));
            this.f.a(this.g.getContext(), this.g, this.b, jSONObject, 0, b());
        }
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject3 = jSONObject.getJSONObject("subSection");
            if (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) == null) {
                return;
            }
            DXTemplateItem c = c(jSONObject2);
            if (c == null) {
                stv.a("DXRenderService", "downloadTemplate dx info error");
                return;
            }
            arrayList.add(c);
            stv.a("DXRenderService", "downloadTemplate start template=" + c);
            this.f.a(arrayList);
        }
    }

    public static DXTemplateItem c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("8266ceb9", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("template");
        if (jSONObject2 == null) {
            stv.a("checkDXInfoValid", "template do not exist in splash data.");
            return null;
        } else if (StringUtils.isEmpty(jSONObject2.getString("name")) || StringUtils.isEmpty(jSONObject2.getString("url")) || jSONObject2.getLongValue("version") <= 0) {
            stv.a("checkDXInfoValid", "skip DX download, not valid DX template, template=" + jSONObject2);
            return null;
        } else {
            DXTemplateItem b = b(jSONObject2);
            if (b != null) {
                return b;
            }
            stv.a("checkDXInfoValid", "downloadTemplate error, templateItem convert fail");
            return null;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.f;
        if (dinamicXEngine != null) {
            dinamicXEngine.a(this.g);
        }
        DXRootView dXRootView = this.g;
        if (dXRootView == null) {
            return;
        }
        dXRootView.setVisibility(4);
    }
}
