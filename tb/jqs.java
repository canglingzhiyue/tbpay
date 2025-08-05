package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jqs implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<jrc> f29715a = new ArrayList();

    static {
        kge.a(-817144904);
        kge.a(1352893937);
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (jrc jrcVar : this.f29715a) {
            jrcVar.a();
        }
    }

    public jqs a(jrc jrcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jqs) ipChange.ipc$dispatch("bed7e07d", new Object[]{this, jrcVar});
        }
        this.f29715a.add(jrcVar);
        return this;
    }
}
