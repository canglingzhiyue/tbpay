package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class laz implements lbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<IPageLifeCycle> f30444a = new CopyOnWriteArrayList();

    static {
        kge.a(-1880172270);
        kge.a(1638416542);
    }

    @Override // tb.lbe
    public void a(IPageLifeCycle iPageLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0204ad", new Object[]{this, iPageLifeCycle});
        } else {
            this.f30444a.add(iPageLifeCycle);
        }
    }

    @Override // tb.lbe
    public void b(IPageLifeCycle iPageLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50debae", new Object[]{this, iPageLifeCycle});
        } else {
            this.f30444a.remove(iPageLifeCycle);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30444a.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (IPageLifeCycle iPageLifeCycle : this.f30444a) {
            iPageLifeCycle.i();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (IPageLifeCycle iPageLifeCycle : this.f30444a) {
            iPageLifeCycle.a(str);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (IPageLifeCycle iPageLifeCycle : this.f30444a) {
            iPageLifeCycle.j();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (IPageLifeCycle iPageLifeCycle : this.f30444a) {
            iPageLifeCycle.k();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (IPageLifeCycle iPageLifeCycle : this.f30444a) {
            iPageLifeCycle.l();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (IPageLifeCycle iPageLifeCycle : this.f30444a) {
            iPageLifeCycle.m();
        }
    }
}
