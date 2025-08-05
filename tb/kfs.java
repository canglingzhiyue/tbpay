package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class kfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(532747285);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[0]) : Globals.getApplication();
    }
}
