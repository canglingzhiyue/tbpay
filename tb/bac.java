package tb;

import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class bac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f25725a = new CopyOnWriteArrayList();

    static {
        kge.a(-225967927);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742a6c4", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.f25725a.add(aVar);
        }
    }
}
