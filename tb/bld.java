package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, blg> f25960a;

    static {
        kge.a(2002644938);
        f25960a = new HashMap();
        a(new blh());
        a(new bli());
        a(new blk());
        a(new blj());
    }

    private static void a(blg blgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f1985b", new Object[]{blgVar});
        } else if (blgVar == null) {
        } else {
            f25960a.put(blgVar.b(), blgVar);
        }
    }

    public static blg a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (blg) ipChange.ipc$dispatch("7c6d7c57", new Object[]{str}) : f25960a.get(str);
    }
}
