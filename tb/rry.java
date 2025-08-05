package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class rry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final rry f33348a;
    private HashSet<Object> b = new HashSet<>();
    private boolean c = false;

    static {
        kge.a(-1510514893);
        f33348a = new rry();
    }

    public static rry a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rry) ipChange.ipc$dispatch("f0a3205", new Object[0]) : f33348a;
    }

    private rry() {
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b.size() > 0;
    }

    public void a(rrx rrxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9b69a0", new Object[]{this, rrxVar});
            return;
        }
        Iterator<Object> it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
