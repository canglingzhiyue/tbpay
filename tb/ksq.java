package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ksq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1605945839);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(oqc.a().l());
        }
        return false;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (!a(str)) {
        } else {
            AppMonitor.Counter.commit("Page_Home", "awesome_loadCacheFailed", str, 1.0d);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (!a(str)) {
        } else {
            AppMonitor.Counter.commit("Page_Home", "awesome_loadPresetDataFailed", str, 1.0d);
        }
    }
}
