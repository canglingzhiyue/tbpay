package tb;

import com.alibaba.analytics.core.sync.e;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class apb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_STATIC_TNET_HOST_PORT = "utanalytics_static_tnet_host_port";

    /* renamed from: a  reason: collision with root package name */
    private static apb f25493a;
    private e b;
    private apa c;
    private aoz d;
    private int e = 0;
    private int f = -1;

    static {
        kge.a(-1805349673);
    }

    public static synchronized apb a() {
        synchronized (apb.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (apb) ipChange.ipc$dispatch("f026d6b", new Object[0]);
            }
            if (f25493a == null) {
                f25493a = new apb();
            }
            return f25493a;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            aow.a().b();
        }
    }

    public e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a860e7a4", new Object[]{this});
        }
        if (aow.a().d()) {
            if (this.d == null) {
                this.d = new aoz();
            }
            this.e = 2;
            aoz aozVar = this.d;
            this.b = aozVar;
            return aozVar;
        } else if (aow.a().c()) {
            if (this.c == null) {
                this.c = new apa();
            }
            this.e = 1;
            apa apaVar = this.c;
            this.b = apaVar;
            return apaVar;
        } else {
            this.e = 0;
            this.b = null;
            return null;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.e;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        aoz aozVar = this.d;
        if (aozVar == null) {
            return 0;
        }
        return aozVar.a();
    }
}
