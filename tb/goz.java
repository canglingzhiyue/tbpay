package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class goz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1085636431);
    }

    public static gom a(IDMComponent iDMComponent, IDMComponent iDMComponent2, IDMComponent iDMComponent3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gom) ipChange.ipc$dispatch("45a057b5", new Object[]{iDMComponent, iDMComponent2, iDMComponent3});
        }
        if (gof.a(iDMComponent3) && gof.g(iDMComponent3) && !gof.d(iDMComponent, iDMComponent3)) {
            return new gpb();
        }
        if (!gof.h(iDMComponent2) && !gof.g(iDMComponent2)) {
            return null;
        }
        if (gof.c(iDMComponent2, iDMComponent)) {
            return new gpd();
        }
        if (!gof.m(iDMComponent2)) {
            return null;
        }
        return new gpa();
    }

    public static gom a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gom) ipChange.ipc$dispatch("f052539", new Object[0]) : new gpc();
    }
}
