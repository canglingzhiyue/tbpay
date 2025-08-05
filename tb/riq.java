package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class riq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static riq f33169a;
    private Context b;
    private final Set<String> c = new HashSet();
    private final Set<String> d;

    static {
        kge.a(-1173566170);
    }

    private riq() {
        this.c.add(xiz.NAME);
        this.d = new HashSet();
        this.d.add("pv_node");
        this.d.add("expose_node");
        this.d.add("tap_node");
        this.d.add("scroll_node");
        this.d.add("request_node");
        this.d.add("new_edge");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            c().b(context);
        }
    }

    public rkv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rkv) ipChange.ipc$dispatch("f0a1761", new Object[]{this});
        }
        if (DAI.loadNativeDBBeforeStart() == 1) {
            return rkv.a();
        }
        return null;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.b;
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    public static synchronized riq c() {
        synchronized (riq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (riq) ipChange.ipc$dispatch("1e6d5a02", new Object[0]);
            }
            if (f33169a == null) {
                f33169a = new riq();
            }
            return f33169a;
        }
    }
}
