package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.m;
import com.taobao.weex.common.Constants;

/* loaded from: classes.dex */
public class cit implements cix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-49363465);
        kge.a(961378442);
    }

    @Override // tb.cix
    public String a(String str, ciu ciuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("654f2b8d", new Object[]{this, str, ciuVar});
        }
        if (str.indexOf("$CPU_ARCH_l") >= 0) {
            str = str.replace("$CPU_ARCH_l", b());
        }
        if (str.indexOf("$CPU_ARCH_s") >= 0) {
            str = str.replace("$CPU_ARCH_s", a());
        }
        return ciuVar.a(str);
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : 8 == rgn.getCurrentRuntimeCpuArchValue(m.f6406a) ? Constants.CodeCache.SAVE_PATH : "v7";
    }

    private String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : 8 == rgn.getCurrentRuntimeCpuArchValue(m.f6406a) ? iju.ABI_ARM64 : iju.ABI_ARM;
    }
}
