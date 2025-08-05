package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.d;
import com.taobao.android.behavix.h;
import tb.cew;

/* loaded from: classes.dex */
public class dsf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static dsf b;

    /* renamed from: a  reason: collision with root package name */
    private long f26936a = 0;

    static {
        kge.a(-789801795);
        kge.a(-1196623488);
        b = null;
    }

    private dsf() {
    }

    public static synchronized dsf a() {
        synchronized (dsf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dsf) ipChange.ipc$dispatch("f03d647", new Object[0]);
            }
            if (b == null) {
                b = new dsf();
            }
            return b;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f26936a = SystemClock.elapsedRealtime();
        h.b(d.c(), d.b());
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (0 != this.f26936a && SystemClock.elapsedRealtime() - this.f26936a > cew.a.CONFIG_TRACK_1022_INTERVAL_TIME) {
            dsk.a();
        }
        h.a(d.c(), d.b());
        this.f26936a = 0L;
    }
}
