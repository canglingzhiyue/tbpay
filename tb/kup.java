package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class kup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<kui> f30331a = new ArrayList();
    private kuk b;

    static {
        kge.a(39407093);
    }

    public kup(kuk kukVar) {
        this.b = kukVar;
        this.f30331a.add(new kuo());
        this.f30331a.add(new kul());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Iterator<kui> it = this.f30331a.iterator();
        while (it.hasNext() && !it.next().a(this.b)) {
        }
    }
}
