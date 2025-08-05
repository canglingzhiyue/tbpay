package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ofy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f32021a = new ArrayList();

    /* loaded from: classes8.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(1861071567);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528304b9", new Object[]{this, aVar});
        } else if (this.f32021a.contains(aVar)) {
        } else {
            this.f32021a.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5e6efa", new Object[]{this, aVar});
        } else {
            this.f32021a.remove(aVar);
        }
    }

    public void a(Component component, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322e9540", new Object[]{this, component, new Integer(i)});
            return;
        }
        for (a aVar : this.f32021a) {
            aVar.a(i);
        }
    }
}
