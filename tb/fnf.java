package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class fnf implements fmv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<fng<?>> f28072a;

    static {
        kge.a(-1829478280);
        kge.a(46001946);
    }

    public fnf(String str) {
        this.f28072a = fne.a(str);
    }

    @Override // tb.fmv
    public boolean evaluate(fmx fmxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d186e4e3", new Object[]{this, fmxVar})).booleanValue() : fne.a(fmxVar, this.f28072a);
    }
}
