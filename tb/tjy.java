package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.f;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.mto;

/* loaded from: classes8.dex */
public class tjy implements t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static t f34165a;
    private static Set<String> b;
    private static Map<String, Map<Long, a>> d;
    private static final String[] h;
    private String c;
    private boolean g = oeb.a("enableAddTintInfo", true);
    private HashSet<String> e = new HashSet<>();
    private Map<String, String> f = new HashMap();
    private Map<String, String> j = new HashMap();
    private String[] i = h;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f34166a;
        public long b;
        public long c;

        static {
            kge.a(-114368776);
        }

        public a(long j, long j2, long j3) {
            this.f34166a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    static {
        kge.a(-733612485);
        kge.a(702325769);
        h = new String[]{"weitao_switch", "tnode", "ShortVideo", f.UGC_ORANGE_GROUP};
        f34165a = b();
        b = new HashSet();
        d = new HashMap();
    }

    public static t b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("fbee01dc", new Object[]{str}) : new tjy(str);
    }

    public static t b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("7d3b80d2", new Object[0]) : new tjy("tab2");
    }

    public static t c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("70cb0513", new Object[0]) : f34165a;
    }

    public static void a(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7099cd2", new Object[]{str, new Long(j), new Long(j2), new Long(j3)});
        } else if (j == 0) {
        } else {
            synchronized (d) {
                Map<Long, a> map = d.get(str);
                if (map == null) {
                    map = new HashMap<>();
                    d.put(str, map);
                }
                map.put(Long.valueOf(j), new a(j, j2, j3));
            }
        }
    }

    private tjy(String str) {
        this.c = str;
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f34167a;
        public List<String> b;

        static {
            kge.a(-1638780069);
        }

        private b() {
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
            return;
        }
        this.i = strArr;
        ohg.a().a(strArr);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            String d2 = d();
            String f = f();
            String g = g();
            String h2 = h();
            Map e = e();
            hashMap.put(this.c + "_basic_configs", d2);
            hashMap.put(this.c + "_orange_configs", f);
            hashMap.put(this.c + "_abtest_configs", g);
            hashMap.put(this.c + "_web_configs", h2);
            hashMap.putAll(this.j);
            hashMap.putAll(e);
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        int g = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w().g();
        String c = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w().c(ab.a());
        String c2 = com.taobao.tao.flexbox.layoutmanager.ac.f.a(ab.a()) ? com.taobao.tao.flexbox.layoutmanager.ac.f.c(ab.a()) : "disconnected";
        int d2 = com.taobao.tao.flexbox.layoutmanager.ac.f.d(ab.a());
        return "deviceLevel:" + g + ";utdid:" + c + ";networkType:" + c2 + ";networkQuality:" + d2;
    }

    private Map e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.f;
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : ohg.a().b().entrySet()) {
                String key = entry.getKey();
                if (c(key)) {
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(key);
                    sb.append(":");
                    sb.append(entry.getValue());
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : this.i) {
            if (StringUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            synchronized (d) {
                Map<Long, a> map = d.get(this.c);
                if (map != null) {
                    for (Map.Entry<Long, a> entry : map.entrySet()) {
                        a value = entry.getValue();
                        if (sb.length() > 0) {
                            sb.append(";");
                        }
                        sb.append(value.f34166a);
                        sb.append(":");
                        sb.append(value.b);
                        sb.append(":");
                        sb.append(value.c);
                    }
                    sb.append(";");
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    private String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        try {
            synchronized (this.e) {
                Iterator<String> it = this.e.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(next);
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else if (list == null) {
        } else {
            try {
                b a2 = a(list);
                if (a2.f34167a == null || a2.b == null) {
                    return;
                }
                synchronized (this.e) {
                    Iterator<String> it = a2.b.iterator();
                    while (it.hasNext()) {
                        HashSet<String> hashSet = this.e;
                        hashSet.add(a2.f34167a + ":" + it.next());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            this.f.put(str, str2);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            this.j.put(str, str2);
        } catch (Throwable unused) {
        }
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            map.putAll(a());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void a(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap();
        }
        a(map);
        AppMonitor.Alarm.commitSuccess(this.c + "_" + str, str2, JSON.toJSONString(map));
        ogg.c("TrackTint", "commitSuccess: " + this.c + "_" + str + " name:" + str2);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void a(String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = new HashMap();
        }
        a(map);
        AppMonitor.Alarm.commitFail(this.c + "_" + str, str2, JSON.toJSONString(map), str3, null);
        ogg.c("TrackTint", "commitFail: " + this.c + "_" + str + " name:" + str2 + " errorCode:" + str3);
    }

    private void b(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a6651d", new Object[]{this, str, str2, map, map2});
            return;
        }
        String str3 = this.c + "_" + str + "_" + str2;
        if (b.contains(str3)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.g) {
            arrayList.add(this.c + "_basic_configs");
            arrayList.add(this.c + "_orange_configs");
            arrayList.add(this.c + "_abtest_configs");
            arrayList.add(this.c + "_web_configs");
            for (String str4 : this.f.keySet()) {
                arrayList.add(str4);
            }
            for (String str5 : this.j.keySet()) {
                arrayList.add(str5);
            }
        }
        if (map != null) {
            for (String str6 : map.keySet()) {
                arrayList.add(str6);
            }
        }
        DimensionSet create = DimensionSet.create(arrayList);
        ArrayList arrayList2 = new ArrayList();
        if (map2 != null) {
            arrayList2.addAll(map2.keySet());
        }
        AppMonitor.register(this.c + "_" + str, str2, MeasureSet.create(arrayList2), create);
        b.add(str3);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t
    public void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
            return;
        }
        b(str, str2, map, map2);
        HashMap hashMap = new HashMap();
        if (this.g) {
            hashMap.putAll(a());
        }
        if (!map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        DimensionValueSet fromStringMap = DimensionValueSet.fromStringMap(hashMap);
        HashMap hashMap2 = new HashMap();
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                hashMap2.put(entry2.getKey(), Double.valueOf(oec.a(entry2.getValue(), (double) mto.a.GEO_NOT_SUPPORT)));
            }
        }
        MeasureValueSet create = MeasureValueSet.create(hashMap2);
        AppMonitor.Stat.commit(this.c + "_" + str, str2, fromStringMap, create);
        ogg.c("TrackTint", "commitState: " + this.c + "_" + str + " name:" + str2);
    }

    private b a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e9dcb1ec", new Object[]{this, list});
        }
        b bVar = new b();
        for (Object obj : list) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String a2 = oec.a(map.get("type"), (String) null);
                String a3 = oec.a(map.get("name"), (String) null);
                String a4 = oec.a(map.get("version"), (String) null);
                if (StringUtils.equals(a2, "page")) {
                    bVar.f34167a = a3 + "_" + a4;
                } else {
                    if (bVar.b == null) {
                        bVar.b = new ArrayList();
                    }
                    List<String> list2 = bVar.b;
                    list2.add(a3 + "_" + a4);
                }
            }
        }
        return bVar;
    }
}
