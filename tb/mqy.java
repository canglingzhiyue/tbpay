package tb;

import com.alibaba.android.split.core.splitinstall.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;

/* loaded from: classes4.dex */
public class mqy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f31212a;

    static {
        kge.a(-404598172);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (b.a().c(str) == null) {
            return true;
        }
        if (f31212a == null) {
            f31212a = c.Companion.a().c();
        }
        g gVar = f31212a;
        if (gVar == null) {
            return false;
        }
        return gVar.a().contains(str);
    }
}
