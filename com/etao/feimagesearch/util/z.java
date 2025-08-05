package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static z b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, b> f7039a = new HashMap();

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f7040a;
        public long b;
        public long c;

        static {
            kge.a(-1074418417);
        }

        public a(long j) {
            this.f7040a = j;
        }
    }

    static {
        kge.a(1219044530);
        b = null;
    }

    public static z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z) ipChange.ipc$dispatch("9b876b7d", new Object[0]);
        }
        if (b == null) {
            b = new z();
        }
        return b;
    }

    public void a(String str, int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (i > 100) {
            i = 99;
        }
        if (this.f7039a.containsKey(str)) {
            bVar = this.f7039a.get(str);
            if (b.a(bVar).size() > 100) {
                b.a(bVar).clear();
            }
        } else {
            b bVar2 = new b(str, "", i);
            b.a(bVar2, Thread.currentThread().getId());
            this.f7039a.put(str, bVar2);
            bVar = bVar2;
        }
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
        }
        b bVar = this.f7039a.get(str);
        if (bVar == null) {
            return 0L;
        }
        return bVar.b();
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f7041a;
        private String b;
        private long c;
        private int d;
        private List<a> e = new ArrayList();

        static {
            kge.a(1067135426);
        }

        public static /* synthetic */ long a(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8138659", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.c = j;
            return j;
        }

        public static /* synthetic */ List a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("89907428", new Object[]{bVar}) : bVar.e;
        }

        public b(String str, String str2, int i) {
            this.f7041a = str;
            this.d = i;
            this.b = str2;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.e.add(new a(currentTimeMillis));
            cot.b("PerformanceLog", "Begin->EventId:[%s] Group:[%s] StartTime:[%d] ThreadId:[%d]", this.f7041a, this.b, Long.valueOf(currentTimeMillis), Long.valueOf(this.c));
        }

        public long b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
            }
            long j = 0;
            if (this.e.size() <= 0) {
                return 0L;
            }
            List<a> list = this.e;
            a aVar = list.get(list.size() - 1);
            aVar.b = System.currentTimeMillis();
            aVar.c = aVar.b - aVar.f7040a;
            cot.b("PerformanceLog", "End->EventId:[%s] Group:[%s] CostTime:[%d]ms ThreadId:[%d]", this.f7041a, this.b, Long.valueOf(aVar.c), Long.valueOf(Thread.currentThread().getId()));
            if (this.d > 0 && this.e.size() % this.d == 0) {
                for (a aVar2 : this.e) {
                    j += aVar2.c;
                }
                cot.b("PerformanceLog", "Average->EventId:[%s] Group:[%s] AverageCostTime:[%d]ms", this.f7041a, this.b, Long.valueOf(j / this.e.size()));
            }
            return aVar.c;
        }
    }
}
