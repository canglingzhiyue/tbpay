package tb;

import android.util.Log;
import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.appbundle.c;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;

/* loaded from: classes3.dex */
public class kfq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";

    static {
        kge.a(289518452);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            k.a().a(Globals.getApplication(), false, "TB3DSpace");
        } catch (Throwable unused) {
        }
        String str = TaoPackageInfo.sTTID;
        String str2 = "process: channel id " + str;
        if ("212200".equals(str)) {
            Log.e("BundleInstallUtil", "this is google play channel.");
            return true;
        }
        g c = c.Companion.a().c();
        return (c == null || b.a().c("TB3DSpace") == null || !c.a().contains("TB3DSpace")) ? false : true;
    }
}
