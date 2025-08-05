package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ota;

/* loaded from: classes8.dex */
public class osw implements ota, ote {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<ota.a> f32384a = new CopyOnWriteArrayList();

    static {
        kge.a(-1768738665);
        kge.a(1655330735);
        kge.a(654368591);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f32384a.clear();
        }
    }

    @Override // tb.ota
    public void a(ota.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25f35f", new Object[]{this, aVar});
        } else {
            this.f32384a.add(aVar);
        }
    }

    @Override // tb.ota
    public void b(ota.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68015da0", new Object[]{this, aVar});
        } else if (this.f32384a.isEmpty() || aVar == null) {
        } else {
            this.f32384a.remove(aVar);
        }
    }

    @Override // tb.ote
    public void a(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271102ec", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!this.f32384a.isEmpty()) {
            for (ota.a aVar : this.f32384a) {
                aVar.a(z, z2, z3);
            }
        }
    }

    @Override // tb.ote
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f32384a.isEmpty()) {
        } else {
            Iterator<ota.a> it = this.f32384a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
