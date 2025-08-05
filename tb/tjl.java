package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.h;
import com.taobao.mmad.data.BaseMmAdModel;

/* loaded from: classes7.dex */
public class tjl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(641773656);
    }

    public static void a(BaseMmAdModel baseMmAdModel, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d64804e", new Object[]{baseMmAdModel, new Boolean(z), new Boolean(z2)});
        } else {
            h.b("").a(z ? 9 : 10, z2);
        }
    }
}
