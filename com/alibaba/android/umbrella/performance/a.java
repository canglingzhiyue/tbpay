package com.alibaba.android.umbrella.performance;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public static final int ADD_ABTEST = 6;
    public static final int ADD_ARGS = 2;
    public static final int ADD_OTHER_PROCESS = 8;
    public static final int ADD_PROCESS_POINT = 3;
    public static final int ADD_SUB_PROCESS_POINT = 4;
    public static final int COMMIT = 5;
    public static final int REGISTER_PAGE_POINT = 1;
    public static final int SET_CHILD_BIZ = 7;

    /* renamed from: a  reason: collision with root package name */
    public int f2831a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public d g;
    public long h;
    public long i;
    public Map<String, String> j;

    private a(C0107a c0107a) {
        this.f2831a = C0107a.a(c0107a);
        this.b = C0107a.b(c0107a);
        this.c = c0107a.b;
        this.d = c0107a.c;
        this.e = c0107a.d;
        this.h = C0107a.c(c0107a);
        this.g = c0107a.f2832a;
        this.f = C0107a.d(c0107a);
        this.j = C0107a.e(c0107a);
        this.i = C0107a.f(c0107a);
    }

    /* renamed from: com.alibaba.android.umbrella.performance.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0107a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public d f2832a;
        public String b;
        public String c;
        public String d;
        private int e;
        private String f;
        private long g;
        private String h;
        private Map<String, String> i;
        private long j;

        public static /* synthetic */ int a(C0107a c0107a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4354835", new Object[]{c0107a})).intValue() : c0107a.e;
        }

        public static /* synthetic */ String b(C0107a c0107a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2747f4fd", new Object[]{c0107a}) : c0107a.f;
        }

        public static /* synthetic */ long c(C0107a c0107a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b4b83b8", new Object[]{c0107a})).longValue() : c0107a.g;
        }

        public static /* synthetic */ String d(C0107a c0107a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6023edbb", new Object[]{c0107a}) : c0107a.h;
        }

        public static /* synthetic */ Map e(C0107a c0107a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("50989efb", new Object[]{c0107a}) : c0107a.i;
        }

        public static /* synthetic */ long f(C0107a c0107a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15ecdcfb", new Object[]{c0107a})).longValue() : c0107a.j;
        }

        public C0107a(String str) {
            this.f = str;
            this.g = SystemClock.uptimeMillis();
        }

        public C0107a(String str, long j) {
            this.f = str;
            if (j > 0) {
                this.g = j;
            } else {
                this.g = SystemClock.uptimeMillis();
            }
        }

        public C0107a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("ab8b8a75", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public C0107a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("99d65b3e", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public C0107a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("f3d5b733", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }

        public C0107a a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("3922beb4", new Object[]{this, dVar});
            }
            this.f2832a = dVar;
            return this;
        }

        public C0107a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("e5562c54", new Object[]{this, new Long(j)});
            }
            this.j = j;
            return this;
        }

        public C0107a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("3644579d", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public C0107a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("d2b253fc", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public C0107a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0107a) ipChange.ipc$dispatch("6f20505b", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("286d6a65", new Object[]{this}) : new a(this);
        }
    }
}
