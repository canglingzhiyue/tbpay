package com.taobao.android.detail.core.model.viewmodel.main;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.eoy;
import tb.epw;
import tb.epz;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends com.taobao.android.detail.datasdk.model.viewmodel.main.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String c;
    public a d;
    public JSONObject e;
    public JSONObject f;
    public String g;
    public String h;
    public JSONObject i;
    public JSONObject j;
    public JSONObject k;
    public JSONObject l;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.DinamicViewModel";
    }

    static {
        kge.a(1322305589);
        c = "updateAddress";
    }

    public c(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel);
        if (componentModel == null || bVar == null) {
            return;
        }
        this.mNodeBundle = bVar;
        ItemNode c2 = eqb.c(bVar);
        FeatureNode f = eqb.f(bVar);
        this.themeGroup = c2.themeType;
        this.needOpenGradient = f.needOpenGradient;
        a(componentModel);
        buildChildren();
        parseMapping();
        initEvents();
        initStyle();
        a();
        b();
    }

    private void a(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58652098", new Object[]{this, componentModel});
            return;
        }
        this.d = new a(componentModel.mapping.getJSONObject("template"));
        this.g = componentModel.mapping.getString("preload");
        this.e = componentModel.mapping.getJSONObject("event");
        this.f = componentModel.mapping.getJSONObject("track");
        this.h = componentModel.mapping.getString("subfilter");
        this.j = componentModel.mapping.getJSONObject("request");
        this.k = componentModel.mapping.getJSONObject(HttpHeaderConstant.KEY_EXTDATA);
        JSONObject jSONObject = this.e;
        if (jSONObject != null) {
            this.e = JSONObject.parseObject(jSONObject.toJSONString());
        }
        JSONObject jSONObject2 = this.f;
        if (jSONObject2 != null) {
            this.f = JSONObject.parseObject(jSONObject2.toJSONString());
        }
        JSONObject jSONObject3 = this.j;
        if (jSONObject3 != null) {
            this.j = JSONObject.parseObject(jSONObject3.toJSONString());
        }
        JSONObject jSONObject4 = this.k;
        if (jSONObject4 == null) {
            return;
        }
        this.k = JSONObject.parseObject(jSONObject4.toJSONString());
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.j;
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (this.mNodeBundle.b) {
                entry.setValue(epz.a(this.mNodeBundle.a(), value, true));
            } else {
                entry.setValue(epz.a(this.mNodeBundle.a(), value));
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.k;
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            Object value = entry.getValue();
            if (this.mNodeBundle.b) {
                entry.setValue(epz.a(this.mNodeBundle.a(), value, true));
            } else {
                entry.setValue(epz.a(this.mNodeBundle.a(), value));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9766a;
        public String b;
        public String c;
        public String d;

        static {
            kge.a(-1515694645);
        }

        public a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f9766a = epw.a(jSONObject.getString("name"));
                this.b = epw.a(jSONObject.getString("android"));
                this.c = epw.a(jSONObject.getString("url"));
                this.d = epw.a(jSONObject.getString("version"));
            }
        }

        public a(JSONObject jSONObject, boolean z) {
            if (jSONObject != null) {
                this.f9766a = epw.a(jSONObject.getString("name"));
                this.b = epw.a(jSONObject.getString("url"));
                if (TextUtils.isEmpty(this.b)) {
                    this.b = epw.a(jSONObject.getString("android"));
                }
                this.d = epw.a(jSONObject.getString("version"));
            }
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && jSONObject.size() > 0) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            JSONObject jSONObject3 = this.k;
            if (jSONObject3 != null) {
                for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                    jSONObject2.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        this.l = jSONObject2;
        return jSONObject2;
    }

    public c(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent);
        if (iDMComponent == null || bVar == null) {
            return;
        }
        this.mNodeBundle = bVar;
        ItemNode c2 = eqb.c(bVar);
        FeatureNode f = eqb.f(bVar);
        this.themeGroup = c2.themeType;
        this.needOpenGradient = f.needOpenGradient;
        a(iDMComponent);
        ultronBuildChildren();
        ultronParseMapping();
        ultronInitStyle();
        a();
        b();
    }

    private void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        JSONObject a2 = a(iDMComponent, iDMComponent.getFields());
        boolean equals = iDMComponent.getContainerType().equals("dinamic");
        if (equals) {
            this.d = new a(iDMComponent.getContainerInfo(), true);
        } else if (a2 != null) {
            this.d = new a(a2.getJSONObject("template"), true);
        }
        if (iDMComponent.getEvents() != null) {
            JSONObject parseObject = JSONObject.parseObject(iDMComponent.getEvents().toJSONString());
            if (equals) {
                if (this.mNodeBundle.b) {
                    parseObject = (JSONObject) epz.a(this.mNodeBundle.a(), parseObject, true);
                } else {
                    parseObject = (JSONObject) epz.a(this.mNodeBundle.a(), parseObject);
                }
            }
            JSONArray jSONArray = parseObject.getJSONArray("onAppear");
            parseObject.remove("onAppear");
            this.e = parseObject;
            if (jSONArray != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("onAppear", (Object) jSONArray);
                this.f = jSONObject;
            }
        }
        if (a2 != null) {
            this.g = a2.getString("preload");
            this.h = a2.getString("subfilter");
            this.j = a2.getJSONObject("request");
            this.k = a2.getJSONObject(HttpHeaderConstant.KEY_EXTDATA);
        }
        this.i = new JSONObject();
        if (a2 != null) {
            if (equals) {
                this.i.put("data", (Object) a2);
            } else {
                this.i.put("data", (Object) a2.getJSONObject("data"));
            }
        }
        JSONObject jSONObject2 = this.e;
        if (jSONObject2 != null) {
            this.e = a(iDMComponent, jSONObject2);
            this.i.put("event", (Object) this.e);
        }
        JSONObject jSONObject3 = this.f;
        if (jSONObject3 != null) {
            this.f = a(iDMComponent, jSONObject3);
            this.i.put("track", (Object) this.f);
        }
        JSONObject jSONObject4 = this.j;
        if (jSONObject4 != null) {
            this.j = JSONObject.parseObject(jSONObject4.toJSONString());
        }
        JSONObject jSONObject5 = this.k;
        if (jSONObject5 != null) {
            this.k = JSONObject.parseObject(jSONObject5.toJSONString());
        }
        a aVar = this.d;
        if (aVar != null) {
            this.i.put("template", (Object) aVar);
        }
        this.i.put("componentId", (Object) eoy.b(iDMComponent));
    }

    private JSONObject a(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b961ba4", new Object[]{this, iDMComponent, jSONObject});
        }
        try {
            if (iDMComponent.getType() != null && iDMComponent.getType().contains("dinamic_async")) {
                return JSONObject.parseObject(jSONObject.toJSONString().replace("@async", "$"));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // tb.eoz
    public void onMessage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
        } else if (obj == null || !(obj instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = this.i;
            if (jSONObject2 != null) {
                a(jSONObject2, jSONObject);
                if (jSONObject.containsKey(c)) {
                    this.i = new JSONObject(this.i);
                }
                setNeedRedraw();
            } else if (this.component.mapping == null) {
            } else {
                a(this.component.mapping, jSONObject);
                setNeedRedraw();
            }
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            jSONObject3.put(entry.getKey(), jSONObject2.get(entry.getKey()));
        }
    }
}
