package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class lit implements lle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<lld> f30668a;

    static {
        kge.a(-1665744748);
        kge.a(806687115);
    }

    @Override // tb.lle
    public void a(lld lldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f300b174", new Object[]{this, lldVar});
            return;
        }
        if (this.f30668a == null) {
            this.f30668a = new CopyOnWriteArrayList();
        }
        this.f30668a.add(lldVar);
    }

    @Override // tb.lle
    public void b(lld lldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e183b7f5", new Object[]{this, lldVar});
            return;
        }
        List<lld> list = this.f30668a;
        if (list == null) {
            return;
        }
        list.remove(lldVar);
    }

    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        List<lld> list = this.f30668a;
        if (list == null) {
            return;
        }
        for (lld lldVar : list) {
            lldVar.onPageScrolled(f, i);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<lld> list = this.f30668a;
        if (list == null) {
            return;
        }
        for (lld lldVar : list) {
            lldVar.onPageSelected();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<lld> list = this.f30668a;
        if (list == null) {
            return;
        }
        for (lld lldVar : list) {
            lldVar.onPageUnSelected();
        }
    }
}
