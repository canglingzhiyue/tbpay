package com.alibaba.analytics.core.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aob;
import tb.aoc;
import tb.apr;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public abstract class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f2059a;
    public static final String[] b;
    private static String e;
    private Vector<n> c = new Vector<>();
    private List<k> d = new LinkedList();

    public abstract void d();

    static {
        kge.a(-1781139843);
        b = new String[]{"ut_sample", "ut_bussiness", "utap_system", "ap_alarm", "ap_counter", "ap_stat", "ut_realtime"};
        e = "{\"utap_system\":{\"content\":{\"fu\":30,\"sw_plugin\":0,\"bu\":300}},\"ut_sample\":{\"content\":{\"1\":{\"cp\":10000},\"1000\":{\"cp\":10000},\"2000\":{\"cp\":10000},\"2100\":{\"cp\":10000},\"3002\":{\"cp\":10000},\"3003\":{\"cp\":10000},\"3004\":{\"cp\":10000},\"4007\":{\"cp\":10000},\"5002\":{\"cp\":10000},\"5004\":{\"cp\":10000},\"5005\":{\"cp\":10000},\"6004\":{\"cp\":10000},\"9001\":{\"cp\":10000},\"9002\":{\"cp\":10000},\"9003\":{\"cp\":10000},\"9101\":{\"cp\":10000},\"9199\":{\"cp\":10000},\"12000\":{\"cp\":10000},\"15301\":{\"cp\":10000},\"15302\":{\"cp\":1},\"15303\":{\"cp\":10000},\"15304\":{\"cp\":10000},\"15305\":{\"cp\":10000},\"15306\":{\"cp\":100},\"15307\":{\"cp\":10000},\"15391\":{\"cp\":100},\"15392\":{\"cp\":10000},\"15393\":{\"cp\":1200},\"15394\":{\"cp\":10000},\"19990\":{\"cp\":10000},\"19997\":{\"cp\":10000},\"19998\":{\"cp\":10000},\"19999\":{\"cp\":10000},\"21032\":{\"cp\":10000},\"21034\":{\"cp\":1},\"21064\":{\"cp\":10000},\"22064\":{\"cp\":1},\"61001\":{\"cp\":10000},\"61006\":{\"cp\":10000},\"61007\":{\"cp\":10000},\"65001\":{\"cp\":1},\"65100\":{\"cp\":1},\"65101\":{\"cp\":4},\"65104\":{\"cp\":10000},\"65105\":{\"cp\":10000},\"65111\":{\"cp\":100},\"65113\":{\"cp\":10000},\"65114\":{\"cp\":10000},\"65125\":{\"cp\":10000},\"65132\":{\"cp\":10000},\"65171\":{\"cp\":100},\"65172\":{\"cp\":100},\"65173\":{\"cp\":100},\"65174\":{\"cp\":100},\"65175\":{\"cp\":100},\"65176\":{\"cp\":100},\"65177\":{\"cp\":100},\"65178\":{\"cp\":100},\"65180\":{\"cp\":900},\"65183\":{\"cp\":10000},\"65200\":{\"cp\":10000},\"65501\":{\"cp\":10000},\"65502\":{\"cp\":10000},\"65503\":{\"cp\":10000},\"66001\":{\"cp\":100},\"66003\":{\"cp\":10000},\"66101\":{\"cp\":10000},\"66404\":{\"cp\":10000},\"66602\":{\"cp\":10000}}},\"ut_bussiness\":{\"content\":{\"tpk\":[{\"kn\":\"adid\",\"ty\":\"nearby\"},{\"kn\":\"ucm\",\"ty\":\"nearby\"},{\"kn\":\"bdid\",\"ty\":\"far\"},{\"kn\":\"ref_pid\",\"ty\":\"far\"},{\"kn\":\"pid\",\"ty\":\"far\"},{\"kn\":\"tpa\",\"ty\":\"far\"},{\"kn\":\"point\",\"ty\":\"far\"},{\"kn\":\"ali_trackid\",\"ty\":\"far\"},{\"kn\":\"xncode\",\"ty\":\"nearby\"},{\"kn\":\"ybhpss\",\"ty\":\"nearby\"},{\"kn\":\"a_n\",\"ty\":\"far\"},{\"kn\":\"i_d\",\"ty\":\"far\"},{\"kn\":\"h_d\",\"ty\":\"far\"},{\"kn\":\"r_n\",\"ty\":\"far\"},{\"kn\":\"uplusRankId\",\"ty\":\"nearby\"}]}}}";
        f2059a = "timestamp";
    }

    public final synchronized void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        if (map != null && map.size() > 0) {
            String remove = map.remove(f2059a);
            if (!TextUtils.isEmpty(remove)) {
                long longValue = Long.valueOf(remove).longValue();
                long b2 = aoc.a().b(str);
                apr.b("UTBaseConfMgr", "updateAndDispatch namespace", str, "inputTimestampLong", String.valueOf(longValue), "configTimeStamp", String.valueOf(b2));
                if (longValue > b2) {
                    k a2 = j.a(str, map, longValue);
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(a2);
                    List<k> c = c(linkedList);
                    if (c != null && c.size() > 0) {
                        a(c);
                    }
                }
                return;
            }
            apr.e("UTBaseConfMgr", "updateAndDispatch", "timestamp is empty");
        }
    }

    public synchronized void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb21e32", new Object[]{this, nVar});
            return;
        }
        if (nVar != null) {
            this.c.add(nVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:9|(9:14|15|16|17|(2:20|18)|21|22|23|24)|28|29|30|(2:33|31)|34|17|(1:18)|21|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        tb.apr.b("UTBaseConfMgr", r0, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[Catch: all -> 0x00d4, LOOP:0: B:27:0x00ad->B:29:0x00b3, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0014, B:10:0x004b, B:13:0x0054, B:14:0x0060, B:26:0x00a4, B:27:0x00ad, B:29:0x00b3, B:30:0x00cd, B:17:0x0065, B:18:0x006d, B:19:0x0079, B:20:0x008c, B:22:0x0092, B:25:0x009d), top: B:36:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.analytics.core.config.g.$ipChange     // Catch: java.lang.Throwable -> Ld4
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> Ld4
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            java.lang.String r1 = "57a83e9"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Ld4
            r2[r3] = r6     // Catch: java.lang.Throwable -> Ld4
            r0.ipc$dispatch(r1, r2)     // Catch: java.lang.Throwable -> Ld4
            monitor-exit(r6)
            return
        L14:
            tb.aob r0 = tb.aob.a()     // Catch: java.lang.Throwable -> Ld4
            tb.aoe r0 = r0.G()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Class<com.alibaba.analytics.core.config.k> r1 = com.alibaba.analytics.core.config.k.class
            r4 = -1
            r5 = 0
            java.util.List r0 = r0.a(r1, r5, r5, r4)     // Catch: java.lang.Throwable -> Ld4
            r6.d = r0     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "UTBaseConfMgr"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r4 = "init UTDBConfig"
            r1[r3] = r4     // Catch: java.lang.Throwable -> Ld4
            tb.apr.b(r0, r1)     // Catch: java.lang.Throwable -> Ld4
            r6.e()     // Catch: java.lang.Throwable -> Ld4
            r6.c()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = "UTBaseConfMgr"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r4 = "init refreshLocalDBConfig"
            r1[r3] = r4     // Catch: java.lang.Throwable -> Ld4
            tb.apr.b(r0, r1)     // Catch: java.lang.Throwable -> Ld4
            r6.e()     // Catch: java.lang.Throwable -> Ld4
            java.util.List<com.alibaba.analytics.core.config.k> r0 = r6.d     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto L6d
            java.util.List<com.alibaba.analytics.core.config.k> r0 = r6.d     // Catch: java.lang.Throwable -> Ld4
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld4
            if (r0 != 0) goto L54
            goto L6d
        L54:
            java.lang.String r0 = "UTBaseConfMgr"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "init refreshDefaultWhiteConfigs"
            r1[r3] = r2     // Catch: java.lang.Throwable -> Ld4
            tb.apr.c(r0, r1)     // Catch: java.lang.Throwable -> Ld4
            r6.a()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> Ld4
            goto La4
        L64:
            r0 = move-exception
            java.lang.String r1 = "UTBaseConfMgr"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld4
            tb.apr.b(r1, r0, r2)     // Catch: java.lang.Throwable -> Ld4
            goto La4
        L6d:
            java.lang.String r0 = "UTBaseConfMgr"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "init LocalDBConfigEntities is null"
            r1[r3] = r2     // Catch: java.lang.Throwable -> Ld4
            tb.apr.b(r0, r1)     // Catch: java.lang.Throwable -> Ld4
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            java.lang.String r1 = com.alibaba.analytics.core.config.g.e     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            r0.<init>(r1)     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            java.util.List r0 = com.alibaba.analytics.core.config.j.b(r0)     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            r6.d = r0     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            java.util.List<com.alibaba.analytics.core.config.k> r0 = r6.d     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            java.util.Iterator r0 = r0.iterator()     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
        L8c:
            boolean r1 = r0.hasNext()     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            if (r1 == 0) goto La4
            java.lang.Object r1 = r0.next()     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            com.alibaba.analytics.core.config.k r1 = (com.alibaba.analytics.core.config.k) r1     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            r1.f()     // Catch: org.json.JSONException -> L9c java.lang.Throwable -> Ld4
            goto L8c
        L9c:
            r0 = move-exception
            java.lang.String r1 = "UTBaseConfMgr"
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld4
            tb.apr.b(r1, r0, r2)     // Catch: java.lang.Throwable -> Ld4
        La4:
            r6.e()     // Catch: java.lang.Throwable -> Ld4
            java.util.List<com.alibaba.analytics.core.config.k> r0 = r6.d     // Catch: java.lang.Throwable -> Ld4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld4
        Lad:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld4
            if (r1 == 0) goto Lcd
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Ld4
            com.alibaba.analytics.core.config.k r1 = (com.alibaba.analytics.core.config.k) r1     // Catch: java.lang.Throwable -> Ld4
            tb.aoc r2 = tb.aoc.a()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> Ld4
            long r4 = r1.c()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Ld4
            r2.a(r3, r1)     // Catch: java.lang.Throwable -> Ld4
            goto Lad
        Lcd:
            java.util.List<com.alibaba.analytics.core.config.k> r0 = r6.d     // Catch: java.lang.Throwable -> Ld4
            r6.a(r0)     // Catch: java.lang.Throwable -> Ld4
            monitor-exit(r6)
            return
        Ld4:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.analytics.core.config.g.b():void");
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (k kVar : this.d) {
            String a2 = kVar.a();
            if ("utap_system".equalsIgnoreCase(a2)) {
                z = true;
            } else if ("ut_sample".equalsIgnoreCase(a2)) {
                z2 = true;
            } else if ("ut_bussiness".equalsIgnoreCase(a2)) {
                z3 = true;
            }
        }
        if (!z || !z2 || !z3) {
            List<k> linkedList = new LinkedList();
            k kVar2 = null;
            try {
                linkedList = j.b(new JSONObject(e));
            } catch (JSONException e2) {
                apr.b(null, e2, new Object[0]);
            }
            if (linkedList != null) {
                k kVar3 = null;
                k kVar4 = null;
                for (k kVar5 : linkedList) {
                    String a3 = kVar5.a();
                    if ("utap_system".equalsIgnoreCase(a3)) {
                        kVar2 = kVar5;
                    } else if ("ut_sample".equalsIgnoreCase(a3)) {
                        kVar3 = kVar5;
                    } else if ("ut_bussiness".equalsIgnoreCase(a3)) {
                        kVar4 = kVar5;
                    }
                }
                if (!z && kVar2 != null) {
                    this.d.add(kVar2);
                    kVar2.f();
                }
                if (!z2 && kVar3 != null) {
                    this.d.add(kVar3);
                }
                if (!z3 && kVar4 != null) {
                    this.d.add(kVar4);
                }
            }
        }
    }

    private synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.d != null && this.d.size() != 0) {
            HashMap hashMap = new HashMap();
            boolean z = false;
            for (k kVar : this.d) {
                long j = 0;
                if (kVar.c() > 0) {
                    String a2 = kVar.a();
                    if (hashMap.containsKey(a2)) {
                        long c = kVar.c();
                        try {
                            j = ((k) hashMap.get(a2)).c();
                        } catch (Exception unused) {
                        }
                        if (c > j) {
                            hashMap.put(a2, kVar);
                        }
                    } else {
                        hashMap.put(a2, kVar);
                    }
                }
                z = true;
            }
            apr.b("UTBaseConfMgr", "LocalDBConfig needClearDatabase", Boolean.valueOf(z));
            if (z) {
                this.d.clear();
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.d.add((k) entry.getValue());
                }
                aob.a().G().c(k.class);
                for (k kVar2 : this.d) {
                    kVar2.f();
                }
            }
        }
    }

    private synchronized List<k> c(List<k> list) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f9e1c8c", new Object[]{this, list});
        }
        HashMap hashMap = new HashMap();
        for (k kVar2 : this.d) {
            if (kVar2.a() != null) {
                hashMap.put(kVar2.a(), kVar2);
            }
        }
        LinkedList linkedList = new LinkedList();
        for (k kVar3 : list) {
            String a2 = kVar3.a();
            long c = kVar3.c();
            if (!aqc.e(a2) && c > 0 && ((kVar = (k) hashMap.get(a2)) == null || c > kVar.c())) {
                if (kVar != null && c > kVar.c()) {
                    this.d.remove(kVar);
                    kVar.g();
                }
                this.d.add(kVar3);
                kVar3.f();
                aoc.a().a(a2, String.valueOf(c));
                linkedList.add(kVar3);
            }
        }
        e();
        return linkedList;
    }

    private synchronized void a(List<k> list) {
        String[] b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        if (list != null && list.size() > 0) {
            HashMap hashMap = new HashMap();
            for (k kVar : list) {
                if (!aqc.e(kVar.a())) {
                    hashMap.put(kVar.a(), kVar);
                }
            }
            Iterator<n> it = this.c.iterator();
            while (it.hasNext()) {
                n next = it.next();
                for (String str : next.b()) {
                    if (hashMap.containsKey(str)) {
                        k kVar2 = (k) hashMap.get(str);
                        if (apr.a()) {
                            apr.b("", "Groupname", str, "DBConfEntity", aqc.b(kVar2.b()));
                        }
                        next.a(str, aqc.b(kVar2.b()));
                    }
                }
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (apr.a()) {
            apr.b("UTBaseConfMgr", "++++++++++_printLocalDBConfigEntities++++++++++");
            apr.b("UTBaseConfMgr", "LocalDBConfigEntities.size", Integer.valueOf(this.d.size()));
            for (k kVar : this.d) {
                apr.b("UTBaseConfMgr", "Groupname", kVar.a(), "ConfTimestamp", Long.valueOf(kVar.c()), "ContentLength", Integer.valueOf(kVar.b().length()), "_id", Long.valueOf(kVar.c));
            }
        }
    }
}
