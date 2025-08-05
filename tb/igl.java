package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class igl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TBQuality";

    /* renamed from: a  reason: collision with root package name */
    private static final igl f29012a;
    private static final AtomicBoolean c;
    private final ign b = new ign();

    static {
        kge.a(-1929739474);
        f29012a = new igl();
        c = new AtomicBoolean(false);
    }

    public static igl a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (igl) ipChange.ipc$dispatch("f05efd0", new Object[0]) : f29012a;
    }

    private igl() {
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!c.compareAndSet(false, true)) {
        } else {
            this.b.a(context);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a();
        }
    }
}
