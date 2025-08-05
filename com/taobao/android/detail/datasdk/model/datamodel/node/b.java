package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.d;
import com.taobao.ju.track.server.JTrackParams;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.epj;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EMPTY_DATA_ERROR = -1;
    public static final int JSON_DATA_PARSE_ERROR = -2;
    public static final int SUCCESS = 0;

    /* renamed from: a  reason: collision with root package name */
    public static String f10050a;
    public boolean b;
    private int c;
    private JSONObject d;
    private String e;
    private Map<String, String> f;
    private Map<String, String> g;
    private Map<String, String> h;
    private Map<String, String> i;
    private String j;
    private Map<String, DetailNode> k;
    private a l;
    private JSONObject m;
    private JSONObject n;
    private JSONObject o;
    private JSONObject p;
    private String q;

    static {
        kge.a(-653671471);
        f10050a = "";
    }

    public b(int i) {
        this.c = 0;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        this.k = new HashMap();
        this.c = i;
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.NodeBundle");
    }

    public b() {
        this.c = 0;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        this.k = new HashMap();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.NodeBundle");
    }

    public static <T extends DetailNode> String a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a11eb5", new Object[]{str, cls});
        }
        return str + "-" + cls.hashCode();
    }

    public b(JSONObject jSONObject) {
        this.c = 0;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        this.k = new HashMap();
        a(jSONObject);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.d = jSONObject;
        this.e = jSONObject.getString("msoaToken");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                this.q = jSONObject2.getString("cpsParams");
                JSONObject jSONObject3 = jSONObject2.getJSONObject(JTrackParams.TRACK_PARAMS);
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    this.f = epw.a(jSONObject3, new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.b.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                        @Override // tb.epy
                        public /* synthetic */ String b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                        }

                        public String a(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                        }
                    });
                }
                this.j = jSONObject2.getString("utParams");
                JSONObject jSONObject4 = jSONObject2.getJSONObject("umbParams");
                if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                    this.g = epw.a(jSONObject4, new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                        @Override // tb.epy
                        public /* synthetic */ String b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                        }

                        public String a(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                        }
                    });
                }
                JSONObject jSONObject5 = jSONObject2.getJSONObject("aliAbTestTrackParams");
                if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                    this.h = epw.a(jSONObject5, new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.b.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                        @Override // tb.epy
                        public /* synthetic */ String b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                        }

                        public String a(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : String.valueOf(obj);
                        }
                    });
                }
                JSONObject jSONObject6 = jSONObject2.getJSONObject("trackEventParams");
                if (jSONObject6 != null && !jSONObject6.isEmpty()) {
                    this.i = epw.a(jSONObject6, new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.b.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                        @Override // tb.epy
                        public /* synthetic */ String b(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
                        }

                        public String a(Object obj) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                        }
                    });
                }
                this.n = jSONObject2.getJSONObject("paramsNewDetail");
            }
            JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
            if (jSONArray == null || jSONArray.size() <= 0) {
                return;
            }
            JSONObject jSONObject7 = jSONArray.getJSONObject(0).getJSONObject("data");
            if (jSONObject7 == null) {
                jSONObject7 = jSONArray.getJSONObject(0).getJSONObject("value");
            }
            if (jSONObject7 == null) {
                return;
            }
            this.l = new a(jSONObject7.getJSONObject(AURASubmitEvent.RPC_ENDPOINT));
        } catch (Throwable unused) {
        }
    }

    public <T extends DetailNode> T b(String str, Class<T> cls) {
        String a2 = a(str, cls);
        d i = epj.i();
        try {
        } catch (NoSuchMethodException unused) {
            if (i != null) {
                i.b(b.class.getSimpleName(), String.format("class %s must have the constructor : \"public %s(JSONObject data)\"", cls.getSimpleName(), cls.getSimpleName()));
            }
        } catch (Exception e) {
            if (i != null) {
                i.b(b.class.getSimpleName(), e.getMessage());
            }
        }
        if (this.k.containsKey(a2)) {
            return (T) this.k.get(a2);
        }
        JSONObject jSONObject = this.d.getJSONObject(str);
        if (jSONObject != null) {
            T newInstance = cls.getConstructor(JSONObject.class).newInstance(jSONObject);
            this.k.put(a2, newInstance);
            return newInstance;
        }
        this.k.put(a2, null);
        return null;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = this.d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.o;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.o = jSONObject;
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.p;
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.f;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.g;
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.h;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.i;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.e;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.c;
    }

    public a j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7058d80", new Object[]{this}) : this.l;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.q;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.j;
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            this.m = jSONObject;
        }
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("48d58e13", new Object[]{this}) : this.m;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = a().getJSONObject("feature");
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return jSONObject.getBooleanValue("finalUltron");
        }
        return false;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : a().getBooleanValue("preload");
    }
}
