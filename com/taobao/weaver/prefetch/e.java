package com.taobao.weaver.prefetch;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weaver.prefetch.PerformanceData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.riy;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static e b;

    /* renamed from: a  reason: collision with root package name */
    public b f23473a;
    private final List<d> c = new CopyOnWriteArrayList();
    private LruCache<String, c> d = new LruCache<>(20);
    private Map<String, List<com.taobao.weaver.prefetch.a>> e = new ConcurrentHashMap();

    /* loaded from: classes9.dex */
    public abstract class a implements com.taobao.weaver.prefetch.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f23475a;

        public a(String str) {
            this.f23475a = str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f23475a;
        }
    }

    /* loaded from: classes9.dex */
    public interface b {
        String a(String str);
    }

    public static /* synthetic */ Map a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4c46f973", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ void a(e eVar, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1840a0a0", new Object[]{eVar, str, cVar});
        } else {
            eVar.a(str, cVar);
        }
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e025344", new Object[0]);
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    private e() {
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8dad75f", new Object[]{this, dVar});
        } else {
            this.c.add(dVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(final java.lang.String r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            r13 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weaver.prefetch.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r13
            r2 = 1
            r1[r2] = r14
            r14 = 2
            r1[r14] = r15
            java.lang.String r14 = "4dcf7ed"
            java.lang.Object r14 = r0.ipc$dispatch(r14, r1)
            java.lang.String r14 = (java.lang.String) r14
            return r14
        L1b:
            java.util.List<com.taobao.weaver.prefetch.d> r0 = r13.c
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L23:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r2 = r0.next()
            com.taobao.weaver.prefetch.d r2 = (com.taobao.weaver.prefetch.d) r2
            com.taobao.weaver.prefetch.f r3 = r2.a(r14, r15)
            com.taobao.weaver.prefetch.PrefetchType r4 = r3.f23476a
            com.taobao.weaver.prefetch.PrefetchType r5 = com.taobao.weaver.prefetch.PrefetchType.NOT_SUPPORTED
            if (r4 == r5) goto L42
            com.taobao.weaver.prefetch.PrefetchType r5 = com.taobao.weaver.prefetch.PrefetchType.CUSTOMIZED
            if (r4 == r5) goto L45
            com.taobao.weaver.prefetch.PrefetchType r5 = com.taobao.weaver.prefetch.PrefetchType.SUPPORTED
            if (r4 != r5) goto L42
            goto L46
        L42:
            r2 = r3
            goto L23
        L44:
            r3 = r2
        L45:
            r2 = r1
        L46:
            if (r2 == 0) goto L89
            if (r3 == 0) goto L89
            java.lang.String r0 = r13.a(r14)
            java.lang.String r1 = r3.b
            boolean r1 = android.text.StringUtils.isEmpty(r1)
            if (r1 != 0) goto L6c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "#"
            r1.append(r0)
            java.lang.String r0 = r3.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L6c:
            r8 = r0
            java.util.Map<java.lang.String, java.util.List<com.taobao.weaver.prefetch.a>> r0 = r13.e
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.put(r8, r1)
            long r10 = java.lang.System.currentTimeMillis()
            com.taobao.weaver.prefetch.e$1 r0 = new com.taobao.weaver.prefetch.e$1
            r6 = r0
            r7 = r13
            r9 = r2
            r12 = r14
            r6.<init>(r8)
            java.lang.String r14 = r2.a(r14, r15, r0)
            return r14
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weaver.prefetch.e.a(java.lang.String, java.util.Map):java.lang.String");
    }

    private void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4372054a", new Object[]{this, str, cVar});
        } else if (cVar == null) {
        } else {
            cVar.a();
            this.d.put(str, cVar);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public void a(String str, com.taobao.weaver.prefetch.a aVar) {
        List<com.taobao.weaver.prefetch.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43711c8c", new Object[]{this, str, aVar});
            return;
        }
        if (this.f23473a != null) {
            String[] split = str.split("#");
            String a2 = this.f23473a.a(split[0]);
            if (!StringUtils.isEmpty(a2)) {
                str = a(a2).concat("#").concat(split[1]);
            }
        }
        c cVar = this.d.get(str);
        if (cVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (cVar.c == null) {
                cVar.c = new PerformanceData();
            }
            cVar.c.f23471a = str;
            if (cVar.c() || cVar.d()) {
                cVar.c.b = PerformanceData.PFResult.DATA_EXPIRED;
                aVar.b(cVar);
                this.d.remove(str);
                String str2 = "prefetch failed : data expired, key=[" + str + riy.ARRAY_END_STR;
                return;
            }
            String str3 = "prefetch success, key=[" + str + riy.ARRAY_END_STR;
            cVar.c.b = PerformanceData.PFResult.SUCCESS;
            cVar.c.e = System.currentTimeMillis() - currentTimeMillis;
            aVar.a(cVar);
            cVar.b();
            if (!cVar.d()) {
                return;
            }
            this.d.remove(str);
        } else if (this.e.containsKey(str) && (list = this.e.get(str)) != null) {
            list.add(aVar);
        } else {
            c cVar2 = new c();
            cVar2.c = new PerformanceData();
            cVar2.c.f23471a = str;
            cVar2.c.b = PerformanceData.PFResult.NO_PREFETCH_DATA;
            aVar.b(cVar2);
        }
    }
}
