package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.floatwindow.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class iyy implements iyz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Class<? extends iza>, iza> f29415a = new HashMap();

    static {
        kge.a(-579106809);
        kge.a(-1823857228);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        izb.a(this);
        this.f29415a.put(izc.class, new d());
    }

    @Override // tb.iyz
    public iza a(Class<? extends iza> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iza) ipChange.ipc$dispatch("271c15c1", new Object[]{this, cls}) : this.f29415a.get(cls);
    }
}
