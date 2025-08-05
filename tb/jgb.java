package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jga sScheduler = new jgc();

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f29532a;
    private long b = 0;
    private jga c = sScheduler;

    public static jgb a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jgb) ipChange.ipc$dispatch("c44f12bb", new Object[]{runnable}) : new jgb(runnable);
    }

    private jgb(Runnable runnable) {
        this.f29532a = runnable;
    }

    public jgb a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgb) ipChange.ipc$dispatch("daacbd85", new Object[]{this, new Long(j)});
        }
        this.b = j;
        return this;
    }

    public jgb a(jga jgaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgb) ipChange.ipc$dispatch("406c384d", new Object[]{this, jgaVar});
        }
        this.c = jgaVar;
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.a(this.f29532a, this.b);
        }
    }
}
