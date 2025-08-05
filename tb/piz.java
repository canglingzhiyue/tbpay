package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;

/* loaded from: classes8.dex */
public class piz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-57136366);
        kge.a(1047369549);
    }

    public Object a(pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a48337ad", new Object[]{this, pkgVar, objArr});
        }
        if (objArr == null || !(objArr[0] instanceof pkd)) {
            return null;
        }
        pkd pkdVar = (pkd) objArr[0];
        if ((objArr[1] instanceof WatchPlatformListenerEnum) && pkdVar.b() != null) {
            return a(pkdVar, objArr);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object a(tb.pkd r8, java.lang.Object... r9) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.piz.a(tb.pkd, java.lang.Object[]):java.lang.Object");
    }
}
