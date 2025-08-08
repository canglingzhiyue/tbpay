package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2001058908);
    }

    public static bdu a(bbz bbzVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdu) ipChange.ipc$dispatch("9bf7bccb", new Object[]{bbzVar, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        int i = -1;
        bby d = bbzVar.x().d();
        if (d != null) {
            i = d.x();
        }
        if (str.startsWith("cartCalculateGlobal")) {
            return new bds(bbzVar, abh.a(4, i));
        }
        if (!str.startsWith("editGroupPopWindow")) {
            return null;
        }
        return new bdt(bbzVar, 3);
    }
}
