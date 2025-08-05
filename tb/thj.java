package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class thj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f34093a;
    private static thj b;
    private thi c;

    static {
        kge.a(-1346757160);
        f34093a = new Object();
    }

    private thj() {
    }

    public static thj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (thj) ipChange.ipc$dispatch("f0af368", new Object[0]);
        }
        if (b == null) {
            synchronized (f34093a) {
                if (b == null) {
                    b = new thj();
                }
            }
        }
        return b;
    }

    public thi b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (thi) ipChange.ipc$dispatch("16bc98a8", new Object[]{this}) : this.c;
    }

    public void a(thi thiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715e43", new Object[]{this, thiVar});
        } else {
            this.c = thiVar;
        }
    }
}
