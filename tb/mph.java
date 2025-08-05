package tb;

import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.q;
import com.taobao.monitor.procedure.IPage;

/* loaded from: classes.dex */
public class mph implements IPage.e {

    /* renamed from: a  reason: collision with root package name */
    private final mou f31187a;
    private q b;

    public mph(mou mouVar) {
        this.f31187a = mouVar;
        m a2 = a.a(a.PAGE_RENDER_DISPATCHER);
        if (a2 instanceof q) {
            this.b = (q) a2;
        }
    }
}
