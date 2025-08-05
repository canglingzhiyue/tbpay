package tb;

import com.alibaba.android.split.e;
import com.alibaba.android.split.k;
import com.alibaba.android.split.manager.a;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bie implements big {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-713884046);
        kge.a(1345880330);
    }

    @Override // tb.big
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!e.a().a(str)) {
            return "";
        }
        try {
            if (((a) k.a()).c().b(str) != null) {
                return ((a) k.a()).c().b(str).b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override // tb.big
    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        if (!e.a().a(str)) {
        }
        return 0L;
    }
}
