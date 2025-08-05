package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.impl.b;

/* loaded from: classes.dex */
public class moc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jzt f31157a = new jzt();
    private final jzs b = new jzs();
    private final IApmEventListener c = b.d().i();
    private boolean d = false;
    private final Runnable e = new Runnable() { // from class: tb.moc.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!moc.a(moc.this)) {
            } else {
                moc.b(moc.this).b(true);
            }
        }
    };
    private final Runnable f = new Runnable() { // from class: tb.moc.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!moc.a(moc.this)) {
            } else {
                moc.c(moc.this).onEvent(50);
            }
        }
    };

    public static /* synthetic */ boolean a(moc mocVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4df5c3b", new Object[]{mocVar})).booleanValue() : mocVar.d;
    }

    public static /* synthetic */ jzt b(moc mocVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jzt) ipChange.ipc$dispatch("5aedfc2a", new Object[]{mocVar}) : mocVar.f31157a;
    }

    public static /* synthetic */ IApmEventListener c(moc mocVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IApmEventListener) ipChange.ipc$dispatch("f4724883", new Object[]{mocVar}) : mocVar.c;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d = true;
        this.f31157a.a(true);
        b.d().c().postDelayed(this.e, 300000L);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d = false;
        this.f31157a.a(false);
        this.f31157a.b(false);
        this.c.onEvent(2);
        b.d().c().removeCallbacks(this.e);
        b.d().c().removeCallbacks(this.f);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = true;
        this.f31157a.a(true);
        this.c.onEvent(1);
        b.d().c().postDelayed(this.e, 300000L);
        b.d().c().postDelayed(this.f, 10000L);
    }
}
