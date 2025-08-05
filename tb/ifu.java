package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ifu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bbz f29000a;
    private boolean b = false;

    static {
        kge.a(-1114531205);
    }

    public ifu(bbz bbzVar) {
        this.f29000a = bbzVar;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        bez x = this.f29000a.x();
        if (x == null) {
            return;
        }
        List<IDMComponent> f = x.d().d().f();
        if (f != null) {
            Iterator<IDMComponent> it = f.iterator();
            while (it.hasNext()) {
                IDMComponent next = it.next();
                if (next != null && next.getFields() != null && next.getFields().getBooleanValue("calculatePopIsCalculateComponent")) {
                    it.remove();
                }
            }
        }
        x.g();
    }
}
