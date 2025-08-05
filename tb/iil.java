package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public class iil implements iij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<iij> f29050a = new CopyOnWriteArraySet();

    public void a(iij iijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edba9b4e", new Object[]{this, iijVar});
        } else if (iijVar == null) {
        } else {
            this.f29050a.add(iijVar);
        }
    }

    @Override // tb.iij
    public void a(iim iimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbbf86b", new Object[]{this, iimVar});
            return;
        }
        for (iij iijVar : this.f29050a) {
            try {
                iijVar.a(iimVar);
            } catch (Throwable th) {
                ikq.a("download->begin,error", th);
            }
        }
    }

    @Override // tb.iij
    public void a(iim iimVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbde84a", new Object[]{this, iimVar, rSoException});
            return;
        }
        for (iij iijVar : this.f29050a) {
            try {
                iijVar.a(iimVar, rSoException);
            } catch (Throwable th) {
                ikq.a("download->finished,error", th);
            }
        }
        this.f29050a.clear();
    }

    @Override // tb.iij
    public void a(iim iimVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c387f8", new Object[]{this, iimVar, new Integer(i)});
            return;
        }
        for (iij iijVar : this.f29050a) {
            try {
                iijVar.a(iimVar, i);
            } catch (Throwable th) {
                ikq.a("download->progress,error", th);
            }
        }
    }
}
