package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class lir implements lkp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<lko> f30666a;

    static {
        kge.a(950661000);
        kge.a(-817870325);
    }

    @Override // tb.lkp
    public void a(lko lkoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f79a08", new Object[]{this, lkoVar});
            return;
        }
        if (this.f30666a == null) {
            this.f30666a = new CopyOnWriteArrayList();
        }
        this.f30666a.add(lkoVar);
    }

    @Override // tb.lkp
    public void b(lko lkoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17aa089", new Object[]{this, lkoVar});
            return;
        }
        List<lko> list = this.f30666a;
        if (list == null) {
            return;
        }
        list.remove(lkoVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<lko> list = this.f30666a;
        if (list == null) {
            return;
        }
        for (lko lkoVar : list) {
            lkoVar.onAppToBackground();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<lko> list = this.f30666a;
        if (list == null) {
            return;
        }
        for (lko lkoVar : list) {
            lkoVar.onAppToFront();
        }
    }
}
