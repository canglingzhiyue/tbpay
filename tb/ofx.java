package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class ofx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f32020a = new ArrayList();

    /* loaded from: classes8.dex */
    public interface a {
        void a(Component component, int i);
    }

    static {
        kge.a(-1256993324);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ce2c1a", new Object[]{this, aVar});
        } else if (this.f32020a.contains(aVar)) {
        } else {
            this.f32020a.add(aVar);
        }
    }

    public void a(Component component, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322e9540", new Object[]{this, component, new Integer(i)});
            return;
        }
        for (a aVar : this.f32020a) {
            aVar.a(component, i);
        }
    }
}
