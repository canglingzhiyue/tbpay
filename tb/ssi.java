package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.view.manager.lifecycle.listener.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class ssi implements tgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f33884a = new CopyOnWriteArrayList();

    static {
        kge.a(-1143588681);
        kge.a(558482091);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f33884a.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (d dVar : this.f33884a) {
            dVar.p();
        }
    }

    @Override // tb.tgt
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a99bad", new Object[]{this, dVar});
        } else {
            this.f33884a.add(dVar);
        }
    }

    @Override // tb.tgt
    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dad670c", new Object[]{this, dVar});
        } else if (this.f33884a.isEmpty()) {
        } else {
            this.f33884a.remove(dVar);
        }
    }
}
