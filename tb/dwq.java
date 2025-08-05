package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.vfw.dataloader.c;
import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.dataloader.h;
import com.alibaba.android.ultron.vfw.dataloader.j;
import com.alibaba.android.ultron.vfw.dataloader.o;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dwq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_MODULE_NAME = "AURADetail";
    public static final String DETAIL2_MODULE_NAME = "detail2";
    public static final String TAG = "UltronEngineProxy";
    private final Context b;
    private d.c c;
    private d f;

    /* renamed from: a  reason: collision with root package name */
    private final String f27039a = "AURADetailParse";
    private List<IDMComponent> d = new ArrayList();
    private List<IDMComponent> e = new ArrayList();

    static {
        kge.a(-723199737);
    }

    public static /* synthetic */ void a(dwq dwqVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af23975a", new Object[]{dwqVar, jSONObject, jSONObject2});
        } else {
            dwqVar.a(jSONObject, jSONObject2);
        }
    }

    public static /* synthetic */ void a(dwq dwqVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70270cb", new Object[]{dwqVar, list});
        } else {
            dwqVar.a(list);
        }
    }

    public dwq(Context context) {
        this.b = context;
        emu.a("com.taobao.android.detail.core.aura.compare.UltronEngineProxy");
    }

    private JSONObject d(b bVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2ba46e5", new Object[]{this, bVar});
        }
        i.a(TAG, "executorParseEngine ");
        this.f = d.a(new UltronInstanceConfig().a(true).a(!f.n() ? AURA_MODULE_NAME : "detail2").c(false), this.b);
        c f = f(bVar);
        if (f == null) {
            return null;
        }
        this.f.a(f);
        this.f.a("AURADetailParse", new o() { // from class: tb.dwq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.dataloader.o
            public void a(com.alibaba.android.ultron.vfw.dataloader.d dVar, com.alibaba.android.ultron.vfw.dataloader.i iVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b088e163", new Object[]{this, dVar, iVar});
                    return;
                }
                d.a d = dVar.d();
                JSONObject jSONObject2 = d.f2693a != null ? d.f2693a : d.c;
                d.c = jSONObject2;
                JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("componentsVO") : null;
                if (jSONObject3 != null) {
                    dwq.a(dwq.this, jSONObject3, jSONObject2);
                    jSONObject2.put("componentsVO", (Object) jSONObject3);
                }
                j jVar = new j();
                jVar.a(jSONObject2);
                iVar.a(jVar);
            }
        });
        com.alibaba.android.ultron.vfw.dataloader.d g = g(bVar);
        final ArrayList arrayList = new ArrayList();
        this.f.a(g, new com.alibaba.android.ultron.vfw.dataloader.f() { // from class: tb.dwq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(h hVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5eca7a1", new Object[]{this, hVar});
                } else {
                    arrayList.add(hVar.a().c);
                }
            }
        });
        if (arrayList.size() != 1 || (jSONObject = (JSONObject) arrayList.get(0)) == null) {
            return null;
        }
        return jSONObject.getJSONObject("data");
    }

    public List<IDMComponent> a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6d91cb05", new Object[]{this, bVar});
        }
        if (this.d.isEmpty()) {
            e(bVar);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        this.d.clear();
        return arrayList;
    }

    public List<IDMComponent> b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("86931ca4", new Object[]{this, bVar});
        }
        if (this.e.isEmpty()) {
            e(bVar);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e);
        this.e.clear();
        return arrayList;
    }

    private void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a837406", new Object[]{this, bVar});
            return;
        }
        JSONObject d = d(bVar);
        try {
            this.f.a(new LinearLayout(this.b), new RecyclerView(this.b), new LinearLayout(this.b));
            this.f.a(d, this.c);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f;
        if (dVar == null) {
            return;
        }
        dVar.m();
        this.f = null;
    }

    private c f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d3446325", new Object[]{this, bVar});
        }
        TemplateInfo c = c(bVar);
        if (c == null) {
            return null;
        }
        c a2 = c.a();
        a2.b("AURADetailParse");
        a2.a(true);
        a2.a(c);
        return a2;
    }

    private com.alibaba.android.ultron.vfw.dataloader.d g(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.dataloader.d) ipChange.ipc$dispatch("136f4a05", new Object[]{this, bVar});
        }
        JSONObject a2 = bVar.a();
        d.a aVar = new d.a();
        aVar.f2693a = a2;
        com.alibaba.android.ultron.vfw.dataloader.d a3 = com.alibaba.android.ultron.vfw.dataloader.d.a("initial", aVar);
        bor borVar = new bor(new d.c() { // from class: tb.dwq.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.instance.d.c
            public void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar2});
                } else if (bVar2 == null || list == null) {
                } else {
                    dwq.a(dwq.this, list);
                }
            }
        });
        this.c = borVar;
        a3.a(borVar);
        return a3;
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object a2 = epz.a(jSONObject2, entry.getValue(), true);
            if (a2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) a2;
                if (jSONObject3.containsKey("filter")) {
                    String string = jSONObject3.getString("filter");
                    if (!TextUtils.isEmpty(string) && com.alibaba.android.ultron.engine.utils.h.a(this.b, string, jSONObject2)) {
                        UnifyLog.d(TAG, "filter过滤掉了VO: " + key);
                        arrayList.add(key);
                    }
                }
            }
            entry.setValue(a2);
        }
        for (String str : arrayList) {
            jSONObject.remove(str);
        }
    }

    private void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.d.clear();
        this.e.clear();
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null) {
                if (a(iDMComponent, "detailInfoUltron")) {
                    this.d.add(iDMComponent);
                } else if (a(iDMComponent, "bottomBar")) {
                    this.e.add(iDMComponent);
                }
            }
        }
    }

    private boolean a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a050eeba", new Object[]{this, iDMComponent, str})).booleanValue();
        }
        if (str.equals(a(iDMComponent))) {
            return true;
        }
        if (iDMComponent.getParent() == null) {
            return false;
        }
        return a(iDMComponent.getParent(), str);
    }

    private String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent}) : iDMComponent.getParent() == null ? iDMComponent.getPosition() : iDMComponent.getParent().getPosition();
    }

    public static TemplateInfo c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateInfo) ipChange.ipc$dispatch("22810e4b", new Object[]{bVar});
        }
        JSONObject jSONObject = (bVar.b() != null ? bVar.a() : bVar.a().getJSONObject("bizData")).getJSONObject("template");
        if (jSONObject == null) {
            return null;
        }
        TemplateInfo templateInfo = new TemplateInfo();
        templateInfo.setUrl(jSONObject.getString("url"));
        templateInfo.setVersion(jSONObject.getString("version"));
        templateInfo.setTemplateId(jSONObject.getString("id"));
        return templateInfo;
    }
}
