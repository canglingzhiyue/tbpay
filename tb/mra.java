package tb;

import com.alibaba.android.split.core.splitinstall.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;

/* loaded from: classes4.dex */
public class mra {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f31214a;

    static {
        kge.a(587959532);
        emu.a("com.taobao.android.detail.core.utils.ocr.RemoteFeatureCheckHelper");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (b.a().c(str) == null) {
            return true;
        }
        if (f31214a == null) {
            f31214a = c.Companion.a().c();
        }
        g gVar = f31214a;
        if (gVar == null) {
            return false;
        }
        return gVar.a().contains(str);
    }
}
