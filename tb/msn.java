package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.f;
import com.taobao.mrt.utils.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class msn implements mso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<String> f31224a = new ArrayList();
    private List<f> b = new ArrayList();
    private Object c = new Object();

    static {
        kge.a(1048849095);
        kge.a(-880218605);
    }

    @Override // tb.mso
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849d73ca", new Object[]{this, fVar});
        } else if (fVar == null) {
        } else {
            synchronized (this.b) {
                this.b.add(fVar);
            }
            synchronized (this.c) {
                this.c.notifyAll();
            }
        }
    }

    @Override // tb.mso
    public f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("497c748a", new Object[]{this});
        }
        while (true) {
            f c = c();
            if (c == null) {
                synchronized (this.c) {
                    try {
                        this.c.wait();
                    } catch (InterruptedException e) {
                        a.b("MRTFIFOScheduler", "", e);
                    }
                }
            } else {
                synchronized (this.f31224a) {
                    this.f31224a.add(c.g.name);
                }
                return c;
            }
        }
    }

    @Override // tb.mso
    public void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756e7b29", new Object[]{this, fVar});
            return;
        }
        synchronized (this.f31224a) {
            this.f31224a.remove(fVar.g.name);
        }
    }

    @Override // tb.mso
    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.c;
    }

    private f c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("bc1e960c", new Object[]{this});
        }
        f fVar = null;
        synchronized (this.b) {
            Iterator<f> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f next = it.next();
                if (!this.f31224a.contains(next.g.name)) {
                    fVar = next;
                    break;
                }
            }
            if (fVar != null) {
                this.b.remove(fVar);
            }
        }
        return fVar;
    }
}
