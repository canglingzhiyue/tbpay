package tb;

import android.content.Intent;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class lya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 23;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent("com.taobao.interact.publish.action.BACK"));
    }
}
