package tb;

import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes9.dex */
public final class naz implements aqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f31359a;

    static {
        kge.a(-53213810);
        kge.a(-930866641);
    }

    @Override // tb.aqn
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        return true;
    }

    @Override // tb.aqn
    public void a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6de311", new Object[]{this, qVar});
        } else {
            this.f31359a = qVar;
        }
    }
}
