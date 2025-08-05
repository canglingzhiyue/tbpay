package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public class lzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31000a;

    static {
        kge.a(395838211);
    }

    public a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("520cef2e", new Object[]{this, aVar});
        }
        if (aVar == null && obu.a()) {
            throw new RuntimeException("FastTrackerInfo is null");
        }
        this.f31000a = aVar;
        return aVar;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6b6f228c", new Object[]{this}) : this.f31000a;
    }

    public a b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4e0e7e0d", new Object[]{this, aVar});
        }
        a aVar2 = this.f31000a;
        if (aVar2 == null) {
            return null;
        }
        List list = aVar2.f;
        if (list == null) {
            list = new ArrayList();
            this.f31000a.f = list;
        }
        list.add(aVar);
        return aVar;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f31000a == null) {
        } else {
            d.a(new Runnable() { // from class: tb.lzc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Map<String, String> c = lzc.this.c();
                    spz.a("VSAggrLog", "generateUtArgs = " + c);
                    FluidSDK.getUTAdapter().trackCustom("VSAggrLog", 19997, "submitLog", "", "", c);
                    spz.c("VSAggrLog", "submitLog 19997");
                }
            });
        }
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lid", this.f31000a.f31001a);
        hashMap.put("plid", this.f31000a.b);
        a(hashMap, "props", this.f31000a.c);
        a(hashMap, "ext", this.f31000a.d);
        a(hashMap, dck.COL_SEQ, this.f31000a.f);
        hashMap.put("ts", this.f31000a.e);
        hashMap.put("type", this.f31000a.g);
        hashMap.put("name", this.f31000a.h);
        return hashMap;
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "lid")

        /* renamed from: a  reason: collision with root package name */
        public final String f31001a;
        @JSONField(name = "plid")
        public String b;
        @JSONField(name = "props")
        public final Map<String, Object> c = new HashMap();
        @JSONField(name = "ext")
        public Map<String, Object> d;
        @JSONField(name = "ts")
        public String e;
        @JSONField(name = dck.COL_SEQ)
        public List<a> f;
        @JSONField(name = "type")
        public String g;
        @JSONField(name = "name")
        public String h;
        @JSONField(deserialize = false, serialize = false)
        public long i;
        @JSONField(deserialize = false, serialize = false)
        public long j;

        static {
            kge.a(617945673);
        }

        private a(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f31001a = UUID.randomUUID().toString();
            } else {
                this.f31001a = str;
            }
            this.i = SystemClock.elapsedRealtime();
        }

        public static a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("28d36602", new Object[]{str});
            }
            a aVar = new a(str);
            IMTopAdapter mTopAdapter = FluidSDK.getMTopAdapter();
            if (mTopAdapter == null) {
                return aVar;
            }
            aVar.c(String.valueOf(mTopAdapter.getServerTimeMillis()));
            return aVar;
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6b6f228c", new Object[0]) : a((String) null);
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b103a5e1", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6f3fe626", new Object[]{this, str, obj});
            }
            this.c.put(str, obj);
            return this;
        }

        public a a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c4101877", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public a b(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("60e98c45", new Object[]{this, str, obj});
            }
            if (this.d == null) {
                this.d = new HashMap(3);
            }
            this.d.put(str, obj);
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3933e5c0", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c164259f", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4994657e", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public Object f(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cac6299b", new Object[]{this, str}) : this.c.get(str);
        }

        public List<a> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f;
        }
    }

    private static void a(Map<String, String> map, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0602c3", new Object[]{map, str, obj});
        } else if (obj == null) {
        } else {
            try {
                map.put(str, URLEncoder.encode(obz.a(obj)));
            } catch (Exception e) {
                spz.a("FastTracker", "", e);
            }
        }
    }
}
