package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class lbb implements lbg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<tgs> f30446a = new CopyOnWriteArrayList();

    static {
        kge.a(-272890204);
        kge.a(-1129218664);
    }

    @Override // tb.lbg
    public void a(tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d278", new Object[]{this, tgsVar});
        } else {
            this.f30446a.add(tgsVar);
        }
    }

    @Override // tb.lbg
    public void b(tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeead8f9", new Object[]{this, tgsVar});
        } else {
            this.f30446a.remove(tgsVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30446a.clear();
        }
    }

    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        for (tgs tgsVar : this.f30446a) {
            tgsVar.a(f, i);
        }
    }

    public void a(String str, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4051d3e3", new Object[]{this, str, tgrVar});
            return;
        }
        for (tgs tgsVar : this.f30446a) {
            tgsVar.a(str, tgrVar);
        }
    }
}
