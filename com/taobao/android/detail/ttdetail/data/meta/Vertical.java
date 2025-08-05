package com.taobao.android.detail.ttdetail.data.meta;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

@MappingKey(key = "vertical")
/* loaded from: classes4.dex */
public class Vertical extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a askAll;
    private final JSONObject dtaoInfo;
    private final b hk;
    private final c jhs;
    private final JSONObject picHeaderGlobalFloatLayer;
    private final d supermarket;
    private final JSONObject transparentBroadcast;

    static {
        kge.a(1763840014);
    }

    public Vertical(JSONObject jSONObject) {
        super(jSONObject);
        this.jhs = c.a(jSONObject.getJSONObject("jhs"));
        this.hk = b.a(jSONObject.getJSONObject("inter"));
        this.askAll = a.a(jSONObject.getJSONObject("askAll"));
        this.dtaoInfo = jSONObject.getJSONObject("dtaoInfo");
        this.supermarket = d.a(jSONObject.getJSONObject("supermarket"));
        this.transparentBroadcast = jSONObject.getJSONObject("transparentBroadcast");
        this.picHeaderGlobalFloatLayer = jSONObject.getJSONObject("picHeaderGlobalFloatLayer");
    }

    public c getJhs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("eb3d554a", new Object[]{this}) : this.jhs;
    }

    public b getHK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b149f145", new Object[]{this}) : this.hk;
    }

    public a getAskAll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1d6a42b", new Object[]{this}) : this.askAll;
    }

    public JSONObject getDtaoInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7111b6a9", new Object[]{this}) : this.dtaoInfo;
    }

    public d getSupermarket() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("99c90ceb", new Object[]{this}) : this.supermarket;
    }

    public JSONObject getTransparentBroadcast() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d43fb92c", new Object[]{this}) : this.transparentBroadcast;
    }

    public JSONObject getPicHeaderGlobalFloatLayer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6dda5ba0", new Object[]{this}) : this.picHeaderGlobalFloatLayer;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final JSONObject f10635a;

        static {
            kge.a(328068574);
        }

        private a(JSONObject jSONObject) {
            this.f10635a = jSONObject;
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("af0149ce", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new a(jSONObject);
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f10635a;
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f10638a;

        static {
            kge.a(-361703105);
        }

        private c(JSONObject jSONObject) {
            this.f10638a = jSONObject.getBooleanValue("hasIntervalPrice");
        }

        public static c a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("af014a0c", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new c(jSONObject);
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10636a;
        private String b;
        private List<Map<String, List<Pair<String, String>>>> c;

        static {
            kge.a(1927994713);
        }

        private b(JSONObject jSONObject) {
            this.f10636a = jSONObject.getString("taxDescTittle");
            this.b = jSONObject.getString("sizeCartUrl");
            this.c = b(jSONObject);
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("af0149ed", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10636a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public List<Map<String, List<Pair<String, String>>>> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
        }

        private List<Map<String, List<Pair<String, String>>>> b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("taxDesc");
            return (jSONArray == null || jSONArray.size() == 0) ? arrayList : z.a(jSONArray, new z.a<Map<String, List<Pair<String, String>>>>() { // from class: com.taobao.android.detail.ttdetail.data.meta.Vertical.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>, java.lang.Object] */
                @Override // com.taobao.android.detail.ttdetail.utils.z.a
                public /* synthetic */ Map<String, List<Pair<String, String>>> convert(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("cbc0bfdc", new Object[]{this, obj}) : a(obj);
                }

                public Map<String, List<Pair<String, String>>> a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("42d7dd79", new Object[]{this, obj});
                    }
                    HashMap hashMap = new HashMap();
                    JSONObject jSONObject2 = (JSONObject) obj;
                    for (String str : jSONObject2.keySet()) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : jSONObject3.keySet()) {
                            String string = jSONObject3.getString(str2);
                            if (!TextUtils.isEmpty(str2)) {
                                arrayList2.add(new Pair(str2, string));
                            }
                        }
                        hashMap.put(str, arrayList2);
                    }
                    return hashMap;
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f10639a;

        static {
            kge.a(-207258655);
        }

        public d(JSONObject jSONObject) {
            this.f10639a = jSONObject.getString("tpId");
        }

        public static d a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("af014a2b", new Object[]{jSONObject});
            }
            if (jSONObject == null) {
                return null;
            }
            return new d(jSONObject);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10639a;
        }
    }
}
