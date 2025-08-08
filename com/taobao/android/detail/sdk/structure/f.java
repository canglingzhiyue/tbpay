package com.taobao.android.detail.sdk.structure;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.LayoutNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.model.template.ContainerModel;
import com.taobao.android.detail.sdk.model.template.LayoutModel;
import com.taobao.android.detail.sdk.utils.j;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.exa;
import tb.exb;
import tb.exp;
import tb.exy;
import tb.jkl;
import tb.jkn;
import tb.jko;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f10334a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static boolean w;
    private i A;
    private Map<String, String> B;
    public Context x;
    public jkl y;
    private String z;

    static {
        kge.a(257871456);
        f10334a = true;
        b = false;
        c = true;
        d = true;
        e = true;
        f = true;
        g = false;
        h = true;
        i = true;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = true;
        v = true;
        w = true;
    }

    public f() {
        tpc.a("com.taobao.android.detail.sdk.structure.MainStructureEngine");
    }

    public f a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("e2e3a507", new Object[]{this, context});
        }
        this.z = context.toString();
        this.x = context.getApplicationContext();
        this.A = new i(this.x);
        this.y = jkl.a(this.x);
        this.y.a(new com.taobao.android.detail.sdk.request.main.a());
        return this;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.B = map;
        }
    }

    public g a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e908a678", new Object[]{this, str});
        }
        j.a("mCreateDetailModel");
        if (StringUtils.isEmpty(str)) {
            return new g(1, "response string is empty.");
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSONObject.parseObject(str);
        } catch (Throwable unused) {
        }
        if (jSONObject == null) {
            return new g(2, "parse json error.");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new g(1, "data node is missing.");
        }
        JSONObject c2 = c(jSONObject2);
        if (c2 == null || c2.isEmpty()) {
            c2 = d(jSONObject2);
            z = true;
        }
        if (c2 == null || c2.isEmpty()) {
            c2 = new JSONObject();
        }
        JSONObject a2 = a(jSONObject2, c2);
        Map<String, String> map = this.B;
        if (map != null) {
            a2.put("queryParams", JSON.toJSON(map));
        }
        a2.put("msoaToken", (Object) this.z);
        a2.put("eventToken", (Object) this.z);
        NodeBundle nodeBundle = new NodeBundle(a2);
        j.b("mCreateDetailModel");
        e a3 = a(nodeBundle);
        j.b("mCreateViewModel");
        g gVar = new g(a3, a(nodeBundle, a3));
        gVar.c = z;
        return gVar;
    }

    public NodeBundle b(String str) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NodeBundle) ipChange.ipc$dispatch("a0892979", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (parseObject = JSONObject.parseObject(str)) == null || (jSONObject = parseObject.getJSONObject("data")) == null || jSONObject.isEmpty()) {
            return null;
        }
        return a(jSONObject);
    }

    private NodeBundle a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NodeBundle) ipChange.ipc$dispatch("2ca9cf0e", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return new NodeBundle(a(jSONObject, b(jSONObject)));
        }
        return null;
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        JSONObject c2 = c(jSONObject);
        if (c2 == null || c2.isEmpty()) {
            c2 = d(jSONObject);
        }
        return (c2 == null || c2.isEmpty()) ? new JSONObject() : c2;
    }

    private JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        String string = (jSONArray == null || jSONArray.isEmpty()) ? null : jSONArray.getJSONObject(0).getString("value");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseObject(string);
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed36a885", new Object[]{this, jSONObject});
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

    public e a(NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d84f69f6", new Object[]{this, nodeBundle});
        }
        LayoutModel a2 = a(new LayoutNode(nodeBundle.root.getJSONObject("layout")));
        d dVar = null;
        if (a2 == null) {
            return null;
        }
        j.a("mCreateViewModel");
        com.taobao.android.detail.sdk.factory.manager.b a3 = com.taobao.android.detail.sdk.factory.manager.b.a();
        exa exaVar = (exa) a3.a(a2.actionBar, nodeBundle);
        exb c2 = a3.c(a2.bottomBar, nodeBundle);
        ArrayList arrayList = new ArrayList();
        int size = a2.components.size();
        if (m) {
            dVar = new d();
        }
        for (int i2 = 0; i2 < size; i2++) {
            ComponentModel componentModel = a2.components.get(i2);
            if (componentModel.key.contains("main")) {
                String str = "发现疑似main_view_container : " + componentModel.key;
            }
            try {
                MainViewModel a4 = a3.a(componentModel, nodeBundle);
                if (a4 != null && (dVar == null || !dVar.a(a4.component.key, a4.component.ruleId))) {
                    arrayList.add(a4);
                }
            } catch (Throwable th) {
                if (componentModel != null) {
                    Log.e("MainStructureEngine", "create model " + componentModel.key, th);
                }
            }
        }
        com.taobao.android.detail.sdk.utils.e.a(arrayList);
        return this.A.a(new e(nodeBundle, arrayList, exaVar, c2));
    }

    public LayoutModel a(LayoutNode layoutNode) {
        jko jkoVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (LayoutModel) ipChange.ipc$dispatch("2182866f", new Object[]{this, layoutNode});
        }
        j.a("mFetchTemplate");
        String str = layoutNode.layoutTemplateId;
        String str2 = layoutNode.ruleTemplateId;
        String str3 = layoutNode.actionTemplateId;
        String str4 = layoutNode.themeTemplateId;
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3) || StringUtils.isEmpty(str4) || (StringUtils.isEmpty(str) && layoutNode.layoutJson == null)) {
            str = h.e;
            str2 = h.f;
            str3 = h.g;
            str4 = h.h;
            z = true;
        }
        if (layoutNode.layoutJson != null && StringUtils.isEmpty(str)) {
            str = h.e;
        }
        ArrayList<jkn> arrayList = new ArrayList<>();
        h a2 = h.a();
        if (p) {
            if (!a2.a(str)) {
                arrayList.add(new jkn(str, h.e, h.f10336a));
            }
            if (!a2.b(str2)) {
                arrayList.add(new jkn(str2, h.f, h.b));
            }
            if (!a2.c(str3)) {
                arrayList.add(new jkn(str3, h.g, h.c));
            }
            arrayList.add(new jkn(str4, h.h, h.d));
        } else {
            arrayList.add(new jkn(str, h.e, h.f10336a));
            arrayList.add(new jkn(str2, h.f, h.b));
            arrayList.add(new jkn(str3, h.g, h.c));
            arrayList.add(new jkn(str4, h.h, h.d));
        }
        if (arrayList.size() == 0) {
            j.b("mFetchTemplate");
            j.a("mCreateProtocolMap");
            j.b("mCreateProtocolMap");
            jkoVar = a2.b();
        } else {
            HashMap<String, jko> a3 = this.y.a(arrayList, true);
            if (a3 == null) {
                return null;
            }
            j.a(a3);
            if (p) {
                j.a("mCreateProtocolMap");
                if (!a2.a(str)) {
                    jkoVar = a3.get(str);
                } else {
                    jkoVar = a2.b();
                }
                if (!a2.b(str2)) {
                    a2.a(a3.get(str2).b, str2);
                }
                if (!a2.c(str3)) {
                    a2.b(a3.get(str3).b, str3);
                }
                a2.c(a3.get(str4).b, str4);
                j.b("mFetchTemplate");
                j.b("mCreateProtocolMap");
            } else {
                jkoVar = a3.get(str);
                j.b("mFetchTemplate");
                j.a("mCreateProtocolMap");
                a2.a(a3.get(str2).b, str2);
                a2.b(a3.get(str3).b, str3);
                a2.c(a3.get(str4).b, str4);
                j.b("mCreateProtocolMap");
            }
        }
        if (jkoVar != null && jkoVar.c) {
            z = true;
        }
        if (layoutNode.layoutJson == null || z || !e(layoutNode.layoutJson)) {
            return a2.a(jkoVar.b);
        }
        return a2.a(layoutNode.layoutJson);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e(com.alibaba.fastjson.JSONObject r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.sdk.structure.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            java.lang.String r6 = "87b16e08"
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
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.sdk.structure.f.e(com.alibaba.fastjson.JSONObject):boolean");
    }

    private b a(NodeBundle nodeBundle, e eVar) {
        ContainerModel a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7bcb7695", new Object[]{this, nodeBundle, eVar});
        }
        if (nodeBundle == null || eVar == null || eVar.b == null || (a2 = a(nodeBundle.root.getJSONObject("layout"), b(nodeBundle))) == null) {
            return null;
        }
        com.taobao.android.detail.sdk.factory.manager.b a3 = com.taobao.android.detail.sdk.factory.manager.b.a();
        return new b(eVar, (exy) a3.d(a2.navBarComponent, nodeBundle), (exp) a3.d(a2.detailHomeComponent, nodeBundle));
    }

    private boolean b(NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51565211", new Object[]{this, nodeBundle})).booleanValue() : nodeBundle.featureNode.isCloudShopItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.android.detail.sdk.model.template.ContainerModel a(com.alibaba.fastjson.JSONObject r4, boolean r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.sdk.structure.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L20
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r5)
            r1[r4] = r2
            java.lang.String r4 = "51f7e146"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            com.taobao.android.detail.sdk.model.template.ContainerModel r4 = (com.taobao.android.detail.sdk.model.template.ContainerModel) r4
            return r4
        L20:
            java.lang.String r0 = "hierarchy"
            r1 = 0
            if (r4 == 0) goto L43
            java.lang.String r2 = "hierarchyData"
            com.alibaba.fastjson.JSONObject r4 = r4.getJSONObject(r2)
            if (r5 != 0) goto L39
            if (r4 == 0) goto L43
            com.alibaba.fastjson.JSONObject r5 = r4.getJSONObject(r0)
            boolean r5 = com.taobao.android.detail.sdk.structure.a.d(r5)
            if (r5 == 0) goto L43
        L39:
            com.taobao.android.detail.sdk.structure.a r5 = new com.taobao.android.detail.sdk.structure.a
            r5.<init>()
            com.taobao.android.detail.sdk.model.template.ContainerModel r4 = r5.c(r4)
            goto L44
        L43:
            r4 = r1
        L44:
            if (r4 != 0) goto L6c
            tb.jkl r5 = r3.y
            java.lang.String r2 = com.taobao.android.detail.sdk.structure.a.f10327a
            java.lang.String r5 = r5.a(r2)
            boolean r2 = android.text.StringUtils.isEmpty(r5)
            if (r2 != 0) goto L6c
            com.alibaba.fastjson.JSONObject r4 = com.alibaba.fastjson.JSON.parseObject(r5)
            com.alibaba.fastjson.JSONObject r5 = r4.getJSONObject(r0)
            boolean r5 = com.taobao.android.detail.sdk.structure.a.d(r5)
            if (r5 != 0) goto L63
            return r1
        L63:
            com.taobao.android.detail.sdk.structure.a r5 = new com.taobao.android.detail.sdk.structure.a
            r5.<init>()
            com.taobao.android.detail.sdk.model.template.ContainerModel r4 = r5.c(r4)
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.sdk.structure.f.a(com.alibaba.fastjson.JSONObject, boolean):com.taobao.android.detail.sdk.model.template.ContainerModel");
    }
}
