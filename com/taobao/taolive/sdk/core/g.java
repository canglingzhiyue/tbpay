package com.taobao.taolive.sdk.core;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ame;
import tb.ibw;
import tb.ibx;
import tb.kge;
import tb.sst;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ISmartLandingProxy.b F;
    public ATaoliveOpenLiveRoomEntity G;
    public boolean H;
    private String b;
    private JSONObject c;
    private Deque<JSONObject> d;
    private JSONObject e;
    private k g;
    private boolean h;
    private RecyclerView k;
    private long o;
    public boolean w;
    private final ame n = new ame();
    public final Map<String, Object> t = new ConcurrentHashMap();
    private long f = 0;
    public boolean B = false;
    private boolean i = true;
    private boolean j = true;
    private boolean p = false;
    private final RecyclerView.RecycledViewPool l = new RecyclerView.RecycledViewPool();
    private final RecyclerView.RecycledViewPool m = new RecyclerView.RecycledViewPool();
    public ArrayList<a> v = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private ibw f21825a = new ibx();

    /* loaded from: classes8.dex */
    public interface a {
        void onGlobalLiveRoomMuteChanged(boolean z);
    }

    static {
        kge.a(1594732724);
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : this.i && sst.a();
    }

    public ATaoliveOpenLiveRoomEntity f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ATaoliveOpenLiveRoomEntity) ipChange.ipc$dispatch("4be534fd", new Object[]{this}) : this.G;
    }

    public ame K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ame) ipChange.ipc$dispatch("65be2c5b", new Object[]{this}) : this.n;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51945c7c", new Object[]{this, aVar});
        } else if (this.v.contains(aVar)) {
        } else {
            this.v.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e6f91b", new Object[]{this, aVar});
        } else {
            this.v.remove(aVar);
        }
    }

    public <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        Map<String, Object> map = this.t;
        if (map == null) {
            return null;
        }
        try {
            return (T) map.get(str);
        } catch (Throwable th) {
            Log.e("globalContext", "msg:" + th.getMessage());
            return null;
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        Map<String, Object> map = this.t;
        if (map != null) {
            if (obj == null) {
                map.remove(str);
                return;
            } else {
                map.put(str, obj);
                return;
            }
        }
        Log.e("globalContext", "mMap or key or value is null,key=" + str);
    }

    public ibw aJ_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ibw) ipChange.ipc$dispatch("868bda2b", new Object[]{this}) : this.f21825a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this}) : this.c;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public Deque<JSONObject> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Deque) ipChange.ipc$dispatch("68fd9ce4", new Object[]{this}) : this.d;
    }

    public void a(Deque<JSONObject> deque) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b56a19", new Object[]{this, deque});
        } else {
            this.d = deque;
        }
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this}) : this.e;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    public long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue() : this.f;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public k t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("eb632de8", new Object[]{this}) : this.g;
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd07815", new Object[]{this, kVar});
        } else {
            this.g = kVar;
        }
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.h;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public RecyclerView D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("e161b799", new Object[]{this}) : this.k;
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else {
            this.k = recyclerView;
        }
    }

    public RecyclerView.RecycledViewPool G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("4cdf24ea", new Object[]{this}) : this.l;
    }

    public RecyclerView.RecycledViewPool H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("754c56b", new Object[]{this}) : this.m;
    }

    public long L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4447ec7", new Object[]{this})).longValue() : this.o;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else if (j <= 0) {
        } else {
            this.o = j;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.p;
    }
}
