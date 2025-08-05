package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.factory.manager.b;
import com.taobao.android.detail.datasdk.model.datamodel.node.LayoutNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.ContainerModel;
import com.taobao.android.detail.datasdk.model.datamodel.template.LayoutModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.jkk;

/* loaded from: classes4.dex */
public class emz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27451a;
    private jkl b;
    private String c;
    private boolean d = false;
    private b e;
    private epk f;

    static {
        kge.a(701223772);
    }

    public emz(Context context) {
        this.c = emx.c(context);
        this.f27451a = context.getApplicationContext();
        this.b = jkl.a(this.f27451a);
        this.b.a(new jkk.b() { // from class: tb.emz.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jkk.b
            public byte[] a(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{this, str}) : epj.p().a(str);
            }
        });
        this.e = emx.a(context).b().l();
        this.f = emx.a(context).b().o();
        emu.a("com.taobao.android.detail.datasdk.engine.dataengine.MainStructureEngine");
    }

    public enh a(epb epbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("71fe7006", new Object[]{this, epbVar});
        }
        ArrayList arrayList = new ArrayList();
        MultiMediaModel multiMediaModel = new MultiMediaModel((ComponentModel) null, epbVar);
        TitleViewModel titleViewModel = new TitleViewModel((ComponentModel) null, epbVar);
        c cVar = new c((ComponentModel) null, epbVar);
        arrayList.add(multiMediaModel);
        arrayList.add(titleViewModel);
        arrayList.add(cVar);
        return new enh(new eng(null, arrayList, null, null));
    }

    public com.taobao.android.detail.datasdk.model.datamodel.node.b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.datamodel.node.b) ipChange.ipc$dispatch("f6a6d5e8", new Object[]{this, jSONObject});
        }
        eqc.a(this.f27451a, "mCreateDetailModel", "主接口数据序列化");
        if (jSONObject == null) {
            return new com.taobao.android.detail.datasdk.model.datamodel.node.b(-2);
        }
        if (jSONObject.size() == 0) {
            return new com.taobao.android.detail.datasdk.model.datamodel.node.b(-1);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new com.taobao.android.detail.datasdk.model.datamodel.node.b(-1);
        }
        JSONObject b = b(jSONObject2);
        if (b == null || b.isEmpty()) {
            this.d = true;
            b = c(jSONObject2);
        }
        if (b == null || b.isEmpty()) {
            b = new JSONObject();
        }
        JSONObject a2 = a(jSONObject2, b);
        a2.put("msoaToken", (Object) this.c);
        a2.put("eventToken", (Object) this.c);
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = new com.taobao.android.detail.datasdk.model.datamodel.node.b(a2);
        eqc.b(this.f27451a, "mCreateDetailModel");
        return bVar;
    }

    public enh a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("c3bf8045", new Object[]{this, bVar});
        }
        eqc.a(this.f27451a, eqc.TAG_PARSE_DETAIL_DATA, "数据解析");
        if (bVar.i() != 0) {
            return new enh(null);
        }
        eqc.a(this.f27451a, eqc.TAG_DETAIL_STRUCTURE, "主结构创建");
        eng b = b(bVar);
        eqc.b(this.f27451a, eqc.TAG_DETAIL_STRUCTURE);
        eqc.a(this.f27451a, eqc.TAG_DETAIL_CONTAINER_STRUCTURE, "主结构创建");
        end a2 = a(bVar, b);
        eqc.b(this.f27451a, eqc.TAG_DETAIL_CONTAINER_STRUCTURE);
        enh enhVar = new enh(b, a2);
        enhVar.f27461a = this.d;
        eqc.b(this.f27451a, eqc.TAG_PARSE_DETAIL_DATA);
        return enhVar;
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        epp.c("MainStructureEngine", "extractApiStackOpt");
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.isEmpty()) {
                return null;
            }
            JSONObject jSONObject2 = jSONArray.getJSONObject(0).getJSONObject("data");
            return jSONObject2 == null ? jSONArray.getJSONObject(0).getJSONObject("value") : jSONObject2;
        } catch (Throwable th) {
            epp.a("MainStructureEngine", "extractApiStackOpt", th);
            return null;
        }
    }

    private JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        try {
            return JSON.parseObject(jSONObject.getString("mockData"));
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            jSONObject = (JSONObject) jSONObject.clone();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(key);
                    if (jSONObject3 != null) {
                        jSONObject.put(key, (Object) a(jSONObject3, (JSONObject) value));
                    } else {
                        jSONObject.put(key, value);
                    }
                } else {
                    jSONObject.put(key, value);
                }
            }
        }
        return jSONObject;
    }

    private eng b(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eng) ipChange.ipc$dispatch("fc9fe0c5", new Object[]{this, bVar});
        }
        eqc.a(this.f27451a, eqc.TAG_CREATE_DINAMIC, "下载创建dinamic");
        LayoutModel a2 = a(new LayoutNode(bVar.a().getJSONObject("layout")));
        eqc.b(this.f27451a, eqc.TAG_CREATE_DINAMIC);
        if (a2 == null) {
            return null;
        }
        eqc.a(this.f27451a, "mCreateViewModel", "创建ViewModel");
        b bVar2 = this.e;
        com.taobao.android.detail.datasdk.model.viewmodel.main.b a3 = bVar2.a(a2.actionBar, bVar);
        com.taobao.android.detail.datasdk.model.viewmodel.main.b c = bVar2.c(a2.bottomBar, bVar);
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> arrayList = new ArrayList<>();
        int size = a2.components.size();
        for (int i = 0; i < size; i++) {
            ComponentModel componentModel = a2.components.get(i);
            if (componentModel.key.contains("main")) {
                epp.b("MainStructureEngine", "发现疑似main_view_container : " + componentModel.key);
            }
            try {
                com.taobao.android.detail.datasdk.model.viewmodel.main.b a4 = bVar2.a(componentModel, bVar);
                if (a4 != null) {
                    arrayList.add(a4);
                }
            } catch (Throwable th) {
                epp.a("MainStructureEngine", "create model " + componentModel.key, th);
            }
        }
        Context context = this.f27451a;
        epx.a(context, emx.c(context), arrayList);
        eqc.b(this.f27451a, "mCreateViewModel");
        epk epkVar = this.f;
        if (epkVar != null) {
            arrayList = epkVar.a(arrayList);
        }
        return new eng(bVar, arrayList, a3, c);
    }

    private LayoutModel a(LayoutNode layoutNode) {
        jko c;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (LayoutModel) ipChange.ipc$dispatch("a0c81ebb", new Object[]{this, layoutNode});
        }
        eqc.a(this.f27451a, "mFetchTemplate", "取模板");
        String str = layoutNode.layoutTemplateId;
        String str2 = layoutNode.ruleTemplateId;
        String str3 = layoutNode.actionTemplateId;
        String str4 = layoutNode.themeTemplateId;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || (TextUtils.isEmpty(str) && layoutNode.layoutJson == null)) {
            str = eni.e;
            str2 = eni.f;
            str3 = eni.g;
            str4 = eni.h;
            z = true;
        }
        if (layoutNode.layoutJson != null && TextUtils.isEmpty(str)) {
            str = eni.e;
        }
        ArrayList<jkn> arrayList = new ArrayList<>();
        eni a2 = eni.a(this.f27451a);
        if (!a2.b(str)) {
            arrayList.add(new jkn(str, eni.e, eni.f27462a));
        }
        if (!a2.c(str2)) {
            arrayList.add(new jkn(str2, eni.f, eni.b));
        }
        if (!a2.d(str3)) {
            arrayList.add(new jkn(str3, eni.g, eni.c));
        }
        if (!a2.e(str4)) {
            arrayList.add(new jkn(str4, eni.h, eni.d));
        }
        epp.b("MainStructureEngine", "templates size :" + arrayList.size());
        if (arrayList.size() == 0) {
            eqc.b(this.f27451a, "mFetchTemplate");
            eqc.a(this.f27451a, "mCreateProtocolMap", "模板数据解析");
            eqc.b(this.f27451a, "mCreateProtocolMap");
            c = a2.c();
        } else {
            HashMap<String, jko> a3 = this.b.a(arrayList, true);
            if (a3 == null) {
                epp.b("MainStructureEngine", "get templates is failed.");
                return null;
            }
            eqc.a(this.f27451a, a3);
            eqc.a(this.f27451a, "mCreateProtocolMap", "模板数据解析");
            if (!a2.b(str)) {
                c = a3.get(str);
            } else {
                c = a2.c();
            }
            if (!a2.c(str2)) {
                a2.a(a3.get(str2).b, str2);
            }
            if (!a2.d(str3)) {
                a2.b(a3.get(str3).b, str3);
            }
            if (!a2.e(str4)) {
                a2.c(a3.get(str4).b, str4);
            }
            eqc.b(this.f27451a, "mFetchTemplate");
            eqc.b(this.f27451a, "mCreateProtocolMap");
        }
        if (c != null && c.c) {
            z = true;
        }
        if (layoutNode.layoutJson == null || z || !d(layoutNode.layoutJson)) {
            return a2.a(c.b);
        }
        return a2.a(layoutNode.layoutJson);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d(com.alibaba.fastjson.JSONObject r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.emz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "265ed169"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            if (r6 == 0) goto L51
            java.lang.String r0 = "homePage"
            com.alibaba.fastjson.JSONArray r6 = r6.getJSONArray(r0)
            if (r6 == 0) goto L51
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r6.next()
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            java.lang.String r1 = "key"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r4 = "bottom_bar"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L52
            java.lang.String r1 = "ID"
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L2a
            goto L52
        L51:
            r2 = 0
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.emz.d(com.alibaba.fastjson.JSONObject):boolean");
    }

    private end a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, eng engVar) {
        ContainerModel e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (end) ipChange.ipc$dispatch("562e64b7", new Object[]{this, bVar, engVar});
        }
        if (bVar == null || engVar == null || engVar.b == null || (e = e(bVar.a().getJSONObject("layout"))) == null) {
            return null;
        }
        b bVar2 = this.e;
        return new end(engVar, bVar2.d(e.navBarComponent, bVar), bVar2.d(e.detailHomeComponent, bVar));
    }

    private ContainerModel e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerModel) ipChange.ipc$dispatch("a6cf6b78", new Object[]{this, jSONObject});
        }
        ContainerModel c = (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("hierarchyData")) == null || !enc.d(jSONObject2.getJSONObject("hierarchy"))) ? null : new enc(this.f27451a).c(jSONObject2);
        if (c != null) {
            return c;
        }
        String a2 = this.b.a(enc.f27456a);
        if (TextUtils.isEmpty(a2)) {
            return c;
        }
        JSONObject parseObject = JSON.parseObject(a2);
        if (enc.d(parseObject.getJSONObject("hierarchy"))) {
            return new enc(this.f27451a).c(parseObject);
        }
        return null;
    }
}
