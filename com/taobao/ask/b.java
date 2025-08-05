package com.taobao.ask;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, WeakReference<JSONObject>> f16387a;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f16388a;

        static {
            kge.a(-1594631759);
            f16388a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1ef53ec4", new Object[0]) : f16388a;
        }
    }

    static {
        kge.a(1749572703);
    }

    private b() {
        this.f16387a = new HashMap();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1ef53ec4", new Object[0]) : a.a();
    }

    public synchronized String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f16387a.put(valueOf, new WeakReference<>(jSONObject));
        return valueOf;
    }

    public synchronized JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        WeakReference<JSONObject> remove = this.f16387a.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }
}
