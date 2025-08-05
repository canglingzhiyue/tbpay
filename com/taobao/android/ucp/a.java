package com.taobao.android.ucp;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.BHRSolution;
import com.taobao.android.behavir.solution.e;
import com.taobao.android.behavir.solution.f;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.k;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.upp.b;
import com.taobao.android.upp.e;
import com.taobao.android.upp.h;
import com.taobao.tao.log.TLog;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends e<Map<String, Object>, Map<String, Object>> implements BHRSolution<Map<String, Object>, Map<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR = "error";
    public static final String NAME = "UCP";
    public static final String TAG = "UCP";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, h> f15694a = new ConcurrentHashMap(10);
    private Map<String, List<h>> b = new ConcurrentHashMap(10);
    private Map<String, List<h>> c = new ConcurrentHashMap(10);
    private Map<String, SoftReference<e.c>> d = new HashMap(5);
    private Map<String, SoftReference<e.a>> e = new HashMap(5);

    /* renamed from: com.taobao.android.ucp.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0608a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f15695a = new a();

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ae3b337c", new Object[0]) : f15695a;
        }
    }

    static {
        kge.a(-1512918789);
        kge.a(1685160846);
        kge.a(2084178938);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.behavir.solution.e
    public boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ed4546e", new Object[]{this, fVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.behavir.solution.e
    public Map<String, String> c(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf17935d", new Object[]{this, fVar});
        }
        return null;
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public Map<String, Object> d(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c04aa7c", new Object[]{this, fVar});
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.lang.Object] */
    @Override // com.taobao.android.behavir.solution.e
    public /* synthetic */ Map<String, Object> b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d7328489", new Object[]{this, fVar}) : d(fVar);
    }

    public static a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b0413659", new Object[0]) : C0608a.a();
    }

    public String a(String str, Object obj, String str2, JSONObject jSONObject, e.a aVar, com.taobao.android.upp.a aVar2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6e05213", new Object[]{this, str, obj, str2, jSONObject, aVar, aVar2});
        }
        try {
            synchronized (this) {
                if (!e()) {
                    LogUtils.a("UCP", "registerResourceSpace", "upp is closed.");
                    return "";
                }
                if (obj != null) {
                    str3 = obj.hashCode() + str;
                } else {
                    str3 = "kUCPCommonInstanceId";
                }
                String str4 = str3;
                h hVar = new h(str2, jSONObject, str4, aVar, aVar2);
                this.f15694a.put(hVar.c(), hVar);
                List<h> list = this.b.get(str2);
                if (list == null) {
                    list = new ArrayList<>(10);
                    this.b.put(str2, list);
                }
                list.add(hVar);
                List<h> list2 = this.c.get(hVar.b());
                if (list2 == null) {
                    list2 = new ArrayList<>(10);
                    this.c.put(hVar.b(), list2);
                }
                list2.add(hVar);
                LogUtils.c("UCP", "registerResourceSpace", hVar);
                k.a("UCP", "register", str, str2, str4, jSONObject);
                UtUtils.a("UCP", UtUtils.a(), "Register", str, str2, g.a("instanceId", hVar.b(), "params", jSONObject));
                return hVar.c();
            }
        } catch (Throwable th) {
            TLog.loge("UCP", "registerResourceSpace", th);
            return "";
        }
    }

    public String a(String str, Activity activity, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69d24792", new Object[]{this, str, activity, str2}) : a(str, activity, str2, null, null, null);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            synchronized (this) {
                if (!e()) {
                    LogUtils.c("UCP", "unregisterResourceSpace", "upp is closed.");
                    return;
                }
                h remove = this.f15694a.remove(str);
                if (remove == null) {
                    return;
                }
                List<h> list = this.b.get(remove.a());
                if (list != null && !list.isEmpty()) {
                    list.remove(remove);
                }
                List<h> list2 = this.c.get(remove.b());
                if (list2 != null && !list2.isEmpty()) {
                    list2.remove(remove);
                }
                LogUtils.c("UCP", "unregisterResourceSpace", remove);
            }
        } catch (Throwable th) {
            TLog.loge("UCP", "unregisterResourceSpace", th);
        }
    }

    public void a(String str, Object obj, e.a aVar, e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641e27c0", new Object[]{this, str, obj, aVar, cVar});
            return;
        }
        String valueOf = obj == null ? "null" : String.valueOf(obj.hashCode());
        if (cVar != null) {
            SoftReference<e.c> softReference = new SoftReference<>(cVar);
            Map<String, SoftReference<e.c>> map = this.d;
            map.put(valueOf + str, softReference);
        }
        if (aVar == null) {
            return;
        }
        SoftReference<e.a> softReference2 = new SoftReference<>(aVar);
        Map<String, SoftReference<e.a>> map2 = this.e;
        map2.put(valueOf + str, softReference2);
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        String valueOf = obj == null ? "null" : String.valueOf(obj.hashCode());
        Map<String, SoftReference<e.c>> map = this.d;
        map.remove(valueOf + str);
        Map<String, SoftReference<e.a>> map2 = this.e;
        map2.remove(valueOf + str);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : b.a();
    }
}
