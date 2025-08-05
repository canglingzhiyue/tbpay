package com.taobao.android.xsearchplugin.muise;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Observable;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class r extends Observable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String STATUS_EXCEED_MAX_SIZE = "EXCEED_MAX_SIZE";
    public static final String STATUS_SAME_KEY = "SAME_KEY";
    public static final String STATUS_SUCCESS = "SUCCESS";

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<String, Object> f16268a;
    private int b;
    private final String c;
    private final String d;

    static {
        kge.a(-1497393789);
        Companion = new a(null);
    }

    public r(String mNamespace, String scope) {
        q.c(mNamespace, "mNamespace");
        q.c(scope, "scope");
        this.c = mNamespace;
        this.d = scope;
        this.f16268a = new LinkedHashMap<>();
        this.b = -1;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.d;
    }

    public final JSONObject a(String status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, status});
        }
        q.c(status, "status");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "namespace", this.c);
        jSONObject2.put((JSONObject) "data", (String) JSON.toJSON(this.f16268a));
        jSONObject2.put((JSONObject) "status", status);
        return jSONObject;
    }

    public final boolean a(String key, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb65392", new Object[]{this, key, obj})).booleanValue();
        }
        q.c(key, "key");
        int size = this.f16268a.size();
        int i = this.b;
        if (size >= i && i >= 0) {
            str = STATUS_EXCEED_MAX_SIZE;
            z = false;
        } else if (this.f16268a.containsKey(key)) {
            this.f16268a.put(key, obj);
            str = STATUS_SAME_KEY;
        } else {
            this.f16268a.put(key, obj);
            str = "SUCCESS";
        }
        setChanged();
        notifyObservers(a(str));
        return z;
    }

    public final void b(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, key});
            return;
        }
        q.c(key, "key");
        if (!this.f16268a.containsKey(key)) {
            return;
        }
        this.f16268a.remove(key);
        setChanged();
        notifyObservers(a("SUCCESS"));
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        if (i < 0 || i <= this.f16268a.size()) {
            return;
        }
        while (this.f16268a.size() > i && (!this.f16268a.isEmpty())) {
            this.f16268a.remove(this.f16268a.entrySet().iterator().next().getKey());
        }
        setChanged();
        notifyObservers(a("SUCCESS"));
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(1319155979);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
