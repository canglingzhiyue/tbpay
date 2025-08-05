package com.taobao.android.detail.ttdetail.async;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class AsyncModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f10483a;
    private b b;
    private DependencyRequest c;
    private List<KVMapping> d;
    private List<RelateComponent> e;
    private String f;

    static {
        kge.a(-155108062);
    }

    public AsyncModule(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("mtopConfig");
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            this.f10483a = new a(jSONObject2);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("R");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            this.b = new b(jSONObject3);
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("dependencyRequest");
        if (jSONObject4 != null && !jSONObject4.isEmpty()) {
            this.c = new DependencyRequest(jSONObject4);
        }
        this.d = a(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("relateComponents");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                    if (this.e == null) {
                        this.e = new ArrayList(jSONArray.size());
                    }
                    this.e.add(new RelateComponent(jSONObject5));
                }
            }
        }
        this.f = jSONObject.getString("v-if");
    }

    public static List<KVMapping> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{jSONObject});
        }
        ArrayList arrayList = null;
        JSONArray jSONArray = jSONObject.getJSONArray("kvmap");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(jSONArray.size());
                    }
                    arrayList.add(new KVMapping(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cf662c9e", new Object[]{this}) : this.f10483a;
    }

    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d569f81c", new Object[]{this}) : this.b;
    }

    public DependencyRequest c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DependencyRequest) ipChange.ipc$dispatch("924c8b79", new Object[]{this}) : this.c;
    }

    public List<KVMapping> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : this.d;
    }

    public List<RelateComponent> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10487a;
        private String b;
        private JSONObject c;

        static {
            kge.a(-1847468020);
        }

        public a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f10487a = jSONObject.getString("apiMethod");
            this.b = jSONObject.getString("apiVersion");
            this.c = jSONObject.getJSONObject("data");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10487a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public JSONObject c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (jSONObject == null || jSONObject.isEmpty()) {
            } else {
                if (this.c == null) {
                    this.c = new JSONObject();
                }
                this.c.putAll(jSONObject);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f10488a;
        private c b;

        public b(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f10488a = new c(jSONObject.getJSONObject("onSuccess"));
            this.b = new c(jSONObject.getJSONObject("onFailed"));
        }

        public c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("cf662cdc", new Object[]{this}) : this.f10488a;
        }

        public c b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d569f83b", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes4.dex */
    public static class DependencyRequest {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f10484a;

        static {
            kge.a(-687701598);
        }

        public DependencyRequest(JSONObject jSONObject) {
            JSONObject jSONObject2;
            if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("mtopConfig")) == null || jSONObject2.isEmpty()) {
                return;
            }
            this.f10484a = new a(jSONObject2);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cf662c9e", new Object[]{this}) : this.f10484a;
        }
    }

    /* loaded from: classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f10489a;
        private List<KVMapping> b;
        private JSONArray c;

        static {
            kge.a(-2086555896);
        }

        public c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f10489a = jSONObject.getJSONObject("payload");
            this.c = jSONObject.getJSONArray("events");
            this.b = AsyncModule.a(jSONObject);
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f10489a;
        }

        public JSONArray b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("505e5935", new Object[]{this}) : this.c;
        }

        public List<KVMapping> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes4.dex */
    public static class KVMapping {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10485a;
        private String b;

        static {
            kge.a(-1012732959);
        }

        public KVMapping(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f10485a = jSONObject.getString("source");
            this.b = jSONObject.getString("target");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10485a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes4.dex */
    public static class RelateComponent {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<KVMapping> f10486a;

        static {
            kge.a(-1464547838);
        }

        public RelateComponent(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f10486a = AsyncModule.a(jSONObject);
        }

        public List<KVMapping> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f10486a;
        }
    }
}
