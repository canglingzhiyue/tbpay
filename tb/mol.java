package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.q;

/* loaded from: classes7.dex */
public class mol extends mok {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private q b;

    @Override // tb.mok
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.mok
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.mok
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        }
    }

    @Override // tb.mok
    public void b(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f634ad", new Object[]{this, new Float(f), new Long(j)});
        }
    }

    @Override // tb.mok
    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        }
    }

    public mol(mou mouVar) {
        super(mouVar);
        m a2 = a.a(a.PAGE_RENDER_DISPATCHER);
        if (a2 instanceof q) {
            this.b = (q) a2;
        }
    }

    @Override // tb.mok
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        q qVar = this.b;
        if (qVar == null) {
            return;
        }
        qVar.e(this.f31166a, j);
    }
}
