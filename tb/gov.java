package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes5.dex */
public class gov extends gmv<goq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1052314282);
    }

    public static /* synthetic */ Object ipc$super(gov govVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public gov(gmv gmvVar) {
        super(gmvVar);
    }

    @Override // tb.gmv
    public boolean a(goq goqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaa8a5b3", new Object[]{this, goqVar})).booleanValue();
        }
        IDMComponent a2 = goqVar.a();
        if (!gof.a(a2)) {
            return b((gov) goqVar);
        }
        int d = goqVar.d();
        int e = goqVar.e();
        List<IDMComponent> c = goqVar.c();
        IDMComponent b = goqVar.b();
        IDMComponent a3 = gof.a(c, d, e);
        if (a3 == null || !gof.d(b, a3)) {
            return true;
        }
        if (gof.g(b)) {
            if (!gof.d(a2, b)) {
                return false;
            }
            return b(goqVar);
        }
        return b(goqVar);
    }

    private boolean b(goq goqVar) {
        IDMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d92bac34", new Object[]{this, goqVar})).booleanValue();
        }
        int d = goqVar.d();
        int e = goqVar.e();
        List<IDMComponent> c = goqVar.c();
        IDMComponent b = goqVar.b();
        return !gof.b(b) || (a2 = gof.a(c, d, e)) == null || !gof.a(b, a2);
    }
}
