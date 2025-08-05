package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class fnb extends fmy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2031652117);
    }

    public static /* synthetic */ Object ipc$super(fnb fnbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fnb(String str, long j, String str2, String str3, fmv fmvVar, List<fmu> list, int i) {
        super(str, j, str2, str3, fmvVar, list, i);
    }

    @Override // tb.fmy
    public boolean a(fmx fmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8daccab", new Object[]{this, fmxVar})).booleanValue();
        }
        if (i()) {
            return this.j.evaluate(fmxVar);
        }
        v.a("CommonRule", "Do not evaluate condition, not in sampling!");
        return false;
    }

    @Override // tb.fmy
    public void b(fmx fmxVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75dd328", new Object[]{this, fmxVar});
            return;
        }
        for (fmu fmuVar : this.k) {
            if (fmuVar.b()) {
                fmuVar.a(fmxVar, this);
            } else {
                v.a("CommonRule", "Action isSampling = false, rule: " + toString());
            }
        }
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : new Random().nextInt(10000) < this.e;
    }
}
