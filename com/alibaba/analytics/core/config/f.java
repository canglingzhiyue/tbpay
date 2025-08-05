package com.alibaba.analytics.core.config;

import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.aob;
import tb.aof;
import tb.apr;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class f extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f2057a;
    private final Map<String, String> b = Collections.synchronizedMap(new HashMap());
    private final Map<String, List<a>> c = Collections.synchronizedMap(new HashMap());
    private final String[] d = {"utap_system"};
    private final Map<String, b> e = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, String str2);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(572585472);
        f2057a = null;
    }

    private f() {
        try {
            if (aob.a().G() == null) {
                return;
            }
            List<? extends aof> a2 = aob.a().G().a(e.class, null, null, -1);
            if (a2.size() <= 0) {
                return;
            }
            Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap(a2.size()));
            for (int i = 0; i < a2.size(); i++) {
                synchronizedMap.put(((e) a2.get(i)).f2056a, ((e) a2.get(i)).b);
            }
            b(synchronizedMap);
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
    }

    public static synchronized f a() {
        synchronized (f.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("afc32d3a", new Object[0]);
            }
            if (f2057a == null) {
                f2057a = new f();
            }
            return f2057a;
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.b.get(str);
    }

    public void a(String str, a aVar) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeeaddd3", new Object[]{this, str, aVar});
            return;
        }
        synchronized (this.c) {
            if (this.c.get(str) == null) {
                list = new ArrayList<>();
            } else {
                list = this.c.get(str);
            }
            list.add(aVar);
            this.c.put(str, list);
        }
    }

    @Override // com.alibaba.analytics.core.config.n
    public String[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this}) : this.d;
    }

    @Override // com.alibaba.analytics.core.config.n
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!"utap_system".equalsIgnoreCase(str)) {
        } else {
            b(map);
            aob.a().G().c(e.class);
            aob.a().G().a(c(this.b));
        }
    }

    private void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        d(map);
        HashMap hashMap = new HashMap(this.b.size());
        hashMap.putAll(this.b);
        this.b.clear();
        this.b.putAll(map);
        for (String str : this.b.keySet()) {
            if ((this.b.get(str) == null && hashMap.get(str) != null) || (this.b.get(str) != null && !this.b.get(str).equalsIgnoreCase((String) hashMap.get(str)))) {
                a(str, this.b.get(str));
            }
            hashMap.remove(str);
        }
        for (String str2 : hashMap.keySet()) {
            a(str2, this.b.get(str2));
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        List<a> list = this.c.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).a(str, str2);
            }
        }
        i.a(str, str2);
    }

    private List<aof> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("76d5220c", new Object[]{this, map});
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            e eVar = new e();
            eVar.f2056a = str;
            eVar.b = map.get(str);
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        String a2 = a(str);
        if (!TextUtils.isEmpty(a2)) {
            try {
                return Integer.valueOf(a2).intValue();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    private synchronized void d(Map<String, String> map) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        if (map != null && map.containsKey("delay")) {
            if ((this.b.get("delay") == null || !map.get("delay").equals(this.b.get("delay"))) && this.e != null) {
                this.e.clear();
                try {
                    JSONObject jSONObject = new JSONObject(map.get("delay"));
                    Iterator<String> keys = jSONObject.keys();
                    if (keys == null) {
                        return;
                    }
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = jSONObject.getString(next);
                        if (!TextUtils.isEmpty(string) && (a2 = b.a(string)) != null) {
                            this.e.put(next, a2);
                        }
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (this.e != null) {
            this.e.clear();
        }
    }

    public synchronized boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return this.e != null && this.e.size() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001e, B:10:0x0022, B:13:0x002c, B:16:0x0039, B:21:0x004f, B:23:0x005b, B:26:0x0061, B:28:0x0070, B:31:0x0076, B:33:0x0085, B:36:0x008b, B:38:0x009a, B:41:0x00a0, B:43:0x00ac, B:19:0x004b), top: B:55:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x001e, B:10:0x0022, B:13:0x002c, B:16:0x0039, B:21:0x004f, B:23:0x005b, B:26:0x0061, B:28:0x0070, B:31:0x0076, B:33:0x0085, B:36:0x008b, B:38:0x009a, B:41:0x00a0, B:43:0x00ac, B:19:0x004b), top: B:55:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.analytics.core.config.f.$ipChange     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> Lb6
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.String r1 = "5a421221"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lb6
            r3[r2] = r5     // Catch: java.lang.Throwable -> Lb6
            r2 = 1
            r3[r2] = r6     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r6 = r0.ipc$dispatch(r1, r3)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lb6
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r5)
            return r6
        L1e:
            java.util.Map<java.lang.String, com.alibaba.analytics.core.config.f$b> r0 = r5.e     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb4
            java.util.Map<java.lang.String, com.alibaba.analytics.core.config.f$b> r0 = r5.e     // Catch: java.lang.Throwable -> Lb6
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb6
            if (r0 > 0) goto L2c
            goto Lb4
        L2c:
            com.alibaba.analytics.core.model.LogField r0 = com.alibaba.analytics.core.model.LogField.EVENTID     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> Lb6
            r1 = -1
            if (r0 == 0) goto L4e
            com.alibaba.analytics.core.model.LogField r0 = com.alibaba.analytics.core.model.LogField.EVENTID     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> Lb6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> Lb6
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> Lb6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> Lb6
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> Lb6
            goto L4f
        L4a:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lb6
        L4e:
            r0 = -1
        L4f:
            java.util.Map<java.lang.String, com.alibaba.analytics.core.config.f$b> r3 = r5.e     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L61
            boolean r6 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r5)
            return r6
        L61:
            int r3 = r0 % 10
            int r0 = r0 - r3
            java.util.Map<java.lang.String, com.alibaba.analytics.core.config.f$b> r3 = r5.e     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L76
            boolean r6 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r5)
            return r6
        L76:
            int r3 = r0 % 100
            int r0 = r0 - r3
            java.util.Map<java.lang.String, com.alibaba.analytics.core.config.f$b> r3 = r5.e     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto L8b
            boolean r6 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r5)
            return r6
        L8b:
            int r3 = r0 % 1000
            int r0 = r0 - r3
            java.util.Map<java.lang.String, com.alibaba.analytics.core.config.f$b> r3 = r5.e     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 == 0) goto La0
            boolean r6 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r5)
            return r6
        La0:
            java.util.Map<java.lang.String, com.alibaba.analytics.core.config.f$b> r0 = r5.e     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lb6
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lb2
            boolean r6 = r5.a(r6, r1)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r5)
            return r6
        Lb2:
            monitor-exit(r5)
            return r2
        Lb4:
            monitor-exit(r5)
            return r2
        Lb6:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.analytics.core.config.f.a(java.util.Map):boolean");
    }

    private boolean a(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee00a48a", new Object[]{this, map, new Integer(i)})).booleanValue();
        }
        b bVar = this.e.get(String.valueOf(i));
        if (bVar == null) {
            return false;
        }
        String str = null;
        if (map.containsKey(LogField.ARG1.toString())) {
            str = map.get(LogField.ARG1.toString());
        }
        return bVar.b(str);
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f2058a = -1;
        private List<String> b = new ArrayList();

        static {
            kge.a(-1491050620);
        }

        private b() {
        }

        public static b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b94a34c6", new Object[]{str});
            }
            try {
                b bVar = new b();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("all_d")) {
                    bVar.f2058a = jSONObject.optInt("all_d", -1);
                }
                if (jSONObject.has("arg1")) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray("arg1");
                    if (jSONArray != null) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                    }
                    bVar.b = arrayList;
                }
                return bVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
            }
            int i = this.f2058a;
            if (i == 0) {
                return c(str);
            }
            return 1 == i && !c(str);
        }

        private boolean c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && this.b != null) {
                for (int i = 0; i < this.b.size(); i++) {
                    String str2 = this.b.get(i);
                    if (!TextUtils.isEmpty(str2)) {
                        if (str2.length() > 2 && str2.startsWith(riy.MOD) && str2.endsWith(riy.MOD)) {
                            if (str.contains(str2.substring(1, str2.length() - 1))) {
                                return true;
                            }
                        } else if (str.equals(str2)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
