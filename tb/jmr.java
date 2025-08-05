package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jmt f29636a;
    private jmu b;
    private jms c;
    private jmw d;
    private jmv e;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static jmr f29637a;

        static {
            kge.a(2002525154);
            f29637a = new jmr();
        }
    }

    static {
        kge.a(-338530033);
    }

    private jmr() {
    }

    public static jmr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jmr) ipChange.ipc$dispatch("f067b6f", new Object[0]) : a.f29637a;
    }

    public jms b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jms) ipChange.ipc$dispatch("16b820ed", new Object[]{this}) : this.c;
    }

    public jmr a(jms jmsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmr) ipChange.ipc$dispatch("e6aac28f", new Object[]{this, jmsVar});
        }
        this.c = jmsVar;
        return this;
    }

    public jmt c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jmt) ipChange.ipc$dispatch("1e69c66b", new Object[]{this}) : this.f29636a;
    }

    public jmr a(jmt jmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmr) ipChange.ipc$dispatch("7b8f7550", new Object[]{this, jmtVar});
        }
        this.f29636a = jmtVar;
        return this;
    }

    public jmu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jmu) ipChange.ipc$dispatch("261b6be9", new Object[]{this}) : this.b;
    }

    public jmr a(jmu jmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmr) ipChange.ipc$dispatch("10742811", new Object[]{this, jmuVar});
        }
        this.b = jmuVar;
        return this;
    }

    public jmw e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jmw) ipChange.ipc$dispatch("2dcd1186", new Object[]{this}) : this.d;
    }

    public jmr a(jmw jmwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmr) ipChange.ipc$dispatch("3a3d8d93", new Object[]{this, jmwVar});
        }
        this.d = jmwVar;
        return this;
    }

    public jmv f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jmv) ipChange.ipc$dispatch("357eb6c6", new Object[]{this}) : this.e;
    }

    public jmr a(jmv jmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmr) ipChange.ipc$dispatch("a558dad2", new Object[]{this, jmvVar});
        }
        this.e = jmvVar;
        return this;
    }
}
