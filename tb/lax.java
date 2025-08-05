package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.manager.lifecycle.listener.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class lax implements lbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f30442a = new CopyOnWriteArrayList();

    static {
        kge.a(-1951451752);
        kge.a(1487187084);
    }

    @Override // tb.lbc
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a83e90", new Object[]{this, aVar});
        } else {
            this.f30442a.add(aVar);
        }
    }

    @Override // tb.lbc
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dac09ef", new Object[]{this, aVar});
        } else {
            this.f30442a.remove(aVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30442a.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (a aVar : this.f30442a) {
            aVar.g();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (a aVar : this.f30442a) {
            aVar.h();
        }
    }
}
