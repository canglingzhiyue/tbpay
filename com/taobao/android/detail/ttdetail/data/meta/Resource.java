package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.eby;
import tb.kge;

@MappingKey(key = "resource")
/* loaded from: classes4.dex */
public class Resource extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a animation;
    private final List<c> floatButtons;
    private final JSONObject floatView;
    private final Map<String, String> rsExtParams;
    private final f share;
    private final JSONObject topAtmosphere;

    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f10621a;
        public ArrayList<d> b;

        static {
            kge.a(1157347252);
        }

        public e(JSONObject jSONObject) {
            this.f10621a = jSONObject.getIntValue("index");
            this.b = z.a(jSONObject.getJSONArray("items"), new z.a<d>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Resource.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.ttdetail.data.meta.Resource$d] */
                @Override // com.taobao.android.detail.ttdetail.utils.z.a
                public /* synthetic */ d convert(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                }

                public d a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2004394f", new Object[]{this, obj}) : new d((JSONObject) obj);
                }
            });
        }
    }

    static {
        kge.a(-888050522);
    }

    public static String nullToEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8ed2fc4", new Object[]{str}) : str == null ? "" : str;
    }

    public Resource(JSONObject jSONObject) {
        super(jSONObject);
        this.animation = a.a(jSONObject.getJSONObject("animation"));
        this.share = f.a(jSONObject.getJSONObject("share"));
        this.floatButtons = c.a(jSONObject.getJSONArray("nativeFloatButton"));
        this.topAtmosphere = jSONObject.getJSONObject("topAtmosphere");
        this.floatView = jSONObject.getJSONObject("floatView");
        this.rsExtParams = (Map) jSONObject.getObject("globalNativeParams", Map.class);
    }

    public a getAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("583aba03", new Object[]{this}) : this.animation;
    }

    public f getShare() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("d6e9b179", new Object[]{this}) : this.share;
    }

    public List<c> getFloatButtons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("32a9f705", new Object[]{this}) : this.floatButtons;
    }

    public JSONObject getTopAtmosphere() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("14b427c8", new Object[]{this}) : this.topAtmosphere;
    }

    public JSONObject getFloatView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("50f96e92", new Object[]{this}) : this.floatView;
    }

    public Map<String, String> getRsExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3a58ff0c", new Object[]{this}) : this.rsExtParams;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10617a;
        private final String b;

        static {
            kge.a(100104422);
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7cc98636", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new a(jSONObject);
        }

        private a(JSONObject jSONObject) {
            this.f10617a = jSONObject.getString("type");
            this.b = jSONObject.getString("animationUrl");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10617a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes4.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10623a;
        private final int b;
        private final String c;
        private final Map<String, String> d;

        static {
            kge.a(717991489);
        }

        public static f a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("7cc986d1", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new f(jSONObject);
            }
            return null;
        }

        private f(JSONObject jSONObject) {
            Integer num;
            this.f10623a = jSONObject.getString("name");
            try {
                num = jSONObject.getInteger("iconType");
            } catch (Exception e) {
                i.a("Share iconType cast fail, " + e);
                num = null;
            }
            this.b = num == null ? 1 : num.intValue();
            this.c = jSONObject.getString("iconUrl");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 != null) {
                this.d = z.a(jSONObject2, new z.a<String>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Resource.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                    @Override // com.taobao.android.detail.ttdetail.utils.z.a
                    public /* synthetic */ String convert(Object obj) {
                        IpChange ipChange = $ipChange;
                        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                    }

                    public String a(Object obj) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
                        }
                        if (!(obj instanceof String)) {
                            return null;
                        }
                        return (String) obj;
                    }
                });
            } else {
                this.d = null;
            }
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.d;
        }
    }

    /* loaded from: classes4.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10625a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private ArrayList<String> g;
        private ArrayList<e> h;

        static {
            kge.a(1566315183);
        }

        public g(JSONObject jSONObject) {
            this.f10625a = Resource.nullToEmpty(jSONObject.getString("title"));
            this.b = Resource.nullToEmpty(jSONObject.getString("period"));
            this.c = Resource.nullToEmpty(jSONObject.getString("activityId"));
            this.d = Resource.nullToEmpty(jSONObject.getString("type"));
            this.e = Resource.nullToEmpty(jSONObject.getString("actionUrl"));
            this.f = Resource.nullToEmpty(jSONObject.getString("iconText"));
            this.g = z.a(jSONObject.getJSONArray("content"), new z.a<String>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Resource.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
                @Override // com.taobao.android.detail.ttdetail.utils.z.a
                public /* synthetic */ String convert(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                }

                public String a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
                }
            });
            this.h = z.a(jSONObject.getJSONArray("giftOfContent"), new z.a<e>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Resource.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.ttdetail.data.meta.Resource$e] */
                @Override // com.taobao.android.detail.ttdetail.utils.z.a
                public /* synthetic */ e convert(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                }

                public e a(Object obj) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("2004396e", new Object[]{this, obj}) : new e((JSONObject) obj);
                }
            });
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f;
        }

        public ArrayList<String> d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this}) : this.g;
        }

        public ArrayList<e> e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("bbce4046", new Object[]{this}) : this.h;
        }
    }

    /* loaded from: classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10620a;
        private String b;
        private String c;

        static {
            kge.a(-1954763071);
        }

        public d(JSONObject jSONObject) {
            this.f10620a = Resource.nullToEmpty(jSONObject.getString("itemId"));
            this.b = Resource.nullToEmpty(jSONObject.getString(eby.KEY_PIC_URL));
            this.c = Resource.nullToEmpty(jSONObject.getString("title"));
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10620a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f10619a;
        private String b;
        private String c;
        private b d;
        private String e;

        static {
            kge.a(-1721922160);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
        }

        public b c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c7321837", new Object[]{this}) : this.d;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
        }

        public static List<c> a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c9355ab7", new Object[]{jSONArray}) : z.a(jSONArray, new z.a<c>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Resource.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.ttdetail.data.meta.Resource$c] */
                @Override // com.taobao.android.detail.ttdetail.utils.z.a
                public /* synthetic */ c convert(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                }

                public c a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (c) ipChange2.ipc$dispatch("20043930", new Object[]{this, obj}) : new c((JSONObject) obj);
                }
            });
        }

        public c(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f10619a = jSONObject.getBooleanValue("showDetailPopBtn");
                this.b = Resource.nullToEmpty(jSONObject.getString("btnImageUrl"));
                this.c = Resource.nullToEmpty(jSONObject.getString("actionType"));
                this.d = new b(jSONObject.getJSONObject("actionData"));
                this.e = Resource.nullToEmpty(jSONObject.getString("bizCode"));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10618a;
        private String b;
        private JSONObject c;
        private String d;

        static {
            kge.a(-958472610);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10618a;
        }

        public JSONObject b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.c;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.d;
        }

        public b() {
        }

        public b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f10618a = Resource.nullToEmpty(jSONObject.getString("abilityName"));
                this.b = Resource.nullToEmpty(jSONObject.getString("apiName"));
                this.c = jSONObject.getJSONObject("params");
                this.d = Resource.nullToEmpty(jSONObject.getString("url"));
            }
        }
    }
}
