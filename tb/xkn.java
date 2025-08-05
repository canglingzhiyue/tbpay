package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.task.Coordinator;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.mytaobao.basement.weex.c;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class xkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private volatile boolean f34352a;
    private final Map<String, a> b = new ConcurrentHashMap();
    private final Map<String, a> c = new ConcurrentHashMap();
    private final njg d = new njg() { // from class: tb.xkn.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.njg
        public void d(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87b91f26", new Object[]{this, str, str2, map});
            }
        }

        {
            xkn.this = this;
        }

        @Override // tb.njg
        public void a(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
                return;
            }
            xkn xknVar = xkn.this;
            xkn.a(xknVar, "onRequest requestId: " + str + ", requestUrl: " + str2 + ", params: " + map);
            xkn xknVar2 = xkn.this;
            xkn.a(xknVar2, str, xkn.a(xknVar2, str2, map), xkn.a(xkn.this, map));
        }

        @Override // tb.njg
        public void b(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
                return;
            }
            xkn xknVar = xkn.this;
            xkn.a(xknVar, "onError requestId: " + str + ", requestUrl: " + str2 + ", params: " + map);
            String str3 = (map == null || !(map.get("resultCode") instanceof String)) ? "null" : (String) map.get("resultCode");
            xkn xknVar2 = xkn.this;
            xkn.a(xknVar2, str, false, str3, null, xkn.a(xknVar2, map));
        }

        @Override // tb.njg
        public void c(String str, String str2, Map<String, Object> map) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8682cc47", new Object[]{this, str, str2, map});
                return;
            }
            xkn.a(xkn.this, "onFinished requestId: " + str + ", requestUrl: " + str2 + ", params: " + map);
            if (map != null) {
                if ((map.get(StdActions.ACTION_OPT_IMMEDIATE) instanceof Boolean) && ((Boolean) map.get(StdActions.ACTION_OPT_IMMEDIATE)).booleanValue()) {
                    str3 = StdActions.ACTION_OPT_IMMEDIATE;
                } else if ((map.get(c.SOURCE_FROM_DISK) instanceof Boolean) && ((Boolean) map.get(c.SOURCE_FROM_DISK)).booleanValue()) {
                    str3 = c.SOURCE_FROM_DISK;
                } else if ((map.get("fromSecondary") instanceof Boolean) && ((Boolean) map.get("fromSecondary")).booleanValue()) {
                    str3 = "fromSecondary";
                }
                xkn xknVar = xkn.this;
                xkn.a(xknVar, str, true, null, str3, xkn.a(xknVar, map));
            }
            str3 = null;
            xkn xknVar2 = xkn.this;
            xkn.a(xknVar2, str, true, null, str3, xkn.a(xknVar2, map));
        }
    };

    static {
        kge.a(-521052039);
    }

    public static /* synthetic */ void lambda$24AbJfbiUJ9Q0LAqM7EyHuuUDts(xkn xknVar) {
        xknVar.i();
    }

    public static /* synthetic */ void lambda$Jk660GAgVj4outt82KZ_5wm2mIY(xkn xknVar) {
        xknVar.j();
    }

    public static /* synthetic */ void lambda$arAmjAPgjvFnE8_eZDuenRasDec(xkn xknVar) {
        xknVar.h();
    }

    /* renamed from: lambda$d5ogB-4wanOPdQvQKmSP8wYlQLg */
    public static /* synthetic */ void m2500lambda$d5ogB4wanOPdQvQKmSP8wYlQLg(xkn xknVar) {
        xknVar.k();
    }

    public static /* synthetic */ void lambda$xFL43kzc8BioKuLVN4NAs_sAT78(xkn xknVar) {
        xknVar.g();
    }

    public static /* synthetic */ long a(xkn xknVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae0310bc", new Object[]{xknVar, map})).longValue() : xknVar.a(map);
    }

    public static /* synthetic */ String a(xkn xknVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7945e162", new Object[]{xknVar, str, map}) : xknVar.a(str, map);
    }

    public static /* synthetic */ void a(xkn xknVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7baa49a7", new Object[]{xknVar, str});
        } else {
            xknVar.a(str);
        }
    }

    public static /* synthetic */ void a(xkn xknVar, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16aa7533", new Object[]{xknVar, str, str2, new Long(j)});
        } else {
            xknVar.a(str, str2, j);
        }
    }

    public static /* synthetic */ void a(xkn xknVar, String str, boolean z, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a0fa43", new Object[]{xknVar, str, new Boolean(z), str2, str3, new Long(j)});
        } else {
            xknVar.a(str, z, str2, str3, j);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e.e("ImageLoadMonitor", "startMonitor");
        Coordinator.execute(new Runnable() { // from class: tb.-$$Lambda$xkn$d5ogB-4wanOPdQvQKmSP8wYlQLg
            @Override // java.lang.Runnable
            public final void run() {
                xkn.m2500lambda$d5ogB4wanOPdQvQKmSP8wYlQLg(xkn.this);
            }
        });
    }

    public /* synthetic */ void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            njh.a().a(this.d);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e.e("ImageLoadMonitor", "stopMonitor");
        Coordinator.execute(new Runnable() { // from class: tb.-$$Lambda$xkn$Jk660GAgVj4outt82KZ_5wm2mIY
            @Override // java.lang.Runnable
            public final void run() {
                xkn.lambda$Jk660GAgVj4outt82KZ_5wm2mIY(xkn.this);
            }
        });
    }

    public /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            njh.a().b(this.d);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.-$$Lambda$xkn$24AbJfbiUJ9Q0LAqM7EyHuuUDts
                @Override // java.lang.Runnable
                public final void run() {
                    xkn.lambda$24AbJfbiUJ9Q0LAqM7EyHuuUDts(xkn.this);
                }
            });
        }
    }

    public /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            lcz.b();
        }
    }

    private String a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map}) : (map == null || !(map.get("oriUrl") instanceof String)) ? str : (String) map.get("oriUrl");
    }

    private long a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a421211", new Object[]{this, map})).longValue() : SystemClock.uptimeMillis();
    }

    private void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.f34352a) {
                this.b.put(str, new a(str, str2, j));
            } else {
                this.c.put(str, new a(str, str2, j));
            }
        }
    }

    private void a(String str, boolean z, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5811bc8e", new Object[]{this, str, new Boolean(z), str2, str3, new Long(j)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a aVar = null;
            if (this.b.containsKey(str)) {
                aVar = this.b.get(str);
            } else if (this.c.containsKey(str)) {
                aVar = this.c.get(str);
            }
            if (aVar == null) {
                return;
            }
            aVar.d = j;
            aVar.e = z;
            aVar.g = str2;
            aVar.f = str3;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.-$$Lambda$xkn$arAmjAPgjvFnE8_eZDuenRasDec
                @Override // java.lang.Runnable
                public final void run() {
                    xkn.lambda$arAmjAPgjvFnE8_eZDuenRasDec(xkn.this);
                }
            });
        }
    }

    public /* synthetic */ void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        for (a aVar : this.b.values()) {
            if (!aVar.a()) {
                a(aVar.f34354a, false, "cancelByManual", null, a((Map<String, Object>) null));
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.-$$Lambda$xkn$xFL43kzc8BioKuLVN4NAs_sAT78
                @Override // java.lang.Runnable
                public final void run() {
                    xkn.lambda$xFL43kzc8BioKuLVN4NAs_sAT78(xkn.this);
                }
            });
        }
    }

    public /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (a aVar : this.c.values()) {
            if (!aVar.a()) {
                a(aVar.f34354a, false, "cancelByManual", null, a((Map<String, Object>) null));
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f34352a = z;
        }
    }

    private JSONObject b(Map<String, a> map) {
        xkn xknVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6501a39c", new Object[]{xknVar, map});
        }
        a aVar = null;
        if (map.size() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        long j = 0;
        long j2 = Long.MAX_VALUE;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        for (a aVar2 : map.values()) {
            xknVar.a(aVar2.toString());
            HashSet hashSet2 = hashSet;
            j2 = Math.min(j2, aVar2.c);
            j = Math.max(j, aVar2.d);
            if (aVar == null || aVar.b() < aVar2.b()) {
                aVar = aVar2;
            }
            if (aVar2.a()) {
                j4 = Math.min(aVar2.d, j4);
                j3 = Math.max(aVar2.d, j3);
                if (!aVar2.e) {
                    i2++;
                    if (aVar2.g != null) {
                        hashSet2.add(aVar2.g);
                    }
                }
            } else {
                i++;
            }
            xknVar = this;
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imageCount", (Object) Integer.valueOf(map.size()));
        jSONObject.put("totalStartTime", (Object) Long.valueOf(j2));
        jSONObject.put("totalEndTime", (Object) Long.valueOf(j));
        jSONObject.put("totalCost", (Object) Long.valueOf(j - j2));
        jSONObject.put("firstImageTime", (Object) Long.valueOf(j4));
        jSONObject.put("lastImageTime", (Object) Long.valueOf(j3));
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("startTime", (Object) Long.valueOf(aVar.c));
            jSONObject2.put("endTime", (Object) Long.valueOf(aVar.d));
            jSONObject2.put("cost", (Object) Long.valueOf(aVar.b()));
            jSONObject2.put("success", (Object) Boolean.valueOf(aVar.e));
            jSONObject2.put("from", (Object) (aVar.f != null ? aVar.f : "null"));
            if (aVar.g != null) {
                jSONObject2.put("errorCode", (Object) aVar.g);
            }
            jSONObject.put("maxCost", (Object) jSONObject2);
            e.c("ImageLoadMonitor", "maxCostItem=" + aVar);
        }
        jSONObject.put("peddingCount", (Object) Integer.valueOf(i));
        jSONObject.put("failedCount", (Object) Integer.valueOf(i2));
        jSONObject.put("failedCodes", (Object) hashSet3);
        return jSONObject;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject b = b(this.b);
        JSONObject b2 = b(this.c);
        if (b == null && b2 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (b != null) {
            jSONObject.put("firstScreenImageLoad", (Object) b);
        }
        if (b2 != null) {
            jSONObject.put("screenImageLoad", (Object) b2);
        }
        e.c("ImageLoadMonitor", jSONObject.toJSONString());
        return jSONObject;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public String f34354a;
        public String b;
        public volatile long c;
        public volatile long d;
        public volatile boolean e;
        public String f;
        public String g;

        static {
            kge.a(-398763901);
        }

        public a(String str, String str2, long j) {
            this.f34354a = str;
            this.b = str2;
            this.c = j;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d > 0;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
            }
            if (this.d < this.c) {
                return 0L;
            }
            return this.d - this.c;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ImageItem{requestId='" + this.f34354a + "', cost=" + b() + ", startTime=" + this.c + ", endTime=" + this.d + ", success=" + this.e + ", from='" + this.f + "', errorCode='" + this.g + "', oriUrl='" + this.b + "'}";
        }
    }
}
