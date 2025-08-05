package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes.dex */
public class aks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_CPUTRACKTICK = "cpuTrackTick";
    public static final int DEVICE_IS_FATAL = 3;
    public static final int DEVICE_IS_GOOD = 0;
    public static final int DEVICE_IS_NORMAL = 1;
    public static final int DEVICE_IS_RISKY = 2;
    public static final int HIGH_END_DEVICE = 0;
    public static final int LOW_END_DEVICE = 2;
    public static final int MEDIUM_DEVICE = 1;

    /* renamed from: a  reason: collision with root package name */
    private volatile b f25403a;
    private volatile a b;
    private volatile akz c;
    private volatile c d;
    private volatile alb e;
    private volatile d f;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f25404a = 0;
        public float b = 0.0f;
        public float c = -1.0f;
        public float d = -1.0f;
        public int e = -1;
        public int f = -1;
        public int g = -1;

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f25405a = 0.0f;
        public int b = 0;
        public int c = 0;
        public String d = "0";
        public int e = -1;

        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public long f25406a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public int j = -1;
        public int k = -1;

        public c() {
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int b;
        public int c;

        /* renamed from: a  reason: collision with root package name */
        public int f25407a = -1;
        public int d = -1;

        public d() {
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            int i = this.c;
            if (i < 90) {
                if (i >= 70) {
                    return 1;
                }
                if (i >= 0) {
                    return 2;
                }
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static aks f25408a = new aks();

        public static /* synthetic */ aks a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aks) ipChange.ipc$dispatch("f025cb5", new Object[0]) : f25408a;
        }
    }

    public static aks a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aks) ipChange.ipc$dispatch("f025cb5", new Object[0]) : e.a();
    }

    private aks() {
        this.c = new akz(Process.myPid(), alf.b);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.c.a(0L);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            this.c.a(this.c.f25415a);
        }
    }

    public b d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fd771614", new Object[]{this});
        }
        if (alf.f25418a == null) {
            return new b();
        }
        if (this.f25403a == null) {
            ala a2 = ala.a(alf.f25418a);
            this.f25403a = new b();
            this.f25403a.f25405a = a2.f25416a;
            this.f25403a.c = a2.c;
            this.f25403a.b = a2.b;
            alc alcVar = new alc();
            alcVar.a(alf.f25418a);
            this.f25403a.d = String.valueOf(alcVar.f25417a);
            this.f25403a.e = a(alcVar.b, 8, 6);
        }
        return this.f25403a;
    }

    public a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("df54df94", new Object[]{this});
        }
        if (alf.f25418a == null) {
            return new a();
        }
        if (this.b == null) {
            aky akyVar = new aky();
            akyVar.a();
            if (this.c == null) {
                this.c = new akz(Process.myPid(), alf.b);
            }
            this.b = new a();
            this.b.f25404a = akyVar.f25414a;
            this.b.b = akyVar.c;
            this.b.e = akyVar.e;
            this.b.f = a(akyVar.e, 8, 5);
        }
        this.b.c = this.c.b();
        this.b.d = this.c.a();
        this.b.g = a((int) (100.0f - this.b.d), 90, 60, 20);
        return this.b;
    }

    private int a(int i, int... iArr) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2621a7dc", new Object[]{this, new Integer(i), iArr})).intValue();
        }
        if (-1 == i) {
            return -1;
        }
        while (true) {
            if (i2 >= iArr.length) {
                i2 = -1;
                break;
            } else if (i >= iArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        return (i2 != -1 || i < 0) ? i2 : iArr.length;
    }

    public c f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c132a971", new Object[]{this});
        }
        if (alf.f25418a == null) {
            return new c();
        }
        if (this.d == null) {
            this.d = new c();
            this.e = new alb();
        }
        try {
            long[] c2 = this.e.c();
            this.d.f25406a = c2[0];
            this.d.b = c2[1];
            long[] a2 = this.e.a();
            this.d.c = a2[0];
            this.d.d = a2[1];
            int i = -1;
            int i2 = a2[0] != 0 ? (int) ((a2[1] * 100.0d) / a2[0]) : -1;
            long[] b2 = this.e.b();
            this.d.e = b2[0];
            this.d.f = b2[1];
            if (b2[0] != 0) {
                i = (int) ((b2[1] * 100.0d) / b2[0]);
            }
            long[] a3 = this.e.a(alf.f25418a, Process.myPid());
            this.d.g = a3[0];
            this.d.h = a3[1];
            this.d.i = a3[2];
            this.d.j = a((int) this.d.f25406a, 5242880, 2621440);
            this.d.k = Math.round((a(100 - i2, 70, 50, 30) + a(100 - i, 60, 40, 20)) / 2.0f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.d;
    }

    @Deprecated
    public d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a310732f", new Object[]{this});
        }
        if (alf.f25418a == null) {
            return new d();
        }
        if (this.f == null) {
            this.f = new d();
            if (this.d == null) {
                f();
            }
            if (this.b == null) {
                e();
            }
            if (this.f25403a == null) {
                d();
            }
            this.f.b = Math.round((((this.d.j * 0.9f) + (this.b.f * 1.5f)) + (this.f25403a.e * 0.6f)) / 3.0f);
            this.f.d = Math.round((this.d.k + this.b.g) / 2.0f);
        } else {
            if (this.d == null) {
                f();
            }
            if (this.b == null) {
                e();
            }
            if (this.f25403a == null) {
                d();
            }
            this.f.d = Math.round(((this.d.k * 0.8f) + (this.b.g * 1.2f)) / 2.0f);
        }
        return this.f;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String str = "om setDeviceScore to outline score =" + i;
        if (i <= 0) {
            return;
        }
        if (this.f == null) {
            g();
        }
        if (this.f == null) {
            return;
        }
        this.f.c = i;
        if (i >= 90) {
            this.f.f25407a = 0;
        } else if (i >= 70) {
            this.f.f25407a = 1;
        } else {
            this.f.f25407a = 2;
        }
    }
}
